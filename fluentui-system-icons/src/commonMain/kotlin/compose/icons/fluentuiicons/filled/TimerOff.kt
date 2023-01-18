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

public val FilledGroup.TimerOff: ImageVector
    get() {
        if (_timerOff != null) {
            return _timerOff!!
        }
        _timerOff = Builder(name = "TimerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(6.2132f, 7.274f)
                curveTo(4.5441f, 8.826f, 3.5f, 11.041f, 3.5f, 13.5f)
                curveTo(3.5f, 18.1944f, 7.3056f, 22.0f, 12.0f, 22.0f)
                curveTo(14.4589f, 22.0f, 16.6739f, 20.9559f, 18.2259f, 19.2869f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(12.6164f, 13.6773f)
                curveTo(12.481f, 13.8723f, 12.2554f, 14.0f, 12.0f, 14.0f)
                curveTo(11.6203f, 14.0f, 11.3065f, 13.7178f, 11.2568f, 13.3518f)
                lineTo(11.25f, 13.25f)
                verticalLineTo(12.3108f)
                lineTo(12.6164f, 13.6773f)
                close()
                moveTo(12.75f, 8.75f)
                verticalLineTo(9.5682f)
                lineTo(19.8784f, 16.6967f)
                curveTo(20.2792f, 15.7099f, 20.5f, 14.6307f, 20.5f, 13.5f)
                curveTo(20.5f, 8.8056f, 16.6944f, 5.0f, 12.0f, 5.0f)
                curveTo(10.8693f, 5.0f, 9.7902f, 5.2208f, 8.8034f, 5.6215f)
                lineTo(11.4367f, 8.2548f)
                curveTo(11.5741f, 8.0986f, 11.7756f, 8.0f, 12.0f, 8.0f)
                curveTo(12.3797f, 8.0f, 12.6935f, 8.2822f, 12.7432f, 8.6482f)
                lineTo(12.75f, 8.75f)
                close()
                moveTo(19.1704f, 5.1226f)
                lineTo(19.2517f, 5.1842f)
                lineTo(20.4008f, 6.1842f)
                curveTo(20.7132f, 6.4562f, 20.7461f, 6.9299f, 20.4742f, 7.2424f)
                curveTo(20.2249f, 7.5288f, 19.8061f, 7.5803f, 19.4973f, 7.3774f)
                lineTo(19.416f, 7.3158f)
                lineTo(18.267f, 6.3158f)
                curveTo(17.9545f, 6.0438f, 17.9217f, 5.5701f, 18.1936f, 5.2576f)
                curveTo(18.4428f, 4.9712f, 18.8617f, 4.9197f, 19.1704f, 5.1226f)
                close()
                moveTo(14.25f, 2.5f)
                curveTo(14.6642f, 2.5f, 15.0f, 2.8358f, 15.0f, 3.25f)
                curveTo(15.0f, 3.6297f, 14.7178f, 3.9435f, 14.3518f, 3.9931f)
                lineTo(14.25f, 4.0f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 4.0f, 9.0f, 3.6642f, 9.0f, 3.25f)
                curveTo(9.0f, 2.8703f, 9.2822f, 2.5565f, 9.6482f, 2.5068f)
                lineTo(9.75f, 2.5f)
                horizontalLineTo(14.25f)
                close()
            }
        }
        .build()
        return _timerOff!!
    }

private var _timerOff: ImageVector? = null
