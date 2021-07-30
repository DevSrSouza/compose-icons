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

public val BrandsGroup.StripeS: ImageVector
    get() {
        if (_stripeS != null) {
            return _stripeS!!
        }
        _stripeS = Builder(name = "StripeS", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.3f, 154.6f)
                curveToRelative(0.0f, -22.3f, 18.6f, -30.9f, 48.4f, -30.9f)
                curveToRelative(43.4f, 0.0f, 98.5f, 13.3f, 141.9f, 36.7f)
                verticalLineTo(26.1f)
                curveTo(298.3f, 7.2f, 251.1f, 0.0f, 203.8f, 0.0f)
                curveTo(88.1f, 0.0f, 11.0f, 60.4f, 11.0f, 161.4f)
                curveToRelative(0.0f, 157.9f, 216.8f, 132.3f, 216.8f, 200.4f)
                curveToRelative(0.0f, 26.4f, -22.9f, 34.9f, -54.7f, 34.9f)
                curveToRelative(-47.2f, 0.0f, -108.2f, -19.5f, -156.1f, -45.5f)
                verticalLineToRelative(128.5f)
                arcToRelative(396.09f, 396.09f, 0.0f, false, false, 156.0f, 32.4f)
                curveToRelative(118.6f, 0.0f, 200.3f, -51.0f, 200.3f, -153.6f)
                curveToRelative(0.0f, -170.2f, -218.0f, -139.7f, -218.0f, -203.9f)
                close()
            }
        }
        .build()
        return _stripeS!!
    }

private var _stripeS: ImageVector? = null
