package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.GrinWink: ImageVector
    get() {
        if (_grinWink != null) {
            return _grinWink!!
        }
        _grinWink = Builder(name = "GrinWink", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(328.0f, 180.0f)
                curveToRelative(-25.69f, 0.0f, -55.88f, 16.92f, -59.86f, 42.12f)
                curveToRelative(-1.75f, 11.22f, 11.5f, 18.24f, 19.83f, 10.84f)
                lineToRelative(9.55f, -8.48f)
                curveToRelative(14.81f, -13.19f, 46.16f, -13.19f, 60.97f, 0.0f)
                lineToRelative(9.55f, 8.48f)
                curveToRelative(8.48f, 7.43f, 21.56f, 0.25f, 19.83f, -10.84f)
                curveTo(383.88f, 196.92f, 353.69f, 180.0f, 328.0f, 180.0f)
                close()
                moveTo(168.0f, 240.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.33f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.33f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.33f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(353.55f, 304.64f)
                curveToRelative(-25.93f, 8.3f, -64.4f, 13.06f, -105.55f, 13.06f)
                reflectiveCurveToRelative(-79.62f, -4.75f, -105.55f, -13.06f)
                curveToRelative(-9.94f, -3.13f, -19.4f, 5.37f, -17.71f, 15.34f)
                curveTo(132.67f, 367.13f, 196.06f, 400.0f, 248.0f, 400.0f)
                reflectiveCurveToRelative(115.33f, -32.87f, 123.26f, -80.02f)
                curveToRelative(1.68f, -9.89f, -7.67f, -18.48f, -17.71f, -15.34f)
                close()
                moveTo(248.0f, 8.0f)
                curveTo(111.03f, 8.0f, 0.0f, 119.03f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(384.97f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 456.0f)
                curveToRelative(-110.28f, 0.0f, -200.0f, -89.72f, -200.0f, -200.0f)
                reflectiveCurveTo(137.72f, 56.0f, 248.0f, 56.0f)
                reflectiveCurveToRelative(200.0f, 89.72f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.72f, 200.0f, -200.0f, 200.0f)
                close()
            }
        }
        .build()
        return _grinWink!!
    }

private var _grinWink: ImageVector? = null
