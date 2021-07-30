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
                moveTo(10.3301f, 8.232f)
                lineTo(13.6603f, 4.0f)
                lineTo(18.6603f, 12.6603f)
                lineTo(15.3301f, 16.8923f)
                lineTo(10.0f, 17.6603f)
                lineTo(5.0f, 9.0f)
                lineTo(10.3301f, 8.232f)
                close()
                moveTo(8.2091f, 10.5583f)
                lineTo(11.4072f, 10.0975f)
                lineTo(13.4052f, 7.5583f)
                lineTo(16.2512f, 12.4876f)
                lineTo(14.2531f, 15.0268f)
                lineTo(11.055f, 15.4876f)
                lineTo(8.2091f, 10.5583f)
                close()
            }
        }
        .build()
        return _pentagonBottomRight!!
    }

private var _pentagonBottomRight: ImageVector? = null
