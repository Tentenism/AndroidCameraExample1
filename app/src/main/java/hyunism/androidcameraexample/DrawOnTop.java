package hyunism.androidcameraexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by 608-6 on 2017-06-08.
 */

public class DrawOnTop extends SurfaceView {

    public DrawOnTop(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setTextSize(20);
        canvas.drawText("손을 선안에 넣어주세요", 20, 20, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        paint.setColor(Color.RED);

        Path path = new Path();
        path.moveTo(50, 50);
        path.lineTo(100, 0);

        path.lineTo(150, 50);
        path.close();

        path.offset(110, 150);
        canvas.drawPath(path, paint);

        super.onDraw(canvas);
    }
}