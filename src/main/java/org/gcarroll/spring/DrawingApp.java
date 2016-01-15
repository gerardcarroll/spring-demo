package org.gcarroll.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

  public static void main(String[] args) {
    // final Triangle triangle = new Triangle();
    final BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    final Triangle triangle = (Triangle) factory.getBean("triangle");
    triangle.draw();

  }

}
