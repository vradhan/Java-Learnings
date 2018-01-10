package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgo;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	public int binarySearch(int[] inputArr, int key) {

		inputArr = sortAlgo.sort(inputArr);

		int start = 0;
		int end = inputArr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			System.out.println("middle value is" + mid);
			if (key == inputArr[mid]) {
				return mid;
			}
			if (key < inputArr[mid]) {
				end = mid - 1;
				System.out.println("end value is" + end);
				return mid;

			} else {
				start = mid + 1;
				System.out.println("start value is" + end);
				return mid;

			}
		}
		return -1;

	}
	
	@PostConstruct
	public void postConstruct(){
		log.info("post info");
	}
	
	@PreDestroy
	public void Destroy(){
		log.info("before destroy");
	}

}
