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

public val SimpleIcons.Helium: ImageVector
    get() {
        if (_helium != null) {
            return _helium!!
        }
        _helium = Builder(name = "Helium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.6274f, 0.0f, 12.0f, 5.3726f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.3726f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.6274f, 0.0f, 12.0f)
                reflectiveCurveTo(5.3726f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.5535f, 5.6062f)
                arcToRelative(2.7033f, 2.7033f, 0.0f, false, false, -0.7421f, 1.3856f)
                curveToRelative(-1.923f, -0.7238f, -4.1285f, -0.264f, -5.5968f, 1.2045f)
                curveToRelative(-1.4696f, 1.4696f, -1.929f, 3.6777f, -1.2024f, 5.6018f)
                arcToRelative(2.7037f, 2.7037f, 0.0f, false, false, -1.3947f, 0.7441f)
                curveToRelative(-1.0604f, 1.0604f, -1.0604f, 2.7799f, 0.0f, 3.8403f)
                curveToRelative(1.0605f, 1.0604f, 2.7798f, 1.0604f, 3.8403f, 0.0f)
                arcToRelative(2.7035f, 2.7035f, 0.0f, false, false, 0.746f, -1.4034f)
                arcToRelative(5.255f, 5.255f, 0.0f, false, false, 1.8373f, 0.332f)
                curveToRelative(1.3756f, 0.0f, 2.7344f, -0.5344f, 3.7442f, -1.5442f)
                curveToRelative(1.463f, -1.463f, 1.9253f, -3.6579f, 1.2127f, -5.576f)
                arcToRelative(2.703f, 2.703f, 0.0f, false, false, 1.3957f, -0.7444f)
                curveToRelative(1.0605f, -1.0604f, 1.0605f, -2.7798f, 0.0f, -3.8403f)
                curveToRelative(-1.0604f, -1.0604f, -2.7798f, -1.0604f, -3.8402f, 0.0f)
                close()
                moveTo(17.7259f, 8.7787f)
                curveToRelative(-0.4029f, 0.403f, -0.9577f, 0.5877f, -1.5231f, 0.5072f)
                arcToRelative(0.3058f, 0.3058f, 0.0f, false, false, -0.0793f, 1.0E-4f)
                arcToRelative(0.9214f, 0.9214f, 0.0f, false, false, -0.9875f, 0.6035f)
                arcToRelative(0.9208f, 0.9208f, 0.0f, false, false, 0.0307f, 0.7007f)
                curveToRelative(0.602f, 1.3006f, 0.3253f, 2.8556f, -0.6886f, 3.8695f)
                curveToRelative(-1.014f, 1.0138f, -2.569f, 1.291f, -3.87f, 0.6884f)
                arcToRelative(0.9211f, 0.9211f, 0.0f, false, false, -0.7098f, -0.0276f)
                arcToRelative(0.9212f, 0.9212f, 0.0f, false, false, -0.5172f, 0.4781f)
                arcToRelative(0.9195f, 0.9195f, 0.0f, false, false, -0.0831f, 0.4539f)
                arcToRelative(0.308f, 0.308f, 0.0f, false, false, 0.0f, 0.0915f)
                arcToRelative(1.7992f, 1.7992f, 0.0f, false, true, -0.5009f, 1.5636f)
                curveToRelative(-0.6991f, 0.699f, -1.8368f, 0.699f, -2.5362f, 0.0f)
                arcToRelative(1.7821f, 1.7821f, 0.0f, false, true, -0.5252f, -1.2681f)
                curveToRelative(0.0f, -0.4791f, 0.1865f, -0.9295f, 0.5252f, -1.2682f)
                curveToRelative(0.4028f, -0.4029f, 0.9579f, -0.5873f, 1.5516f, -0.506f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, 0.1824f, 0.0205f)
                curveToRelative(0.13f, 0.0f, 0.262f, -0.0277f, 0.3877f, -0.0858f)
                arcToRelative(0.9213f, 0.9213f, 0.0f, false, false, 0.4753f, -0.5104f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, -0.0247f, -0.7167f)
                curveToRelative(-0.602f, -1.3006f, -0.3253f, -2.8555f, 0.6886f, -3.8694f)
                curveToRelative(1.014f, -1.014f, 2.5692f, -1.2909f, 3.87f, -0.6885f)
                arcToRelative(0.9212f, 0.9212f, 0.0f, false, false, 0.7074f, 0.0287f)
                arcToRelative(0.9218f, 0.9218f, 0.0f, false, false, 0.5197f, -0.4792f)
                curveToRelative(0.083f, -0.1793f, 0.103f, -0.3715f, 0.07f, -0.5583f)
                arcToRelative(1.7988f, 1.7988f, 0.0f, false, true, 0.5009f, -1.5637f)
                curveToRelative(0.6991f, -0.6993f, 1.8369f, -0.6993f, 2.536f, 0.0f)
                curveToRelative(0.6993f, 0.6993f, 0.6993f, 1.837f, 0.0f, 2.5362f)
                close()
                moveTo(10.6082f, 10.5898f)
                curveToRelative(-0.7758f, 0.7759f, -0.7758f, 2.0337f, 0.0f, 2.8095f)
                curveToRelative(0.7759f, 0.776f, 2.0338f, 0.776f, 2.8096f, 0.0f)
                curveToRelative(0.7758f, -0.7758f, 0.7758f, -2.0336f, 0.0f, -2.8095f)
                curveToRelative(-0.7758f, -0.7757f, -2.0337f, -0.7757f, -2.8096f, 0.0f)
                close()
            }
        }
        .build()
        return _helium!!
    }

private var _helium: ImageVector? = null
