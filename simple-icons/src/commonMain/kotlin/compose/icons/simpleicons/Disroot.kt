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

public val SimpleIcons.Disroot: ImageVector
    get() {
        if (_disroot != null) {
            return _disroot!!
        }
        _disroot = Builder(name = "Disroot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.976f, 2.856f)
                curveTo(2.321f, 3.296f, 0.603f, 4.491f, 0.122f, 5.536f)
                curveToRelative(-0.144f, 0.315f, -0.164f, 0.885f, -0.04f, 1.133f)
                curveToRelative(0.178f, 0.35f, 0.343f, 0.384f, 1.387f, 0.24f)
                curveToRelative(0.817f, -0.11f, 1.085f, -0.117f, 1.985f, -0.055f)
                curveToRelative(1.106f, 0.076f, 1.594f, 0.213f, 1.882f, 0.522f)
                curveToRelative(0.172f, 0.179f, 3.75f, 9.033f, 3.813f, 9.418f)
                curveToRelative(0.11f, 0.694f, -0.234f, 1.312f, -1.189f, 2.143f)
                curveToRelative(-0.797f, 0.687f, -0.927f, 0.907f, -0.824f, 1.381f)
                curveToRelative(0.151f, 0.666f, 0.508f, 0.982f, 1.113f, 0.982f)
                curveToRelative(0.508f, 0.0f, 2.095f, -0.268f, 3.297f, -0.55f)
                curveToRelative(3.476f, -0.817f, 6.437f, -1.923f, 8.504f, -3.173f)
                curveToRelative(1.944f, -1.168f, 3.25f, -2.555f, 3.765f, -3.984f)
                curveToRelative(0.15f, -0.433f, 0.178f, -0.618f, 0.185f, -1.326f)
                curveToRelative(0.0f, -0.975f, -0.11f, -1.38f, -0.536f, -1.958f)
                curveToRelative(-0.858f, -1.16f, -1.8f, -2.005f, -3.338f, -2.988f)
                curveToRelative(-2.96f, -1.902f, -3.778f, -2.294f, -6.67f, -3.215f)
                curveToRelative(-2.521f, -0.803f, -5.358f, -1.318f, -7.728f, -1.394f)
                curveToRelative(-1.017f, -0.027f, -1.147f, -0.02f, -1.752f, 0.144f)
                close()
                moveTo(13.387f, 9.382f)
                curveToRelative(1.477f, 0.563f, 2.823f, 1.47f, 4.554f, 3.07f)
                curveToRelative(0.838f, 0.777f, 1.024f, 1.072f, 1.058f, 1.732f)
                curveToRelative(0.076f, 1.23f, -0.597f, 2.033f, -2.088f, 2.507f)
                curveToRelative(-0.708f, 0.22f, -2.191f, 0.536f, -2.253f, 0.474f)
                curveToRelative(-0.02f, -0.014f, 0.0f, -0.13f, 0.041f, -0.254f)
                curveToRelative(0.048f, -0.13f, 0.062f, -0.447f, 0.048f, -0.749f)
                curveToRelative(-0.027f, -0.433f, -0.096f, -0.68f, -0.364f, -1.319f)
                curveToRelative(-0.179f, -0.433f, -0.708f, -1.91f, -1.175f, -3.283f)
                lineToRelative(-0.851f, -2.5f)
                lineToRelative(0.22f, 0.047f)
                curveToRelative(0.123f, 0.028f, 0.487f, 0.151f, 0.81f, 0.275f)
                close()
            }
        }
        .build()
        return _disroot!!
    }

private var _disroot: ImageVector? = null
