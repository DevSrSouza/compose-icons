package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandRevolut: ImageVector
    get() {
        if (_brandRevolut != null) {
            return _brandRevolut!!
        }
        _brandRevolut = Builder(name = "BrandRevolut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.908f, 6.0f)
                curveToRelative(-0.091f, 0.363f, -0.908f, 5.0f, -0.908f, 5.0f)
                horizontalLineToRelative(1.228f)
                curveToRelative(1.59f, 0.0f, 2.772f, -1.168f, 2.772f, -2.943f)
                curveToRelative(0.0f, -1.249f, -0.818f, -2.057f, -2.087f, -2.057f)
                horizontalLineToRelative(-1.005f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 13.5f)
                lineToRelative(1.791f, 4.558f)
                curveToRelative(0.535f, 1.352f, 1.13f, 2.008f, 1.709f, 2.442f)
                curveToRelative(-1.0f, 0.5f, -2.616f, 0.522f, -3.605f, 0.497f)
                curveToRelative(-0.973f, 0.0f, -2.28f, -0.24f, -3.106f, -2.6f)
                lineToRelative(-1.289f, -3.397f)
                horizontalLineToRelative(-1.5f)
                reflectiveCurveToRelative(-0.465f, 2.243f, -0.65f, 3.202f)
                curveToRelative(-0.092f, 0.704f, 0.059f, 1.594f, 0.15f, 2.298f)
                curveToRelative(-1.0f, 0.5f, -2.5f, 0.5f, -3.5f, 0.5f)
                curveToRelative(-0.727f, 0.0f, -1.45f, -0.248f, -1.5f, -1.5f)
                lineToRelative(0.004f, -0.311f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.149f, -1.409f)
                curveToRelative(0.75f, -3.577f, 1.366f, -7.17f, 1.847f, -10.78f)
                curveToRelative(0.23f, -1.722f, 0.0f, -3.5f, 0.0f, -3.5f)
                curveToRelative(0.585f, -0.144f, 2.709f, -0.602f, 6.787f, -0.471f)
                arcToRelative(10.26f, 10.26f, 0.0f, false, true, 3.641f, 0.722f)
                curveToRelative(0.308f, 0.148f, 0.601f, 0.326f, 0.875f, 0.531f)
                curveToRelative(0.254f, 0.212f, 0.497f, 0.437f, 0.727f, 0.674f)
                curveToRelative(0.3f, 0.382f, 0.545f, 0.804f, 0.727f, 1.253f)
                curveToRelative(0.155f, 0.483f, 0.237f, 0.987f, 0.243f, 1.493f)
                curveToRelative(0.001f, 2.462f, -1.412f, 4.676f, -3.5f, 5.798f)
                close()
            }
        }
        .build()
        return _brandRevolut!!
    }

private var _brandRevolut: ImageVector? = null
