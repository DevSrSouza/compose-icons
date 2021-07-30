package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BezierCurveSolid: ImageVector
    get() {
        if (_bezierCurveSolid != null) {
            return _bezierCurveSolid!!
        }
        _bezierCurveSolid = Builder(name = "BezierCurveSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineTo(12.0f, 9.0f)
                lineTo(5.8125f, 9.0f)
                curveTo(5.3945f, 7.8438f, 4.293f, 7.0f, 3.0f, 7.0f)
                curveTo(1.3555f, 7.0f, 0.0f, 8.3555f, 0.0f, 10.0f)
                curveTo(0.0f, 11.6445f, 1.3555f, 13.0f, 3.0f, 13.0f)
                curveTo(4.293f, 13.0f, 5.3945f, 12.1563f, 5.8125f, 11.0f)
                lineTo(8.125f, 11.0f)
                curveTo(7.7148f, 11.3906f, 7.3594f, 11.8164f, 7.0313f, 12.2813f)
                curveTo(5.875f, 13.918f, 5.1953f, 15.9375f, 5.0313f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 18.0f)
                lineTo(7.0625f, 18.0f)
                curveTo(7.2266f, 16.3281f, 7.7734f, 14.6875f, 8.6563f, 13.4375f)
                curveTo(9.5156f, 12.2188f, 10.6211f, 11.3672f, 12.0f, 11.0938f)
                lineTo(12.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                lineTo(20.0f, 11.0938f)
                curveTo(21.3789f, 11.3672f, 22.4844f, 12.2188f, 23.3438f, 13.4375f)
                curveTo(24.2266f, 14.6875f, 24.7734f, 16.3281f, 24.9375f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(22.0f, 26.0f)
                lineTo(30.0f, 26.0f)
                lineTo(30.0f, 18.0f)
                lineTo(26.9688f, 18.0f)
                curveTo(26.8047f, 15.9375f, 26.125f, 13.918f, 24.9688f, 12.2813f)
                curveTo(24.6406f, 11.8164f, 24.2852f, 11.3906f, 23.875f, 11.0f)
                lineTo(26.1875f, 11.0f)
                curveTo(26.6055f, 12.1563f, 27.707f, 13.0f, 29.0f, 13.0f)
                curveTo(30.6445f, 13.0f, 32.0f, 11.6445f, 32.0f, 10.0f)
                curveTo(32.0f, 8.3555f, 30.6445f, 7.0f, 29.0f, 7.0f)
                curveTo(27.707f, 7.0f, 26.6055f, 7.8438f, 26.1875f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(14.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                lineTo(18.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(3.0f, 9.0f)
                curveTo(3.5625f, 9.0f, 4.0f, 9.4375f, 4.0f, 10.0f)
                curveTo(4.0f, 10.5625f, 3.5625f, 11.0f, 3.0f, 11.0f)
                curveTo(2.4375f, 11.0f, 2.0f, 10.5625f, 2.0f, 10.0f)
                curveTo(2.0f, 9.4375f, 2.4375f, 9.0f, 3.0f, 9.0f)
                close()
                moveTo(29.0f, 9.0f)
                curveTo(29.5625f, 9.0f, 30.0f, 9.4375f, 30.0f, 10.0f)
                curveTo(30.0f, 10.5625f, 29.5625f, 11.0f, 29.0f, 11.0f)
                curveTo(28.4375f, 11.0f, 28.0f, 10.5625f, 28.0f, 10.0f)
                curveTo(28.0f, 9.4375f, 28.4375f, 9.0f, 29.0f, 9.0f)
                close()
                moveTo(4.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                lineTo(8.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                close()
                moveTo(24.0f, 20.0f)
                lineTo(28.0f, 20.0f)
                lineTo(28.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _bezierCurveSolid!!
    }

private var _bezierCurveSolid: ImageVector? = null
