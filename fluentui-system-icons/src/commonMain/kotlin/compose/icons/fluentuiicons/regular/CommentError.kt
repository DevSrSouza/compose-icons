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

public val RegularGroup.CommentError: ImageVector
    get() {
        if (_commentError != null) {
            return _commentError!!
        }
        _commentError = Builder(name = "CommentError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5f)
                curveTo(23.0f, 9.5376f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 14.4624f, 1.0f, 17.5f, 1.0f)
                curveTo(20.5376f, 1.0f, 23.0f, 3.4624f, 23.0f, 6.5f)
                close()
                moveTo(17.5f, 3.0f)
                curveTo(17.2239f, 3.0f, 17.0f, 3.2239f, 17.0f, 3.5f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 7.7761f, 17.2239f, 8.0f, 17.5f, 8.0f)
                curveTo(17.7761f, 8.0f, 18.0f, 7.7761f, 18.0f, 7.5f)
                verticalLineTo(3.5f)
                curveTo(18.0f, 3.2239f, 17.7761f, 3.0f, 17.5f, 3.0f)
                close()
                moveTo(17.5f, 10.125f)
                curveTo(17.8452f, 10.125f, 18.125f, 9.8452f, 18.125f, 9.5f)
                curveTo(18.125f, 9.1548f, 17.8452f, 8.875f, 17.5f, 8.875f)
                curveTo(17.1548f, 8.875f, 16.875f, 9.1548f, 16.875f, 9.5f)
                curveTo(16.875f, 9.8452f, 17.1548f, 10.125f, 17.5f, 10.125f)
                close()
                moveTo(20.5f, 14.75f)
                verticalLineTo(12.2678f)
                curveTo(21.051f, 11.9806f, 21.5557f, 11.6168f, 22.0f, 11.1904f)
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
                horizontalLineTo(12.0218f)
                curveTo(11.7253f, 3.4632f, 11.4858f, 3.9665f, 11.3135f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 4.5f, 3.5f, 5.2835f, 3.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(3.5f, 15.7165f, 4.2835f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(7.4988f)
                lineTo(7.4999f, 20.2506f)
                lineTo(12.5135f, 16.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 16.5f, 20.5f, 15.7165f, 20.5f, 14.75f)
                close()
            }
        }
        .build()
        return _commentError!!
    }

private var _commentError: ImageVector? = null
