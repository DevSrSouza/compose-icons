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

public val FilledGroup.ChatWarning: ImageVector
    get() {
        if (_chatWarning != null) {
            return _chatWarning!!
        }
        _chatWarning = Builder(name = "ChatWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.998f)
                curveTo(22.0f, 6.4752f, 17.5228f, 1.998f, 12.0f, 1.998f)
                curveTo(6.4771f, 1.998f, 2.0f, 6.4752f, 2.0f, 11.998f)
                curveTo(2.0f, 13.6408f, 2.3972f, 15.2274f, 3.1449f, 16.6483f)
                lineTo(2.0285f, 20.9367f)
                curveTo(1.992f, 21.0771f, 1.992f, 21.2246f, 2.0286f, 21.3651f)
                curveTo(2.1469f, 21.8194f, 2.6111f, 22.0917f, 3.0654f, 21.9734f)
                lineTo(7.3558f, 20.8563f)
                curveTo(8.7752f, 21.602f, 10.3596f, 21.998f, 12.0f, 21.998f)
                curveTo(17.5228f, 21.998f, 22.0f, 17.5209f, 22.0f, 11.998f)
                close()
                moveTo(12.0f, 6.4995f)
                curveTo(12.4142f, 6.4995f, 12.75f, 6.8353f, 12.75f, 7.2495f)
                verticalLineTo(13.4995f)
                curveTo(12.75f, 13.9137f, 12.4142f, 14.2495f, 12.0f, 14.2495f)
                curveTo(11.5858f, 14.2495f, 11.25f, 13.9137f, 11.25f, 13.4995f)
                verticalLineTo(7.2495f)
                curveTo(11.25f, 6.8353f, 11.5858f, 6.4995f, 12.0f, 6.4995f)
                close()
                moveTo(13.0f, 16.4974f)
                curveTo(13.0f, 17.0497f, 12.5523f, 17.4974f, 12.0f, 17.4974f)
                curveTo(11.4477f, 17.4974f, 11.0f, 17.0497f, 11.0f, 16.4974f)
                curveTo(11.0f, 15.9451f, 11.4477f, 15.4974f, 12.0f, 15.4974f)
                curveTo(12.5523f, 15.4974f, 13.0f, 15.9451f, 13.0f, 16.4974f)
                close()
            }
        }
        .build()
        return _chatWarning!!
    }

private var _chatWarning: ImageVector? = null
