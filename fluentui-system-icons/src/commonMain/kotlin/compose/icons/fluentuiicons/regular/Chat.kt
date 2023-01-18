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

public val RegularGroup.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(8.75f, 13.0f)
                horizontalLineTo(13.2483f)
                curveTo(13.6625f, 13.0f, 13.9983f, 13.3358f, 13.9983f, 13.75f)
                curveTo(13.9983f, 14.1297f, 13.7161f, 14.4435f, 13.35f, 14.4932f)
                lineTo(13.2483f, 14.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 14.5f, 8.0f, 14.1642f, 8.0f, 13.75f)
                curveTo(8.0f, 13.3703f, 8.2822f, 13.0565f, 8.6482f, 13.0068f)
                lineTo(8.75f, 13.0f)
                horizontalLineTo(13.2483f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.75f, 9.5f)
                horizontalLineTo(15.2545f)
                curveTo(15.6687f, 9.5f, 16.0045f, 9.8358f, 16.0045f, 10.25f)
                curveTo(16.0045f, 10.6297f, 15.7223f, 10.9435f, 15.3563f, 10.9932f)
                lineTo(15.2545f, 11.0f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 11.0f, 8.0f, 10.6642f, 8.0f, 10.25f)
                curveTo(8.0f, 9.8703f, 8.2822f, 9.5565f, 8.6482f, 9.5069f)
                lineTo(8.75f, 9.5f)
                horizontalLineTo(15.2545f)
                horizontalLineTo(8.75f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null
