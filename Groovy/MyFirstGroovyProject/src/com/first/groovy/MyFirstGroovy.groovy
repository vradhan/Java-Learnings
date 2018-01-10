package com.first.groovy

import groovy.util.AntBuilder

class MyFirstGroovy {
	
	static def sum (a,b){
		return a+b;
	}
	
	def base_dir = "C:/Users/rvishnur/neon/GroovyAntDateUtils/"
	def src_dir = base_dir + "src/com/first/groovy"
	def lib_dir = "C:/Jars/groovy-2.4.12/lib"
	def build_dir = base_dir + "com/core/utils"
	def dist_dir = base_dir + "dist"
	def file_name = "DateUtils"

	static void main(args){
		def a = 10;
		def b = 10;
		println(sum(a,b));
	}
}

