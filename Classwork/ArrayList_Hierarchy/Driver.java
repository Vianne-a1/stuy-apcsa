public class Driver {
        public static void main(String[] args) {
                    // Test NoNullArrayList
                            NoNullArrayList<String> stringList = new NoNullArrayList<>();
                                    stringList.add("Hello");
                                            stringList.add("World");

                                                    NoNullArrayList<Integer> integerList = new NoNullArrayList<>();
                                                            integerList.add(42);
                                                                    integerList.add(7);

                                                                            // Test OrderedArrayList
                                                                                    OrderedArrayList<String> orderedStringList = new OrderedArrayList<>();
                                                                                            orderedStringList.add("Banana");
                                                                                                    orderedStringList.add("Apple");
                                                                                                            orderedStringList.add("Orange");

                                                                                                                    OrderedArrayList<Integer> orderedIntegerList = new OrderedArrayList<>();
                                                                                                                            orderedIntegerList.add(5);
                                                                                                                                    orderedIntegerList.add(2);
                                                                                                                                            orderedIntegerList.add(8);

                                                                                                                                                    System.out.println("NoNullArrayList of Strings: " + stringList);
                                                                                                                                                            System.out.println("NoNullArrayList of Integers: " + integerList);
                                                                                                                                                                    System.out.println("OrderedArrayList of Strings: " + orderedStringList);
                                                                                                                                                                            System.out.println("OrderedArrayList of Integers: " + orderedIntegerList);
        }
    }

}}
