package com.example.pagingtmdbdapr;


import android.app.Service;
import android.content.Context;
import android.content.Intent;

import com.example.pagingtmdbdapr.mockito.ClassMockitoA;
import com.example.pagingtmdbdapr.mockito.ClassMockitoB;
import com.example.pagingtmdbdapr.mockito.ClassMockitoC;
import com.example.pagingtmdbdapr.mockito.ClassMockitoD;

import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class XTest {



    @Mock
    ClassMockitoA mockA;

    @Mock
    Service service;

    @Mock
    ClassMockitoB databaseMockB;

    @Mock
    ClassMockitoC MockC;

    @Mock
    Intent intent;

    @Mock
    Context context;

    @Mock
    ClassMockitoD MockD;


    @Mock
    Intent inte;

    @Before
    public void setUp()
    {

    }
    @Test
    public void testA() {
        ClassMockitoD classd = new ClassMockitoD();
        classd.methodDD();
    }
    @Test
    public void testMockInsideDD() {
       when(MockC.methodcc()).thenReturn("aaaa");
       MockD.methodDedependent(MockC);
       assertEquals(MockC.methodcc(),"aaaa");
    }

    @Test
    public void testAddParamters() {
        ClassMockitoD classd = new ClassMockitoD();
        // when(MockC.methodcc()).thenReturn("aaa");
        classd.methodDedependent(MockC,intent,context);
        //when(service.onLowMemory()).thenReturn(null);
        //when(service.onLowMemory()).thenReturn(Exception);
        String n = "aaa";
        verify(intent,times(1)).setAction(n);
       // verify(MockC, times(1)).methodcc();
//verify()
        // classd.onLowMemory();
    }


    @Test
    public void testB() {
        ClassMockitoD classd = new ClassMockitoD();
       // when(MockC.methodcc()).thenReturn("aaa");
        classd.methodDedependent(MockC);
        //when(service.onLowMemory()).thenReturn(null);
        //when(service.onLowMemory()).thenReturn(Exception);
        verify(MockC, times(1)).methodcc();
//verify()
       // classd.onLowMemory();
    }

    @Test
    public void testQuery()  {
        assertNotNull(mockA);
        when(mockA.isAvailable()).thenReturn(true);
        ClassMockitoB t  = new ClassMockitoB(mockA);
        boolean check = t.query("* from t");
        assertTrue(check);
    }

    @Test
   public void ensureMockitoReturnsTheConfiguredValue() {

        // define return value for method getUniqueId()
        when(mockA.getUniqueId()).thenReturn("cake");

        ClassMockitoB service = new ClassMockitoB(mockA);
        // use mock in test....
        assertEquals(service.toString(), "cake");
    }


    @Test
    public void testOverridenMethod() {
        when(mockA.onStartCommand(inte,0,0)).thenReturn(1);
        //verify(databaseMock).onStartCommand(inte,0,0);
        verify(databaseMockB).query("ddd");
//  onStartCOmman can defenitely be called
    }
/*






    @Test
    public void testVerify(@Mock ClassMockitoA database) {
        // create and configure mock

        when(database.getUniqueId()).thenReturn("cake");


        // call method testing on the mock with parameter 12
        database.setUniqueId("cake");
        database.getUniqueId();
        database.getUniqueId();
        verify(database).setUniqueId(ArgumentMatchers.eq("cake"));

        // was the method called twice?
      //  verify(database, times(2)).getUniqueId();

        // other alternatives for verifiying the number of method calls for a method
       // verify(database, never()).isAvailable();
        //verify(database, never()).setUniqueId("cake");
    }


 */



    @Test
    public void testOverridenMethodAllInside() {
        ClassMockitoA aa = mock( ClassMockitoA.class);
        ClassMockitoB bb = mock( ClassMockitoB.class);

aa.onStartCommand(inte,0,0);

        verify(bb).query("ddd");
//  onStartCOmman can defenitely be called
    }


    @Test
    public void testVerifyB() {
        // create and configure mock

        // cake , coke still passes the test
        when(mockA.getUniqueId()).thenReturn("cake");
        mockA.getUniqueId();
      //  verify(databaseMock).setUniqueId(ArgumentMatchers.eq("cake"));

        verify(mockA).getUniqueId();
        verify(mockA).getUniqueId();

        // call method testing on the mock with parameter 12
      //  databaseMock.setUniqueId("cake");
     //   databaseMock.getUniqueId();
    }



    @Test
    public void testVerifyC() {
        // create and configure mock

        when(mockA.getUniqueId()).thenReturn("cake");
        mockA.getUniqueId();
        //  verify(database Mock).setUniqueId(ArgumentMatchers.eq("cake"));
        verify(mockA).getUniqueId();

        // call method testing on the mock with parameter 12
        //  databaseMock.setUniqueId("cake");
        //   databaseMock.getUniqueId();
    }

}
