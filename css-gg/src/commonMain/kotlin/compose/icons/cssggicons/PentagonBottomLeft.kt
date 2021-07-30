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
                moveTo(13.3301f, 9.232f)
                lineTo(10.0f, 5.0f)
                lineTo(5.0f, 13.6603f)
                lineTo(8.3301f, 17.8923f)
                lineTo(13.6603f, 18.6603f)
                lineTo(18.6603f, 10.0f)
                lineTo(13.3301f, 9.232f)
                close()
                moveTo(15.4512f, 11.5583f)
                lineTo(12.2531f, 11.0975f)
                lineTo(10.255f, 8.5583f)
                lineTo(7.4091f, 13.4876f)
                lineTo(9.4072f, 16.0268f)
                lineTo(12.6052f, 16.4876f)
                lineTo(15.4512f, 11.5583f)
                close()
            }
        }
        .build()
        return _pentagonBottomLeft!!
    }

private var _pentagonBottomLeft: ImageVector? = null
