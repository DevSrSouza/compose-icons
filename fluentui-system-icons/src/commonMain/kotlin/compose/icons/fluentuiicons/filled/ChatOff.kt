package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ChatOff: ImageVector
    get() {
        if (_chatOff != null) {
            return _chatOff!!
        }
        _chatOff = Builder(name = "ChatOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(4.4184f, 5.4791f)
                curveTo(2.9111f, 7.2299f, 2.0f, 9.5085f, 2.0f, 12.0f)
                curveTo(2.0f, 13.6428f, 2.3972f, 15.2294f, 3.1449f, 16.6503f)
                lineTo(2.0285f, 20.9386f)
                curveTo(1.992f, 21.0791f, 1.992f, 21.2266f, 2.0286f, 21.367f)
                curveTo(2.1469f, 21.8213f, 2.6111f, 22.0937f, 3.0654f, 21.9753f)
                lineTo(7.3558f, 20.8583f)
                curveTo(8.7752f, 21.6039f, 10.3596f, 22.0f, 12.0f, 22.0f)
                curveTo(14.4914f, 22.0f, 16.77f, 21.0889f, 18.5208f, 19.5818f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(13.4201f, 14.481f)
                curveTo(13.3983f, 14.486f, 13.376f, 14.4901f, 13.3535f, 14.4932f)
                lineTo(13.2517f, 14.5f)
                horizontalLineTo(8.75f)
                lineTo(8.6482f, 14.4932f)
                curveTo(8.2822f, 14.4435f, 8.0f, 14.1297f, 8.0f, 13.75f)
                curveTo(8.0f, 13.3703f, 8.2822f, 13.0565f, 8.6482f, 13.0069f)
                lineTo(8.75f, 13.0f)
                horizontalLineTo(11.9392f)
                lineTo(13.4201f, 14.481f)
                close()
                moveTo(9.9392f, 11.0f)
                horizontalLineTo(8.75f)
                lineTo(8.6482f, 10.9932f)
                curveTo(8.2822f, 10.9435f, 8.0f, 10.6297f, 8.0f, 10.25f)
                curveTo(8.0f, 9.9284f, 8.2024f, 9.6541f, 8.4867f, 9.5475f)
                lineTo(9.9392f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 11.0f)
                horizontalLineTo(14.1818f)
                lineTo(20.4816f, 17.2999f)
                curveTo(21.4438f, 15.7634f, 22.0f, 13.9466f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4772f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(10.0534f, 2.0f, 8.2368f, 2.5562f, 6.7003f, 3.5183f)
                lineTo(12.6818f, 9.5f)
                horizontalLineTo(15.25f)
                lineTo(15.3518f, 9.5069f)
                curveTo(15.7178f, 9.5565f, 16.0f, 9.8703f, 16.0f, 10.25f)
                curveTo(16.0f, 10.6297f, 15.7178f, 10.9435f, 15.3518f, 10.9932f)
                lineTo(15.25f, 11.0f)
                close()
            }
        }
        .build()
        return _chatOff!!
    }

private var _chatOff: ImageVector? = null
