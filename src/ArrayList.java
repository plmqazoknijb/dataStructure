class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[50];

    public int size()
    {
        return size;
    }

    // 3가지 사항을 만족하는 indexOf 메소드를 완성하세요.
    public int indexOf(Object o){
        // 코드를 추가하세요.
        for(int i=0; i < size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }


    public Object get(int index)
    {
        return elementData[index];
    }

    public String toString()
    {
        String ans = "[";
        for(int i=0; i<size; i++)
        {
            ans += elementData[i];
            if(i<size-1)
            {
                ans += ",";
            }
        }
        ans += "]";
        return ans;
    }

    public boolean addLast(Object e)
    {
        elementData[size++] = e;
        return true;
    }

    public boolean add(int index, Object element)
    {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }
    public boolean addFirst(Object element)
    {
        return add(0, element);
    }
}