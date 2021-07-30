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

public val CssGgIcons.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight = Builder(name = "ChevronRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5858f, 6.3432f)
                lineTo(12.0f, 4.929f)
                lineTo(19.0711f, 12.0f)
                lineTo(12.0f, 19.0711f)
                lineTo(10.5858f, 17.6569f)
                lineTo(16.2427f, 12.0f)
                lineTo(10.5858f, 6.3432f)
                close()
            }
        }
        .build()
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
