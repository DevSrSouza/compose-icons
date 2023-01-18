package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.TextColor: ImageVector
    get() {
        if (_textColor != null) {
            return _textColor!!
        }
        _textColor = Builder(name = "TextColor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 14.5005f)
                curveTo(18.9926f, 14.5005f, 20.0f, 15.5079f, 20.0f, 16.7505f)
                verticalLineTo(19.7504f)
                curveTo(20.0f, 20.993f, 18.9926f, 22.0004f, 17.75f, 22.0004f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 22.0004f, 3.0f, 20.993f, 3.0f, 19.7504f)
                verticalLineTo(16.7505f)
                curveTo(3.0f, 15.5079f, 4.0074f, 14.5005f, 5.25f, 14.5005f)
                horizontalLineTo(17.75f)
                close()
                moveTo(7.0525f, 11.9694f)
                lineTo(10.8061f, 2.4743f)
                curveTo(11.0415f, 1.8788f, 11.8486f, 1.8441f, 12.1508f, 2.3698f)
                lineTo(12.2013f, 2.4749f)
                lineTo(15.9477f, 11.9754f)
                curveTo(16.0997f, 12.3607f, 15.9105f, 12.7962f, 15.5251f, 12.9482f)
                curveTo(15.1719f, 13.0875f, 14.7765f, 12.9401f, 14.596f, 12.6178f)
                lineTo(14.5523f, 12.5256f)
                lineTo(13.556f, 10.0f)
                horizontalLineTo(9.443f)
                lineTo(8.4475f, 12.5209f)
                curveTo(8.3079f, 12.874f, 7.9301f, 13.0621f, 7.5714f, 12.9737f)
                lineTo(7.4743f, 12.9426f)
                curveTo(7.1212f, 12.803f, 6.9331f, 12.4253f, 7.0215f, 12.0666f)
                lineTo(7.0525f, 11.9694f)
                lineTo(10.8061f, 2.4743f)
                lineTo(7.0525f, 11.9694f)
                close()
                moveTo(11.5027f, 4.7923f)
                lineTo(10.036f, 8.5f)
                horizontalLineTo(12.964f)
                lineTo(11.5027f, 4.7923f)
                close()
            }
        }
        .build()
        return _textColor!!
    }

private var _textColor: ImageVector? = null
