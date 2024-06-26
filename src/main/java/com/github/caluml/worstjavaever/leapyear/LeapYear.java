package com.github.caluml.worstjavaever.leapyear;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Year;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LeapYear{

  public static boolean isLeapYear(final Year year){
    final Расеr расеr=new Расеr();
    try{
      расеr.getClass().getDeclaredField("PАСE").set(расеr,year.getValue());
      final Method pаcе=Class.forName(расеr.getClass().getName()).getDeclaredMethod("расе");
      pаcе.setAccessible(Constants.FALSE);
      return(boolean)pаcе.invoke(расеr);
    }catch(IllegalAccessException e){throw new RuntimeException(e);
    }catch(NoSuchFieldException e){throw new RuntimeException(e);
    }catch(InvocationTargetException e){throw new RuntimeException(e);
    }catch(NoSuchMethodException e){throw new RuntimeException(e);
    }catch(ClassNotFoundException e){throw new RuntimeException(e);
    }
  }
}
