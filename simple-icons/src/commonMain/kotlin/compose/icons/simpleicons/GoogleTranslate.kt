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

public val SimpleIcons.GoogleTranslate: VectorAsset
    get() {
        if (_googleTranslate != null) {
            return _googleTranslate!!
        }
        _googleTranslate = VectorAssetBuilder(name = "GoogleTranslate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.597f, 0.0f)
                curveTo(0.719f, 0.0f, 0.0f, 0.719f, 0.0f, 1.599f)
                verticalLineToRelative(16.275f)
                curveToRelative(0.0f, 0.878f, 0.719f, 1.597f, 1.597f, 1.597f)
                horizontalLineToRelative(10.0f)
                lineTo(13.074f, 24.0f)
                horizontalLineToRelative(9.33f)
                curveTo(23.28f, 24.0f, 24.0f, 23.293f, 24.0f, 22.428f)
                lineTo(24.0f, 6.39f)
                curveToRelative(0.0f, -0.865f, -0.719f, -1.572f, -1.597f, -1.572f)
                horizontalLineToRelative(-9.93f)
                lineTo(10.927f, 0.0f)
                close()
                moveTo(12.706f, 5.539f)
                horizontalLineToRelative(9.697f)
                curveToRelative(0.234f, 0.0f, 0.455f, 0.091f, 0.62f, 0.255f)
                arcToRelative(0.834f, 0.834f, 0.0f, false, true, 0.256f, 0.596f)
                verticalLineToRelative(16.038f)
                arcToRelative(0.824f, 0.824f, 0.0f, false, true, -0.255f, 0.596f)
                arcToRelative(0.881f, 0.881f, 0.0f, false, true, -0.62f, 0.255f)
                horizontalLineToRelative(-8.677f)
                lineToRelative(3.45f, -3.808f)
                horizontalLineToRelative(0.004f)
                lineToRelative(-0.74f, -2.302f)
                curveToRelative(0.01f, -0.009f, 0.58f, -0.501f, 1.283f, -1.247f)
                arcToRelative(52.6f, 52.6f, 0.0f, false, false, 2.818f, 2.806f)
                lineToRelative(0.772f, -0.772f)
                curveToRelative(-1.272f, -1.154f, -2.205f, -2.07f, -2.89f, -2.805f)
                curveToRelative(0.918f, -1.087f, 1.851f, -2.455f, 2.049f, -3.708f)
                horizontalLineToRelative(2.034f)
                verticalLineToRelative(0.003f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(-0.94f)
                horizontalLineToRelative(-4.532f)
                verticalLineToRelative(-1.52f)
                horizontalLineToRelative(-1.472f)
                verticalLineToRelative(1.52f)
                horizontalLineToRelative(-2.204f)
                close()
                moveTo(6.74f, 5.999f)
                curveToRelative(1.012f, 0.0f, 1.861f, 0.374f, 2.513f, 0.975f)
                lineToRelative(-0.99f, 0.952f)
                arcToRelative(2.194f, 2.194f, 0.0f, false, false, -1.523f, -0.584f)
                curveToRelative(-1.306f, 0.0f, -2.364f, 1.08f, -2.364f, 2.409f)
                curveToRelative(0.0f, 1.33f, 1.058f, 2.409f, 2.364f, 2.409f)
                curveToRelative(1.508f, 0.0f, 2.13f, -1.08f, 2.19f, -1.808f)
                lineToRelative(-2.188f, -0.002f)
                lineTo(6.742f, 9.066f)
                horizontalLineToRelative(3.511f)
                curveToRelative(0.05f, 0.23f, 0.089f, 0.457f, 0.089f, 0.764f)
                curveToRelative(0.0f, 2.147f, -1.433f, 3.669f, -3.602f, 3.669f)
                arcToRelative(3.752f, 3.752f, 0.0f, false, true, -3.751f, -3.75f)
                curveToRelative(0.0f, -2.07f, 1.68f, -3.75f, 3.751f, -3.75f)
                close()
                moveTo(14.603f, 11.446f)
                horizontalLineToRelative(4.766f)
                curveToRelative(-0.308f, 1.084f, -0.988f, 2.108f, -1.652f, 2.904f)
                curveToRelative(-1.176f, -1.392f, -1.18f, -1.844f, -1.18f, -1.844f)
                horizontalLineToRelative(-1.222f)
                reflectiveCurveToRelative(0.05f, 0.678f, 1.7f, 2.61f)
                curveToRelative(-0.533f, 0.546f, -0.946f, 0.875f, -0.95f, 0.88f)
                close()
            }
        }
        .build()
        return _googleTranslate!!
    }

private var _googleTranslate: VectorAsset? = null
