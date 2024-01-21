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

public val BrandsGroup.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.033f, 8.0f, 0.0f, 119.033f, 0.0f, 256.0f)
                reflectiveCurveTo(111.033f, 504.0f, 248.0f, 504.0f)
                reflectiveCurveTo(496.0f, 392.967f, 496.0f, 256.0f)
                reflectiveCurveTo(384.967f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(362.952f, 176.66f)
                curveToRelative(-3.732f, 39.215f, -19.881f, 134.378f, -28.1f, 178.3f)
                curveToRelative(-3.476f, 18.584f, -10.322f, 24.816f, -16.948f, 25.425f)
                curveToRelative(-14.4f, 1.326f, -25.338f, -9.517f, -39.287f, -18.661f)
                curveToRelative(-21.827f, -14.308f, -34.158f, -23.215f, -55.346f, -37.177f)
                curveToRelative(-24.485f, -16.135f, -8.612f, -25.0f, 5.342f, -39.5f)
                curveToRelative(3.652f, -3.793f, 67.107f, -61.51f, 68.335f, -66.746f)
                curveToRelative(0.153f, -0.655f, 0.3f, -3.1f, -1.154f, -4.384f)
                reflectiveCurveToRelative(-3.59f, -0.849f, -5.135f, -0.5f)
                quadToRelative(-3.283f, 0.746f, -104.608f, 69.142f)
                quadToRelative(-14.845f, 10.194f, -26.894f, 9.934f)
                curveToRelative(-8.855f, -0.191f, -25.888f, -5.006f, -38.551f, -9.123f)
                curveToRelative(-15.531f, -5.048f, -27.875f, -7.717f, -26.8f, -16.291f)
                quadToRelative(0.84f, -6.7f, 18.45f, -13.7f)
                quadToRelative(108.446f, -47.248f, 144.628f, -62.3f)
                curveToRelative(68.872f, -28.647f, 83.183f, -33.623f, 92.511f, -33.789f)
                curveToRelative(2.052f, -0.034f, 6.639f, 0.474f, 9.61f, 2.885f)
                arcToRelative(10.452f, 10.452f, 0.0f, false, true, 3.53f, 6.716f)
                arcTo(43.765f, 43.765f, 0.0f, false, true, 362.952f, 176.66f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
