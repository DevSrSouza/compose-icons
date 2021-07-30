package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Qq: ImageVector
    get() {
        if (_qq != null) {
            return _qq!!
        }
        _qq = Builder(name = "Qq", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.754f, 420.445f)
                curveToRelative(-11.526f, 1.393f, -44.86f, -52.741f, -44.86f, -52.741f)
                curveToRelative(0.0f, 31.345f, -16.136f, 72.247f, -51.051f, 101.786f)
                curveToRelative(16.842f, 5.192f, 54.843f, 19.167f, 45.803f, 34.421f)
                curveToRelative(-7.316f, 12.343f, -125.51f, 7.881f, -159.632f, 4.037f)
                curveToRelative(-34.122f, 3.844f, -152.316f, 8.306f, -159.632f, -4.037f)
                curveToRelative(-9.045f, -15.25f, 28.918f, -29.214f, 45.783f, -34.415f)
                curveToRelative(-34.92f, -29.539f, -51.059f, -70.445f, -51.059f, -101.792f)
                curveToRelative(0.0f, 0.0f, -33.334f, 54.134f, -44.859f, 52.741f)
                curveToRelative(-5.37f, -0.65f, -12.424f, -29.644f, 9.347f, -99.704f)
                curveToRelative(10.261f, -33.024f, 21.995f, -60.478f, 40.144f, -105.779f)
                curveTo(60.683f, 98.063f, 108.982f, 0.006f, 224.0f, 0.0f)
                curveToRelative(113.737f, 0.006f, 163.156f, 96.133f, 160.264f, 214.963f)
                curveToRelative(18.118f, 45.223f, 29.912f, 72.85f, 40.144f, 105.778f)
                curveToRelative(21.768f, 70.06f, 14.716f, 99.053f, 9.346f, 99.704f)
                close()
            }
        }
        .build()
        return _qq!!
    }

private var _qq: ImageVector? = null
