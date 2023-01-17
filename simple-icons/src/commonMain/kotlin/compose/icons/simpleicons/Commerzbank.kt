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

public val SimpleIcons.Commerzbank: ImageVector
    get() {
        if (_commerzbank != null) {
            return _commerzbank!!
        }
        _commerzbank = Builder(name = "Commerzbank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.277f, 1.538f)
                arcToRelative(0.018f, 0.018f, 0.0f, false, false, -0.012f, 0.007f)
                lineToRelative(-4.74f, 8.21f)
                lineToRelative(-1.398f, 2.418f)
                curveToRelative(0.446f, 0.774f, 0.794f, 1.353f, 1.22f, 2.09f)
                curveToRelative(0.671f, 1.164f, 1.548f, 1.597f, 3.13f, 1.889f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, 0.697f, -1.392f)
                lineToRelative(2.783f, -4.824f)
                lineToRelative(2.786f, -4.826f)
                curveToRelative(0.404f, -0.702f, 1.296f, -2.143f, 2.57f, -2.965f)
                curveToRelative(-0.04f, 0.025f, -0.07f, 0.059f, -0.109f, 0.085f)
                curveToRelative(0.07f, -0.047f, 0.137f, -0.094f, 0.209f, -0.136f)
                curveToRelative(0.46f, -0.278f, 0.98f, -0.467f, 1.413f, -0.515f)
                curveToRelative(0.339f, -0.038f, 1.465f, -0.041f, 2.74f, -0.041f)
                close()
                moveTo(17.867f, 2.043f)
                curveToRelative(-1.048f, -0.008f, -1.462f, 0.007f, -2.545f, 0.008f)
                curveToRelative(-1.39f, 0.0f, -2.381f, 0.887f, -3.083f, 1.773f)
                curveToRelative(0.372f, 0.493f, 0.68f, 0.971f, 0.863f, 1.288f)
                arcToRelative(13357.605f, 13357.605f, 0.0f, false, false, 5.571f, 9.648f)
                curveToRelative(0.404f, 0.7f, 1.209f, 2.196f, 1.284f, 3.71f)
                curveToRelative(0.029f, 0.574f, -0.079f, 1.165f, -0.265f, 1.592f)
                curveToRelative(-0.131f, 0.3f, -0.652f, 1.207f, -1.256f, 2.253f)
                lineTo(24.0f, 12.678f)
                verticalLineToRelative(-0.008f)
                arcToRelative(0.013f, 0.013f, 0.0f, false, false, -0.002f, -0.005f)
                close()
                moveTo(0.001f, 8.163f)
                lineToRelative(0.095f, 4.946f)
                lineTo(0.0f, 8.163f)
                close()
                moveTo(0.094f, 13.109f)
                lineTo(1.226f, 15.073f)
                lineTo(5.49f, 22.457f)
                arcToRelative(0.015f, 0.015f, 0.0f, false, false, 0.012f, 0.005f)
                horizontalLineToRelative(12.265f)
                curveToRelative(0.446f, -0.779f, 0.664f, -1.147f, 1.311f, -2.282f)
                curveToRelative(0.709f, -1.242f, 0.278f, -2.681f, -0.037f, -3.472f)
                curveToRelative(-0.618f, 0.076f, -1.18f, 0.093f, -1.547f, 0.093f)
                lineTo(6.35f, 16.801f)
                curveToRelative(-0.809f, 0.0f, -2.505f, -0.05f, -3.853f, -0.741f)
                curveToRelative(-0.513f, -0.263f, -0.972f, -0.65f, -1.248f, -1.027f)
                curveToRelative(-0.176f, -0.238f, -0.625f, -1.003f, -1.156f, -1.924f)
                close()
            }
        }
        .build()
        return _commerzbank!!
    }

private var _commerzbank: ImageVector? = null
