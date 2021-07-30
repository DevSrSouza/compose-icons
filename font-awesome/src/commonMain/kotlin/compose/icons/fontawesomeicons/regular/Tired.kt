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

public val RegularGroup.Tired: ImageVector
    get() {
        if (_tired != null) {
            return _tired!!
        }
        _tired = Builder(name = "Tired", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 456.0f)
                curveToRelative(-110.3f, 0.0f, -200.0f, -89.7f, -200.0f, -200.0f)
                reflectiveCurveTo(137.7f, 56.0f, 248.0f, 56.0f)
                reflectiveCurveToRelative(200.0f, 89.7f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.7f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(377.1f, 152.2f)
                curveToRelative(-3.8f, -4.4f, -10.3f, -5.4f, -15.3f, -2.5f)
                lineToRelative(-80.0f, 48.0f)
                curveToRelative(-3.6f, 2.2f, -5.8f, 6.1f, -5.8f, 10.3f)
                reflectiveCurveToRelative(2.2f, 8.1f, 5.8f, 10.3f)
                lineToRelative(80.0f, 48.0f)
                curveToRelative(5.4f, 3.2f, 11.8f, 1.6f, 15.3f, -2.5f)
                curveToRelative(3.8f, -4.5f, 3.9f, -11.0f, 0.1f, -15.5f)
                lineTo(343.6f, 208.0f)
                lineToRelative(33.6f, -40.3f)
                curveToRelative(3.8f, -4.5f, 3.7f, -11.1f, -0.1f, -15.5f)
                close()
                moveTo(220.0f, 208.0f)
                curveToRelative(0.0f, -4.2f, -2.2f, -8.1f, -5.8f, -10.3f)
                lineToRelative(-80.0f, -48.0f)
                curveToRelative(-5.0f, -3.0f, -11.5f, -1.9f, -15.3f, 2.5f)
                curveToRelative(-3.8f, 4.5f, -3.9f, 11.0f, -0.1f, 15.5f)
                lineToRelative(33.6f, 40.3f)
                lineToRelative(-33.6f, 40.3f)
                curveToRelative(-3.8f, 4.5f, -3.7f, 11.0f, 0.1f, 15.5f)
                curveToRelative(3.5f, 4.1f, 9.9f, 5.7f, 15.3f, 2.5f)
                lineToRelative(80.0f, -48.0f)
                curveToRelative(3.6f, -2.2f, 5.8f, -6.1f, 5.8f, -10.3f)
                close()
                moveTo(248.0f, 272.0f)
                curveToRelative(-45.4f, 0.0f, -100.9f, 38.3f, -107.8f, 93.3f)
                curveToRelative(-1.5f, 11.8f, 6.9f, 21.6f, 15.5f, 17.9f)
                curveTo(178.4f, 373.5f, 212.0f, 368.0f, 248.0f, 368.0f)
                reflectiveCurveToRelative(69.6f, 5.5f, 92.3f, 15.2f)
                curveToRelative(8.5f, 3.7f, 17.0f, -6.0f, 15.5f, -17.9f)
                curveToRelative(-6.9f, -55.0f, -62.4f, -93.3f, -107.8f, -93.3f)
                close()
            }
        }
        .build()
        return _tired!!
    }

private var _tired: ImageVector? = null
