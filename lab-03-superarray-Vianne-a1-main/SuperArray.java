public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public SuperArray(int initialCapacity) {
        data = new String[initialCapacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean add(String value) {
        if (size == data.length) {
            resize();
        }
        data[size] = value;
        size++;
        return true;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
        }
        return data[index];
    }

    public String set(int index, String newValue) {
        if (index < 0 || index >= size) {
        }
        String oldValue = data[index];
        data[index] = newValue;
        return oldValue;
    }

    public String remove(int index) {
        if (index < 0 || index >= size) {
        }
        String removedValue = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return removedValue;
    }

    public boolean remove(String target) {
        int indexToRemove = -1;

        for (int i = 0; i < size; i++) {
            if (data[i].equals(target)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            data[size - 1] = null;
            size--;
            return true;
        } else {
            return false;
        }
    }

    private void resize() {
        int newCapacity = data.length * 2 + 1;
        String[] newData = new String[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public int indexOf(String target) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(String target) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public void add(int index, String value) {
        if (index < 0 || index > size) {
        }
        if (size == data.length) {
            resize();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }
}
