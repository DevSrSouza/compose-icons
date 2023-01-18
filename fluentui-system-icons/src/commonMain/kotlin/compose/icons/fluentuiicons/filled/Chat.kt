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

public val FilledGroup.Chat: ImageVector
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
                curveTo(10.3596f, 22.0f, 8.7752f, 21.6039f, 7.3558f, 20.8583f)
                lineTo(3.0654f, 21.9753f)
                curveTo(2.6111f, 22.0937f, 2.1469f, 21.8213f, 2.0286f, 21.367f)
                curveTo(1.992f, 21.2266f, 1.992f, 21.0791f, 2.0285f, 20.9386f)
                lineTo(3.1449f, 16.6502f)
                curveTo(2.3972f, 15.2294f, 2.0f, 13.6428f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.2517f, 13.0f)
                horizontalLineTo(8.75f)
                lineTo(8.6482f, 13.0068f)
                curveTo(8.2822f, 13.0565f, 8.0f, 13.3703f, 8.0f, 13.75f)
                curveTo(8.0f, 14.1297f, 8.2822f, 14.4435f, 8.6482f, 14.4932f)
                lineTo(8.75f, 14.5f)
                horizontalLineTo(13.2517f)
                lineTo(13.3535f, 14.4932f)
                curveTo(13.7196f, 14.4435f, 14.0017f, 14.1297f, 14.0017f, 13.75f)
                curveTo(14.0017f, 13.3703f, 13.7196f, 13.0565f, 13.3535f, 13.0068f)
                lineTo(13.2517f, 13.0f)
                close()
                moveTo(15.25f, 9.5f)
                horizontalLineTo(8.75f)
                lineTo(8.6482f, 9.5069f)
                curveTo(8.2822f, 9.5565f, 8.0f, 9.8703f, 8.0f, 10.25f)
                curveTo(8.0f, 10.6297f, 8.2822f, 10.9435f, 8.6482f, 10.9932f)
                lineTo(8.75f, 11.0f)
                horizontalLineTo(15.25f)
                lineTo(15.3518f, 10.9932f)
                curveTo(15.7178f, 10.9435f, 16.0f, 10.6297f, 16.0f, 10.25f)
                curveTo(16.0f, 9.8703f, 15.7178f, 9.5565f, 15.3518f, 9.5069f)
                lineTo(15.25f, 9.5f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null
