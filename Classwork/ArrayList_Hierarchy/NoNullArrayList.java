
import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

    public NoNullArrayList() {
        super();
    }

    public NoNullArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Cannot add null elements to NoNullArrayList");
        }
        return super.add(element);
    }

    @Override
    public T set(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException("Cannot set null elements in NoNullArrayList");
        }
        return super.set(index, element);
    }
}

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
                                                                                            public T set(int index, T element) {
                                                                                                        T removedElement = remove(index);
                                                                                                                add(element);
                                                                                                                        return removedElement;
                                                                                            }
                                                                                        }

}}}}}}}}}}}}}}