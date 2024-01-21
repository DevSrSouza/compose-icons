package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 4.504f)
                lineTo(7.0f, 4.504f)
                verticalLineToRelative(14.992f)
                horizontalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.604f, -7.955f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 4.505f)
                close()
                moveTo(9.0f, 6.504f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                lineTo(9.0f, 10.504f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 17.495f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                lineTo(9.0f, 17.495f)
                close()
            }
        }
        .build()
        return _formatBold!!
    }

private var _formatBold: ImageVector? = null
