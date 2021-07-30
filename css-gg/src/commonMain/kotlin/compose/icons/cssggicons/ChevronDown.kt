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

public val CssGgIcons.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = Builder(name = "ChevronDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3432f, 7.7573f)
                lineTo(4.929f, 9.1715f)
                lineTo(12.0f, 16.2426f)
                lineTo(19.0711f, 9.1716f)
                lineTo(17.6569f, 7.7573f)
                lineTo(12.0f, 13.4142f)
                lineTo(6.3432f, 7.7573f)
                close()
            }
        }
        .build()
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
