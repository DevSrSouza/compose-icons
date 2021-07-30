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

public val CssGgIcons.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = Builder(name = "ChevronUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6569f, 16.2427f)
                lineTo(19.0711f, 14.8285f)
                lineTo(12.0001f, 7.7574f)
                lineTo(4.929f, 14.8285f)
                lineTo(6.3432f, 16.2427f)
                lineTo(12.0001f, 10.5858f)
                lineTo(17.6569f, 16.2427f)
                close()
            }
        }
        .build()
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
