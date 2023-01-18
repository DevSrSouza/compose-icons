package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.LiveOff: ImageVector
    get() {
        if (_liveOff != null) {
            return _liveOff!!
        }
        _liveOff = Builder(name = "LiveOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(4.4182f, 5.4789f)
                curveTo(1.0318f, 9.4076f, 1.2021f, 15.3442f, 4.9289f, 19.0711f)
                curveTo(5.2218f, 19.364f, 5.6967f, 19.364f, 5.9896f, 19.0711f)
                curveTo(6.2825f, 18.7782f, 6.2825f, 18.3033f, 5.9896f, 18.0104f)
                curveTo(2.8489f, 14.8697f, 2.6798f, 9.8826f, 5.4823f, 6.543f)
                lineTo(7.2598f, 8.3206f)
                curveTo(5.428f, 10.6744f, 5.5938f, 14.0791f, 7.7574f, 16.2426f)
                curveTo(8.0503f, 16.5355f, 8.5251f, 16.5355f, 8.818f, 16.2426f)
                curveTo(9.1109f, 15.9498f, 9.1109f, 15.4749f, 8.818f, 15.182f)
                curveTo(7.2414f, 13.6053f, 7.0792f, 11.1498f, 8.3316f, 9.3924f)
                lineTo(10.5508f, 11.6116f)
                curveTo(10.5177f, 11.7355f, 10.5f, 11.8657f, 10.5f, 12.0f)
                curveTo(10.5f, 12.8284f, 11.1716f, 13.5f, 12.0f, 13.5f)
                curveTo(12.1343f, 13.5f, 12.2645f, 13.4824f, 12.3884f, 13.4492f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(19.3885f, 16.2068f)
                lineTo(20.4822f, 17.3006f)
                curveTo(22.8997f, 13.4397f, 22.4293f, 8.2872f, 19.0711f, 4.9289f)
                curveTo(18.7782f, 4.636f, 18.3033f, 4.636f, 18.0104f, 4.9289f)
                curveTo(17.7175f, 5.2218f, 17.7175f, 5.6967f, 18.0104f, 5.9896f)
                curveTo(20.7791f, 8.7583f, 21.2385f, 12.9619f, 19.3885f, 16.2068f)
                close()
                moveTo(16.3472f, 13.1655f)
                lineTo(17.5252f, 14.3434f)
                curveTo(18.4507f, 12.1592f, 18.0232f, 9.5379f, 16.2426f, 7.7574f)
                curveTo(15.9497f, 7.4645f, 15.4749f, 7.4645f, 15.182f, 7.7574f)
                curveTo(14.8891f, 8.0503f, 14.8891f, 8.5251f, 15.182f, 8.818f)
                curveTo(16.3598f, 9.9958f, 16.7482f, 11.6642f, 16.3472f, 13.1655f)
                close()
            }
        }
        .build()
        return _liveOff!!
    }

private var _liveOff: ImageVector? = null
