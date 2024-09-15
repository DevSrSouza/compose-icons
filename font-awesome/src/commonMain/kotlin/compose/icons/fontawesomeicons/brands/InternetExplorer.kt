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
                moveTo(483.05f, 159.71f)
                curveToRelative(10.85f, -24.58f, 21.42f, -60.44f, 21.42f, -87.87f)
                curveToRelative(0.0f, -72.72f, -79.64f, -98.37f, -209.67f, -38.58f)
                curveToRelative(-107.63f, -7.18f, -211.22f, 73.67f, -237.1f, 186.46f)
                curveToRelative(30.85f, -34.86f, 78.27f, -82.3f, 121.98f, -101.16f)
                curveTo(125.4f, 166.85f, 79.13f, 228.0f, 43.99f, 291.73f)
                curveTo(23.25f, 329.65f, 0.0f, 390.94f, 0.0f, 436.75f)
                curveToRelative(0.0f, 98.57f, 92.85f, 86.5f, 180.25f, 42.01f)
                curveToRelative(31.42f, 15.43f, 66.56f, 15.57f, 101.69f, 15.57f)
                curveToRelative(97.12f, 0.0f, 184.25f, -54.29f, 216.81f, -146.02f)
                lineTo(377.93f, 348.3f)
                curveToRelative(-52.51f, 88.59f, -196.82f, 53.0f, -196.82f, -47.44f)
                lineTo(509.9f, 300.87f)
                curveToRelative(6.41f, -43.58f, -1.65f, -95.71f, -26.85f, -141.16f)
                close()
                moveTo(64.56f, 346.88f)
                curveToRelative(17.71f, 51.15f, 53.7f, 95.87f, 100.27f, 123.3f)
                curveToRelative(-88.74f, 48.94f, -173.27f, 29.1f, -100.27f, -123.3f)
                close()
                moveTo(180.54f, 238.0f)
                curveToRelative(2.0f, -55.15f, 50.28f, -94.87f, 103.98f, -94.87f)
                curveToRelative(53.42f, 0.0f, 101.98f, 39.72f, 103.98f, 94.87f)
                lineTo(180.54f, 238.0f)
                close()
                moveTo(365.07f, 50.4f)
                curveToRelative(21.42f, -10.29f, 48.56f, -22.0f, 72.56f, -22.0f)
                curveToRelative(31.42f, 0.0f, 54.27f, 21.72f, 54.27f, 53.72f)
                curveToRelative(0.0f, 20.0f, -7.43f, 49.01f, -14.57f, 67.87f)
                curveToRelative(-26.28f, -42.29f, -65.99f, -81.58f, -112.26f, -99.59f)
                close()
            }
        }
        .build()
        return _internetExplorer!!
    }

private var _internetExplorer: ImageVector? = null
