package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(431.98f, 448.01f)
                lineToRelative(-47.97f, 0.05f)
                lineTo(384.01f, 416.0f)
                horizontalLineToRelative(-128.0f)
                verticalLineToRelative(32.21f)
                lineToRelative(-47.98f, 0.05f)
                curveToRelative(-8.82f, 0.01f, -15.97f, 7.16f, -15.98f, 15.99f)
                lineToRelative(-0.05f, 31.73f)
                curveToRelative(-0.01f, 8.85f, 7.17f, 16.03f, 16.02f, 16.02f)
                lineToRelative(223.96f, -0.26f)
                curveToRelative(8.82f, -0.01f, 15.97f, -7.16f, 15.98f, -15.98f)
                lineToRelative(0.04f, -31.73f)
                curveToRelative(0.01f, -8.85f, -7.17f, -16.03f, -16.02f, -16.02f)
                close()
                moveTo(585.2f, 26.74f)
                curveTo(582.58f, 11.31f, 568.99f, 0.0f, 553.06f, 0.0f)
                lineTo(86.93f, 0.0f)
                curveTo(71.0f, 0.0f, 57.41f, 11.31f, 54.79f, 26.74f)
                curveTo(-3.32f, 369.16f, 0.04f, 348.08f, 0.03f, 352.0f)
                curveToRelative(-0.03f, 17.32f, 14.29f, 32.0f, 32.6f, 32.0f)
                horizontalLineToRelative(574.74f)
                curveToRelative(18.23f, 0.0f, 32.51f, -14.56f, 32.59f, -31.79f)
                curveToRelative(0.02f, -4.08f, 3.35f, 16.95f, -54.76f, -325.47f)
                close()
                moveTo(259.83f, 64.0f)
                horizontalLineToRelative(120.33f)
                lineToRelative(9.77f, 96.0f)
                lineTo(250.06f, 160.0f)
                lineToRelative(9.77f, -96.0f)
                close()
                moveTo(184.66f, 320.0f)
                lineTo(71.09f, 320.0f)
                lineTo(90.1f, 208.0f)
                horizontalLineToRelative(105.97f)
                lineToRelative(-11.41f, 112.0f)
                close()
                moveTo(200.95f, 160.0f)
                lineTo(98.24f, 160.0f)
                lineToRelative(16.29f, -96.0f)
                horizontalLineToRelative(96.19f)
                lineToRelative(-9.77f, 96.0f)
                close()
                moveTo(233.77f, 320.0f)
                lineToRelative(11.4f, -112.0f)
                horizontalLineToRelative(149.65f)
                lineToRelative(11.4f, 112.0f)
                lineTo(233.77f, 320.0f)
                close()
                moveTo(429.27f, 64.0f)
                horizontalLineToRelative(96.19f)
                lineToRelative(16.29f, 96.0f)
                lineTo(439.04f, 160.0f)
                lineToRelative(-9.77f, -96.0f)
                close()
                moveTo(455.33f, 320.0f)
                lineToRelative(-11.4f, -112.0f)
                lineTo(549.9f, 208.0f)
                lineToRelative(19.01f, 112.0f)
                lineTo(455.33f, 320.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
