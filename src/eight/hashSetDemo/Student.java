package eight.hashSetDemo;

class Student {
    String id;
    String name;
    public Student(String id,String name) {	     // 创建构造方法
        this.id=id;
        this.name = name;
    }
    public String toString() {			              // 重写toString()方法
        return id+":"+name;
    }
    // 重写hashCode方法
    public int hashCode() {
        return id.hashCode();	                 // 返回id属性的哈希值
    }
    // 重写equals方法
    public boolean equals(Object obj) {
        if (this == obj) {                        // 判断是否是同一个对象
            return true;	                      // 如果是，直接返回true
        }
        if (obj instanceof Student) {	   // 判断对象是为Student类型
            // 将对象强转为Student类型
            Student stu = (Student) obj;
            if(this.id.equals(stu.id)){
                return true;
            }
        }
        return	false;	                               // 返回判断结果
    }
}
