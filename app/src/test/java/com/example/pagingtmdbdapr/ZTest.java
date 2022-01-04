package com.example.pagingtmdbdapr;

import android.content.res.TypedArray;
import android.util.TypedValue;
import android.widget.TextView;

import com.example.pagingtmdbdapr.customview.CustomButton;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class ZTest {

    @Mock
    CustomButton customButton;
    TypedValue k;
    TextView b;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

         k = mock(TypedValue.class);
         b = mock(TextView.class);


    }

    @Test
    public void testCustomButton()
    {
        //when(databaseMock.isAvailable()).thenReturn(true);

        customButton.disabledButton(true);
        //verify(customButton).disabledButton(true);


// ya below is object and not the
        // problem is I amy not be able to find any Mockito methods
        // its ok.   no constructor , no void(cant do assert)
        //   because its called by resetPresernter or View. hence it can be mocked
        verify(b).setTextColor(k.data);


    }

}
