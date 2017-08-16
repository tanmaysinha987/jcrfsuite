package com.github.jcrfsuite.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.github.jcrfsuite.CrfTagger;
import com.github.jcrfsuite.util.Pair;

/**
 * This example shows how to use jcrfsuite to do POS tagging
 * 
 * @author vinkhu
 *
 */
public class Tag {

	/**
	 * Tag the sequences in a file.
	 * 
	 * @param args
	 *			Model file, test file.
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/*
		if (args.length != 2) {
			System.out.println("Usage: " + Tag.class.getCanonicalName() + " <model file> <test file>");
			System.exit(1);
		}*/
		String modelFile = "E:/sample_crfsuite_model";
		String testFile = "C:/Users/TSO2492/Desktop/test_feats_crfsuite.txt";
		
		// POS tag
		CrfTagger crfTagger = new CrfTagger(modelFile);
		List<Map<List<Pair<String, Double>>, Double>> tagProbLists = crfTagger.tagWithSequenceProbability(testFile);
		
		// Compute accuracy
		System.out.println("Gold\tPredict\tProbability");
		
	}
}
