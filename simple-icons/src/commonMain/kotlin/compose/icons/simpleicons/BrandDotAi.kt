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

public val SimpleIcons.BrandDotAi: ImageVector
    get() {
        if (_brandDotAi != null) {
            return _brandDotAi!!
        }
        _brandDotAi = Builder(name = "BrandDotAi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.956f, 11.2626f)
                curveTo(23.578f, 5.007f, 18.4025f, 0.0485f, 12.061f, 0.0095f)
                horizontalLineToRelative(-0.142f)
                curveToRelative(-2.2398f, 0.016f, -4.3356f, 0.64f, -6.1245f, 1.7239f)
                arcTo(12.0293f, 12.0293f, 0.0f, false, false, 1.747f, 5.766f)
                curveTo(0.7599f, 7.381f, 0.1499f, 9.2527f, 0.023f, 11.2556f)
                curveToRelative(-0.015f, 0.247f, -0.023f, 0.494f, -0.023f, 0.7469f)
                curveToRelative(0.0f, 0.25f, 0.01f, 0.5f, 0.025f, 0.746f)
                curveToRelative(0.123f, 2.0028f, 0.734f, 3.8726f, 1.7229f, 5.4895f)
                curveToRelative(0.9999f, 1.6478f, 2.3838f, 3.0297f, 4.0236f, 4.0326f)
                curveToRelative(1.7979f, 1.074f, 3.8967f, 1.7049f, 6.1295f, 1.7199f)
                horizontalLineToRelative(0.18f)
                curveToRelative(6.3425f, -0.043f, 11.497f, -4.9896f, 11.889f, -11.239f)
                curveToRelative(0.014f, -0.24f, 0.03f, -0.496f, 0.03f, -0.735f)
                reflectiveCurveToRelative(0.0f, -0.495f, -0.016f, -0.734f)
                lineToRelative(-0.027f, -0.022f)
                close()
                moveTo(12.001f, 15.6422f)
                verticalLineToRelative(3.8297f)
                curveToRelative(0.096f, 2.3398f, -0.57f, 2.7297f, -1.3699f, 2.7657f)
                curveToRelative(-0.034f, 0.0f, -0.066f, 0.003f, -0.1f, 0.004f)
                curveToRelative(-4.5556f, -0.6449f, -8.1573f, -4.2566f, -8.7832f, -8.8222f)
                curveToRelative(-0.066f, -0.464f, -0.1f, -0.938f, -0.1f, -1.4199f)
                curveToRelative(0.0f, -0.48f, 0.034f, -0.953f, 0.1f, -1.4179f)
                curveToRelative(0.6249f, -4.5596f, 4.2176f, -8.1693f, 8.7692f, -8.8192f)
                lineToRelative(0.115f, 0.01f)
                curveToRelative(0.8f, 0.043f, 1.4649f, 0.43f, 1.3699f, 2.7637f)
                verticalLineToRelative(3.8277f)
                curveToRelative(-0.01f, 1.5729f, 0.895f, 3.0717f, 1.8568f, 3.6397f)
                curveToRelative(-0.9619f, 0.56f, -1.8678f, 1.8748f, -1.8578f, 3.6337f)
                close()
            }
        }
        .build()
        return _brandDotAi!!
    }

private var _brandDotAi: ImageVector? = null
