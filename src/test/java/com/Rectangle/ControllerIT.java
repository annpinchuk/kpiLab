package com.Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ControllerIT {

    @Test
    void mockInput() throws Exception {
        var view =  mock(View.class);
        var rectangle = mock(Rectangle.class);
        var controller = new Controller(rectangle, view);

        when(view.read()).thenReturn(new int[]{3,4,5,6});
        when(view.readMove()).thenReturn(new int[]{2,8});

        controller.run();

        verify(rectangle).setX(3);
        verify(rectangle).setY(4);
        verify(rectangle).setA(5);
        verify(rectangle).setB(6);
        verify(rectangle).move(2,8);
    }
}
