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

public val FilledGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(16.6944f, 5.0f, 20.5f, 8.8056f, 20.5f, 13.5f)
                curveTo(20.5f, 18.1944f, 16.6944f, 22.0f, 12.0f, 22.0f)
                curveTo(7.3056f, 22.0f, 3.5f, 18.1944f, 3.5f, 13.5f)
                curveTo(3.5f, 8.8056f, 7.3056f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(11.6203f, 8.0f, 11.3065f, 8.2822f, 11.2568f, 8.6482f)
                lineTo(11.25f, 8.75f)
                verticalLineTo(13.25f)
                lineTo(11.2568f, 13.3518f)
                curveTo(11.3065f, 13.7178f, 11.6203f, 14.0f, 12.0f, 14.0f)
                curveTo(12.3797f, 14.0f, 12.6935f, 13.7178f, 12.7432f, 13.3518f)
                lineTo(12.75f, 13.25f)
                verticalLineTo(8.75f)
                lineTo(12.7432f, 8.6482f)
                curveTo(12.6935f, 8.2822f, 12.3797f, 8.0f, 12.0f, 8.0f)
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
                curveTo(9.0f, 2.8703f, 9.2822f, 2.5565f, 9.6482f, 2.5069f)
                lineTo(9.75f, 2.5f)
                horizontalLineTo(14.25f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
