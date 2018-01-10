package com.core.utils

import groovy.util.AntBuilder

class build {

	def ant = new groovy.util.AntBuilder()

	def base_dir = "C:/Users/rvishnur/neon/GroovyAntDateUtils/"
	def src_dir = base_dir + "src/com/core/utils"
	def lib_dir = "C:/Jars/groovy-2.4.12/lib"
	def build_dir = base_dir + "com/core/utils"
	def dist_dir = base_dir + "dist"
	def file_name = "DateUtils"

	def classpath = ant.path {
		fileset(dir: "${lib_dir}"){ include(name: "*.jar") }
		pathelement(path: "${build_dir}")
	}


	def clean(){
		ant.delete(dir : "${build_dir}")
		ant.delete(dir : "${dist_dir}")
	}

	def jar(){
		clean()
		buildFolder()
		ant.mkdir(dir: "${dist_dir}")
		ant.jar(destfile: "${dist_dir}/${file_name}.jar", basedir: "${build_dir}")
	}

	def compile(){
		ant.javac(destdir: "${build_dir}", srcdir: "${src_dir}", classpath: "${classpath}",includeantruntime:"false")
	}

	def buildFolder(){
		ant.mkdir(dir: "${build_dir}")
		compile()
	}
	
	static void main(args){
		println("hi welcome to groovy");
		def b = new build()
		b.jar()
		println("completed building jar");
	}
}