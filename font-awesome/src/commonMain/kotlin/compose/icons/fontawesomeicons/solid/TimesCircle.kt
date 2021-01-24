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

public val SolidGroup.TimesCircle: ImageVector
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
                moveTo(377.6f, 321.1f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0.0f, 17.0f)
                lineTo(338.0f, 377.6f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17.0f, 0.0f)
                lineTo(256.0f, 312.0f)
                lineToRelative(-65.1f, 65.6f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17.0f, 0.0f)
                lineTo(134.4f, 338.0f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(65.6f, -65.0f)
                lineToRelative(-65.6f, -65.1f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(39.6f, -39.6f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17.0f, 0.0f)
                lineToRelative(65.0f, 65.7f)
                lineToRelative(65.1f, -65.6f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17.0f, 0.0f)
                lineToRelative(39.6f, 39.6f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0.0f, 17.0f)
                lineTo(312.0f, 256.0f)
                lineToRelative(65.6f, 65.1f)
                close()
            }
        }
        .build()
        return _timesCircle!!
    }

private var _timesCircle: ImageVector? = null
