package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6569f, 11.2929f)
                lineTo(16.2427f, 12.7071f)
                lineTo(12.0f, 8.4644f)
                lineTo(7.7573f, 12.7071f)
                lineTo(6.3431f, 11.2929f)
                lineTo(12.0f, 5.6361f)
                lineTo(17.6569f, 11.2929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6569f, 16.9497f)
                lineTo(16.2427f, 18.3639f)
                lineTo(12.0f, 14.1213f)
                lineTo(7.7573f, 18.364f)
                lineTo(6.3431f, 16.9498f)
                lineTo(12.0f, 11.2929f)
                lineTo(17.6569f, 16.9497f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

private var _chevronDoubleUp: ImageVector? = null
