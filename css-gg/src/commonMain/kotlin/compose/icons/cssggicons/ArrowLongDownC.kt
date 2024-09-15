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

public val CssGgIcons.ArrowLongDownC: ImageVector
    get() {
        if (_arrowLongDownC != null) {
            return _arrowLongDownC!!
        }
        _arrowLongDownC = Builder(name = "ArrowLongDownC", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.999f, 6.85f)
                curveTo(9.833f, 6.438f, 8.998f, 5.327f, 8.998f, 4.02f)
                curveTo(8.998f, 2.363f, 10.341f, 1.02f, 11.998f, 1.02f)
                curveTo(13.655f, 1.02f, 14.998f, 2.363f, 14.998f, 4.02f)
                curveTo(14.998f, 5.326f, 14.164f, 6.437f, 12.999f, 6.849f)
                lineTo(13.012f, 19.138f)
                lineTo(14.824f, 17.315f)
                lineTo(16.243f, 18.725f)
                lineTo(12.012f, 22.98f)
                lineTo(7.757f, 18.749f)
                lineTo(9.168f, 17.331f)
                lineTo(11.012f, 19.165f)
                lineTo(10.999f, 6.85f)
                close()
                moveTo(11.998f, 5.02f)
                curveTo(11.446f, 5.02f, 10.998f, 4.572f, 10.998f, 4.02f)
                curveTo(10.998f, 3.468f, 11.446f, 3.02f, 11.998f, 3.02f)
                curveTo(12.55f, 3.02f, 12.998f, 3.468f, 12.998f, 4.02f)
                curveTo(12.998f, 4.572f, 12.55f, 5.02f, 11.998f, 5.02f)
                close()
            }
        }
        .build()
        return _arrowLongDownC!!
    }

private var _arrowLongDownC: ImageVector? = null
