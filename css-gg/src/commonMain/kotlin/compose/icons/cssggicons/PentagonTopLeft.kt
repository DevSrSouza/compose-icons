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

public val CssGgIcons.PentagonTopLeft: ImageVector
    get() {
        if (_pentagonTopLeft != null) {
            return _pentagonTopLeft!!
        }
        _pentagonTopLeft = Builder(name = "PentagonTopLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.3301f, 15.1601f)
                lineTo(11.0f, 19.3922f)
                lineTo(6.0f, 10.7319f)
                lineTo(9.3301f, 6.4999f)
                lineTo(14.6603f, 5.7319f)
                lineTo(19.6603f, 14.3922f)
                lineTo(14.3301f, 15.1601f)
                close()
                moveTo(16.4512f, 12.8339f)
                lineTo(13.2531f, 13.2947f)
                lineTo(11.255f, 15.8339f)
                lineTo(8.4091f, 10.9046f)
                lineTo(10.4072f, 8.3654f)
                lineTo(13.6052f, 7.9046f)
                lineTo(16.4512f, 12.8339f)
                close()
            }
        }
        .build()
        return _pentagonTopLeft!!
    }

private var _pentagonTopLeft: ImageVector? = null
