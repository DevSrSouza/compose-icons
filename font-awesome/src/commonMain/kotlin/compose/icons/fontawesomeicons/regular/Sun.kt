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

public val RegularGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(505.2f, 324.8f)
                lineToRelative(-47.73f, -68.78f)
                lineToRelative(47.75f, -68.81f)
                curveToRelative(7.359f, -10.62f, 8.797f, -24.12f, 3.844f, -36.06f)
                curveToRelative(-4.969f, -11.94f, -15.52f, -20.44f, -28.22f, -22.72f)
                lineToRelative(-82.39f, -14.88f)
                lineToRelative(-14.89f, -82.41f)
                curveToRelative(-2.281f, -12.72f, -10.76f, -23.25f, -22.69f, -28.22f)
                curveToRelative(-11.97f, -4.936f, -25.42f, -3.498f, -36.12f, 3.844f)
                lineTo(256.0f, 54.49f)
                lineTo(187.2f, 6.709f)
                curveTo(176.5f, -0.602f, 163.1f, -2.039f, 151.1f, 2.896f)
                curveToRelative(-11.92f, 4.971f, -20.4f, 15.5f, -22.7f, 28.19f)
                lineToRelative(-14.89f, 82.44f)
                lineTo(31.15f, 128.4f)
                curveTo(18.42f, 130.7f, 7.854f, 139.2f, 2.9f, 151.2f)
                curveTo(-2.051f, 163.1f, -0.6f, 176.6f, 6.775f, 187.2f)
                lineToRelative(47.73f, 68.78f)
                lineToRelative(-47.75f, 68.81f)
                curveToRelative(-7.359f, 10.62f, -8.795f, 24.12f, -3.844f, 36.06f)
                curveToRelative(4.969f, 11.94f, 15.52f, 20.44f, 28.22f, 22.72f)
                lineToRelative(82.39f, 14.88f)
                lineToRelative(14.89f, 82.41f)
                curveToRelative(2.297f, 12.72f, 10.78f, 23.25f, 22.7f, 28.22f)
                curveToRelative(11.95f, 4.906f, 25.44f, 3.531f, 36.09f, -3.844f)
                lineTo(256.0f, 457.5f)
                lineToRelative(68.83f, 47.78f)
                curveTo(331.3f, 509.7f, 338.8f, 512.0f, 346.3f, 512.0f)
                curveToRelative(4.906f, 0.0f, 9.859f, -0.969f, 14.56f, -2.906f)
                curveToRelative(11.92f, -4.969f, 20.4f, -15.5f, 22.7f, -28.19f)
                lineToRelative(14.89f, -82.44f)
                lineToRelative(82.37f, -14.88f)
                curveToRelative(12.73f, -2.281f, 23.3f, -10.78f, 28.25f, -22.75f)
                curveTo(514.1f, 348.9f, 512.6f, 335.4f, 505.2f, 324.8f)
                close()
                moveTo(456.8f, 339.2f)
                lineToRelative(-99.61f, 18.0f)
                lineToRelative(-18.0f, 99.63f)
                lineTo(256.0f, 399.1f)
                lineTo(172.8f, 456.8f)
                lineToRelative(-18.0f, -99.63f)
                lineToRelative(-99.61f, -18.0f)
                lineTo(112.9f, 255.1f)
                lineTo(55.23f, 172.8f)
                lineToRelative(99.61f, -18.0f)
                lineToRelative(18.0f, -99.63f)
                lineTo(256.0f, 112.9f)
                lineToRelative(83.15f, -57.75f)
                lineToRelative(18.02f, 99.66f)
                lineToRelative(99.61f, 18.0f)
                lineTo(399.1f, 255.1f)
                lineTo(456.8f, 339.2f)
                close()
                moveTo(256.0f, 143.1f)
                curveToRelative(-61.85f, 0.0f, -111.1f, 50.14f, -111.1f, 111.1f)
                curveToRelative(0.0f, 61.85f, 50.15f, 111.1f, 111.1f, 111.1f)
                reflectiveCurveToRelative(111.1f, -50.14f, 111.1f, -111.1f)
                curveTo(367.1f, 194.1f, 317.8f, 143.1f, 256.0f, 143.1f)
                close()
                moveTo(256.0f, 319.1f)
                curveToRelative(-35.28f, 0.0f, -63.99f, -28.71f, -63.99f, -63.99f)
                reflectiveCurveTo(220.7f, 192.0f, 256.0f, 192.0f)
                reflectiveCurveToRelative(63.99f, 28.71f, 63.99f, 63.1f)
                reflectiveCurveTo(291.3f, 319.1f, 256.0f, 319.1f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
