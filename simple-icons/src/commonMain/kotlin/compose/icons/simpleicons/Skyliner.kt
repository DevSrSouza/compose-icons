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

public val SimpleIcons.Skyliner: ImageVector
    get() {
        if (_skyliner != null) {
            return _skyliner!!
        }
        _skyliner = Builder(name = "Skyliner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.961f, 17.563f)
                curveToRelative(-0.182f, -0.037f, -0.366f, 0.044f, -0.461f, 0.203f)
                curveToRelative(-0.475f, 1.02f, -1.576f, 1.592f, -2.684f, 1.395f)
                curveToRelative(-0.203f, -1.108f, 0.373f, -2.213f, 1.397f, -2.681f)
                curveToRelative(0.204f, -0.125f, 0.271f, -0.392f, 0.146f, -0.597f)
                curveToRelative(-0.067f, -0.111f, -0.182f, -0.188f, -0.311f, -0.205f)
                curveToRelative(-1.577f, -0.297f, -3.193f, 0.262f, -4.252f, 1.469f)
                curveTo(0.545f, 18.865f, 0.074f, 21.03f, 0.5f, 23.113f)
                curveToRelative(0.031f, 0.185f, 0.175f, 0.329f, 0.359f, 0.359f)
                curveToRelative(0.498f, 0.081f, 1.002f, 0.12f, 1.508f, 0.12f)
                curveToRelative(1.834f, 0.102f, 3.625f, -0.581f, 4.931f, -1.873f)
                curveToRelative(0.89f, -1.054f, 1.259f, -2.452f, 1.007f, -3.808f)
                curveToRelative(-0.021f, -0.187f, -0.161f, -0.337f, -0.345f, -0.375f)
                lineToRelative(0.001f, 0.027f)
                close()
                moveTo(23.778f, 0.203f)
                curveToRelative(-0.171f, -0.169f, -0.522f, -0.089f, -0.522f, -0.089f)
                curveTo(22.621f, 0.04f, 21.98f, 0.003f, 21.339f, 0.001f)
                curveToRelative(-4.154f, -0.043f, -8.153f, 1.576f, -11.106f, 4.497f)
                curveToRelative(-0.36f, 0.362f, -0.7f, 0.742f, -1.02f, 1.139f)
                curveToRelative(-1.402f, -0.65f, -3.008f, -0.709f, -4.455f, -0.165f)
                curveToRelative(-2.287f, 0.984f, -3.623f, 3.787f, -4.729f, 6.671f)
                curveToRelative(-0.087f, 0.224f, 0.025f, 0.476f, 0.249f, 0.562f)
                curveToRelative(0.144f, 0.055f, 0.304f, 0.031f, 0.425f, -0.064f)
                curveToRelative(1.566f, -1.163f, 3.618f, -1.445f, 5.44f, -0.749f)
                lineTo(5.6f, 13.856f)
                curveToRelative(-0.05f, 0.184f, 0.026f, 0.377f, 0.187f, 0.479f)
                curveToRelative(1.466f, 1.096f, 2.767f, 2.395f, 3.863f, 3.857f)
                curveToRelative(0.103f, 0.163f, 0.298f, 0.239f, 0.482f, 0.188f)
                lineToRelative(1.963f, -0.539f)
                curveToRelative(0.719f, 1.826f, 0.436f, 3.893f, -0.749f, 5.456f)
                curveToRelative(-0.148f, 0.188f, -0.116f, 0.463f, 0.071f, 0.61f)
                curveToRelative(0.121f, 0.096f, 0.285f, 0.12f, 0.428f, 0.064f)
                curveToRelative(2.883f, -1.109f, 5.686f, -2.443f, 6.665f, -4.722f)
                curveToRelative(0.544f, -1.446f, 0.487f, -3.049f, -0.161f, -4.451f)
                curveToRelative(0.395f, -0.326f, 0.772f, -0.672f, 1.133f, -1.036f)
                curveToRelative(3.381f, -3.44f, 5.0f, -8.241f, 4.392f, -13.026f)
                curveToRelative(0.0f, 0.0f, 0.076f, -0.352f, -0.096f, -0.524f)
                lineTo(23.778f, 0.203f)
                close()
                moveTo(21.339f, 0.87f)
                curveToRelative(0.563f, 0.0f, 1.127f, 0.029f, 1.688f, 0.088f)
                curveToRelative(0.079f, 0.771f, 0.103f, 1.548f, 0.07f, 2.322f)
                curveToRelative(-0.611f, -0.066f, -1.184f, -0.34f, -1.623f, -0.771f)
                curveToRelative(-0.438f, -0.437f, -0.713f, -1.009f, -0.777f, -1.623f)
                curveToRelative(0.209f, -0.011f, 0.422f, -0.018f, 0.636f, -0.018f)
                lineToRelative(0.006f, 0.002f)
                close()
                moveTo(10.846f, 5.112f)
                curveTo(13.262f, 2.716f, 16.438f, 1.24f, 19.828f, 0.94f)
                curveToRelative(0.07f, 0.677f, 0.33f, 1.318f, 0.749f, 1.855f)
                lineToRelative(-2.698f, 2.697f)
                curveToRelative(-1.529f, -1.203f, -3.742f, -0.939f, -4.946f, 0.59f)
                curveToRelative(-1.005f, 1.278f, -1.005f, 3.078f, 0.0f, 4.356f)
                lineToRelative(-3.147f, 3.147f)
                curveToRelative(-0.811f, -0.785f, -1.689f, -1.498f, -2.626f, -2.131f)
                curveToRelative(0.662f, -2.394f, 1.932f, -4.58f, 3.686f, -6.342f)
                close()
                moveTo(18.37f, 8.271f)
                curveToRelative(0.001f, 1.469f, -1.188f, 2.66f, -2.657f, 2.66f)
                curveToRelative(-1.469f, 0.002f, -2.659f, -1.188f, -2.66f, -2.656f)
                curveToRelative(0.0f, -1.47f, 1.189f, -2.66f, 2.657f, -2.661f)
                horizontalLineToRelative(0.003f)
                curveToRelative(1.467f, 0.0f, 2.656f, 1.19f, 2.657f, 2.657f)
                close()
                moveTo(1.314f, 11.269f)
                curveToRelative(0.941f, -2.254f, 2.09f, -4.268f, 3.779f, -4.994f)
                curveToRelative(1.154f, -0.428f, 2.428f, -0.396f, 3.559f, 0.09f)
                curveTo(7.639f, 7.78f, 6.871f, 9.36f, 6.387f, 11.033f)
                curveToRelative(-1.645f, -0.667f, -3.498f, -0.581f, -5.074f, 0.233f)
                lineToRelative(0.001f, 0.003f)
                close()
                moveTo(10.205f, 17.459f)
                curveToRelative(-1.074f, -1.37f, -2.311f, -2.604f, -3.683f, -3.677f)
                lineToRelative(0.395f, -1.434f)
                curveToRelative(1.845f, 1.275f, 3.444f, 2.874f, 4.722f, 4.718f)
                lineToRelative(-1.434f, 0.393f)
                close()
                moveTo(17.713f, 18.884f)
                curveToRelative(-0.727f, 1.698f, -2.737f, 2.848f, -4.989f, 3.789f)
                curveToRelative(0.811f, -1.578f, 0.893f, -3.432f, 0.225f, -5.074f)
                curveToRelative(1.677f, -0.488f, 3.259f, -1.26f, 4.679f, -2.278f)
                curveToRelative(0.484f, 1.134f, 0.515f, 2.412f, 0.083f, 3.566f)
                lineToRelative(0.002f, -0.003f)
                close()
                moveTo(12.527f, 16.824f)
                curveToRelative(-0.629f, -0.937f, -1.34f, -1.816f, -2.123f, -2.628f)
                lineToRelative(3.147f, -3.148f)
                curveToRelative(1.528f, 1.203f, 3.743f, 0.939f, 4.945f, -0.59f)
                curveToRelative(1.006f, -1.278f, 1.006f, -3.078f, 0.0f, -4.356f)
                lineToRelative(2.698f, -2.698f)
                curveToRelative(0.535f, 0.418f, 1.177f, 0.677f, 1.85f, 0.75f)
                curveToRelative(-0.299f, 3.387f, -1.772f, 6.563f, -4.166f, 8.979f)
                curveToRelative(-1.763f, 1.754f, -3.947f, 3.022f, -6.343f, 3.684f)
                lineToRelative(-0.008f, 0.007f)
                close()
            }
        }
        .build()
        return _skyliner!!
    }

private var _skyliner: ImageVector? = null
