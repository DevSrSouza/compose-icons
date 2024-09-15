package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UniversalAccess: ImageVector
    get() {
        if (_universalAccess != null) {
            return _universalAccess!!
        }
        _universalAccess = Builder(name = "UniversalAccess", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveToRelative(114.95f, 0.0f, 208.0f, 93.03f, 208.0f, 208.0f)
                curveToRelative(0.0f, 114.95f, -93.03f, 208.0f, -208.0f, 208.0f)
                curveToRelative(-114.95f, 0.0f, -208.0f, -93.03f, -208.0f, -208.0f)
                curveToRelative(0.0f, -114.95f, 93.03f, -208.0f, 208.0f, -208.0f)
                moveToRelative(0.0f, -40.0f)
                curveTo(119.03f, 8.0f, 8.0f, 119.03f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(392.97f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 64.0f)
                curveTo(149.96f, 64.0f, 64.0f, 149.96f, 64.0f, 256.0f)
                reflectiveCurveToRelative(85.96f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -85.96f, 192.0f, -192.0f)
                reflectiveCurveTo(362.04f, 64.0f, 256.0f, 64.0f)
                close()
                moveTo(256.0f, 108.0f)
                curveToRelative(19.88f, 0.0f, 36.0f, 16.12f, 36.0f, 36.0f)
                reflectiveCurveToRelative(-16.12f, 36.0f, -36.0f, 36.0f)
                reflectiveCurveToRelative(-36.0f, -16.12f, -36.0f, -36.0f)
                reflectiveCurveToRelative(16.12f, -36.0f, 36.0f, -36.0f)
                close()
                moveTo(373.74f, 206.02f)
                curveToRelative(-28.71f, 6.78f, -55.51f, 12.75f, -82.14f, 15.81f)
                curveToRelative(0.85f, 101.02f, 12.31f, 123.05f, 25.04f, 155.62f)
                curveToRelative(3.62f, 9.26f, -0.96f, 19.7f, -10.22f, 23.32f)
                curveToRelative(-9.26f, 3.62f, -19.7f, -0.96f, -23.32f, -10.22f)
                curveToRelative(-8.7f, -22.31f, -17.09f, -40.64f, -22.26f, -78.55f)
                horizontalLineToRelative(-9.69f)
                curveToRelative(-5.17f, 37.85f, -13.53f, 56.21f, -22.26f, 78.55f)
                curveToRelative(-3.62f, 9.26f, -14.05f, 13.84f, -23.32f, 10.22f)
                curveToRelative(-9.26f, -3.62f, -13.83f, -14.06f, -10.22f, -23.32f)
                curveToRelative(12.71f, -32.54f, 24.18f, -54.54f, 25.04f, -155.62f)
                curveToRelative(-26.63f, -3.06f, -53.43f, -9.03f, -82.14f, -15.81f)
                curveToRelative(-8.6f, -2.03f, -13.93f, -10.65f, -11.9f, -19.25f)
                reflectiveCurveToRelative(10.65f, -13.93f, 19.25f, -11.9f)
                curveToRelative(96.69f, 22.83f, 124.28f, 22.78f, 220.77f, 0.0f)
                curveToRelative(8.6f, -2.03f, 17.22f, 3.29f, 19.25f, 11.9f)
                curveToRelative(2.03f, 8.6f, -3.3f, 17.22f, -11.9f, 19.25f)
                close()
            }
        }
        .build()
        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
