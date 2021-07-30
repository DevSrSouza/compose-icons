package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.FormatItalic: ImageVector
    get() {
        if (_formatItalic != null) {
            return _formatItalic!!
        }
        _formatItalic = Builder(name = "FormatItalic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4903f, 5.458f)
                horizontalLineTo(17.4903f)
                lineTo(16.7788f, 7.3272f)
                horizontalLineTo(14.7788f)
                lineTo(11.2212f, 16.6729f)
                horizontalLineTo(13.2212f)
                lineTo(12.5097f, 18.5421f)
                horizontalLineTo(6.5097f)
                lineTo(7.2212f, 16.6729f)
                horizontalLineTo(9.2212f)
                lineTo(12.7788f, 7.3272f)
                horizontalLineTo(10.7788f)
                lineTo(11.4903f, 5.458f)
                close()
            }
        }
        .build()
        return _formatItalic!!
    }

private var _formatItalic: ImageVector? = null
