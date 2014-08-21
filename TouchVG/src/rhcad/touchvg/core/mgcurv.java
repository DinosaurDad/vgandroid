/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class mgcurv {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected mgcurv(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(mgcurv obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_mgcurv(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void fitBezier(Point2d pts, float t, Point2d fitpt) {
    touchvgJNI.mgcurv_fitBezier(Point2d.getCPtr(pts), pts, t, Point2d.getCPtr(fitpt), fitpt);
  }

  public static void bezierTanget(Point2d pts, float t, Point2d outpt) {
    touchvgJNI.mgcurv_bezierTanget(Point2d.getCPtr(pts), pts, t, Point2d.getCPtr(outpt), outpt);
  }

  public static void splitBezier(Point2d pts, float t, Point2d pts1, Point2d pts2) {
    touchvgJNI.mgcurv_splitBezier(Point2d.getCPtr(pts), pts, t, Point2d.getCPtr(pts1), pts1, Point2d.getCPtr(pts2), pts2);
  }

  public static float lengthOfBezier(Point2d pts, float tol) {
    return touchvgJNI.mgcurv_lengthOfBezier(Point2d.getCPtr(pts), pts, tol);
  }

  public static void bezier4P(Point2d pt1, Point2d pt2, Point2d pt3, Point2d pt4, Point2d ctrpt1, Point2d ctrpt2) {
    touchvgJNI.mgcurv_bezier4P(Point2d.getCPtr(pt1), pt1, Point2d.getCPtr(pt2), pt2, Point2d.getCPtr(pt3), pt3, Point2d.getCPtr(pt4), pt4, Point2d.getCPtr(ctrpt1), ctrpt1, Point2d.getCPtr(ctrpt2), ctrpt2);
  }

  public static int fitCurve(int knotCount, Point2d knots, Vector2d knotvs, int count, Point2d pts, float tol) {
    return touchvgJNI.mgcurv_fitCurve(knotCount, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs, count, Point2d.getCPtr(pts), pts, tol);
  }

  public static void quadBezierToCubic(Point2d quad, Point2d cubic) {
    touchvgJNI.mgcurv_quadBezierToCubic(Point2d.getCPtr(quad), quad, Point2d.getCPtr(cubic), cubic);
  }

  public static void ellipse90ToBezier(Point2d frompt, Point2d topt, Point2d ctrpt1, Point2d ctrpt2) {
    touchvgJNI.mgcurv_ellipse90ToBezier(Point2d.getCPtr(frompt), frompt, Point2d.getCPtr(topt), topt, Point2d.getCPtr(ctrpt1), ctrpt1, Point2d.getCPtr(ctrpt2), ctrpt2);
  }

  public static void ellipseToBezier(Point2d points, Point2d center, float rx, float ry) {
    touchvgJNI.mgcurv_ellipseToBezier(Point2d.getCPtr(points), points, Point2d.getCPtr(center), center, rx, ry);
  }

  public static void roundRectToBeziers(Point2d points, Box2d rect, float rx, float ry) {
    touchvgJNI.mgcurv_roundRectToBeziers(Point2d.getCPtr(points), points, Box2d.getCPtr(rect), rect, rx, ry);
  }

  public static int arcToBezier(Point2d points, Point2d center, float rx, float ry, float startAngle, float sweepAngle) {
    return touchvgJNI.mgcurv_arcToBezier(Point2d.getCPtr(points), points, Point2d.getCPtr(center), center, rx, ry, startAngle, sweepAngle);
  }

  public static int insectTwoCircles(Point2d pt1, Point2d pt2, Point2d c1, float r1, Point2d c2, float r2) {
    return touchvgJNI.mgcurv_insectTwoCircles(Point2d.getCPtr(pt1), pt1, Point2d.getCPtr(pt2), pt2, Point2d.getCPtr(c1), c1, r1, Point2d.getCPtr(c2), c2, r2);
  }

  public static boolean cubicSplines(int n, Point2d knots, Vector2d knotvs, int flag, float tension) {
    return touchvgJNI.mgcurv_cubicSplines__SWIG_0(n, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs, flag, tension);
  }

  public static boolean cubicSplines(int n, Point2d knots, Vector2d knotvs, int flag) {
    return touchvgJNI.mgcurv_cubicSplines__SWIG_1(n, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs, flag);
  }

  public static boolean cubicSplines(int n, Point2d knots, Vector2d knotvs) {
    return touchvgJNI.mgcurv_cubicSplines__SWIG_2(n, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs);
  }

  public static void fitCubicSpline(int n, Point2d knots, Vector2d knotvs, int i, float t, Point2d fitpt) {
    touchvgJNI.mgcurv_fitCubicSpline(n, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs, i, t, Point2d.getCPtr(fitpt), fitpt);
  }

  public static void cubicSplineToBezier(int n, Point2d knots, Vector2d knotvs, int i, Point2d points, boolean hermite) {
    touchvgJNI.mgcurv_cubicSplineToBezier__SWIG_0(n, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs, i, Point2d.getCPtr(points), points, hermite);
  }

  public static void cubicSplineToBezier(int n, Point2d knots, Vector2d knotvs, int i, Point2d points) {
    touchvgJNI.mgcurv_cubicSplineToBezier__SWIG_1(n, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs, i, Point2d.getCPtr(points), points);
  }

  public static int bsplinesToBeziers(Point2d points, int n, Point2d ctlpts, boolean closed) {
    return touchvgJNI.mgcurv_bsplinesToBeziers(Point2d.getCPtr(points), points, n, Point2d.getCPtr(ctlpts), ctlpts, closed);
  }

  public mgcurv() {
    this(touchvgJNI.new_mgcurv(), true);
  }

  public final static class SplineFlags {
    public final static mgcurv.SplineFlags cubicTan1 = new mgcurv.SplineFlags("cubicTan1", 1);
    public final static mgcurv.SplineFlags cubicArm1 = new mgcurv.SplineFlags("cubicArm1", 2);
    public final static mgcurv.SplineFlags cubicTan2 = new mgcurv.SplineFlags("cubicTan2", 4);
    public final static mgcurv.SplineFlags cubicArm2 = new mgcurv.SplineFlags("cubicArm2", 8);
    public final static mgcurv.SplineFlags cubicLoop = new mgcurv.SplineFlags("cubicLoop", 16);

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static SplineFlags swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + SplineFlags.class + " with value " + swigValue);
    }

    private SplineFlags(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private SplineFlags(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private SplineFlags(String swigName, SplineFlags swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static SplineFlags[] swigValues = { cubicTan1, cubicArm1, cubicTan2, cubicArm2, cubicLoop };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}