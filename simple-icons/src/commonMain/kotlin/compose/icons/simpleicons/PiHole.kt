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

public val SimpleIcons.PiHole: VectorAsset
    get() {
        if (_piHole != null) {
            return _piHole!!
        }
        _piHole = VectorAssetBuilder(name = "PiHole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.375f, 8.782f)
                lineToRelative(-4.442f, 4.44f)
                curveToRelative(-1.451f, 1.45f, -1.451f, 3.803f, 0.0f, 5.253f)
                lineToRelative(4.442f, 4.439f)
                curveToRelative(1.45f, 1.449f, 3.799f, 1.449f, 5.249f, 0.0f)
                lineToRelative(4.442f, -4.439f)
                curveToRelative(1.451f, -1.45f, 1.452f, -3.803f, 0.0f, -5.253f)
                lineToRelative(-4.442f, -4.44f)
                curveTo(13.175f, 7.333f, 10.825f, 7.333f, 9.375f, 8.782f)
                close()
                moveTo(10.595f, 7.38f)
                curveTo(7.597f, 7.06f, 4.577f, 4.794f, 4.338f, 0.0f)
                curveToRelative(4.652f, 0.0f, 7.14f, 2.754f, 7.38f, 7.118f)
                curveToRelative(0.88f, -5.234f, 5.003f, -4.621f, 5.003f, -4.621f)
                curveToRelative(0.196f, 2.966f, -2.24f, 4.765f, -5.003f, 4.914f)
                curveToRelative(-0.776f, -1.636f, -5.426f, -5.648f, -5.426f, -5.648f)
                curveTo(6.287f, 1.759f, 6.278f, 1.759f, 6.274f, 1.765f)
                curveTo(6.271f, 1.768f, 6.27f, 1.774f, 6.272f, 1.778f)
                curveTo(6.272f, 1.778f, 10.759f, 5.687f, 10.595f, 7.38f)
                moveTo(11.994f, 17.684f)
                curveToRelative(-2.231f, 0.165f, -3.212f, 1.738f, -3.148f, 3.274f)
                curveToRelative(-0.003f, -0.036f, -0.007f, -0.07f, -0.009f, -0.107f)
                curveToRelative(-0.133f, -1.848f, 1.327f, -3.21f, 1.327f, -5.005f)
                curveToRelative(-0.172f, -2.322f, -1.869f, -3.287f, -3.462f, -3.133f)
                curveToRelative(0.101f, -0.012f, 0.204f, -0.022f, 0.313f, -0.028f)
                curveToRelative(1.848f, -0.133f, 3.212f, 1.327f, 5.005f, 1.327f)
                curveToRelative(2.082f, -0.157f, 3.074f, -1.537f, 3.146f, -2.969f)
                curveToRelative(0.022f, 1.75f, -1.331f, 3.079f, -1.331f, 4.81f)
                curveToRelative(0.165f, 2.23f, 1.736f, 3.21f, 3.271f, 3.148f)
                curveToRelative(-0.036f, 0.003f, -0.07f, 0.007f, -0.107f, 0.009f)
                curveTo(15.151f, 19.144f, 13.787f, 17.684f, 11.994f, 17.684f)
                close()
            }
        }
        .build()
        return _piHole!!
    }

private var _piHole: VectorAsset? = null
