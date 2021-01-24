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

public val SolidGroup.ShareAlt: ImageVector
    get() {
        if (_shareAlt != null) {
            return _shareAlt!!
        }
        _shareAlt = Builder(name = "ShareAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 320.0f)
                curveToRelative(-22.608f, 0.0f, -43.387f, 7.819f, -59.79f, 20.895f)
                lineToRelative(-102.486f, -64.054f)
                arcToRelative(96.551f, 96.551f, 0.0f, false, false, 0.0f, -41.683f)
                lineToRelative(102.486f, -64.054f)
                curveTo(308.613f, 184.181f, 329.392f, 192.0f, 352.0f, 192.0f)
                curveToRelative(53.019f, 0.0f, 96.0f, -42.981f, 96.0f, -96.0f)
                reflectiveCurveTo(405.019f, 0.0f, 352.0f, 0.0f)
                reflectiveCurveToRelative(-96.0f, 42.981f, -96.0f, 96.0f)
                curveToRelative(0.0f, 7.158f, 0.79f, 14.13f, 2.276f, 20.841f)
                lineTo(155.79f, 180.895f)
                curveTo(139.387f, 167.819f, 118.608f, 160.0f, 96.0f, 160.0f)
                curveToRelative(-53.019f, 0.0f, -96.0f, 42.981f, -96.0f, 96.0f)
                reflectiveCurveToRelative(42.981f, 96.0f, 96.0f, 96.0f)
                curveToRelative(22.608f, 0.0f, 43.387f, -7.819f, 59.79f, -20.895f)
                lineToRelative(102.486f, 64.054f)
                arcTo(96.301f, 96.301f, 0.0f, false, false, 256.0f, 416.0f)
                curveToRelative(0.0f, 53.019f, 42.981f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.981f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-42.981f, -96.0f, -96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _shareAlt!!
    }

private var _shareAlt: ImageVector? = null
