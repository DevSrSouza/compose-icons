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

public val CssGgIcons.Select: ImageVector
    get() {
        if (_select != null) {
            return _select!!
        }
        _select = Builder(name = "Select", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.657f)
                lineTo(7.414f, 11.071f)
                lineTo(11.657f, 6.828f)
                lineTo(15.899f, 11.071f)
                lineTo(17.314f, 9.657f)
                lineTo(11.657f, 4.0f)
                lineTo(6.0f, 9.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.443f)
                lineTo(7.414f, 13.029f)
                lineTo(11.657f, 17.272f)
                lineTo(15.899f, 13.029f)
                lineTo(17.314f, 14.443f)
                lineTo(11.657f, 20.1f)
                lineTo(6.0f, 14.443f)
                close()
            }
        }
        .build()
        return _select!!
    }

private var _select: ImageVector? = null
