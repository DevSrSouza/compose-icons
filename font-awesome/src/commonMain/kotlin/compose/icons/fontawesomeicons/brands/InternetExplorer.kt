package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.InternetExplorer: ImageVector
    get() {
        if (_internetExplorer != null) {
            return _internetExplorer!!
        }
        _internetExplorer = Builder(name = "InternetExplorer", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.049f, 159.706f)
                curveToRelative(10.855f, -24.575f, 21.424f, -60.438f, 21.424f, -87.871f)
                curveToRelative(0.0f, -72.722f, -79.641f, -98.371f, -209.673f, -38.577f)
                curveToRelative(-107.632f, -7.181f, -211.221f, 73.67f, -237.098f, 186.457f)
                curveToRelative(30.852f, -34.862f, 78.271f, -82.298f, 121.977f, -101.158f)
                curveTo(125.404f, 166.85f, 79.128f, 228.002f, 43.992f, 291.725f)
                curveTo(23.246f, 329.651f, 0.0f, 390.94f, 0.0f, 436.747f)
                curveToRelative(0.0f, 98.575f, 92.854f, 86.5f, 180.251f, 42.006f)
                curveToRelative(31.423f, 15.43f, 66.559f, 15.573f, 101.695f, 15.573f)
                curveToRelative(97.124f, 0.0f, 184.249f, -54.294f, 216.814f, -146.022f)
                lineTo(377.927f, 348.304f)
                curveToRelative(-52.509f, 88.593f, -196.819f, 52.996f, -196.819f, -47.436f)
                lineTo(509.9f, 300.868f)
                curveToRelative(6.407f, -43.581f, -1.655f, -95.715f, -26.851f, -141.162f)
                close()
                moveTo(64.559f, 346.877f)
                curveToRelative(17.711f, 51.15f, 53.703f, 95.871f, 100.266f, 123.304f)
                curveToRelative(-88.741f, 48.94f, -173.267f, 29.096f, -100.266f, -123.304f)
                close()
                moveTo(180.536f, 238.004f)
                curveToRelative(2.0f, -55.151f, 50.276f, -94.871f, 103.98f, -94.871f)
                curveToRelative(53.418f, 0.0f, 101.981f, 39.72f, 103.981f, 94.871f)
                lineTo(180.536f, 238.004f)
                close()
                moveTo(365.072f, 50.404f)
                curveToRelative(21.425f, -10.287f, 48.563f, -22.003f, 72.558f, -22.003f)
                curveToRelative(31.422f, 0.0f, 54.274f, 21.717f, 54.274f, 53.722f)
                curveToRelative(0.0f, 20.003f, -7.427f, 49.007f, -14.569f, 67.867f)
                curveToRelative(-26.28f, -42.292f, -65.986f, -81.584f, -112.263f, -99.586f)
                close()
            }
        }
        .build()
        return _internetExplorer!!
    }

private var _internetExplorer: ImageVector? = null
