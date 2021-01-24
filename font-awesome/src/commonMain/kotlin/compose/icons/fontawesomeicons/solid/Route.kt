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

public val SolidGroup.Route: ImageVector
    get() {
        if (_route != null) {
            return _route!!
        }
        _route = Builder(name = "Route", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 320.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-17.6f, 0.0f, -32.0f, -14.4f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.4f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(96.0f)
                reflectiveCurveToRelative(96.0f, -107.0f, 96.0f, -160.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 25.5f, 22.2f, 63.4f, 45.3f, 96.0f)
                lineTo(320.0f, 192.0f)
                curveToRelative(-52.9f, 0.0f, -96.0f, 43.1f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.1f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.6f, 0.0f, 32.0f, 14.4f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.4f, 32.0f, -32.0f, 32.0f)
                lineTo(185.5f, 448.0f)
                curveToRelative(-16.0f, 24.8f, -33.8f, 47.7f, -47.3f, 64.0f)
                lineTo(416.0f, 512.0f)
                curveToRelative(52.9f, 0.0f, 96.0f, -43.1f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.1f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(416.0f, 64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(96.0f, 256.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, 160.0f, 96.0f, 160.0f)
                reflectiveCurveToRelative(96.0f, -107.0f, 96.0f, -160.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(96.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _route!!
    }

private var _route: ImageVector? = null
