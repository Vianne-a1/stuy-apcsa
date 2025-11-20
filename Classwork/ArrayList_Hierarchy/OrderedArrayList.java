
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

        public OrderedArrayList() {
                    super();
        }

            public OrderedArrayList(int initialCapacity) {
                        super(initialCapacity);
            }

                @Override
                    public boolean add(T element) {
                                if (element == null) {
                                                throw new IllegalArgumentException("Cannot add null elements to OrderedArrayList");
                                }
                                        int index = 0;
                                                while (index < size() && element.compareTo(get(index)) > 0) {
                                                                index++;
                                                }
                                                        super.add(index, element);
                                                                return true;
                                            }

                                                @Override
                                                    public void add(int index, T element) {
                                                                if (element == null) {
                                                                                throw new IllegalArgumentException("Cannot add null elements to OrderedArrayList");
                                                                }
                                                                        super.add(index, element);
                                                                                // Reorder the elements to maintain the order
                                                                                        sortList();
                                                            }

                                                                @Override
                                                                    public T set(int index, T element) {
                                                                                T removedElement = remove(index);
                                                                                        add(element);
                                                                                                return removedElement;
                                                                    }

                                                                        private void sortList() {
                                                                                    // Sorting the list after adding a new element
                                                                                            this.sort(Comparable::compareTo);
                                                                        }
                                                                    }

}}}}}}}}}}