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

public val CssGgIcons.PentagonBottomRight: ImageVector
    get() {
        if (_pentagonBottomRight != null) {
            return _pentagonBottomRight!!
        }
        _pentagonBottomRight = Builder(name = "PentagonBottomRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.33f, 8.232f)
                lineTo(13.66f, 4.0f)
                lineTo(18.66f, 12.66f)
                lineTo(15.33f, 16.892f)
                lineTo(10.0f, 17.66f)
                lineTo(5.0f, 9.0f)
                lineTo(10.33f, 8.232f)
                close()
                moveTo(8.209f, 10.558f)
                lineTo(11.407f, 10.097f)
                lineTo(13.405f, 7.558f)
                lineTo(16.251f, 12.488f)
                lineTo(14.253f, 15.027f)
                lineTo(11.055f, 15.488f)
                lineTo(8.209f, 10.558f)
                close()
            }
        }
        .build()
        return _pentagonBottomRight!!
    }

private var _pentagonBottomRight: ImageVector? = null
