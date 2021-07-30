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

public val CssGgIcons.LoadbarAlt: ImageVector
    get() {
        if (_loadbarAlt != null) {
            return _loadbarAlt!!
        }
        _loadbarAlt = Builder(name = "LoadbarAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 10.0f)
                close()
            }
        }
        .build()
        return _loadbarAlt!!
    }

private var _loadbarAlt: ImageVector? = null
