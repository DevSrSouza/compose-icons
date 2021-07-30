package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.EuroSignSolid: ImageVector
    get() {
        if (_euroSignSolid != null) {
            return _euroSignSolid!!
        }
        _euroSignSolid = Builder(name = "EuroSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                curveTo(13.2617f, 4.0f, 9.4141f, 7.8867f, 8.3125f, 13.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 15.0f)
                lineTo(8.0625f, 15.0f)
                curveTo(8.0391f, 15.3281f, 8.0f, 15.6641f, 8.0f, 16.0f)
                curveTo(8.0f, 16.3359f, 8.0391f, 16.6719f, 8.0625f, 17.0f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 19.0f)
                lineTo(8.3125f, 19.0f)
                curveTo(9.4141f, 24.1133f, 13.2617f, 28.0f, 18.0f, 28.0f)
                curveTo(20.707f, 28.0f, 23.168f, 26.6953f, 24.9375f, 24.6563f)
                lineTo(23.4063f, 23.3438f)
                curveTo(21.9531f, 25.0195f, 20.0703f, 26.0f, 18.0f, 26.0f)
                curveTo(14.4961f, 26.0f, 11.4102f, 23.1016f, 10.375f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 17.0f)
                lineTo(10.0313f, 17.0f)
                curveTo(10.0039f, 16.668f, 10.0f, 16.3398f, 10.0f, 16.0f)
                curveTo(10.0f, 15.6602f, 10.0039f, 15.332f, 10.0313f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 13.0f)
                lineTo(10.375f, 13.0f)
                curveTo(11.4102f, 8.8984f, 14.4961f, 6.0f, 18.0f, 6.0f)
                curveTo(20.0703f, 6.0f, 21.9531f, 6.9805f, 23.4063f, 8.6563f)
                lineTo(24.9375f, 7.3438f)
                curveTo(23.168f, 5.3047f, 20.707f, 4.0f, 18.0f, 4.0f)
                close()
            }
        }
        .build()
        return _euroSignSolid!!
    }

private var _euroSignSolid: ImageVector? = null
