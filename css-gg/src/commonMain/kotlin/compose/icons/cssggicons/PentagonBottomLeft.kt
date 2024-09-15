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

public val CssGgIcons.PentagonBottomLeft: ImageVector
    get() {
        if (_pentagonBottomLeft != null) {
            return _pentagonBottomLeft!!
        }
        _pentagonBottomLeft = Builder(name = "PentagonBottomLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.33f, 9.232f)
                lineTo(10.0f, 5.0f)
                lineTo(5.0f, 13.66f)
                lineTo(8.33f, 17.892f)
                lineTo(13.66f, 18.66f)
                lineTo(18.66f, 10.0f)
                lineTo(13.33f, 9.232f)
                close()
                moveTo(15.451f, 11.558f)
                lineTo(12.253f, 11.097f)
                lineTo(10.255f, 8.558f)
                lineTo(7.409f, 13.488f)
                lineTo(9.407f, 16.027f)
                lineTo(12.605f, 16.488f)
                lineTo(15.451f, 11.558f)
                close()
            }
        }
        .build()
        return _pentagonBottomLeft!!
    }

private var _pentagonBottomLeft: ImageVector? = null
