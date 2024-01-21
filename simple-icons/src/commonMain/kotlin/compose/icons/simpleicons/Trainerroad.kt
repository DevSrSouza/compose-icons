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

public val SimpleIcons.Trainerroad: ImageVector
    get() {
        if (_trainerroad != null) {
            return _trainerroad!!
        }
        _trainerroad = Builder(name = "Trainerroad", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.289f, 14.039f)
                curveToRelative(0.157f, -0.064f, 0.44f, -0.199f, 0.51f, -0.234f)
                curveToRelative(1.105f, -0.56f, 1.92f, -1.222f, 2.42f, -1.966f)
                curveToRelative(0.527f, -0.756f, 0.8f, -1.658f, 0.78f, -2.579f)
                curveToRelative(0.0f, -1.253f, -0.456f, -2.193f, -1.398f, -2.874f)
                curveToRelative(-0.922f, -0.668f, -2.225f, -0.971f, -3.874f, -1.012f)
                lineTo(1.357f, 5.374f)
                lineTo(0.0f, 8.421f)
                horizontalLineToRelative(5.528f)
                curveToRelative(0.014f, 0.0f, 0.028f, 0.005f, 0.038f, 0.016f)
                arcToRelative(0.02f, 0.02f, 0.0f, false, true, 0.004f, 0.019f)
                lineTo(2.785f, 16.85f)
                horizontalLineToRelative(3.668f)
                curveToRelative(0.063f, 0.0f, 0.12f, -0.041f, 0.14f, -0.102f)
                lineToRelative(2.759f, -8.303f)
                arcToRelative(0.043f, 0.043f, 0.0f, false, true, 0.042f, -0.024f)
                lineToRelative(2.823f, 0.001f)
                curveToRelative(0.014f, 0.0f, 0.028f, 0.005f, 0.038f, 0.015f)
                arcToRelative(0.02f, 0.02f, 0.0f, false, true, 0.004f, 0.019f)
                lineTo(9.473f, 16.85f)
                horizontalLineToRelative(3.669f)
                curveToRelative(0.064f, 0.0f, 0.12f, -0.042f, 0.14f, -0.103f)
                lineToRelative(0.742f, -2.26f)
                arcToRelative(0.043f, 0.043f, 0.0f, false, true, 0.042f, -0.024f)
                reflectiveCurveToRelative(2.452f, 0.005f, 2.452f, 0.003f)
                curveToRelative(0.864f, 1.363f, 1.807f, 2.878f, 2.616f, 4.16f)
                lineToRelative(3.844f, -0.002f)
                curveToRelative(0.118f, 0.0f, 0.19f, -0.13f, 0.125f, -0.229f)
                lineToRelative(-2.832f, -4.321f)
                curveToRelative(-0.01f, -0.022f, 0.013f, -0.025f, 0.018f, -0.035f)
                close()
                moveTo(19.839f, 10.684f)
                curveToRelative(-0.437f, 0.412f, -1.185f, 0.612f, -2.163f, 0.612f)
                horizontalLineToRelative(-2.583f)
                lineToRelative(0.952f, -2.874f)
                lineToRelative(2.353f, 0.001f)
                curveToRelative(1.14f, 0.017f, 1.826f, 0.514f, 1.838f, 1.337f)
                curveToRelative(0.007f, 0.35f, -0.138f, 0.688f, -0.397f, 0.924f)
                close()
            }
        }
        .build()
        return _trainerroad!!
    }

private var _trainerroad: ImageVector? = null
