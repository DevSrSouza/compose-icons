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

public val CssGgIcons.PentagonTopRight: ImageVector
    get() {
        if (_pentagonTopRight != null) {
            return _pentagonTopRight!!
        }
        _pentagonTopRight = Builder(name = "PentagonTopRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.3301f, 15.1601f)
                lineTo(5.0f, 14.3922f)
                lineTo(10.0f, 5.7319f)
                lineTo(15.3301f, 6.4999f)
                lineTo(18.6603f, 10.7319f)
                lineTo(13.6603f, 19.3922f)
                lineTo(10.3301f, 15.1601f)
                close()
                moveTo(13.4052f, 15.8339f)
                lineTo(11.4072f, 13.2947f)
                lineTo(8.2091f, 12.8339f)
                lineTo(11.055f, 7.9046f)
                lineTo(14.2531f, 8.3654f)
                lineTo(16.2512f, 10.9046f)
                lineTo(13.4052f, 15.8339f)
                close()
            }
        }
        .build()
        return _pentagonTopRight!!
    }

private var _pentagonTopRight: ImageVector? = null
