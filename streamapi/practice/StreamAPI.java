package com.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Stream API (Java 8)
 * --------------------
 * A Stream is used to process collections of data in a functional way.
 *
 * Important Points:
 * 1. Stream is an interface present in java.util.stream package.
 * 2. It does NOT store data. It only processes data.
 * 3. It does NOT modify the original collection.
 * 4. Streams are lazy - operations are executed only when a terminal operation is called.
 * 5. A stream can be used ONLY ONCE.
 */

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 3, 7, 2, 6);

        System.out.println("Original List: " + nums);

        /*
         * filter()
         * --------
         * Used to select elements based on a condition.
         *
         * Example:
         * Keep only even numbers.
         */
        System.out.println("\nEven Numbers:");
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


        /*
         * map()
         * -----
         * Used to transform each element.
         *
         * Example:
         * Multiply every number by 2.
         */
        System.out.println("\nNumbers multiplied by 2:");
        nums.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);


        /*
         * sorted()
         * --------
         * Sorts elements in natural order.
         */
        System.out.println("\nSorted Numbers:");
        nums.stream()
                .sorted()
                .forEach(System.out::println);


        /*
         * distinct()
         * ----------
         * Removes duplicate elements.
         */
        List<Integer> duplicateNums = Arrays.asList(4, 5, 3, 4, 2, 6, 2);

        System.out.println("\nDistinct Elements:");
        duplicateNums.stream()
                .distinct()
                .forEach(System.out::println);


        /*
         * limit()
         * -------
         * Returns only the first n elements.
         */
        System.out.println("\nFirst 3 Elements:");
        nums.stream()
                .limit(3)
                .forEach(System.out::println);


        /*
         * skip()
         * ------
         * Skips the first n elements.
         */
        System.out.println("\nAfter Skipping First 2 Elements:");
        nums.stream()
                .skip(2)
                .forEach(System.out::println);


        /*
         * reduce()
         * --------
         * Combines all elements into a single result.
         *
         * Example:
         * Find the sum of all numbers.
         */
        int sum = nums.stream()
                .reduce(0, (currentSum, element) -> currentSum + element);

        System.out.println("\nSum using reduce(): " + sum);


        /*
         * count()
         * -------
         * Counts the number of elements.
         */
        long count = nums.stream()
                .count();

        System.out.println("\nCount: " + count);


        /*
         * findFirst()
         * -----------
         * Returns the first element.
         *
         * Returns Optional because the stream may be empty.
         */
        Optional<Integer> first = nums.stream()
                .findFirst();

        System.out.println("\nFirst Element: " + first.orElse(-1));


        /*
         * findAny()
         * ---------
         * Returns any element from the stream.
         * Mostly useful in parallel streams.
         */
        Optional<Integer> any = nums.stream()
                .findAny();

        System.out.println("Any Element: " + any.orElse(-1));


        /*
         * anyMatch()
         * ----------
         * Checks if ANY element satisfies the condition.
         */
        boolean hasEven = nums.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("\nContains Even Number? " + hasEven);


        /*
         * allMatch()
         * ----------
         * Checks if ALL elements satisfy the condition.
         */
        boolean allPositive = nums.stream()
                .allMatch(n -> n > 0);

        System.out.println("Are All Positive? " + allPositive);


        /*
         * noneMatch()
         * -----------
         * Checks if NO element satisfies the condition.
         */
        boolean noneNegative = nums.stream()
                .noneMatch(n -> n < 0);

        System.out.println("No Negative Numbers? " + noneNegative);


        /*
         * Stream.of()
         * -----------
         * Creates a stream directly without a collection.
         */
        System.out.println("\nStream.of() Example:");
        Stream.of("Java", "Spring", "Kafka")
                .forEach(System.out::println);


        /*
         * Chaining Operations
         * -------------------
         * Filter even numbers
         * Multiply by 2
         * Sum everything
         */
        int result = nums.stream()
                .filter(n -> n % 2 == 0)   // 4, 2, 6
                .map(n -> n * 2)           // 8, 4, 12
                .reduce(0, Integer::sum); // 24

        System.out.println("\nFinal Result: " + result);


        /*
         * IMPORTANT: Stream can only be used once.
         */

        Stream<Integer> stream = nums.stream();

        stream.forEach(System.out::println);

        // ERROR:
        // stream.forEach(System.out::println);

        /*
         * Why?
         *
         * Think of a stream like water flowing through a pipe.
         * Once the water has passed, you cannot use the same water again.
         *
         * If you need it again, create a new stream:
         *
         * nums.stream().forEach(...);
         */
    }
}