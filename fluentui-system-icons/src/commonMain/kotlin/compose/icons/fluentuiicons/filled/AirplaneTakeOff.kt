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

public val FilledGroup.AirplaneTakeOff: ImageVector
    get() {
        if (_airplaneTakeOff != null) {
            return _airplaneTakeOff!!
        }
        _airplaneTakeOff = Builder(name = "AirplaneTakeOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3937f, 5.9252f)
                lineTo(10.5225f, 4.4103f)
                curveTo(10.1945f, 4.1449f, 9.7853f, 4.0f, 9.3634f, 4.0f)
                curveTo(7.956f, 4.0f, 7.0684f, 5.5143f, 7.7561f, 6.7422f)
                lineTo(8.1376f, 7.4235f)
                lineTo(11.6014f, 6.7019f)
                curveTo(11.6567f, 6.6904f, 11.7711f, 6.6412f, 11.8952f, 6.4917f)
                curveTo(12.0355f, 6.3227f, 12.2028f, 6.1297f, 12.3937f, 5.9252f)
                close()
                moveTo(3.0f, 20.0f)
                curveTo(3.0f, 19.4477f, 3.4477f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 19.0f, 21.0f, 19.4477f, 21.0f, 20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                close()
                moveTo(21.547f, 6.8293f)
                curveTo(20.6017f, 5.7462f, 18.9302f, 4.3303f, 16.6924f, 4.5026f)
                curveTo(15.7632f, 4.5742f, 14.9221f, 5.0518f, 14.2634f, 5.5597f)
                curveTo(13.5935f, 6.0762f, 13.0355f, 6.684f, 12.6647f, 7.1307f)
                curveTo(12.4221f, 7.4228f, 12.1192f, 7.6157f, 11.8053f, 7.6811f)
                lineTo(7.1419f, 8.6527f)
                lineTo(6.176f, 6.8818f)
                curveTo(5.8796f, 6.3385f, 5.3102f, 6.0004f, 4.6912f, 6.0004f)
                curveTo(3.7572f, 6.0004f, 3.0f, 6.7576f, 3.0f, 7.6917f)
                verticalLineTo(11.3815f)
                curveTo(3.0f, 12.822f, 4.3123f, 13.906f, 5.7269f, 13.6339f)
                lineTo(9.0276f, 12.999f)
                lineTo(8.5195f, 14.2331f)
                curveTo(7.9764f, 15.5522f, 8.9463f, 17.0004f, 10.3728f, 17.0004f)
                curveTo(11.0037f, 17.0004f, 11.5978f, 16.7034f, 11.9763f, 16.1987f)
                lineTo(15.212f, 11.8842f)
                lineTo(20.5827f, 10.0324f)
                curveTo(21.2312f, 9.8088f, 21.7201f, 9.314f, 21.9247f, 8.7122f)
                curveTo(22.1337f, 8.0974f, 22.0357f, 7.3893f, 21.547f, 6.8293f)
                close()
            }
        }
        .build()
        return _airplaneTakeOff!!
    }

private var _airplaneTakeOff: ImageVector? = null
