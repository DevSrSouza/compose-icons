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

public val SimpleIcons.Helm: VectorAsset
    get() {
        if (_helm != null) {
            return _helm!!
        }
        _helm = VectorAssetBuilder(name = "Helm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.651f, 19.252f)
                curveToRelative(0.704f, 1.005f, 0.96f, 2.039f, 0.573f, 2.31f)
                curveToRelative(-0.387f, 0.271f, -1.271f, -0.324f, -1.975f, -1.329f)
                curveToRelative(-0.259f, -0.37f, -0.456f, -0.744f, -0.584f, -1.082f)
                curveToRelative(-1.156f, 0.772f, -2.493f, 1.258f, -3.898f, 1.4f)
                curveToRelative(0.081f, 0.34f, 0.13f, 0.737f, 0.13f, 1.166f)
                curveToRelative(0.0f, 1.227f, -0.383f, 2.221f, -0.856f, 2.221f)
                curveToRelative(-0.473f, 0.0f, -0.856f, -0.994f, -0.856f, -2.221f)
                curveToRelative(0.0f, -0.42f, 0.047f, -0.807f, 0.125f, -1.142f)
                curveToRelative(-1.414f, -0.099f, -2.765f, -0.547f, -3.944f, -1.284f)
                curveToRelative(-0.127f, 0.301f, -0.3f, 0.621f, -0.524f, 0.942f)
                curveToRelative(-0.704f, 1.005f, -1.588f, 1.6f, -1.975f, 1.329f)
                curveToRelative(-0.387f, -0.271f, -0.131f, -1.305f, 0.573f, -2.31f)
                curveToRelative(0.236f, -0.337f, 0.492f, -0.622f, 0.743f, -0.85f)
                curveToRelative(-0.487f, -0.437f, -0.928f, -0.931f, -1.309f, -1.479f)
                lineToRelative(1.124f, -0.782f)
                curveToRelative(1.345f, 1.934f, 3.554f, 3.088f, 5.908f, 3.088f)
                curveToRelative(2.36f, 0.0f, 4.571f, -1.158f, 5.916f, -3.098f)
                lineToRelative(1.125f, 0.78f)
                curveToRelative(-0.348f, 0.502f, -0.747f, 0.957f, -1.183f, 1.366f)
                curveTo(18.06f, 18.518f, 18.369f, 18.85f, 18.651f, 19.252f)
                close()
                moveTo(6.277f, 5.623f)
                curveTo(5.682f, 6.143f, 5.153f, 6.746f, 4.711f, 7.43f)
                lineToRelative(1.15f, 0.743f)
                curveTo(7.193f, 6.111f, 9.453f, 4.88f, 11.907f, 4.88f)
                curveToRelative(2.535f, 0.0f, 4.835f, 1.294f, 6.151f, 3.461f)
                lineToRelative(1.17f, -0.711f)
                curveToRelative(-0.435f, -0.716f, -0.963f, -1.349f, -1.56f, -1.895f)
                curveToRelative(0.324f, -0.245f, 0.671f, -0.603f, 0.983f, -1.049f)
                curveToRelative(0.704f, -1.005f, 0.96f, -2.039f, 0.573f, -2.31f)
                curveToRelative(-0.387f, -0.271f, -1.271f, 0.324f, -1.975f, 1.329f)
                curveToRelative(-0.294f, 0.419f, -0.504f, 0.84f, -0.627f, 1.212f)
                curveToRelative(-1.152f, -0.761f, -2.485f, -1.232f, -3.9f, -1.364f)
                curveToRelative(0.108f, -0.372f, 0.175f, -0.83f, 0.175f, -1.333f)
                curveTo(12.897f, 0.994f, 12.514f, 0.0f, 12.041f, 0.0f)
                curveToRelative(-0.473f, 0.0f, -0.856f, 0.994f, -0.856f, 2.221f)
                curveToRelative(0.0f, 0.491f, 0.063f, 0.941f, 0.167f, 1.308f)
                curveToRelative(-1.413f, 0.09f, -2.757f, 0.525f, -3.93f, 1.247f)
                curveToRelative(-0.128f, -0.336f, -0.323f, -0.705f, -0.58f, -1.071f)
                curveTo(6.139f, 2.7f, 5.255f, 2.106f, 4.868f, 2.377f)
                curveToRelative(-0.387f, 0.271f, -0.131f, 1.305f, 0.573f, 2.31f)
                curveTo(5.706f, 5.065f, 5.997f, 5.385f, 6.277f, 5.623f)
                close()
                moveTo(0.5f, 15.272f)
                horizontalLineToRelative(1.648f)
                verticalLineTo(12.8f)
                horizontalLineToRelative(1.859f)
                verticalLineToRelative(2.473f)
                horizontalLineToRelative(1.648f)
                verticalLineTo(9.043f)
                horizontalLineTo(4.008f)
                verticalLineToRelative(2.319f)
                horizontalLineTo(2.148f)
                verticalLineTo(9.043f)
                horizontalLineTo(0.5f)
                verticalLineTo(15.272f)
                close()
                moveTo(7.036f, 9.043f)
                verticalLineToRelative(6.229f)
                horizontalLineToRelative(4.121f)
                verticalLineToRelative(-1.38f)
                horizontalLineTo(8.684f)
                verticalLineToRelative(-1.112f)
                horizontalLineToRelative(2.032f)
                verticalLineToRelative(-1.38f)
                horizontalLineTo(8.684f)
                verticalLineToRelative(-0.978f)
                horizontalLineToRelative(2.377f)
                verticalLineToRelative(-1.38f)
                lineTo(7.036f, 9.043f)
                lineTo(7.036f, 9.043f)
                close()
                moveTo(12.364f, 9.043f)
                verticalLineToRelative(6.229f)
                horizontalLineToRelative(4.006f)
                verticalLineToRelative(-1.38f)
                horizontalLineToRelative(-2.358f)
                verticalLineTo(9.043f)
                lineTo(12.364f, 9.043f)
                lineTo(12.364f, 9.043f)
                close()
                moveTo(17.443f, 9.043f)
                verticalLineToRelative(6.229f)
                horizontalLineToRelative(1.514f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0.0f, -0.16f, -0.008f, -0.335f, -0.024f, -0.527f)
                curveToRelative(-0.016f, -0.192f, -0.034f, -0.388f, -0.053f, -0.589f)
                curveToRelative(-0.019f, -0.201f, -0.042f, -0.398f, -0.067f, -0.589f)
                curveToRelative(-0.026f, -0.192f, -0.048f, -0.364f, -0.067f, -0.517f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.498f, 1.457f)
                lineToRelative(0.863f, 2.099f)
                horizontalLineToRelative(0.613f)
                lineToRelative(0.862f, -2.099f)
                lineToRelative(0.517f, -1.457f)
                horizontalLineToRelative(0.038f)
                curveToRelative(-0.019f, 0.153f, -0.042f, 0.326f, -0.067f, 0.518f)
                curveToRelative(-0.026f, 0.192f, -0.048f, 0.388f, -0.067f, 0.589f)
                curveToRelative(-0.019f, 0.201f, -0.037f, 0.398f, -0.053f, 0.589f)
                curveToRelative(-0.016f, 0.192f, -0.024f, 0.367f, -0.024f, 0.527f)
                verticalLineToRelative(1.84f)
                horizontalLineTo(23.5f)
                verticalLineTo(9.043f)
                horizontalLineToRelative(-1.706f)
                lineToRelative(-0.939f, 2.588f)
                lineToRelative(-0.345f, 1.016f)
                horizontalLineToRelative(-0.038f)
                lineToRelative(-0.345f, -1.016f)
                lineToRelative(-0.978f, -2.588f)
                lineTo(17.443f, 9.043f)
                lineTo(17.443f, 9.043f)
                close()
            }
        }
        .build()
        return _helm!!
    }

private var _helm: VectorAsset? = null
