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

public val SimpleIcons.Solid: ImageVector
    get() {
        if (_solid != null) {
            return _solid!!
        }
        _solid = Builder(name = "Solid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.558f, 0.788f)
                arcTo(9.082f, 9.082f, 0.0f, false, false, 9.776f, 0.99f)
                lineToRelative(-0.453f, 0.15f)
                curveToRelative(-0.906f, 0.303f, -1.656f, 0.755f, -2.1f, 1.348f)
                lineToRelative(-0.301f, 0.452f)
                lineToRelative(-2.035f, 3.528f)
                curveToRelative(0.426f, -0.387f, 0.974f, -0.698f, 1.643f, -0.894f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.613f, -0.154f)
                horizontalLineToRelative(0.001f)
                arcToRelative(8.82f, 8.82f, 0.0f, false, true, 1.777f, -0.206f)
                curveToRelative(2.916f, -0.053f, 6.033f, 1.148f, 8.423f, 2.36f)
                curveToRelative(2.317f, 1.175f, 3.888f, 2.32f, 3.987f, 2.39f)
                lineTo(24.0f, 5.518f)
                curveToRelative(-0.082f, -0.06f, -1.66f, -1.21f, -3.991f, -2.386f)
                curveToRelative(-2.393f, -1.206f, -5.521f, -2.396f, -8.45f, -2.343f)
                close()
                moveTo(8.924f, 5.366f)
                arcToRelative(8.634f, 8.634f, 0.0f, false, false, -1.745f, 0.203f)
                lineToRelative(-0.606f, 0.151f)
                curveToRelative(-1.278f, 0.376f, -2.095f, 1.16f, -2.43f, 2.108f)
                curveToRelative(-0.334f, 0.948f, -0.188f, 2.065f, 0.487f, 3.116f)
                curveToRelative(0.33f, 0.43f, 0.747f, 0.813f, 1.216f, 1.147f)
                lineTo(12.328f, 10.0f)
                horizontalLineToRelative(0.001f)
                arcToRelative(6.943f, 6.943f, 0.0f, false, true, 6.013f, 1.013f)
                lineToRelative(2.844f, -0.963f)
                curveToRelative(-0.17f, -0.124f, -1.663f, -1.2f, -3.91f, -2.34f)
                curveToRelative(-2.379f, -1.206f, -5.479f, -2.396f, -8.352f, -2.344f)
                close()
                moveTo(14.359f, 9.863f)
                arcToRelative(6.791f, 6.791f, 0.0f, false, false, -1.984f, 0.283f)
                lineTo(2.94f, 13.189f)
                lineTo(0.0f, 18.334f)
                lineToRelative(9.276f, -2.992f)
                arcToRelative(6.945f, 6.945f, 0.0f, false, true, 7.408f, 2.314f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.695f, 0.903f, 0.89f, 1.906f, 0.66f, 2.808f)
                lineToRelative(2.572f, -4.63f)
                curveToRelative(0.595f, -1.041f, 0.45f, -2.225f, -0.302f, -3.429f)
                arcToRelative(6.792f, 6.792f, 0.0f, false, false, -5.255f, -2.543f)
                close()
                moveTo(11.328f, 15.204f)
                arcToRelative(6.787f, 6.787f, 0.0f, false, false, -2.006f, 0.283f)
                lineTo(0.008f, 18.492f)
                curveToRelative(0.175f, 0.131f, 2.02f, 1.498f, 4.687f, 2.768f)
                curveToRelative(2.797f, 1.332f, 6.37f, 2.467f, 9.468f, 1.712f)
                lineToRelative(0.454f, -0.152f)
                horizontalLineToRelative(0.002f)
                curveToRelative(1.278f, -0.376f, 2.134f, -1.162f, 2.487f, -2.09f)
                curveToRelative(0.353f, -0.93f, 0.207f, -2.004f, -0.541f, -2.978f)
                arcToRelative(6.791f, 6.791f, 0.0f, false, false, -5.237f, -2.548f)
                close()
            }
        }
        .build()
        return _solid!!
    }

private var _solid: ImageVector? = null
