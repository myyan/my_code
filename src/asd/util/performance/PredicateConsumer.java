package asd.util.performance;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by chenhao on 2016/10/9.
 */
public class PredicateConsumer{
    public static Student updateStudentFee(Student student, Predicate<Student> predicate, Consumer<Student> consumer){
        if (predicate.test(student)){
            consumer.accept(student);
        }
        return student;
    }

    public static void main(String[] args) {
        Student student = new Student("chenaho",12,30);
        System.out.println(student);
        //student2 是参数名 所以这里没有什么问题
        /**
         * 匿名函数 再简洁一点就是这样了
         * */
        Student student1 = updateStudentFee(student,student2 -> {
            System.out.println("entry predicate");
            System.out.println(student2.toString());
            return student2.getAge()>10;
        },student2 -> {
            System.out.println(student2);
            student2.setFee(10);
            student2.setAge(1);
            student2.setName("123");
        });
        System.out.println(student);
    }
}
