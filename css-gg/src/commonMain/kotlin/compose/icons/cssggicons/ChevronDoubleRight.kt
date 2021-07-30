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

public val CssGgIcons.ChevronDoubleRight: ImageVector
    get() {
        if (_chevronDoubleRight != null) {
            return _chevronDoubleRight!!
        }
        _chevronDoubleRight = Builder(name = "ChevronDoubleRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6361f, 7.7573f)
                lineTo(7.0503f, 6.3431f)
                lineTo(12.7071f, 12.0f)
                lineTo(7.0503f, 17.6568f)
                lineTo(5.6361f, 16.2426f)
                lineTo(9.8787f, 12.0f)
                lineTo(5.6361f, 7.7573f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7071f, 6.3431f)
                lineTo(11.2929f, 7.7573f)
                lineTo(15.5356f, 12.0f)
                lineTo(11.2929f, 16.2426f)
                lineTo(12.7072f, 17.6568f)
                lineTo(18.364f, 12.0f)
                lineTo(12.7071f, 6.3431f)
                close()
            }
        }
        .build()
        return _chevronDoubleRight!!
    }

private var _chevronDoubleRight: ImageVector? = null
