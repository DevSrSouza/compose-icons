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

public val RegularGroup.ChatWarning: ImageVector
    get() {
        if (_chatWarning != null) {
            return _chatWarning!!
        }
        _chatWarning = Builder(name = "ChatWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                curveTo(12.4142f, 6.5f, 12.75f, 6.8358f, 12.75f, 7.25f)
                verticalLineTo(13.5f)
                curveTo(12.75f, 13.9142f, 12.4142f, 14.25f, 12.0f, 14.25f)
                curveTo(11.5858f, 14.25f, 11.25f, 13.9142f, 11.25f, 13.5f)
                verticalLineTo(7.25f)
                curveTo(11.25f, 6.8358f, 11.5858f, 6.5f, 12.0f, 6.5f)
                close()
                moveTo(12.0f, 17.4978f)
                curveTo(12.5523f, 17.4978f, 13.0f, 17.0501f, 13.0f, 16.4978f)
                curveTo(13.0f, 15.9455f, 12.5523f, 15.4978f, 12.0f, 15.4978f)
                curveTo(11.4477f, 15.4978f, 11.0f, 15.9455f, 11.0f, 16.4978f)
                curveTo(11.0f, 17.0501f, 11.4477f, 17.4978f, 12.0f, 17.4978f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(10.3817f, 22.0f, 8.8178f, 21.6146f, 7.4129f, 20.888f)
                lineTo(3.587f, 21.9553f)
                curveTo(2.9221f, 22.141f, 2.2326f, 21.7525f, 2.0469f, 21.0876f)
                curveTo(1.9855f, 20.8676f, 1.9855f, 20.6349f, 2.047f, 20.4151f)
                lineTo(3.1146f, 16.5922f)
                curveTo(2.3864f, 15.186f, 2.0f, 13.6203f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 13.4696f, 3.8728f, 14.8834f, 4.573f, 16.1375f)
                lineTo(4.7237f, 16.4072f)
                lineTo(3.611f, 20.3914f)
                lineTo(7.5975f, 19.2792f)
                lineTo(7.8671f, 19.4295f)
                curveTo(9.1201f, 20.1281f, 10.5322f, 20.5f, 12.0f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f)
                curveTo(20.5f, 7.3056f, 16.6944f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _chatWarning!!
    }

private var _chatWarning: ImageVector? = null
