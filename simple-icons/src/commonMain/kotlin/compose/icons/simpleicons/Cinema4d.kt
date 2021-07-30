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

public val SimpleIcons.Cinema4d: ImageVector
    get() {
        if (_cinema4d != null) {
            return _cinema4d!!
        }
        _cinema4d = Builder(name = "Cinema4d", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.052f, 0.0f)
                curveTo(5.394f, -0.007f, -0.003f, 5.412f, 0.0f, 11.976f)
                curveTo(0.003f, 18.654f, 5.475f, 23.981f, 11.978f, 24.0f)
                curveToRelative(6.535f, 0.02f, 12.057f, -5.306f, 12.022f, -11.998f)
                curveToRelative(-0.009f, -1.665f, -0.53f, -5.371f, -1.84f, -5.276f)
                curveToRelative(-1.98f, 0.145f, -2.159f, 4.12f, -2.377f, 5.407f)
                curveToRelative(-0.417f, 2.46f, -1.346f, 5.08f, -2.953f, 6.99f)
                curveToRelative(-1.88f, 2.359f, -4.697f, 3.634f, -7.662f, 3.158f)
                curveToRelative(-3.55f, -0.564f, -5.893f, -3.278f, -6.68f, -5.201f)
                curveToRelative(-0.753f, -1.723f, -1.035f, -4.162f, -0.07f, -6.324f)
                curveToRelative(1.16f, -2.766f, 3.734f, -4.632f, 6.28f, -5.584f)
                curveToRelative(2.006f, -0.827f, 4.103f, -1.151f, 5.357f, -1.375f)
                curveToRelative(2.516f, -0.5f, 2.855f, -1.463f, 2.814f, -2.149f)
                curveToRelative(-0.015f, -0.252f, -0.256f, -0.724f, -0.785f, -0.943f)
                curveTo(15.03f, 0.269f, 13.268f, 0.001f, 12.052f, 0.0f)
                close()
                moveTo(17.15f, 1.342f)
                curveToRelative(0.139f, 0.398f, 0.088f, 0.85f, -0.148f, 1.256f)
                curveToRelative(-0.325f, 0.56f, -0.972f, 1.05f, -1.897f, 1.29f)
                curveToRelative(-1.636f, 0.428f, -2.976f, 0.554f, -4.34f, 0.96f)
                curveToRelative(-1.312f, 0.39f, -3.397f, 1.018f, -5.316f, 2.552f)
                curveToRelative(-0.268f, 0.842f, -0.341f, 1.892f, -0.369f, 2.662f)
                curveToRelative(0.15f, 5.014f, 4.557f, 8.884f, 9.17f, 8.682f)
                curveToRelative(0.853f, -0.037f, 1.921f, -0.261f, 2.912f, -0.68f)
                arcToRelative(13.56f, 13.56f, 0.0f, false, false, 1.387f, -2.683f)
                lineToRelative(0.002f, -0.002f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.424f, -1.03f, 0.606f, -1.836f, 0.8f, -2.793f)
                curveToRelative(0.32f, -1.565f, 0.202f, -2.88f, 1.012f, -4.758f)
                curveToRelative(0.251f, -0.582f, 0.71f, -1.113f, 1.258f, -1.346f)
                curveToRelative(0.25f, -0.105f, 0.522f, -0.133f, 0.79f, -0.072f)
                curveToRelative(-0.89f, -2.471f, -3.115f, -4.326f, -5.26f, -5.066f)
                close()
            }
        }
        .build()
        return _cinema4d!!
    }

private var _cinema4d: ImageVector? = null
