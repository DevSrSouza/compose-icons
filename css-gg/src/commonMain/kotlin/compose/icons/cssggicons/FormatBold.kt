package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(12.946f, 10.7833f)
                lineTo(11.2754f, 12.209f)
                lineTo(13.4476f, 12.533f)
                curveTo(14.8919f, 12.7485f, 16.0f, 13.9957f, 16.0f, 15.5f)
                curveTo(16.0f, 13.8431f, 14.6569f, 12.5f, 13.0f, 12.5f)
                horizontalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.0f)
                horizontalLineTo(11.0f)
                curveTo(12.6283f, 11.5f, 13.9536f, 10.2028f, 13.9988f, 8.5854f)
                curveTo(13.9743f, 9.4647f, 13.5724f, 10.2488f, 12.946f, 10.7833f)
                close()
            }
        }
        .build()
        return _formatBold!!
    }

private var _formatBold: ImageVector? = null
