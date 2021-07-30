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
                curveTo(119.033f, 8.0f, 8.0f, 119.033f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.033f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.033f, 248.0f, -248.0f)
                reflectiveCurveTo(392.967f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 456.0f)
                curveToRelative(-110.532f, 0.0f, -200.0f, -89.451f, -200.0f, -200.0f)
                curveToRelative(0.0f, -110.531f, 89.451f, -200.0f, 200.0f, -200.0f)
                curveToRelative(110.532f, 0.0f, 200.0f, 89.451f, 200.0f, 200.0f)
                curveToRelative(0.0f, 110.532f, -89.451f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(366.442f, 374.209f)
                curveToRelative(-53.046f, -96.284f, -50.25f, -91.468f, -53.271f, -96.085f)
                curveToRelative(24.267f, -13.879f, 39.482f, -41.563f, 39.482f, -73.176f)
                curveToRelative(0.0f, -52.503f, -30.247f, -85.252f, -101.498f, -85.252f)
                horizontalLineToRelative(-78.667f)
                curveToRelative(-6.617f, 0.0f, -12.0f, 5.383f, -12.0f, 12.0f)
                lineTo(160.488f, 380.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(38.568f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                verticalLineToRelative(-83.663f)
                horizontalLineToRelative(31.958f)
                lineToRelative(47.515f, 89.303f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, false, 10.593f, 6.36f)
                horizontalLineToRelative(42.81f)
                curveToRelative(9.14f, 0.0f, 14.914f, -9.799f, 10.51f, -17.791f)
                close()
                moveTo(256.933f, 239.906f)
                horizontalLineToRelative(-33.875f)
                verticalLineToRelative(-64.14f)
                horizontalLineToRelative(27.377f)
                curveToRelative(32.417f, 0.0f, 38.929f, 12.133f, 38.929f, 31.709f)
                curveToRelative(-0.001f, 20.913f, -11.518f, 32.431f, -32.431f, 32.431f)
                close()
            }
        }
        .build()
        return _registered!!
    }

private var _registered: ImageVector? = null
