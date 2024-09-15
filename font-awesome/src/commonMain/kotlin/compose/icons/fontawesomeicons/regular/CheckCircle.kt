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

public val RegularGroup.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) {
            return _checkCircle!!
        }
        _checkCircle = Builder(name = "CheckCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.03f, 8.0f, 8.0f, 119.03f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(392.97f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 56.0f)
                curveToRelative(110.53f, 0.0f, 200.0f, 89.45f, 200.0f, 200.0f)
                curveToRelative(0.0f, 110.53f, -89.45f, 200.0f, -200.0f, 200.0f)
                curveToRelative(-110.53f, 0.0f, -200.0f, -89.45f, -200.0f, -200.0f)
                curveToRelative(0.0f, -110.53f, 89.45f, -200.0f, 200.0f, -200.0f)
                moveToRelative(140.2f, 130.27f)
                lineToRelative(-22.54f, -22.72f)
                curveToRelative(-4.67f, -4.7f, -12.27f, -4.74f, -16.97f, -0.07f)
                lineTo(215.35f, 303.7f)
                lineToRelative(-59.79f, -60.28f)
                curveToRelative(-4.67f, -4.7f, -12.27f, -4.74f, -16.97f, -0.07f)
                lineToRelative(-22.72f, 22.54f)
                curveToRelative(-4.7f, 4.67f, -4.74f, 12.27f, -0.07f, 16.97f)
                lineToRelative(90.78f, 91.52f)
                curveToRelative(4.67f, 4.7f, 12.27f, 4.74f, 16.97f, 0.07f)
                lineToRelative(172.59f, -171.2f)
                curveToRelative(4.7f, -4.67f, 4.73f, -12.27f, 0.07f, -16.97f)
                close()
            }
        }
        .build()
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
