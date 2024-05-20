class employee{
    String name;
    int salary;
    
    void setData(String name,int sal)
    {
        this.name=name;
        salary=sal;
    }
    
    void getData()
    {
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String arg[])
    {
        employee e1=new employee();
        
        e1.setData("nirav",30000);
        //System.out.println();
        e1.getData();
    }
}
