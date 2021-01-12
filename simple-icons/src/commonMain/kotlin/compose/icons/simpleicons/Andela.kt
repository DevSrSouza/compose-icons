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

public val SimpleIcons.Andela: VectorAsset
    get() {
        if (_andela != null) {
            return _andela!!
        }
        _andela = VectorAssetBuilder(name = "Andela", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.996f, 0.002f)
                curveToRelative(-0.365f, 0.01f, -0.588f, 0.29f, -0.828f, 0.574f)
                lineTo(8.553f, 3.674f)
                lineTo(10.53f, 4.75f)
                lineTo(12.0f, 2.943f)
                lineToRelative(1.469f, 1.805f)
                lineToRelative(1.978f, -1.074f)
                lineTo(12.83f, 0.576f)
                curveToRelative(-0.24f, -0.284f, -0.462f, -0.564f, -0.826f, -0.574f)
                close()
                moveTo(8.553f, 3.674f)
                lineToRelative(-4.041f, -0.34f)
                curveToRelative(-0.371f, -0.03f, -0.727f, -0.072f, -0.992f, 0.178f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.002f, 0.004f)
                lineToRelative(-0.002f, 0.002f)
                curveToRelative(-0.251f, 0.265f, -0.21f, 0.624f, -0.178f, 0.994f)
                lineToRelative(0.338f, 4.039f)
                lineToRelative(2.162f, -0.64f)
                lineToRelative(-0.24f, -2.315f)
                lineToRelative(2.314f, 0.238f)
                close()
                moveTo(3.673f, 8.55f)
                lineTo(0.577f, 11.168f)
                curveToRelative(-0.283f, 0.24f, -0.564f, 0.462f, -0.574f, 0.826f)
                lineTo(0.0f, 11.994f)
                lineTo(0.002f, 12.0f)
                verticalLineToRelative(0.004f)
                curveToRelative(0.01f, 0.365f, 0.291f, 0.588f, 0.574f, 0.828f)
                lineToRelative(3.098f, 2.617f)
                lineToRelative(1.074f, -1.98f)
                lineTo(2.943f, 12.0f)
                lineToRelative(1.805f, -1.469f)
                close()
                moveTo(3.673f, 15.448f)
                reflectiveCurveToRelative(-0.307f, 3.665f, -0.337f, 4.041f)
                curveToRelative(-0.031f, 0.37f, -0.074f, 0.727f, 0.176f, 0.992f)
                lineToRelative(0.004f, 0.004f)
                lineToRelative(0.002f, 0.002f)
                curveToRelative(0.265f, 0.251f, 0.624f, 0.21f, 0.994f, 0.18f)
                lineToRelative(4.039f, -0.342f)
                lineToRelative(-0.64f, -2.158f)
                lineToRelative(-2.315f, 0.236f)
                lineToRelative(0.238f, -2.314f)
                close()
                moveTo(8.551f, 20.325f)
                lineToRelative(2.619f, 3.1f)
                curveToRelative(0.239f, 0.28f, 0.461f, 0.564f, 0.826f, 0.574f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.365f, -0.01f, 0.587f, -0.291f, 0.828f, -0.572f)
                lineToRelative(2.617f, -3.1f)
                lineToRelative(-1.98f, -1.074f)
                lineTo(12.0f, 21.059f)
                lineToRelative(-1.469f, -1.807f)
                close()
                moveTo(15.449f, 20.325f)
                lineToRelative(4.041f, 0.34f)
                curveToRelative(0.368f, 0.03f, 0.727f, 0.072f, 0.992f, -0.178f)
                lineToRelative(0.002f, -0.004f)
                lineToRelative(0.002f, -0.002f)
                curveToRelative(0.251f, -0.265f, 0.212f, -0.622f, 0.182f, -0.992f)
                lineToRelative(-0.342f, -4.04f)
                lineToRelative(-2.16f, 0.64f)
                lineToRelative(0.238f, 2.316f)
                lineToRelative(-2.314f, -0.24f)
                close()
                moveTo(20.326f, 15.448f)
                lineToRelative(3.098f, -2.619f)
                curveToRelative(0.282f, -0.239f, 0.566f, -0.461f, 0.576f, -0.826f)
                arcTo(0.01f, 0.01f, 0.0f, false, true, 24.0f, 12.0f)
                verticalLineToRelative(-0.004f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.01f, -0.365f, -0.291f, -0.587f, -0.572f, -0.828f)
                curveToRelative(-0.29f, -0.242f, -3.1f, -2.617f, -3.1f, -2.617f)
                lineToRelative(-1.074f, 1.98f)
                lineTo(21.059f, 12.0f)
                lineToRelative(-1.807f, 1.47f)
                close()
                moveTo(20.326f, 8.55f)
                lineToRelative(0.34f, -4.041f)
                curveToRelative(0.03f, -0.368f, 0.072f, -0.726f, -0.178f, -0.992f)
                lineToRelative(-0.004f, -0.002f)
                curveToRelative(0.0f, -0.001f, 0.0f, -0.002f, -0.002f, -0.002f)
                curveToRelative(-0.265f, -0.251f, -0.622f, -0.212f, -0.992f, -0.182f)
                curveToRelative(-0.376f, 0.033f, -4.04f, 0.34f, -4.04f, 0.342f)
                lineToRelative(0.64f, 2.16f)
                lineToRelative(2.316f, -0.238f)
                lineToRelative(-0.24f, 2.314f)
                close()
                moveTo(11.998f, 6.827f)
                curveToRelative(-0.404f, 0.0f, -0.592f, 0.363f, -0.666f, 0.576f)
                lineToRelative(-3.3f, 8.17f)
                curveToRelative(0.0f, 0.005f, -0.127f, 0.278f, -0.102f, 0.313f)
                curveToRelative(0.025f, 0.035f, 0.067f, 0.052f, 0.12f, 0.052f)
                horizontalLineToRelative(1.014f)
                curveToRelative(0.1f, 0.0f, 0.168f, -0.053f, 0.217f, -0.168f)
                lineToRelative(0.81f, -1.986f)
                horizontalLineToRelative(3.811f)
                lineToRelative(0.817f, 1.986f)
                curveToRelative(0.048f, 0.115f, 0.118f, 0.168f, 0.219f, 0.168f)
                horizontalLineToRelative(1.011f)
                curveToRelative(0.053f, 0.0f, 0.097f, -0.017f, 0.121f, -0.052f)
                curveToRelative(0.026f, -0.035f, -0.101f, -0.309f, -0.101f, -0.313f)
                lineToRelative(-3.301f, -8.17f)
                curveToRelative(-0.073f, -0.213f, -0.265f, -0.576f, -0.67f, -0.576f)
                close()
                moveTo(12.0f, 9.09f)
                lineToRelative(0.002f, 0.004f)
                lineTo(12.002f, 9.09f)
                lineToRelative(1.42f, 3.445f)
                curveToRelative(-0.947f, -0.002f, -1.895f, -0.002f, -2.842f, -0.002f)
                close()
            }
        }
        .build()
        return _andela!!
    }

private var _andela: VectorAsset? = null
