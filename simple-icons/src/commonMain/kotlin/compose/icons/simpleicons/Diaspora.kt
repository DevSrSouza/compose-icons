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

public val SimpleIcons.Diaspora: VectorAsset
    get() {
        if (_diaspora != null) {
            return _diaspora!!
        }
        _diaspora = VectorAssetBuilder(name = "Diaspora", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.26f, 21.896f)
                lineToRelative(-2.332f, -3.256f)
                curveToRelative(-0.622f, -0.87f, -1.127f, -1.547f, -1.154f, -1.547f)
                reflectiveCurveToRelative(-1.006f, 1.314f, -2.316f, 3.113f)
                curveTo(8.21f, 21.92f, 7.178f, 23.32f, 7.163f, 23.32f)
                curveToRelative(-0.033f, 0.0f, -4.498f, -3.144f, -4.51f, -3.177f)
                curveToRelative(-0.006f, -0.016f, 1.005f, -1.498f, 2.242f, -3.293f)
                curveToRelative(1.24f, -1.795f, 2.254f, -3.29f, 2.254f, -3.326f)
                curveToRelative(0.0f, -0.055f, -0.408f, -0.193f, -3.557f, -1.245f)
                lineTo(0.0f, 11.08f)
                curveToRelative(-0.03f, -0.018f, 0.156f, -0.64f, 0.793f, -2.65f)
                curveToRelative(0.46f, -1.446f, 0.844f, -2.64f, 0.855f, -2.655f)
                curveToRelative(0.014f, -0.016f, 1.71f, 0.524f, 3.772f, 1.205f)
                curveToRelative(2.063f, 0.68f, 3.765f, 1.234f, 3.788f, 1.234f)
                curveToRelative(0.022f, 0.0f, 0.046f, -0.03f, 0.053f, -0.07f)
                curveToRelative(0.01f, -0.03f, 0.03f, -1.786f, 0.04f, -3.9f)
                curveToRelative(0.02f, -2.1f, 0.04f, -3.84f, 0.05f, -3.87f)
                curveToRelative(0.02f, -0.03f, 0.6f, -0.03f, 2.73f, -0.03f)
                curveToRelative(1.484f, 0.0f, 2.713f, 0.015f, 2.733f, 0.03f)
                curveToRelative(0.025f, 0.016f, 0.065f, 1.186f, 0.136f, 3.78f)
                curveToRelative(0.11f, 4.275f, 0.11f, 4.335f, 0.18f, 4.335f)
                curveToRelative(0.025f, 0.0f, 1.66f, -0.54f, 3.63f, -1.22f)
                curveToRelative(1.973f, -0.66f, 3.592f, -1.2f, 3.605f, -1.186f)
                curveToRelative(0.03f, 0.044f, 1.65f, 5.31f, 1.635f, 5.325f)
                curveToRelative(-0.017f, 0.016f, -1.667f, 0.585f, -3.66f, 1.26f)
                curveToRelative(-2.76f, 0.93f, -3.647f, 1.245f, -3.647f, 1.29f)
                curveToRelative(-0.014f, 0.03f, 0.93f, 1.455f, 2.146f, 3.21f)
                curveToRelative(1.184f, 1.74f, 2.143f, 3.165f, 2.143f, 3.18f)
                curveToRelative(-0.015f, 0.046f, -4.44f, 3.302f, -4.483f, 3.302f)
                curveToRelative(-0.015f, 0.0f, -0.585f, -0.766f, -1.245f, -1.695f)
                lineToRelative(0.005f, -0.067f)
                close()
            }
        }
        .build()
        return _diaspora!!
    }

private var _diaspora: VectorAsset? = null
