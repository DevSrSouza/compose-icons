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

public val CssGgIcons.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.6569f, 2.7574f)
                curveTo(15.0f, 0.4142f, 18.799f, 0.4142f, 21.1421f, 2.7574f)
                curveTo(23.4853f, 5.1005f, 23.4853f, 8.8995f, 21.1421f, 11.2426f)
                lineTo(11.2426f, 21.1421f)
                curveTo(8.8995f, 23.4853f, 5.1005f, 23.4853f, 2.7574f, 21.1421f)
                curveTo(0.4142f, 18.799f, 0.4142f, 15.0f, 2.7574f, 12.6569f)
                lineTo(12.6569f, 2.7574f)
                close()
                moveTo(19.7279f, 9.8284f)
                lineTo(15.4853f, 14.0711f)
                lineTo(9.8284f, 8.4142f)
                lineTo(14.0711f, 4.1716f)
                curveTo(15.6332f, 2.6095f, 18.1658f, 2.6095f, 19.7279f, 4.1716f)
                curveTo(21.29f, 5.7337f, 21.29f, 8.2663f, 19.7279f, 9.8284f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
