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
                curveTo(119.033f, 8.0f, 8.0f, 119.033f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.033f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.033f, 248.0f, -248.0f)
                reflectiveCurveTo(392.967f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 56.0f)
                curveToRelative(110.532f, 0.0f, 200.0f, 89.451f, 200.0f, 200.0f)
                curveToRelative(0.0f, 110.532f, -89.451f, 200.0f, -200.0f, 200.0f)
                curveToRelative(-110.532f, 0.0f, -200.0f, -89.451f, -200.0f, -200.0f)
                curveToRelative(0.0f, -110.532f, 89.451f, -200.0f, 200.0f, -200.0f)
                moveToRelative(140.204f, 130.267f)
                lineToRelative(-22.536f, -22.718f)
                curveToRelative(-4.667f, -4.705f, -12.265f, -4.736f, -16.97f, -0.068f)
                lineTo(215.346f, 303.697f)
                lineToRelative(-59.792f, -60.277f)
                curveToRelative(-4.667f, -4.705f, -12.265f, -4.736f, -16.97f, -0.069f)
                lineToRelative(-22.719f, 22.536f)
                curveToRelative(-4.705f, 4.667f, -4.736f, 12.265f, -0.068f, 16.971f)
                lineToRelative(90.781f, 91.516f)
                curveToRelative(4.667f, 4.705f, 12.265f, 4.736f, 16.97f, 0.068f)
                lineToRelative(172.589f, -171.204f)
                curveToRelative(4.704f, -4.668f, 4.734f, -12.266f, 0.067f, -16.971f)
                close()
            }
        }
        .build()
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
