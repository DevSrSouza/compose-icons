package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zillow: ImageVector
    get() {
        if (_zillow != null) {
            return _zillow!!
        }
        _zillow = Builder(name = "Zillow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.006f, 0.0f)
                lineTo(1.086f, 8.627f)
                verticalLineToRelative(3.868f)
                curveToRelative(3.386f, -2.013f, 11.219f, -5.13f, 14.763f, -6.015f)
                curveToRelative(0.11f, -0.024f, 0.16f, 0.005f, 0.227f, 0.078f)
                curveToRelative(0.372f, 0.427f, 1.586f, 1.899f, 1.916f, 2.301f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, true, -0.03f, 0.195f)
                arcToRelative(43.607f, 43.607f, 0.0f, false, false, -6.67f, 6.527f)
                curveToRelative(-0.03f, 0.037f, -0.006f, 0.043f, 0.012f, 0.03f)
                curveToRelative(2.642f, -1.134f, 8.828f, -2.94f, 11.622f, -3.452f)
                lineTo(22.926f, 8.627f)
                close()
                moveTo(11.526f, 11.177f)
                curveToRelative(-2.136f, 0.708f, -8.195f, 3.307f, -10.452f, 4.576f)
                lineTo(1.074f, 24.0f)
                horizontalLineToRelative(21.852f)
                verticalLineToRelative(-7.936f)
                curveToRelative(-2.99f, 0.506f, -11.902f, 3.16f, -15.959f, 5.246f)
                arcToRelative(0.183f, 0.183f, 0.0f, false, true, -0.23f, -0.036f)
                lineToRelative(-2.044f, -2.429f)
                curveToRelative(-0.055f, -0.061f, -0.062f, -0.098f, 0.011f, -0.208f)
                curveToRelative(1.574f, -2.3f, 4.789f, -5.899f, 6.833f, -7.418f)
                curveToRelative(0.042f, -0.03f, 0.031f, -0.06f, -0.012f, -0.042f)
                close()
            }
        }
        .build()
        return _zillow!!
    }

private var _zillow: ImageVector? = null
