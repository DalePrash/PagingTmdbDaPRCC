package com.example.pagingtmdbdapr;

import android.content.Context;

import com.example.pagingtmdbdapr.mockito.ClassMockitoA;
import com.example.pagingtmdbdapr.mockito.ClassMockitoB;
import com.example.pagingtmdbdapr.movieroom.MovieDataBase;

import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.disposables.CompositeDisposable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class XBClass {


    @Mock
    MovieDataBase mock;

    @Mock
    Context context;

    @Test
    public void testX()  {
        mock.close();

    }
}
