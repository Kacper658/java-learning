package lemonDB;

public class Mixed<T> {
    private T value;

    public Mixed(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    public String type() {
    	try {
    	value.equals((String)value);
    	}
    	catch (java.lang.ClassCastException e) {
    		
    	}
    	return "String";
    }
    

    @Override
    public String toString() {
        return "Mixed{" +
                "value=" + value +
                '}';
    }
}
