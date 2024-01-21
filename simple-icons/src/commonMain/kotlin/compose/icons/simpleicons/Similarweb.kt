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

public val SimpleIcons.Similarweb: ImageVector
    get() {
        if (_similarweb != null) {
            return _similarweb!!
        }
        _similarweb = Builder(name = "Similarweb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.099f, 5.781f)
                curveToRelative(-1.283f, -2.0f, -3.14f, -3.67f, -5.27f, -4.52f)
                lineToRelative(-0.63f, -0.213f)
                arcToRelative(7.433f, 7.433f, 0.0f, false, false, -2.15f, -0.331f)
                curveToRelative(-2.307f, 0.01f, -4.175f, 1.92f, -4.175f, 4.275f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 0.867f, 2.602f)
                lineToRelative(-0.26f, -0.342f)
                curveToRelative(0.124f, 0.186f, 0.26f, 0.37f, 0.417f, 0.556f)
                curveToRelative(0.663f, 0.802f, 1.604f, 1.635f, 2.822f, 2.58f)
                curveToRelative(2.999f, 2.32f, 4.943f, 4.378f, 5.104f, 6.93f)
                curveToRelative(0.038f, 0.344f, 0.062f, 0.696f, 0.062f, 1.051f)
                curveToRelative(0.0f, 1.297f, -0.283f, 2.67f, -0.764f, 3.635f)
                horizontalLineToRelative(0.005f)
                reflectiveCurveToRelative(-0.207f, 0.377f, -0.077f, 0.487f)
                curveToRelative(0.066f, 0.057f, 0.21f, 0.1f, 0.46f, -0.053f)
                arcToRelative(12.104f, 12.104f, 0.0f, false, false, 3.4f, -3.33f)
                arcToRelative(12.111f, 12.111f, 0.0f, false, false, 2.088f, -6.635f)
                arcToRelative(12.098f, 12.098f, 0.0f, false, false, -1.9f, -6.692f)
                close()
                moveTo(13.003f, 14.499f)
                lineTo(11.125f, 12.949f)
                curveToRelative(-3.934f, -2.87f, -5.98f, -5.966f, -4.859f, -9.783f)
                arcToRelative(8.73f, 8.73f, 0.0f, false, true, 0.37f, -1.016f)
                verticalLineToRelative(-0.004f)
                reflectiveCurveToRelative(0.278f, -0.583f, -0.327f, -0.295f)
                arcToRelative(12.067f, 12.067f, 0.0f, false, false, -6.292f, 9.975f)
                arcToRelative(12.11f, 12.11f, 0.0f, false, false, 2.053f, 7.421f)
                arcToRelative(9.394f, 9.394f, 0.0f, false, false, 2.154f, 2.168f)
                lineTo(4.22f, 21.415f)
                curveToRelative(4.148f, 3.053f, 7.706f, 1.446f, 7.706f, 1.446f)
                horizontalLineToRelative(0.003f)
                arcToRelative(4.847f, 4.847f, 0.0f, false, false, 2.962f, -4.492f)
                arcToRelative(4.855f, 4.855f, 0.0f, false, false, -1.889f, -3.87f)
                close()
            }
        }
        .build()
        return _similarweb!!
    }

private var _similarweb: ImageVector? = null
