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

public val FilledGroup.MicOff: ImageVector
    get() {
        if (_micOff != null) {
            return _micOff!!
        }
        _micOff = Builder(name = "MicOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(8.0f, 9.0608f)
                verticalLineTo(12.0f)
                curveTo(8.0f, 14.2091f, 9.7909f, 16.0f, 12.0f, 16.0f)
                curveTo(12.8335f, 16.0f, 13.6074f, 15.7451f, 14.2481f, 15.309f)
                lineTo(15.394f, 16.4549f)
                curveTo(14.5176f, 17.1112f, 13.4292f, 17.5f, 12.25f, 17.5f)
                horizontalLineTo(11.75f)
                lineTo(11.5336f, 17.4956f)
                curveTo(8.7345f, 17.3821f, 6.5f, 15.077f, 6.5f, 12.25f)
                verticalLineTo(11.75f)
                lineTo(6.4932f, 11.6482f)
                curveTo(6.4435f, 11.2822f, 6.1297f, 11.0f, 5.75f, 11.0f)
                curveTo(5.3358f, 11.0f, 5.0f, 11.3358f, 5.0f, 11.75f)
                verticalLineTo(12.25f)
                lineTo(5.0041f, 12.4863f)
                curveTo(5.1228f, 15.938f, 7.8332f, 18.7316f, 11.25f, 18.9818f)
                lineTo(11.25f, 21.25f)
                lineTo(11.2568f, 21.3518f)
                curveTo(11.3065f, 21.7178f, 11.6203f, 22.0f, 12.0f, 22.0f)
                curveTo(12.4142f, 22.0f, 12.75f, 21.6642f, 12.75f, 21.25f)
                lineTo(12.751f, 18.9817f)
                curveTo(14.15f, 18.8791f, 15.4305f, 18.35f, 16.4631f, 17.5241f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(17.1962f, 14.0144f)
                lineTo(18.3421f, 15.1604f)
                curveTo(18.7638f, 14.2791f, 19.0f, 13.2921f, 19.0f, 12.25f)
                verticalLineTo(11.75f)
                lineTo(18.9932f, 11.6482f)
                curveTo(18.9435f, 11.2822f, 18.6297f, 11.0f, 18.25f, 11.0f)
                curveTo(17.8358f, 11.0f, 17.5f, 11.3358f, 17.5f, 11.75f)
                verticalLineTo(12.25f)
                lineTo(17.4956f, 12.4664f)
                curveTo(17.4737f, 13.0075f, 17.3698f, 13.5276f, 17.1962f, 14.0144f)
                close()
                moveTo(8.1377f, 4.9557f)
                lineTo(15.9301f, 12.7483f)
                curveTo(15.976f, 12.5059f, 16.0f, 12.2558f, 16.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 3.7909f, 14.2091f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1521f, 2.0f, 8.5969f, 3.253f, 8.1377f, 4.9557f)
                close()
            }
        }
        .build()
        return _micOff!!
    }

private var _micOff: ImageVector? = null
