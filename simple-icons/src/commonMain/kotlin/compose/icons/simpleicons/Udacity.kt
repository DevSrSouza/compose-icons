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

public val SimpleIcons.Udacity: VectorAsset
    get() {
        if (_udacity != null) {
            return _udacity!!
        }
        _udacity = VectorAssetBuilder(name = "Udacity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.01f, 0.138f)
                lineTo(0.0f, 4.68f)
                verticalLineToRelative(10.458f)
                curveToRelative(-0.015f, 4.803f, 3.915f, 8.71f, 8.775f, 8.725f)
                curveToRelative(1.604f, 0.004f, 3.115f, -0.418f, 4.414f, -1.154f)
                lineToRelative(6.487f, -3.686f)
                curveToRelative(2.561f, -1.306f, 4.313f, -3.946f, 4.323f, -6.991f)
                lineTo(23.999f, 1.096f)
                lineTo(22.409f, 0.18f)
                lineToRelative(-6.503f, 3.631f)
                verticalLineToRelative(11.373f)
                curveToRelative(-0.003f, 0.482f, -0.025f, 0.836f, -0.153f, 1.435f)
                curveToRelative(-0.216f, 0.915f, -0.521f, 1.561f, -0.574f, 1.665f)
                curveToRelative(-0.511f, -0.03f, -1.546f, -0.314f, -2.386f, -0.81f)
                curveToRelative(-0.42f, -0.24f, -0.914f, -0.601f, -1.364f, -1.021f)
                curveToRelative(-0.3f, -0.285f, -0.556f, -0.615f, -0.78f, -0.945f)
                curveToRelative(-0.24f, -0.345f, -0.435f, -0.704f, -0.585f, -1.079f)
                curveToRelative(-0.165f, -0.391f, -0.284f, -0.78f, -0.375f, -1.185f)
                curveToRelative(-0.09f, -0.421f, -0.104f, -0.855f, -0.104f, -1.275f)
                lineTo(9.6f, 1.051f)
                lineTo(8.01f, 0.143f)
                lineTo(8.01f, 0.138f)
                close()
                moveTo(11.697f, 21.721f)
                curveToRelative(-0.436f, 0.179f, -0.889f, 0.316f, -1.35f, 0.41f)
                curveToRelative(-0.477f, 0.094f, -0.916f, 0.141f, -1.403f, 0.141f)
                curveToRelative(-0.488f, 0.0f, -0.978f, -0.053f, -1.452f, -0.151f)
                curveToRelative(-0.461f, -0.092f, -0.915f, -0.234f, -1.35f, -0.417f)
                curveToRelative(-0.424f, -0.179f, -0.836f, -0.404f, -1.219f, -0.659f)
                curveToRelative(-0.99f, -0.691f, -1.5f, -1.291f, -1.941f, -1.936f)
                curveToRelative(-0.26f, -0.39f, -0.48f, -0.795f, -0.66f, -1.215f)
                curveToRelative(-0.183f, -0.435f, -0.322f, -0.886f, -0.416f, -1.335f)
                curveToRelative(-0.09f, -0.465f, -0.104f, -0.961f, -0.104f, -1.439f)
                lineTo(1.802f, 5.58f)
                lineToRelative(6.0f, -3.621f)
                lineTo(7.802f, 11.97f)
                curveToRelative(0.0f, 3.806f, 2.819f, 6.979f, 6.45f, 7.747f)
                curveToRelative(-0.135f, 0.165f, -0.24f, 0.331f, -0.391f, 0.48f)
                curveToRelative(-0.33f, 0.322f, -0.675f, 0.624f, -1.064f, 0.877f)
                curveToRelative(-0.375f, 0.257f, -0.645f, 0.465f, -1.065f, 0.644f)
                lineToRelative(-0.035f, 0.003f)
                close()
                moveTo(22.102f, 13.313f)
                curveToRelative(-0.087f, 0.404f, -0.211f, 0.803f, -0.375f, 1.186f)
                curveToRelative(-0.439f, 0.955f, -1.148f, 1.77f, -1.74f, 2.294f)
                curveToRelative(-1.216f, 1.101f, -2.725f, 1.44f, -2.898f, 1.44f)
                curveToRelative(0.362f, -0.948f, 0.608f, -1.965f, 0.611f, -3.039f)
                lineTo(17.7f, 4.725f)
                lineTo(22.204f, 2.0f)
                lineToRelative(0.003f, 10.009f)
                curveToRelative(0.0f, 0.431f, -0.018f, 0.879f, -0.105f, 1.296f)
                verticalLineToRelative(0.008f)
                close()
            }
        }
        .build()
        return _udacity!!
    }

private var _udacity: VectorAsset? = null
