package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FormatClear: ImageVector
    get() {
        if (_formatClear != null) {
            return _formatClear!!
        }
        _formatClear = Builder(name = "FormatClear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.651f, 14.065f)
                lineTo(11.605f, 20.0f)
                lineTo(9.574f, 20.0f)
                lineToRelative(1.35f, -7.661f)
                lineToRelative(-7.41f, -7.41f)
                lineTo(4.93f, 3.515f)
                lineTo(20.485f, 19.07f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-6.42f, -6.42f)
                close()
                moveTo(11.773f, 7.53f)
                lineToRelative(0.27f, -1.53f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(20.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.927f)
                lineTo(13.5f, 9.257f)
                lineTo(11.773f, 7.53f)
                close()
            }
        }
        .build()
        return _formatClear!!
    }

private var _formatClear: ImageVector? = null
