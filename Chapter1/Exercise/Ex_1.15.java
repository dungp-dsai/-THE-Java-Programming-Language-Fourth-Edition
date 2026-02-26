interface Lookup {
    Object find(String name);
}

interface Looking extends Lookup {
    void add(String name, Object value);
    void remove(String name);
}

class ClassImplementInterface implements Looking {
    private String[] names;
    private Object[] values;
    public Object find(String name) {
        for(int i=0; i<names.length; i++) {
            if(names[i].equals(name))
                return values[i];
        }
        return null;
    }

    public void add(String name, Object value) {
        //
    }

    public void remove(String name) {
        //
    }
}