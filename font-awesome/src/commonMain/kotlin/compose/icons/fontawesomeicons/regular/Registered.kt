package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Registered: ImageVector
    get() {
        if (_registered != null) {
            return _registered!!
        }
        _registered = Builder(name = "Registered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.03f, 8.0f, 8.0f, 119.03f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(392.97f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 456.0f)
                curveToRelative(-110.53f, 0.0f, -200.0f, -89.45f, -200.0f, -200.0f)
                curveToRelative(0.0f, -110.53f, 89.45f, -200.0f, 200.0f, -200.0f)
                curveToRelative(110.53f, 0.0f, 200.0f, 89.45f, 200.0f, 200.0f)
                curveToRelative(0.0f, 110.53f, -89.45f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(366.44f, 374.21f)
                curveToRelative(-53.05f, -96.28f, -50.25f, -91.47f, -53.27f, -96.08f)
                curveToRelative(24.27f, -13.88f, 39.48f, -41.56f, 39.48f, -73.18f)
                curveToRelative(0.0f, -52.5f, -30.25f, -85.25f, -101.5f, -85.25f)
                horizontalLineToRelative(-78.67f)
                curveToRelative(-6.62f, 0.0f, -12.0f, 5.38f, -12.0f, 12.0f)
                lineTo(160.49f, 380.0f)
                curveToRelative(0.0f, 6.62f, 5.38f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(38.57f)
                curveToRelative(6.62f, 0.0f, 12.0f, -5.38f, 12.0f, -12.0f)
                verticalLineToRelative(-83.66f)
                horizontalLineToRelative(31.96f)
                lineToRelative(47.51f, 89.3f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, false, 10.59f, 6.36f)
                horizontalLineToRelative(42.81f)
                curveToRelative(9.14f, 0.0f, 14.91f, -9.8f, 10.51f, -17.79f)
                close()
                moveTo(256.93f, 239.91f)
                horizontalLineToRelative(-33.88f)
                verticalLineToRelative(-64.14f)
                horizontalLineToRelative(27.38f)
                curveToRelative(32.42f, 0.0f, 38.93f, 12.13f, 38.93f, 31.71f)
                curveToRelative(-0.0f, 20.91f, -11.52f, 32.43f, -32.43f, 32.43f)
                close()
            }
        }
        .build()
        return _registered!!
    }

private var _registered: ImageVector? = null
