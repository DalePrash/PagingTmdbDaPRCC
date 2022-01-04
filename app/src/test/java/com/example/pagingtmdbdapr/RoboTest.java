package com.example.pagingtmdbdapr;

import com.example.pagingtmdbdapr.mockito.ClassMockitoA;
import com.example.pagingtmdbdapr.mockito.ClassMockitoB;
import com.example.pagingtmdbdapr.mockito.ClassMockitoD;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
class RoboTest {


    private ClassMockitoB classd;

    @Before
    void setup()
    {
        classd = Robolectric.buildActivity(ClassMockitoB.class )
                .create()
                .resume()
                .get();
      //  Robolectric.buildService()  need to
    }
}
