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
                lineTo(5.813f, 9.0f)
                curveTo(5.395f, 7.844f, 4.293f, 7.0f, 3.0f, 7.0f)
                curveTo(1.355f, 7.0f, 0.0f, 8.355f, 0.0f, 10.0f)
                curveTo(0.0f, 11.645f, 1.355f, 13.0f, 3.0f, 13.0f)
                curveTo(4.293f, 13.0f, 5.395f, 12.156f, 5.813f, 11.0f)
                lineTo(8.125f, 11.0f)
                curveTo(7.715f, 11.391f, 7.359f, 11.816f, 7.031f, 12.281f)
                curveTo(5.875f, 13.918f, 5.195f, 15.938f, 5.031f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 18.0f)
                lineTo(7.063f, 18.0f)
                curveTo(7.227f, 16.328f, 7.773f, 14.688f, 8.656f, 13.438f)
                curveTo(9.516f, 12.219f, 10.621f, 11.367f, 12.0f, 11.094f)
                lineTo(12.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                lineTo(20.0f, 11.094f)
                curveTo(21.379f, 11.367f, 22.484f, 12.219f, 23.344f, 13.438f)
                curveTo(24.227f, 14.688f, 24.773f, 16.328f, 24.938f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(22.0f, 26.0f)
                lineTo(30.0f, 26.0f)
                lineTo(30.0f, 18.0f)
                lineTo(26.969f, 18.0f)
                curveTo(26.805f, 15.938f, 26.125f, 13.918f, 24.969f, 12.281f)
                curveTo(24.641f, 11.816f, 24.285f, 11.391f, 23.875f, 11.0f)
                lineTo(26.188f, 11.0f)
                curveTo(26.605f, 12.156f, 27.707f, 13.0f, 29.0f, 13.0f)
                curveTo(30.645f, 13.0f, 32.0f, 11.645f, 32.0f, 10.0f)
                curveTo(32.0f, 8.355f, 30.645f, 7.0f, 29.0f, 7.0f)
                curveTo(27.707f, 7.0f, 26.605f, 7.844f, 26.188f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(14.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                lineTo(18.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(3.0f, 9.0f)
                curveTo(3.563f, 9.0f, 4.0f, 9.438f, 4.0f, 10.0f)
                curveTo(4.0f, 10.563f, 3.563f, 11.0f, 3.0f, 11.0f)
                curveTo(2.438f, 11.0f, 2.0f, 10.563f, 2.0f, 10.0f)
                curveTo(2.0f, 9.438f, 2.438f, 9.0f, 3.0f, 9.0f)
                close()
                moveTo(29.0f, 9.0f)
                curveTo(29.563f, 9.0f, 30.0f, 9.438f, 30.0f, 10.0f)
                curveTo(30.0f, 10.563f, 29.563f, 11.0f, 29.0f, 11.0f)
                curveTo(28.438f, 11.0f, 28.0f, 10.563f, 28.0f, 10.0f)
                curveTo(28.0f, 9.438f, 28.438f, 9.0f, 29.0f, 9.0f)
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
