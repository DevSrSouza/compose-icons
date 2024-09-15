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
                curveTo(13.262f, 4.0f, 9.414f, 7.887f, 8.313f, 13.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 15.0f)
                lineTo(8.063f, 15.0f)
                curveTo(8.039f, 15.328f, 8.0f, 15.664f, 8.0f, 16.0f)
                curveTo(8.0f, 16.336f, 8.039f, 16.672f, 8.063f, 17.0f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 19.0f)
                lineTo(8.313f, 19.0f)
                curveTo(9.414f, 24.113f, 13.262f, 28.0f, 18.0f, 28.0f)
                curveTo(20.707f, 28.0f, 23.168f, 26.695f, 24.938f, 24.656f)
                lineTo(23.406f, 23.344f)
                curveTo(21.953f, 25.02f, 20.07f, 26.0f, 18.0f, 26.0f)
                curveTo(14.496f, 26.0f, 11.41f, 23.102f, 10.375f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 17.0f)
                lineTo(10.031f, 17.0f)
                curveTo(10.004f, 16.668f, 10.0f, 16.34f, 10.0f, 16.0f)
                curveTo(10.0f, 15.66f, 10.004f, 15.332f, 10.031f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 13.0f)
                lineTo(10.375f, 13.0f)
                curveTo(11.41f, 8.898f, 14.496f, 6.0f, 18.0f, 6.0f)
                curveTo(20.07f, 6.0f, 21.953f, 6.98f, 23.406f, 8.656f)
                lineTo(24.938f, 7.344f)
                curveTo(23.168f, 5.305f, 20.707f, 4.0f, 18.0f, 4.0f)
                close()
            }
        }
        .build()
        return _euroSignSolid!!
    }

private var _euroSignSolid: ImageVector? = null
