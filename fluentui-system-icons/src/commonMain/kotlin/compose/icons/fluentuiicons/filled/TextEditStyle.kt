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

public val FilledGroup.TextEditStyle: ImageVector
    get() {
        if (_textEditStyle != null) {
            return _textEditStyle!!
        }
        _textEditStyle = Builder(name = "TextEditStyle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0626f, 8.4453f)
                curveTo(21.319f, 9.7025f, 21.3183f, 11.7401f, 20.0612f, 12.9964f)
                lineTo(12.9472f, 20.0984f)
                curveTo(12.6755f, 20.3697f, 12.3388f, 20.5669f, 11.9693f, 20.6713f)
                lineTo(7.3562f, 21.9745f)
                curveTo(6.7851f, 22.1359f, 6.2617f, 21.6013f, 6.4351f, 21.0337f)
                lineTo(7.8226f, 16.4905f)
                curveTo(7.9304f, 16.1374f, 8.1235f, 15.8162f, 8.3848f, 15.5554f)
                lineTo(15.5091f, 8.4427f)
                curveTo(16.7674f, 7.1865f, 18.8058f, 7.1876f, 20.0626f, 8.4453f)
                close()
                moveTo(8.151f, 2.3698f)
                lineTo(8.2015f, 2.4749f)
                lineTo(11.454f, 10.724f)
                lineTo(10.297f, 11.879f)
                lineTo(9.556f, 10.0f)
                horizontalLineTo(5.443f)
                lineTo(4.4477f, 12.5209f)
                curveTo(4.3081f, 12.874f, 3.9303f, 13.0621f, 3.5716f, 12.9737f)
                lineTo(3.4745f, 12.9426f)
                curveTo(3.1214f, 12.803f, 2.9333f, 12.4253f, 3.0217f, 12.0666f)
                lineTo(3.0527f, 11.9694f)
                lineTo(6.8063f, 2.4743f)
                curveTo(7.0417f, 1.8788f, 7.8488f, 1.8441f, 8.151f, 2.3698f)
                close()
                moveTo(7.5029f, 4.7923f)
                lineTo(6.036f, 8.5f)
                horizontalLineTo(8.964f)
                lineTo(7.5029f, 4.7923f)
                close()
            }
        }
        .build()
        return _textEditStyle!!
    }

private var _textEditStyle: ImageVector? = null
