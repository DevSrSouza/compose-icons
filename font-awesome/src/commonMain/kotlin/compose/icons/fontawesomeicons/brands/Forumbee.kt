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

public val BrandsGroup.Forumbee: ImageVector
    get() {
        if (_forumbee != null) {
            return _forumbee!!
        }
        _forumbee = Builder(name = "Forumbee", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8f, 309.7f)
                curveTo(2.0f, 292.7f, 0.0f, 275.5f, 0.0f, 258.3f)
                curveTo(0.0f, 135.0f, 99.8f, 35.0f, 223.1f, 35.0f)
                curveToRelative(16.6f, 0.0f, 33.3f, 2.0f, 49.3f, 5.5f)
                curveTo(149.0f, 87.5f, 51.9f, 186.0f, 5.8f, 309.7f)
                close()
                moveTo(398.7f, 120.5f)
                curveTo(385.0f, 103.0f, 369.0f, 87.8f, 350.9f, 75.2f)
                curveToRelative(-149.6f, 44.3f, -266.3f, 162.1f, -309.7f, 312.0f)
                curveToRelative(12.5f, 18.1f, 28.0f, 35.6f, 45.2f, 49.0f)
                curveToRelative(43.1f, -151.3f, 161.2f, -271.7f, 312.3f, -315.7f)
                close()
                moveTo(414.5f, 373.2f)
                curveToRelative(15.2f, -25.1f, 25.4f, -53.7f, 29.5f, -82.8f)
                curveToRelative(-79.4f, 42.9f, -145.0f, 110.6f, -187.6f, 190.3f)
                curveToRelative(30.0f, -4.4f, 58.9f, -15.3f, 84.6f, -31.3f)
                curveToRelative(35.0f, 13.1f, 70.9f, 24.3f, 107.0f, 33.6f)
                curveToRelative(-9.3f, -36.5f, -20.4f, -74.5f, -33.5f, -109.8f)
                close()
                moveTo(444.2f, 227.7f)
                curveToRelative(-2.6f, -19.5f, -7.9f, -38.7f, -15.8f, -56.8f)
                curveTo(290.5f, 216.7f, 182.0f, 327.5f, 137.1f, 466.0f)
                curveToRelative(18.1f, 7.6f, 37.0f, 12.5f, 56.6f, 15.2f)
                curveTo(240.0f, 367.1f, 330.5f, 274.4f, 444.2f, 227.7f)
                close()
            }
        }
        .build()
        return _forumbee!!
    }

private var _forumbee: ImageVector? = null
