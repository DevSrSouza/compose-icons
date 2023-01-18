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

public val RegularGroup.CommentLightning: ImageVector
    get() {
        if (_commentLightning != null) {
            return _commentLightning!!
        }
        _commentLightning = Builder(name = "CommentLightning", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3167f, 1.0f)
                horizontalLineTo(21.1443f)
                curveTo(21.5267f, 1.0f, 21.7676f, 1.4118f, 21.5801f, 1.7451f)
                lineTo(19.7492f, 5.0f)
                horizontalLineTo(21.2454f)
                curveTo(21.8899f, 5.0f, 22.2342f, 5.7593f, 21.8096f, 6.2441f)
                lineTo(16.9857f, 11.7519f)
                curveTo(16.4811f, 12.328f, 15.543f, 11.8375f, 15.7282f, 11.0945f)
                lineTo(16.4992f, 8.0f)
                horizontalLineTo(13.4967f)
                curveTo(13.1303f, 8.0f, 12.8883f, 7.6189f, 13.0442f, 7.2873f)
                lineTo(15.8642f, 1.2873f)
                curveTo(15.9466f, 1.112f, 16.1229f, 1.0f, 16.3167f, 1.0f)
                close()
                moveTo(5.25f, 3.0f)
                horizontalLineTo(13.9555f)
                lineTo(13.2505f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 4.5f, 3.5f, 5.2835f, 3.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(3.5f, 15.7165f, 4.2835f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(7.4988f)
                lineTo(7.4999f, 20.2506f)
                lineTo(12.5135f, 16.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 16.5f, 20.5f, 15.7165f, 20.5f, 14.75f)
                verticalLineTo(9.2585f)
                lineTo(22.0f, 7.5459f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 16.5449f, 20.5449f, 18.0f, 18.75f, 18.0f)
                horizontalLineTo(13.0125f)
                lineTo(7.9987f, 21.7507f)
                curveTo(7.4458f, 22.1642f, 6.6625f, 22.0512f, 6.249f, 21.4984f)
                curveTo(6.0874f, 21.2822f, 6.0f, 21.0196f, 6.0f, 20.7499f)
                lineTo(5.9992f, 18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 18.0f, 2.0f, 16.5449f, 2.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                close()
            }
        }
        .build()
        return _commentLightning!!
    }

private var _commentLightning: ImageVector? = null
