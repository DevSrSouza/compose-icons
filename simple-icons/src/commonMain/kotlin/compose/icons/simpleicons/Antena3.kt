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

public val SimpleIcons.Antena3: ImageVector
    get() {
        if (_antena3 != null) {
            return _antena3!!
        }
        _antena3 = Builder(name = "Antena3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.997f, 10.755f)
                arcToRelative(7.222f, 7.222f, 0.0f, false, false, -0.997f, -0.083f)
                curveToRelative(-0.111f, 0.0f, -0.497f, 0.008f, -0.998f, 0.083f)
                curveToRelative(-2.919f, 0.438f, -4.948f, 2.08f, -6.201f, 4.695f)
                curveToRelative(-0.641f, 1.336f, -0.357f, 2.255f, 0.8f, 3.166f)
                curveToRelative(0.068f, 0.054f, 0.137f, 0.106f, 0.205f, 0.158f)
                curveToRelative(0.213f, 0.143f, 0.423f, 0.28f, 0.627f, 0.414f)
                curveToRelative(3.026f, 1.975f, 4.133f, 2.676f, 4.58f, 2.881f)
                curveToRelative(0.186f, 0.085f, 0.512f, 0.244f, 0.962f, 0.255f)
                horizontalLineToRelative(0.048f)
                curveToRelative(0.45f, -0.011f, 0.777f, -0.17f, 0.963f, -0.255f)
                curveToRelative(0.446f, -0.205f, 1.553f, -0.907f, 4.579f, -2.882f)
                curveToRelative(0.205f, -0.134f, 0.415f, -0.272f, 0.629f, -0.415f)
                arcToRelative(22.7f, 22.7f, 0.0f, false, false, 0.203f, -0.156f)
                curveToRelative(1.157f, -0.911f, 1.441f, -1.83f, 0.8f, -3.166f)
                curveToRelative(-1.251f, -2.614f, -3.281f, -4.257f, -6.2f, -4.695f)
                close()
                moveTo(20.249f, 15.115f)
                curveToRelative(0.637f, 0.774f, 1.205f, 0.834f, 1.843f, 0.387f)
                curveToRelative(0.85f, -0.597f, 1.894f, -2.857f, 1.908f, -4.724f)
                curveToRelative(-0.05f, -5.112f, -5.337f, -8.666f, -10.648f, -9.093f)
                curveToRelative(-0.212f, -0.02f, -0.534f, -0.026f, -0.777f, 0.153f)
                curveToRelative(-0.247f, 0.182f, -0.292f, 0.457f, -0.113f, 0.812f)
                curveToRelative(0.305f, 0.603f, 0.708f, 1.147f, 1.092f, 1.7f)
                curveToRelative(1.928f, 2.77f, 3.56f, 5.72f, 5.298f, 8.607f)
                curveToRelative(0.442f, 0.734f, 0.85f, 1.492f, 1.397f, 2.157f)
                close()
                moveTo(5.148f, 12.956f)
                curveToRelative(1.738f, -2.886f, 3.37f, -5.837f, 5.297f, -8.607f)
                curveToRelative(0.385f, -0.553f, 0.787f, -1.097f, 1.092f, -1.7f)
                curveToRelative(0.18f, -0.355f, 0.135f, -0.63f, -0.113f, -0.812f)
                curveToRelative(-0.243f, -0.18f, -0.565f, -0.173f, -0.777f, -0.153f)
                curveTo(5.337f, 2.112f, 0.05f, 5.665f, 0.0f, 10.778f)
                curveToRelative(0.013f, 1.867f, 1.057f, 4.128f, 1.908f, 4.724f)
                curveToRelative(0.638f, 0.447f, 1.206f, 0.387f, 1.843f, -0.388f)
                curveToRelative(0.546f, -0.665f, 0.954f, -1.423f, 1.397f, -2.157f)
                close()
            }
        }
        .build()
        return _antena3!!
    }

private var _antena3: ImageVector? = null
