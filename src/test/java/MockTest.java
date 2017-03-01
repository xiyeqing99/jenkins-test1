
//import org.junit.Assert;
//import org.junit.other.Test;

import dao.OrderDao;
import dao.UserDao;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

/**
 * Created by xiyeqing on 2017-二月-24.
 */
public class MockTest {

        @Test
        public void test(){

            //创建mock对象，参数可以是类，也可以是接口
            List<String> list = mock(List.class);

            //设置方法的预期返回值
            when(list.get(0)).thenReturn("helloworld");

            String result = list.get(0);

            //验证方法调用(是否调用了get(0))
            verify(list).get(0);

            //junit测试 此处换成了 testng
            Assert.assertEquals("helloworld", result);
        }

    @Test
    public void argumentMatcherTest(){

        List<String> list = mock(List.class);

        when(list.get(anyInt())).thenReturn("hello","world");

        String result = list.get(0)+list.get(1);

        verify(list,times(2)).get(anyInt());

        Assert.assertEquals("helloworld", result);

    }

    @Test
    public void test0(){

        //也可以Mock具体的类，而不仅仅是接口
        LinkedList mockedList = mock(LinkedList.class);

        //Stub
        when(mockedList.get(0)).thenReturn("first"); // 设置返回值
//        when(mockedList.get(1)).thenThrow(new RuntimeException()); // 抛出异常

        try {
            Thread.sleep(1000);
        }catch (Exception ex){

        }
        //第一个会打印 "first"
        System.out.println(mockedList.get(0));

//        //接下来会抛出runtime异常
//        System.out.println(mockedList.get(1));

        //接下来会打印"null",这是因为没有stub get(999)
        System.out.println(mockedList.get(999));

        // 可以选择性地验证行为，比如只关心是否调用过get(0)，而不关心是否调用过get(1)
        verify(mockedList).get(0);
    }



    @Test
    public void testFindUser(){
        //初始化user
        User user1 = new User();
        user1.setName("1");

        User user2 = new User();
        user2.setName("2");

        User user3 = new User();
        user3.setName("admin");
        UserDao userDao = mock(UserDao.class);
//        user.setName("xxx");
//        user.setAge("18");
        when(userDao.findUser(1)).thenReturn(user1);
        when(userDao.findUser(2)).thenReturn(user2);
        when(userDao.findUser(3)).thenReturn(user3);

    }


    @Test
    public void testSaveUser(){

        UserDao userDao = mock(UserDao.class);

        //初始化user
        User user = new User();
//        user.setName("xxx");
//        user.setAge("18");

        when(userDao.saveUser(user)).thenReturn(true);

        boolean result =userDao.saveUser(user);
        Assert.assertEquals(true, result);

        System.out.println("xxxxxx");
    }

    @Test
    public void testGetKey(){

        UserDao dao = mock(UserDao.class);
//        user.setName("xxx");
//        user.setAge("18");
        when(dao.getKey()).thenReturn(1);
        if(dao.getKey()==1){
            System.out.println("dao.getKey()==1");
        }

        when(dao.getKey()).thenReturn(2);
        if(dao.getKey()==2){
            System.out.println("dao.getKey()==2");
        }

        when(dao.getKey()).thenReturn(3);
        if(dao.getKey()==3){
            System.out.println("dao.getKey()==3");
        }
    }

    @Test
    public void testGetKey1(){

        UserDao dao = mock(UserDao.class);
//        user.setName("xxx");
//        user.setAge("18");

        if(dao.getKey()==1){
            System.out.println("dao.getKey()==1");
        }

        if(dao.getKey()==2){
            System.out.println("dao.getKey()==2");
        }


        if(dao.getKey()==3){
            System.out.println("dao.getKey()==3");
        }
    }


    @Test
    public void testGetValue(){

        UserDao dao = mock(UserDao.class);

        when(dao.getValue()).thenReturn("1");
        if(dao.getValue()=="1"){
            System.out.println("dao.getValue()==1");
        }

        when(dao.getValue()).thenReturn("2");
        if(dao.getValue()=="2"){
            System.out.println("dao.getValue()==2");
        }

        when(dao.getValue()).thenReturn("3");
        if(dao.getValue()=="3"){
            System.out.println("dao.getValue()==3");
        }
    }

    @Test
    public void testOrderDao(){

        OrderDao dao = mock(OrderDao.class);
//        user.setName("xxx");
//        user.setAge("18");
        when(dao.getOrder()).thenReturn(1);
        if(dao.getOrder()==1){
            System.out.println("doAction1");
        }
        when(dao.getOrder()).thenReturn(2);
        if(dao.getOrder()==2){
            System.out.println("doAction2");
        }

        when(dao.getOrder()).thenReturn(3);
        if(dao.getOrder()==3){
            System.out.println("doAction3");
        }
    }

}

