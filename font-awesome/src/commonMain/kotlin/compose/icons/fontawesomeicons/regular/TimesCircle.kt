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

public val RegularGroup.TimesCircle: ImageVector
    get() {
        if (_timesCircle != null) {
            return _timesCircle!!
        }
        _timesCircle = Builder(name = "TimesCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.0f, 8.0f, 8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(393.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 456.0f)
                curveToRelative(-110.5f, 0.0f, -200.0f, -89.5f, -200.0f, -200.0f)
                reflectiveCurveTo(145.5f, 56.0f, 256.0f, 56.0f)
                reflectiveCurveToRelative(200.0f, 89.5f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.5f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(357.8f, 193.8f)
                lineTo(295.6f, 256.0f)
                lineToRelative(62.2f, 62.2f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0.0f, 17.0f)
                lineToRelative(-22.6f, 22.6f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17.0f, 0.0f)
                lineTo(256.0f, 295.6f)
                lineToRelative(-62.2f, 62.2f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17.0f, 0.0f)
                lineToRelative(-22.6f, -22.6f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(62.2f, -62.2f)
                lineToRelative(-62.2f, -62.2f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(22.6f, -22.6f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17.0f, 0.0f)
                lineToRelative(62.2f, 62.2f)
                lineToRelative(62.2f, -62.2f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17.0f, 0.0f)
                lineToRelative(22.6f, 22.6f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0.0f, 17.0f)
                close()
            }
        }
        .build()
        return _timesCircle!!
    }

private var _timesCircle: ImageVector? = null
