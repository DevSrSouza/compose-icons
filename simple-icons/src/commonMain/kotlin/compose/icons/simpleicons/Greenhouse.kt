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

public val SimpleIcons.Greenhouse: ImageVector
    get() {
        if (_greenhouse != null) {
            return _greenhouse!!
        }
        _greenhouse = Builder(name = "Greenhouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.279f, 7.13f)
                curveToRelative(0.0f, 1.16f, -0.49f, 2.185f, -1.293f, 2.987f)
                curveToRelative(-0.891f, 0.891f, -2.184f, 1.114f, -2.184f, 1.872f)
                curveToRelative(0.0f, 1.025f, 1.65f, 0.713f, 3.231f, 2.295f)
                curveToRelative(1.048f, 1.047f, 1.694f, 2.43f, 1.694f, 4.034f)
                curveTo(17.727f, 21.482f, 15.187f, 24.0f, 12.0f, 24.0f)
                curveToRelative(-3.187f, 0.0f, -5.727f, -2.518f, -5.727f, -5.68f)
                curveToRelative(0.0f, -1.607f, 0.646f, -2.989f, 1.694f, -4.036f)
                curveToRelative(1.582f, -1.582f, 3.23f, -1.27f, 3.23f, -2.295f)
                curveToRelative(0.0f, -0.758f, -1.292f, -0.98f, -2.183f, -1.872f)
                curveToRelative(-0.802f, -0.802f, -1.293f, -1.827f, -1.293f, -3.03f)
                curveToRelative(0.0f, -2.318f, 1.895f, -4.19f, 4.212f, -4.19f)
                curveToRelative(0.446f, 0.0f, 0.847f, 0.067f, 1.181f, 0.067f)
                curveToRelative(0.602f, 0.0f, 0.914f, -0.268f, 0.914f, -0.691f)
                curveToRelative(0.0f, -0.245f, -0.112f, -0.557f, -0.112f, -0.891f)
                curveToRelative(0.0f, -0.758f, 0.647f, -1.382f, 1.427f, -1.382f)
                reflectiveCurveToRelative(1.404f, 0.646f, 1.404f, 1.426f)
                curveToRelative(0.0f, 0.825f, -0.647f, 1.204f, -1.137f, 1.382f)
                curveToRelative(-0.401f, 0.134f, -0.713f, 0.312f, -0.713f, 0.713f)
                curveToRelative(0.0f, 0.758f, 1.382f, 1.493f, 1.382f, 3.61f)
                close()
                moveTo(15.833f, 18.32f)
                curveToRelative(0.0f, -2.206f, -1.627f, -3.99f, -3.833f, -3.99f)
                curveToRelative(-2.206f, 0.0f, -3.833f, 1.784f, -3.833f, 3.99f)
                curveToRelative(0.0f, 2.184f, 1.627f, 3.989f, 3.833f, 3.989f)
                curveToRelative(2.206f, 0.0f, 3.833f, -1.808f, 3.833f, -3.99f)
                close()
                moveTo(14.518f, 7.086f)
                curveToRelative(0.0f, -1.404f, -1.136f, -2.562f, -2.518f, -2.562f)
                reflectiveCurveTo(9.482f, 5.682f, 9.482f, 7.086f)
                reflectiveCurveTo(10.618f, 9.65f, 12.0f, 9.65f)
                reflectiveCurveToRelative(2.518f, -1.159f, 2.518f, -2.563f)
                close()
            }
        }
        .build()
        return _greenhouse!!
    }

private var _greenhouse: ImageVector? = null
