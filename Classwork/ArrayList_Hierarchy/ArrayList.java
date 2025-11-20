

import java.util.Arrays;

public class ArrayList<T> {
        private static final int DEFAULT_CAPACITY = 10;
            private Object[] elementData;
                private int size;

                    public ArrayList() {
                                this.elementData = new Object[DEFAULT_CAPACITY];
                    }

                        public ArrayList(int initialCapacity) {
                                    if (initialCapacity >= 0) {
                                                    this.elementData = new Object[initialCapacity];
                                    } else {
                                                    throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
                                    }
                                }

                                    public boolean add(T element) {
                                                ensureCapacityInternal(size + 1);
                                                        elementData[size++] = element;
                                                                return true;
                                    }

                                        public void add(int index, T element) {
                                                    rangeCheckForAdd(index);
                                                            ensureCapacityInternal(size + 1);
                                                                    System.arraycopy(elementData, index, elementData, index + 1, size - index);
                                                                            elementData[index] = element;
                                                                                    size++;
                                        }

                                            public T set(int index, T element) {
                                                        rangeCheck(index);
                                                                T oldValue = elementData(index);
                                                                        elementData[index] = element;
                                                                                return oldValue;
                                            }

                                                private void ensureCapacityInternal(int minCapacity) {
                                                            if (minCapacity - elementData.length > 0) {
                                                                            grow(minCapacity);
                                                            }
                                                        }

                                                            private void grow(int minCapacity) {
                                                                        int oldCapacity = elementData.length;
                                                                                int newCapacity = oldCapacity + (oldCapacity >> 1);
                                                                                        if (newCapacity - minCapacity < 0) {
                                                                                                        newCapacity = minCapacity;
                                                                                        }
                                                                                                elementData = Arrays.copyOf(elementData, newCapacity);
                                                                                    }

                                                                                        private void rangeCheck(int index) {
                                                                                                    if (index >= size) {
                                                                                                                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                                                                                                    }
                                                                                                }

                                                                                                    private void rangeCheckForAdd(int index) {
                                                                                                                if (index > size || index < 0) {
                                                                                                                                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                                                                                                                }
                                                                                                            }

                                                                                                                @SuppressWarnings("unchecked")
                                                                                                                    private T elementData(int index) {
                                                                                                                                return (T) elementData[index];
                                                                                                                    }

                                                                                                                        public int size() {
                                                                                                                                    return size;
                                                                                                                        }

                                                                                                                            @Override
                                                                                                                                public String toString() {
                                                                                                                                            return Arrays.toString(Arrays.copyOf(elementData, size));
                                                                                                                                }
                                                                                                                            }
                                                                                                                            
                                                                                                                                }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                    }
                                                                                                    }
                                                                                        }
                                                                                        }
                                                            }
                                                            }
                                                }
                                            }
                                        }
                                    }
                                    }
                                    }
                        }
                    }
}