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

public val CssGgIcons.ColorPicker: ImageVector
    get() {
        if (_colorPicker != null) {
            return _colorPicker!!
        }
        _colorPicker = Builder(name = "ColorPicker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.385f, 2.879f)
                curveTo(19.213f, 1.707f, 17.314f, 1.707f, 16.142f, 2.879f)
                lineTo(14.02f, 5.001f)
                lineTo(13.313f, 4.293f)
                curveTo(12.922f, 3.903f, 12.289f, 3.903f, 11.899f, 4.293f)
                curveTo(11.508f, 4.684f, 11.508f, 5.317f, 11.899f, 5.708f)
                lineTo(17.556f, 11.364f)
                curveTo(17.946f, 11.755f, 18.579f, 11.755f, 18.97f, 11.364f)
                curveTo(19.36f, 10.974f, 19.36f, 10.341f, 18.97f, 9.95f)
                lineTo(18.263f, 9.243f)
                lineTo(20.385f, 7.121f)
                curveTo(21.556f, 5.95f, 21.556f, 4.05f, 20.385f, 2.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.93f, 7.091f)
                lineTo(4.152f, 14.869f)
                curveTo(3.228f, 15.793f, 3.032f, 17.169f, 3.565f, 18.284f)
                lineTo(2.0f, 19.849f)
                lineTo(3.414f, 21.264f)
                lineTo(4.979f, 19.698f)
                curveTo(6.094f, 20.231f, 7.47f, 20.036f, 8.394f, 19.112f)
                lineTo(16.172f, 11.334f)
                lineTo(11.93f, 7.091f)
                close()
                moveTo(13.344f, 11.334f)
                lineTo(11.93f, 9.92f)
                lineTo(5.566f, 16.284f)
                curveTo(5.175f, 16.674f, 5.175f, 17.307f, 5.566f, 17.698f)
                curveTo(5.956f, 18.088f, 6.589f, 18.088f, 6.98f, 17.698f)
                lineTo(13.344f, 11.334f)
                close()
            }
        }
        .build()
        return _colorPicker!!
    }

private var _colorPicker: ImageVector? = null
