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

public val SimpleIcons.Thunderbird: ImageVector
    get() {
        if (_thunderbird != null) {
            return _thunderbird!!
        }
        _thunderbird = Builder(name = "Thunderbird", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.73f, 10.23f)
                curveToRelative(-0.225f, -1.2f, -0.694f, -2.362f, -1.331f, -3.411f)
                curveToRelative(-0.181f, -0.323f, -0.417f, -0.629f, -0.619f, -0.919f)
                curveToRelative(-1.349f, -1.893f, -2.418f, -2.53f, -2.624f, -2.643f)
                curveToRelative(-0.187f, -0.131f, -0.375f, -0.262f, -0.562f, -0.375f)
                curveToRelative(-1.743f, -1.087f, -2.868f, -1.237f, -2.868f, -1.237f)
                curveToRelative(-0.806f, -0.337f, -1.593f, -0.525f, -2.174f, -0.619f)
                curveToRelative(-1.256f, -0.15f, -2.306f, -0.131f, -3.224f, 0.0f)
                curveToRelative(0.15f, -0.262f, 0.281f, -0.356f, 0.319f, -0.375f)
                curveToRelative(0.023f, 0.0f, 0.017f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.45f, 0.038f, -0.993f, 0.337f, -1.481f, 0.637f)
                curveTo(9.503f, 0.633f, 10.215f, 0.258f, 10.309f, 0.202f)
                horizontalLineToRelative(0.019f)
                curveTo(9.766f, 0.165f, 8.172f, 0.521f, 6.804f, 2.039f)
                curveTo(2.549f, 3.82f, 0.0f, 7.718f, 0.0f, 11.973f)
                curveToRelative(0.0f, 3.224f, 1.256f, 5.548f, 2.624f, 7.085f)
                curveToRelative(1.293f, 1.406f, 2.718f, 2.155f, 3.393f, 2.362f)
                curveToRelative(0.071f, 0.028f, 0.225f, 0.038f, 0.225f, 0.038f)
                curveToRelative(0.019f, -0.056f, -0.862f, -1.462f, -1.256f, -3.149f)
                curveToRelative(0.787f, 0.806f, 1.724f, 1.425f, 2.774f, 1.537f)
                curveToRelative(0.112f, 0.019f, -0.375f, -0.581f, -0.9f, -1.368f)
                lineToRelative(0.712f, 0.244f)
                lineToRelative(7.816f, 2.605f)
                curveToRelative(-0.768f, 0.787f, -1.799f, 1.556f, -3.205f, 2.23f)
                curveToRelative(0.0f, 0.0f, 3.149f, -0.262f, 4.705f, -2.006f)
                curveToRelative(-0.637f, 1.462f, -2.381f, 2.249f, -2.381f, 2.249f)
                curveToRelative(1.275f, -0.188f, 4.648f, -1.181f, 6.785f, -3.861f)
                curveToRelative(2.437f, -3.036f, 3.168f, -5.886f, 2.437f, -9.709f)
                close()
                moveTo(17.507f, 17.334f)
                curveToRelative(-0.244f, 1.181f, -0.75f, 2.493f, -1.893f, 3.749f)
                lineTo(1.799f, 16.49f)
                curveToRelative(-0.394f, -1.256f, -0.581f, -2.718f, -0.469f, -4.424f)
                curveToRelative(0.244f, 0.45f, 0.975f, 0.825f, 1.424f, 0.844f)
                curveToRelative(-1.05f, -2.343f, -0.637f, -3.955f, 0.15f, -5.023f)
                arcToRelative(635.68f, 635.68f, 0.0f, false, true, 1.031f, 1.518f)
                verticalLineToRelative(-0.112f)
                curveToRelative(0.019f, -0.15f, 0.038f, -0.262f, 0.075f, -0.375f)
                curveToRelative(-0.356f, -0.525f, -0.656f, -0.975f, -0.881f, -1.293f)
                curveToRelative(0.431f, -0.487f, 0.918f, -0.843f, 1.35f, -1.087f)
                curveToRelative(0.019f, 0.206f, 0.056f, 0.394f, 0.112f, 0.618f)
                curveToRelative(0.075f, 0.319f, 0.094f, 0.787f, 0.056f, 1.162f)
                verticalLineToRelative(-0.019f)
                curveToRelative(0.0f, 0.075f, -0.019f, 0.15f, -0.037f, 0.225f)
                curveToRelative(-0.019f, 0.075f, -0.225f, 0.281f, -0.281f, 0.825f)
                curveToRelative(-0.056f, 0.581f, 0.15f, 0.9f, 0.356f, 1.143f)
                curveToRelative(0.244f, -0.225f, 0.694f, -0.787f, 1.518f, -1.106f)
                curveToRelative(0.825f, -0.337f, 1.368f, -0.825f, 2.418f, -1.349f)
                curveToRelative(0.618f, -0.319f, 1.275f, -0.281f, 2.099f, -0.244f)
                curveToRelative(1.481f, 0.262f, 3.43f, 0.787f, 5.248f, 0.881f)
                curveToRelative(0.412f, 0.975f, 0.581f, 2.38f, 0.581f, 2.418f)
                curveToRelative(0.0f, 0.131f, 0.019f, 0.244f, 0.019f, 0.356f)
                curveToRelative(-3.224f, 1.218f, -7.01f, 2.605f, -8.603f, 3.018f)
                curveToRelative(-0.131f, 0.038f, -1.518f, -1.968f, -2.812f, -3.88f)
                curveToRelative(-0.019f, 0.038f, -0.056f, 0.056f, -0.075f, 0.075f)
                curveToRelative(-0.037f, 0.038f, -0.075f, 0.075f, -0.094f, 0.112f)
                horizontalLineToRelative(-0.112f)
                curveToRelative(1.387f, 2.043f, 2.868f, 4.161f, 3.018f, 4.161f)
                curveToRelative(1.406f, -0.506f, 5.604f, -1.949f, 8.66f, -2.999f)
                curveToRelative(-0.019f, 2.306f, -0.581f, 3.168f, -0.581f, 3.168f)
                reflectiveCurveToRelative(0.768f, -0.3f, 1.556f, -1.087f)
                curveToRelative(0.0f, 0.637f, -0.169f, 2.287f, -1.5f, 3.88f)
                curveToRelative(0.0f, 0.0f, 0.693f, -0.187f, 1.481f, -0.562f)
                close()
            }
        }
        .build()
        return _thunderbird!!
    }

private var _thunderbird: ImageVector? = null
