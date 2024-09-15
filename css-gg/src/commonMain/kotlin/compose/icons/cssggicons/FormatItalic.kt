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
                moveTo(11.49f, 5.458f)
                horizontalLineTo(17.49f)
                lineTo(16.779f, 7.327f)
                horizontalLineTo(14.779f)
                lineTo(11.221f, 16.673f)
                horizontalLineTo(13.221f)
                lineTo(12.51f, 18.542f)
                horizontalLineTo(6.51f)
                lineTo(7.221f, 16.673f)
                horizontalLineTo(9.221f)
                lineTo(12.779f, 7.327f)
                horizontalLineTo(10.779f)
                lineTo(11.49f, 5.458f)
                close()
            }
        }
        .build()
        return _formatItalic!!
    }

private var _formatItalic: ImageVector? = null
