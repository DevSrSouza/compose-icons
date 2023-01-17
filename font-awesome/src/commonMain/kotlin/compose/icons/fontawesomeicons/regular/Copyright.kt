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

public val RegularGroup.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.6f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(256.0f, 464.0f)
                curveToRelative(-114.7f, 0.0f, -208.0f, -93.31f, -208.0f, -208.0f)
                reflectiveCurveTo(141.3f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveToRelative(208.0f, 93.31f, 208.0f, 208.0f)
                reflectiveCurveTo(370.7f, 464.0f, 256.0f, 464.0f)
                close()
                moveTo(255.1f, 176.0f)
                curveTo(255.1f, 176.0f, 255.1f, 176.0f, 255.1f, 176.0f)
                curveToRelative(21.06f, 0.0f, 40.92f, 8.312f, 55.83f, 23.38f)
                curveToRelative(9.375f, 9.344f, 24.53f, 9.5f, 33.97f, 0.156f)
                curveToRelative(9.406f, -9.344f, 9.469f, -24.53f, 0.156f, -33.97f)
                curveToRelative(-24.0f, -24.22f, -55.95f, -37.56f, -89.95f, -37.56f)
                curveToRelative(0.0f, 0.0f, 0.031f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-33.97f, 0.0f, -65.95f, 13.34f, -89.95f, 37.56f)
                curveToRelative(-49.44f, 49.88f, -49.44f, 131.0f, 0.0f, 180.9f)
                curveToRelative(24.0f, 24.22f, 55.98f, 37.56f, 89.95f, 37.56f)
                curveToRelative(0.031f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(34.0f, 0.0f, 65.95f, -13.34f, 89.95f, -37.56f)
                curveToRelative(9.312f, -9.438f, 9.25f, -24.62f, -0.156f, -33.97f)
                curveToRelative(-9.438f, -9.312f, -24.59f, -9.219f, -33.97f, 0.156f)
                curveToRelative(-14.91f, 15.06f, -34.77f, 23.38f, -55.83f, 23.38f)
                curveToRelative(0.0f, 0.0f, 0.031f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-21.09f, 0.0f, -40.95f, -8.312f, -55.89f, -23.38f)
                curveToRelative(-30.94f, -31.22f, -30.94f, -82.03f, 0.0f, -113.3f)
                curveTo(214.2f, 184.3f, 234.0f, 176.0f, 255.1f, 176.0f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
