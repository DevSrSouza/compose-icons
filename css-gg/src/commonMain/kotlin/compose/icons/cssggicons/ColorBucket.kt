package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ColorBucket: ImageVector
    get() {
        if (_colorBucket != null) {
            return _colorBucket!!
        }
        _colorBucket = Builder(name = "ColorBucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.203f, 2.004f)
                curveTo(9.464f, 2.004f, 10.507f, 3.107f, 10.679f, 4.542f)
                lineTo(19.162f, 13.026f)
                lineTo(11.384f, 20.804f)
                curveTo(10.212f, 21.976f, 8.313f, 21.976f, 7.141f, 20.804f)
                lineTo(2.899f, 16.562f)
                curveTo(1.727f, 15.39f, 1.727f, 13.49f, 2.899f, 12.319f)
                lineTo(5.703f, 9.514f)
                verticalLineTo(4.961f)
                curveTo(5.703f, 3.328f, 6.823f, 2.004f, 8.203f, 2.004f)
                close()
                moveTo(8.703f, 4.961f)
                verticalLineTo(6.514f)
                lineTo(7.703f, 7.514f)
                verticalLineTo(4.961f)
                curveTo(7.703f, 4.634f, 7.927f, 4.37f, 8.203f, 4.37f)
                curveTo(8.48f, 4.37f, 8.703f, 4.634f, 8.703f, 4.961f)
                close()
                moveTo(8.703f, 10.875f)
                verticalLineTo(9.342f)
                lineTo(4.313f, 13.733f)
                curveTo(3.922f, 14.124f, 3.922f, 14.757f, 4.313f, 15.147f)
                lineTo(8.556f, 19.39f)
                curveTo(8.946f, 19.78f, 9.579f, 19.78f, 9.97f, 19.39f)
                lineTo(16.334f, 13.026f)
                lineTo(10.703f, 7.396f)
                verticalLineTo(10.875f)
                curveTo(10.703f, 10.918f, 10.703f, 10.961f, 10.701f, 11.004f)
                horizontalLineTo(8.692f)
                curveTo(8.699f, 10.962f, 8.703f, 10.92f, 8.703f, 10.875f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.859f, 16.875f)
                curveTo(15.687f, 18.046f, 15.687f, 19.946f, 16.859f, 21.118f)
                curveTo(18.03f, 22.289f, 19.93f, 22.289f, 21.101f, 21.118f)
                curveTo(22.273f, 19.946f, 22.273f, 18.046f, 21.101f, 16.875f)
                lineTo(18.98f, 14.754f)
                lineTo(16.859f, 16.875f)
                close()
            }
        }
        .build()
        return _colorBucket!!
    }

private var _colorBucket: ImageVector? = null
