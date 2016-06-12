package net.zerox4c.study.opengles;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class net.zerox4c.study.opengles.StudyOpenGLESActivityTest \
 * net.zerox4c.study.opengles.tests/android.test.InstrumentationTestRunner
 */
public class StudyOpenGLESActivityTest extends ActivityInstrumentationTestCase2<StudyOpenGLESActivity> {

    public StudyOpenGLESActivityTest() {
        super("net.zerox4c.study.opengles", StudyOpenGLESActivity.class);
    }

}
