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
                curveToRelative(-22.61f, 0.0f, -43.39f, 7.82f, -59.79f, 20.9f)
                lineToRelative(-102.49f, -64.05f)
                arcToRelative(96.55f, 96.55f, 0.0f, false, false, 0.0f, -41.68f)
                lineToRelative(102.49f, -64.05f)
                curveTo(308.61f, 184.18f, 329.39f, 192.0f, 352.0f, 192.0f)
                curveToRelative(53.02f, 0.0f, 96.0f, -42.98f, 96.0f, -96.0f)
                reflectiveCurveTo(405.02f, 0.0f, 352.0f, 0.0f)
                reflectiveCurveToRelative(-96.0f, 42.98f, -96.0f, 96.0f)
                curveToRelative(0.0f, 7.16f, 0.79f, 14.13f, 2.28f, 20.84f)
                lineTo(155.79f, 180.9f)
                curveTo(139.39f, 167.82f, 118.61f, 160.0f, 96.0f, 160.0f)
                curveToRelative(-53.02f, 0.0f, -96.0f, 42.98f, -96.0f, 96.0f)
                reflectiveCurveToRelative(42.98f, 96.0f, 96.0f, 96.0f)
                curveToRelative(22.61f, 0.0f, 43.39f, -7.82f, 59.79f, -20.9f)
                lineToRelative(102.49f, 64.05f)
                arcTo(96.3f, 96.3f, 0.0f, false, false, 256.0f, 416.0f)
                curveToRelative(0.0f, 53.02f, 42.98f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.98f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-42.98f, -96.0f, -96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _shareAlt!!
    }

private var _shareAlt: ImageVector? = null
