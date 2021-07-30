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

public val SimpleIcons.Krita: ImageVector
    get() {
        if (_krita != null) {
            return _krita!!
        }
        _krita = Builder(name = "Krita", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.652f, 0.76f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.5f, 0.246f)
                curveToRelative(-0.352f, 0.448f, -0.035f, 0.898f, 0.362f, 1.262f)
                curveToRelative(0.206f, 0.189f, 1.77f, 1.794f, 3.428f, 3.527f)
                arcToRelative(11.054f, 11.054f, 0.0f, false, true, 1.815f, -1.983f)
                curveTo(3.667f, 2.515f, 1.694f, 1.266f, 1.461f, 1.1f)
                curveTo(1.201f, 0.914f, 0.917f, 0.762f, 0.652f, 0.76f)
                close()
                moveTo(5.757f, 3.812f)
                curveToRelative(1.848f, 1.148f, 3.786f, 2.332f, 4.693f, 2.84f)
                curveToRelative(1.469f, 0.821f, 3.758f, 2.684f, 4.092f, 4.434f)
                curveToRelative(0.535f, 0.466f, 2.182f, 1.916f, 2.596f, 2.413f)
                curveToRelative(0.698f, -0.211f, 1.518f, 0.133f, 2.06f, 1.12f)
                curveToRelative(0.866f, 1.583f, 0.227f, 3.747f, -1.968f, 4.988f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -0.296f, 0.267f)
                lineToRelative(0.296f, -0.267f)
                curveToRelative(1.14f, -1.468f, -0.714f, -2.44f, -1.175f, -3.864f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, -0.11f, -0.78f)
                curveToRelative(-0.533f, -0.282f, -2.11f, -1.452f, -2.795f, -1.965f)
                curveToRelative(-1.801f, 0.16f, -4.207f, -1.773f, -5.35f, -3.08f)
                curveToRelative(-0.7f, -0.802f, -2.32f, -2.517f, -3.858f, -4.123f)
                arcToRelative(11.052f, 11.052f, 0.0f, false, false, -2.046f, 6.393f)
                arcTo(11.052f, 11.052f, 0.0f, true, false, 12.948f, 1.136f)
                curveToRelative(-2.64f, 0.004f, -5.19f, 0.954f, -7.19f, 2.676f)
                close()
                moveTo(14.467f, 11.364f)
                curveToRelative(-0.515f, 0.126f, -0.968f, 0.831f, -1.118f, 1.306f)
                curveToRelative(-0.038f, 0.115f, -0.04f, 0.303f, 0.066f, 0.342f)
                curveToRelative(0.802f, 0.592f, 1.556f, 1.168f, 2.4f, 1.7f)
                curveToRelative(0.162f, -0.393f, 0.746f, -0.963f, 1.096f, -1.2f)
                close()
                moveTo(2.937f, 13.003f)
                curveToRelative(0.812f, 1.898f, 5.798f, 7.17f, 12.06f, 2.695f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, 0.114f, 0.715f)
                curveToRelative(0.46f, 1.42f, 2.36f, 2.427f, 1.238f, 3.89f)
                curveToRelative(-2.135f, 1.364f, -5.0f, 1.201f, -6.989f, 0.528f)
                curveToRelative(-3.558f, -1.204f, -5.914f, -4.332f, -6.424f, -7.828f)
                close()
                moveTo(16.719f, 13.703f)
                arcToRelative(0.771f, 0.771f, 0.0f, false, false, -0.065f, 0.049f)
                curveToRelative(-0.004f, 0.003f, -0.008f, 0.008f, -0.011f, 0.008f)
                curveToRelative(0.003f, -0.003f, 0.007f, -0.008f, 0.01f, -0.008f)
                curveToRelative(0.024f, -0.015f, 0.044f, -0.034f, 0.066f, -0.048f)
                close()
            }
        }
        .build()
        return _krita!!
    }

private var _krita: ImageVector? = null
