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

public val CssGgIcons.FormatBold: ImageVector
    get() {
        if (_formatBold != null) {
            return _formatBold!!
        }
        _formatBold = Builder(name = "FormatBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.946f, 10.783f)
                lineTo(11.275f, 12.209f)
                lineTo(13.448f, 12.533f)
                curveTo(14.892f, 12.748f, 16.0f, 13.996f, 16.0f, 15.5f)
                curveTo(16.0f, 13.843f, 14.657f, 12.5f, 13.0f, 12.5f)
                horizontalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.0f)
                horizontalLineTo(11.0f)
                curveTo(12.628f, 11.5f, 13.954f, 10.203f, 13.999f, 8.585f)
                curveTo(13.974f, 9.465f, 13.572f, 10.249f, 12.946f, 10.783f)
                close()
            }
        }
        .build()
        return _formatBold!!
    }

private var _formatBold: ImageVector? = null
