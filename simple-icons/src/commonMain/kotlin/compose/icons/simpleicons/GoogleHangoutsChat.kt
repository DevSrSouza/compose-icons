package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.GoogleHangoutsChat: VectorAsset
    get() {
        if (_googleHangoutsChat != null) {
            return _googleHangoutsChat!!
        }
        _googleHangoutsChat = VectorAssetBuilder(name = "GoogleHangoutsChat", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(10.357f, 10.357f, 0.0f, false, false, 1.637f, 10.363f)
                curveToRelative(0.0f, 5.427f, 4.949f, 9.818f, 10.363f, 9.818f)
                verticalLineToRelative(3.818f)
                curveToRelative(6.3f, -3.191f, 10.363f, -8.333f, 10.363f, -13.637f)
                arcTo(10.358f, 10.358f, 0.0f, false, false, 12.0f, -0.001f)
                close()
                moveTo(12.027f, 4.227f)
                curveToRelative(0.873f, 0.0f, 1.664f, 0.151f, 2.4f, 0.465f)
                reflectiveCurveToRelative(1.364f, 0.722f, 1.895f, 1.254f)
                curveToRelative(0.532f, 0.532f, 0.94f, 1.145f, 1.24f, 1.855f)
                reflectiveCurveToRelative(0.451f, 1.459f, 0.451f, 2.25f)
                curveToRelative(0.0f, 0.45f, -0.055f, 0.86f, -0.15f, 1.242f)
                reflectiveCurveToRelative(-0.246f, 0.722f, -0.451f, 1.008f)
                curveToRelative(-0.205f, 0.286f, -0.45f, 0.518f, -0.75f, 0.682f)
                reflectiveCurveToRelative(-0.64f, 0.246f, -1.035f, 0.246f)
                curveToRelative(-0.382f, 0.0f, -0.735f, -0.096f, -1.035f, -0.287f)
                reflectiveCurveToRelative(-0.547f, -0.464f, -0.725f, -0.832f)
                arcToRelative(2.586f, 2.586f, 0.0f, false, true, -0.885f, 0.832f)
                curveToRelative(-0.355f, 0.191f, -0.765f, 0.287f, -1.242f, 0.287f)
                arcToRelative(2.923f, 2.923f, 0.0f, false, true, -2.099f, -0.873f)
                arcTo(3.066f, 3.066f, 0.0f, false, true, 9.0f, 11.374f)
                arcToRelative(3.376f, 3.376f, 0.0f, false, true, -0.232f, -1.256f)
                curveToRelative(0.0f, -0.45f, 0.082f, -0.872f, 0.232f, -1.254f)
                curveToRelative(0.164f, -0.382f, 0.368f, -0.709f, 0.641f, -0.982f)
                curveToRelative(0.259f, -0.273f, 0.574f, -0.491f, 0.928f, -0.641f)
                reflectiveCurveToRelative(0.723f, -0.232f, 1.105f, -0.232f)
                reflectiveCurveToRelative(0.735f, 0.082f, 1.035f, 0.232f)
                reflectiveCurveToRelative(0.559f, 0.355f, 0.764f, 0.6f)
                horizontalLineToRelative(0.096f)
                verticalLineToRelative(-0.613f)
                horizontalLineToRelative(1.295f)
                verticalLineToRelative(3.832f)
                curveToRelative(0.0f, 0.245f, 0.068f, 0.464f, 0.205f, 0.668f)
                reflectiveCurveToRelative(0.355f, 0.312f, 0.641f, 0.312f)
                curveToRelative(0.191f, 0.0f, 0.354f, -0.054f, 0.49f, -0.176f)
                reflectiveCurveToRelative(0.232f, -0.286f, 0.314f, -0.477f)
                curveToRelative(0.082f, -0.191f, 0.136f, -0.424f, 0.164f, -0.656f)
                arcToRelative(6.67f, 6.67f, 0.0f, false, false, 0.041f, -0.723f)
                curveToRelative(0.0f, -0.614f, -0.123f, -1.201f, -0.355f, -1.76f)
                arcToRelative(4.897f, 4.897f, 0.0f, false, false, -0.98f, -1.459f)
                curveToRelative(-0.423f, -0.423f, -0.914f, -0.749f, -1.486f, -0.994f)
                reflectiveCurveToRelative(-1.187f, -0.367f, -1.869f, -0.367f)
                curveToRelative(-0.655f, 0.0f, -1.267f, 0.122f, -1.84f, 0.354f)
                reflectiveCurveToRelative(-1.064f, 0.56f, -1.486f, 0.969f)
                curveToRelative(-0.423f, 0.409f, -0.751f, 0.9f, -0.996f, 1.459f)
                curveToRelative(-0.245f, 0.573f, -0.367f, 1.186f, -0.367f, 1.855f)
                reflectiveCurveToRelative(0.122f, 1.282f, 0.367f, 1.855f)
                reflectiveCurveToRelative(0.586f, 1.05f, 1.023f, 1.459f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 3.287f, 1.322f)
                curveToRelative(0.75f, 0.0f, 1.404f, -0.164f, 1.99f, -0.477f)
                lineToRelative(0.477f, 1.199f)
                arcToRelative(5.864f, 5.864f, 0.0f, false, true, -2.455f, 0.518f)
                curveToRelative(-0.873f, 0.0f, -1.664f, -0.149f, -2.414f, -0.463f)
                curveToRelative(-0.736f, -0.314f, -1.376f, -0.724f, -1.908f, -1.256f)
                reflectiveCurveToRelative(-0.956f, -1.145f, -1.256f, -1.855f)
                curveToRelative(-0.3f, -0.709f, -0.449f, -1.471f, -0.449f, -2.275f)
                reflectiveCurveToRelative(0.149f, -1.555f, 0.449f, -2.277f)
                arcToRelative(5.736f, 5.736f, 0.0f, false, true, 3.164f, -3.123f)
                curveToRelative(0.723f, -0.314f, 1.527f, -0.465f, 2.414f, -0.465f)
                close()
                moveTo(11.836f, 8.4f)
                curveToRelative(-0.218f, 0.0f, -0.436f, 0.041f, -0.641f, 0.123f)
                reflectiveCurveToRelative(-0.382f, 0.19f, -0.545f, 0.34f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -0.369f, 0.561f)
                curveToRelative(-0.095f, 0.218f, -0.135f, 0.462f, -0.135f, 0.734f)
                reflectiveCurveToRelative(0.04f, 0.518f, 0.135f, 0.736f)
                curveToRelative(0.095f, 0.218f, 0.219f, 0.409f, 0.369f, 0.559f)
                curveToRelative(0.164f, 0.15f, 0.341f, 0.274f, 0.545f, 0.342f)
                arcToRelative(1.727f, 1.727f, 0.0f, false, false, 1.282f, 0.0f)
                curveToRelative(0.205f, -0.082f, 0.382f, -0.192f, 0.545f, -0.342f)
                reflectiveCurveToRelative(0.287f, -0.327f, 0.369f, -0.545f)
                curveToRelative(0.095f, -0.218f, 0.135f, -0.464f, 0.135f, -0.75f)
                reflectiveCurveToRelative(-0.04f, -0.532f, -0.135f, -0.75f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, -0.369f, -0.545f)
                arcToRelative(1.759f, 1.759f, 0.0f, false, false, -1.186f, -0.463f)
                close()
            }
        }
        .build()
        return _googleHangoutsChat!!
    }

private var _googleHangoutsChat: VectorAsset? = null
