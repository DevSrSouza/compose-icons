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

public val RegularGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.1f, 454.3f)
                curveToRelative(0.0f, 6.297f, 1.816f, 12.44f, 5.284f, 17.69f)
                lineToRelative(17.14f, 25.69f)
                curveToRelative(5.25f, 7.875f, 17.17f, 14.28f, 26.64f, 14.28f)
                horizontalLineToRelative(61.67f)
                curveToRelative(9.438f, 0.0f, 21.36f, -6.401f, 26.61f, -14.28f)
                lineToRelative(17.08f, -25.68f)
                curveToRelative(2.938f, -4.438f, 5.348f, -12.37f, 5.348f, -17.7f)
                lineTo(272.0f, 415.1f)
                horizontalLineToRelative(-160.0f)
                lineTo(112.1f, 454.3f)
                close()
                moveTo(192.0f, 0.0f)
                curveTo(90.02f, 0.32f, 16.0f, 82.97f, 16.0f, 175.1f)
                curveToRelative(0.0f, 44.38f, 16.44f, 84.84f, 43.56f, 115.8f)
                curveToRelative(16.53f, 18.84f, 42.34f, 58.23f, 52.22f, 91.45f)
                curveToRelative(0.031f, 0.25f, 0.094f, 0.517f, 0.125f, 0.782f)
                horizontalLineToRelative(160.2f)
                curveToRelative(0.031f, -0.266f, 0.094f, -0.517f, 0.125f, -0.782f)
                curveToRelative(9.875f, -33.22f, 35.69f, -72.61f, 52.22f, -91.45f)
                curveTo(351.6f, 260.8f, 368.0f, 220.4f, 368.0f, 175.1f)
                curveTo(368.0f, 78.8f, 289.2f, 0.004f, 192.0f, 0.0f)
                close()
                moveTo(288.4f, 260.1f)
                curveToRelative(-15.66f, 17.85f, -35.04f, 46.3f, -49.05f, 75.89f)
                horizontalLineToRelative(-94.61f)
                curveToRelative(-14.01f, -29.59f, -33.39f, -58.04f, -49.04f, -75.88f)
                curveTo(75.24f, 236.8f, 64.0f, 206.1f, 64.0f, 175.1f)
                curveTo(64.0f, 113.3f, 112.1f, 48.25f, 191.1f, 48.0f)
                curveTo(262.6f, 48.0f, 320.0f, 105.4f, 320.0f, 175.1f)
                curveTo(320.0f, 206.1f, 308.8f, 236.8f, 288.4f, 260.1f)
                close()
                moveTo(176.0f, 80.0f)
                curveTo(131.9f, 80.0f, 96.0f, 115.9f, 96.0f, 160.0f)
                curveToRelative(0.0f, 8.844f, 7.156f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveTo(128.0f, 168.8f, 128.0f, 160.0f)
                curveToRelative(0.0f, -26.47f, 21.53f, -48.0f, 48.0f, -48.0f)
                curveToRelative(8.844f, 0.0f, 16.0f, -7.148f, 16.0f, -15.99f)
                reflectiveCurveTo(184.8f, 80.0f, 176.0f, 80.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
