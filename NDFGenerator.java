package Sim;

import java.util.Random;

public class NDFGenerator extends TrafficGenerator {

	int _deviation;
	int _average;

	Random _r;

	public NDFGenerator(int deviation, int average) {
		_deviation = deviation;
		_average = average;
		_r = new Random();
	}

	public double getTimeBetweenSending() {
		int temp = (int) (_r.nextGaussian() * _deviation + _average);
		generatedTimes.add(temp);
		return temp;
	}
}