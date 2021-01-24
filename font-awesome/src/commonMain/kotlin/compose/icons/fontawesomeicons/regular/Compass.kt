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

public val RegularGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(347.94f, 129.86f)
                lineTo(203.6f, 195.83f)
                arcToRelative(31.938f, 31.938f, 0.0f, false, false, -15.77f, 15.77f)
                lineToRelative(-65.97f, 144.34f)
                curveToRelative(-7.61f, 16.65f, 9.54f, 33.81f, 26.2f, 26.2f)
                lineToRelative(144.34f, -65.97f)
                arcToRelative(31.938f, 31.938f, 0.0f, false, false, 15.77f, -15.77f)
                lineToRelative(65.97f, -144.34f)
                curveToRelative(7.61f, -16.66f, -9.54f, -33.81f, -26.2f, -26.2f)
                close()
                moveTo(270.58f, 278.58f)
                curveToRelative(-12.47f, 12.47f, -32.69f, 12.47f, -45.16f, 0.0f)
                curveToRelative(-12.47f, -12.47f, -12.47f, -32.69f, 0.0f, -45.16f)
                curveToRelative(12.47f, -12.47f, 32.69f, -12.47f, 45.16f, 0.0f)
                curveToRelative(12.47f, 12.47f, 12.47f, 32.69f, 0.0f, 45.16f)
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
        return _compass!!
    }

private var _compass: ImageVector? = null
