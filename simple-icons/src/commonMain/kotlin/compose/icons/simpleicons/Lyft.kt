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

public val SimpleIcons.Lyft: VectorAsset
    get() {
        if (_lyft != null) {
            return _lyft!!
        }
        _lyft = VectorAssetBuilder(name = "Lyft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.122f)
                verticalLineToRelative(-3.512f)
                horizontalLineToRelative(-1.253f)
                curveToRelative(-0.524f, -2.76f, -3.424f, -4.575f, -6.34f, -3.483f)
                curveToRelative(-1.624f, 0.606f, -2.944f, 2.546f, -2.944f, 4.282f)
                verticalLineToRelative(7.981f)
                horizontalLineToRelative(0.14f)
                curveToRelative(0.003f, 0.0f, 0.003f, 0.0f, 0.006f, 0.0f)
                reflectiveCurveToRelative(0.003f, 0.0f, 0.006f, 0.0f)
                curveToRelative(0.904f, -0.038f, 1.75f, -0.421f, 2.38f, -1.077f)
                curveToRelative(0.632f, -0.659f, 0.981f, -1.522f, 0.981f, -2.432f)
                horizontalLineToRelative(1.463f)
                verticalLineToRelative(-3.515f)
                horizontalLineToRelative(-1.463f)
                verticalLineToRelative(-0.966f)
                curveToRelative(0.0f, -0.375f, 0.199f, -0.726f, 0.527f, -0.907f)
                curveToRelative(0.899f, -0.501f, 1.815f, 0.143f, 1.815f, 0.995f)
                verticalLineToRelative(3.22f)
                curveToRelative(0.0f, 1.273f, 0.48f, 2.456f, 1.352f, 3.331f)
                curveToRelative(0.834f, 0.834f, 1.964f, 1.314f, 3.179f, 1.352f)
                curveToRelative(0.0f, 0.0f, 0.003f, 0.0f, 0.003f, 0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.003f, 0.0f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(0.143f)
                verticalLineToRelative(-3.512f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.656f, -0.003f, -1.171f, -0.53f, -1.171f, -1.171f)
                verticalLineToRelative(-0.585f)
                close()
                moveTo(3.512f, 13.463f)
                verticalLineToRelative(-9.366f)
                horizontalLineToRelative(-3.512f)
                verticalLineToRelative(8.78f)
                curveToRelative(0.0f, 2.412f, 1.592f, 3.512f, 3.073f, 3.512f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.442f, 0.0f, 0.884f, -0.102f, 1.279f, -0.287f)
                curveToRelative(0.059f, -0.026f, 0.152f, -0.085f, 0.152f, -0.085f)
                reflectiveCurveToRelative(-0.088f, -0.094f, -0.126f, -0.135f)
                curveToRelative(-0.562f, -0.641f, -0.866f, -1.472f, -0.866f, -2.42f)
                close()
                moveTo(9.073f, 12.375f)
                curveToRelative(0.0f, 0.146f, -0.07f, 0.287f, -0.19f, 0.369f)
                curveToRelative(-0.471f, 0.331f, -0.981f, -0.003f, -0.981f, -0.451f)
                verticalLineToRelative(-4.683f)
                horizontalLineToRelative(-3.512f)
                verticalLineToRelative(5.854f)
                curveToRelative(0.0f, 1.613f, 1.314f, 2.927f, 2.927f, 2.927f)
                curveToRelative(0.697f, 0.0f, 1.373f, -0.249f, 1.902f, -0.702f)
                curveToRelative(-0.056f, 0.433f, -0.293f, 0.79f, -0.691f, 1.039f)
                curveToRelative(-0.372f, 0.234f, -0.858f, 0.357f, -1.402f, 0.357f)
                curveToRelative(-0.562f, 0.0f, -1.133f, -0.132f, -1.651f, -0.38f)
                curveToRelative(0.0f, 0.0f, -0.094f, -0.044f, -0.211f, -0.111f)
                verticalLineToRelative(3.12f)
                curveToRelative(0.781f, 0.316f, 1.639f, 0.483f, 2.467f, 0.483f)
                curveToRelative(1.311f, 0.0f, 2.508f, -0.41f, 3.372f, -1.156f)
                curveToRelative(0.969f, -0.834f, 1.481f, -2.055f, 1.481f, -3.527f)
                verticalLineToRelative(-7.902f)
                horizontalLineToRelative(-3.512f)
                close()
            }
        }
        .build()
        return _lyft!!
    }

private var _lyft: VectorAsset? = null
