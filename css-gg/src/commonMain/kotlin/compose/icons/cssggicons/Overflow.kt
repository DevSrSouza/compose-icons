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

public val CssGgIcons.Overflow: ImageVector
    get() {
        if (_overflow != null) {
            return _overflow!!
        }
        _overflow = Builder(name = "Overflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                curveTo(22.0f, 13.6522f, 20.9464f, 16.1957f, 19.0711f, 18.0711f)
                curveTo(17.1957f, 19.9464f, 14.6522f, 21.0f, 12.0f, 21.0f)
                curveTo(9.3478f, 21.0f, 6.8043f, 19.9464f, 4.9289f, 18.0711f)
                curveTo(3.0536f, 16.1957f, 2.0f, 13.6522f, 2.0f, 11.0f)
                lineTo(22.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveTo(20.0f, 13.1217f, 19.1571f, 15.1566f, 17.6569f, 16.6569f)
                curveTo(16.1566f, 18.1571f, 14.1217f, 19.0f, 12.0f, 19.0f)
                curveTo(9.8783f, 19.0f, 7.8434f, 18.1571f, 6.3432f, 16.6569f)
                curveTo(4.8429f, 15.1566f, 4.0f, 13.1217f, 4.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveTo(20.0f, 8.8783f, 19.1571f, 6.8434f, 17.6569f, 5.3432f)
                curveTo(16.1566f, 3.8428f, 14.1217f, 3.0f, 12.0f, 3.0f)
                curveTo(9.8783f, 3.0f, 7.8434f, 3.8428f, 6.3432f, 5.3432f)
                curveTo(4.8429f, 6.8434f, 4.0f, 8.8783f, 4.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _overflow!!
    }

private var _overflow: ImageVector? = null
