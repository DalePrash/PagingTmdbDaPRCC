package com.example.pagingtmdbdapr;
import com.example.pagingtmdbdapr.mockito.ClassMockitoB;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import java.util.concurrent.atomic.AtomicReference;
 import com.example.pagingtmdbdapr.mockito.ClassMockitoB.Dummy;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

class XStaticTest {



    @Test
    void testStaticMockSimple() {


        MockedStatic<Dummy> mockStatic = Mockito.mockStatic(Dummy.class);
      //  try (MockedStatic<Utility> mockedStatic = Mockito.mockStatic(Dummy.class)) {
        /*
        assertEquals("foo", ClassMockitoB.Dummy.foo());
        try (MockedStatic<ClassMockitoB.Dummy> ignored = mockStatic(Dummy.class)) {
            assertNull(Dummy.foo());
        }
        assertEquals("foo", Dummy.foo());

         */
    }



    @Test
    void testStaticMockWithVerification() {
        try (MockedStatic<Dummy> dummy = mockStatic(Dummy.class)) {
            dummy.when(Dummy::foo).thenReturn("bar");
         //   assertEquals("bar", Dummy.foo());
            dummy.verify(Dummy::foo);
        }
    }

}
