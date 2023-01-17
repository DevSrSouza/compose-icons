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

public val SimpleIcons.Lotpolishairlines: ImageVector
    get() {
        if (_lotpolishairlines != null) {
            return _lotpolishairlines!!
        }
        _lotpolishairlines = Builder(name = "Lotpolishairlines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.3754f, 0.0f, 0.0f, 5.3754f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.3754f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.3754f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6246f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(0.7445f, 12.0f)
                curveTo(0.7445f, 5.7792f, 5.7792f, 0.7445f, 12.0f, 0.7445f)
                curveToRelative(1.2871f, 0.0f, 2.511f, 0.2271f, 3.6593f, 0.6183f)
                lineTo(9.388f, 13.9306f)
                lineTo(1.2745f, 15.407f)
                arcTo(11.256f, 11.256f, 0.0f, false, true, 0.7445f, 12.0f)
                close()
                moveTo(12.0f, 23.2555f)
                curveToRelative(-4.9968f, 0.0f, -9.2366f, -3.2682f, -10.7003f, -7.7728f)
                horizontalLineToRelative(7.836f)
                lineToRelative(7.0788f, 6.9526f)
                curveToRelative(-1.2997f, 0.5174f, -2.7256f, 0.8202f, -4.2145f, 0.8202f)
                close()
                moveTo(16.2271f, 22.4227f)
                arcToRelative(2.246f, 2.246f, 0.0f, false, false, 0.6309f, -1.5647f)
                curveToRelative(0.0f, -0.7066f, -0.328f, -1.3501f, -0.8454f, -1.7539f)
                lineToRelative(-4.7319f, -3.6214f)
                horizontalLineToRelative(11.4195f)
                curveToRelative(-1.0346f, 3.1545f, -3.4194f, 5.7034f, -6.4731f, 6.94f)
                close()
                moveTo(21.388f, 14.3344f)
                horizontalLineToRelative(-2.7003f)
                lineToRelative(0.2019f, 0.2902f)
                horizontalLineToRelative(0.9211f)
                lineToRelative(0.4669f, 0.5678f)
                horizontalLineToRelative(-5.0851f)
                curveToRelative(0.0f, -1.0094f, -0.8202f, -1.8422f, -1.8423f, -1.8422f)
                curveToRelative(-0.101f, 0.0f, -0.2019f, 0.0126f, -0.2902f, 0.0252f)
                lineToRelative(-1.8297f, 0.2776f)
                lineToRelative(5.4006f, -8.9842f)
                curveToRelative(0.2146f, -0.3533f, 0.3281f, -0.7571f, 0.3281f, -1.1861f)
                curveToRelative(0.0f, -0.9085f, -0.5047f, -1.7161f, -1.2492f, -2.0946f)
                curveTo(20.1009f, 2.9148f, 23.2555f, 7.0788f, 23.2555f, 12.0f)
                curveToRelative(0.0f, 1.1104f, -0.164f, 2.1829f, -0.4669f, 3.1924f)
                arcToRelative(1.7505f, 1.7505f, 0.0f, false, true, -1.4006f, -0.858f)
                close()
            }
        }
        .build()
        return _lotpolishairlines!!
    }

private var _lotpolishairlines: ImageVector? = null
