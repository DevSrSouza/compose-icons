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

public val SimpleIcons.Treehouse: VectorAsset
    get() {
        if (_treehouse != null) {
            return _treehouse!!
        }
        _treehouse = VectorAssetBuilder(name = "Treehouse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.537f, 4.118f)
                curveToRelative(-0.806f, -0.453f, -2.092f, 0.278f, -2.871f, 1.635f)
                lineTo(16.25f, 8.215f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, false, 0.21f, 3.18f)
                lineToRelative(0.041f, 0.062f)
                curveToRelative(0.653f, 0.94f, 1.535f, 1.808f, 1.823f, 2.118f)
                arcToRelative(1.613f, 1.613f, 0.0f, false, true, -0.739f, 2.654f)
                arcToRelative(1.603f, 1.603f, 0.0f, false, true, -2.025f, -1.747f)
                curveToRelative(0.045f, -0.35f, -0.067f, -0.927f, -0.574f, -1.489f)
                curveToRelative(-0.506f, -0.563f, -1.54f, 0.5f, -1.874f, 1.61f)
                lineToRelative(-0.016f, 0.061f)
                curveToRelative(-0.334f, 1.094f, -0.546f, 2.05f, -0.482f, 2.143f)
                curveToRelative(0.037f, 0.06f, 0.072f, 0.12f, 0.105f, 0.182f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, true, -3.196f, 1.701f)
                arcToRelative(1.806f, 1.806f, 0.0f, false, true, 0.747f, -2.446f)
                lineToRelative(0.121f, -0.061f)
                curveToRelative(0.065f, -0.03f, 0.26f, -0.486f, 0.423f, -1.032f)
                lineToRelative(0.301f, -0.987f)
                curveToRelative(0.019f, -0.047f, 0.033f, -0.107f, 0.045f, -0.168f)
                lineToRelative(0.897f, -3.19f)
                lineToRelative(-0.957f, 1.96f)
                curveToRelative(-0.112f, -0.363f, -0.3f, -0.38f, -0.709f, -0.091f)
                curveToRelative(-0.243f, 0.183f, -0.653f, 0.531f, -0.85f, 0.669f)
                curveToRelative(-0.365f, 0.273f, -0.685f, 0.788f, -0.851f, 1.109f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, true, -0.41f, 0.5f)
                curveToRelative(-0.684f, 0.564f, -1.687f, 0.456f, -2.234f, -0.227f)
                arcToRelative(1.591f, 1.591f, 0.0f, false, true, 0.912f, -2.552f)
                curveToRelative(0.409f, -0.092f, 1.777f, -0.927f, 2.596f, -1.52f)
                curveToRelative(0.152f, -0.106f, 0.274f, -0.197f, 0.38f, -0.304f)
                lineToRelative(2.203f, -1.67f)
                lineToRelative(-1.914f, 1.032f)
                reflectiveCurveToRelative(-0.196f, -0.016f, -0.426f, 0.017f)
                curveToRelative(-0.698f, 0.075f, -1.428f, 0.182f, -1.564f, 0.35f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, true, -0.29f, 0.272f)
                curveToRelative(-0.637f, 0.456f, -1.519f, 0.32f, -1.989f, -0.317f)
                arcTo(1.437f, 1.437f, 0.0f, false, true, 6.29f, 8.04f)
                curveToRelative(0.259f, -0.183f, 0.577f, -0.274f, 0.865f, -0.274f)
                curveToRelative(0.518f, 0.016f, 1.87f, 0.29f, 2.993f, 0.092f)
                lineToRelative(0.288f, -0.045f)
                curveToRelative(1.14f, -0.196f, 2.476f, -1.186f, 3.024f, -2.187f)
                lineToRelative(1.184f, -2.067f)
                curveToRelative(0.653f, -1.139f, 0.608f, -2.384f, -0.105f, -2.795f)
                lineToRelative(-1.323f, -0.76f)
                curveToRelative(-0.653f, -0.363f, -1.715f, -0.363f, -2.354f, 0.0f)
                lineTo(2.004f, 4.97f)
                curveTo(1.337f, 5.319f, 0.805f, 6.23f, 0.805f, 6.975f)
                verticalLineToRelative(9.744f)
                curveToRelative(0.0f, 0.744f, 0.532f, 1.656f, 1.178f, 2.02f)
                lineToRelative(8.85f, 4.983f)
                curveToRelative(0.652f, 0.365f, 1.716f, 0.365f, 2.354f, 0.0f)
                lineToRelative(8.826f, -4.983f)
                curveToRelative(0.653f, -0.368f, 1.184f, -1.276f, 1.184f, -2.02f)
                verticalLineToRelative(-9.76f)
                curveToRelative(0.0f, -0.744f, -0.531f, -1.653f, -1.169f, -2.02f)
                lineToRelative(-1.46f, -0.823f)
            }
        }
        .build()
        return _treehouse!!
    }

private var _treehouse: VectorAsset? = null
