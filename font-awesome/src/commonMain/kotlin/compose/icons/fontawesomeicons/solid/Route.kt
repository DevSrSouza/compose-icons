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
                moveTo(512.0f, 96.0f)
                curveToRelative(0.0f, 50.2f, -59.1f, 125.1f, -84.6f, 155.0f)
                curveToRelative(-3.8f, 4.4f, -9.4f, 6.1f, -14.5f, 5.0f)
                horizontalLineTo(320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.0f, 96.0f, -96.0f, 96.0f)
                horizontalLineTo(139.6f)
                curveToRelative(8.7f, -9.9f, 19.3f, -22.6f, 30.0f, -36.8f)
                curveToRelative(6.3f, -8.4f, 12.8f, -17.6f, 19.0f, -27.2f)
                horizontalLineTo(416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(320.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(43.0f, -96.0f, 96.0f, -96.0f)
                horizontalLineToRelative(39.8f)
                curveToRelative(-21.0f, -31.5f, -39.8f, -67.7f, -39.8f, -96.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                close()
                moveTo(117.1f, 489.1f)
                curveToRelative(-3.8f, 4.3f, -7.2f, 8.1f, -10.1f, 11.3f)
                lineToRelative(-1.8f, 2.0f)
                lineToRelative(-0.2f, -0.2f)
                curveToRelative(-6.0f, 4.6f, -14.6f, 4.0f, -20.0f, -1.8f)
                curveTo(59.8f, 473.0f, 0.0f, 402.5f, 0.0f, 352.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                curveToRelative(0.0f, 30.0f, -21.1f, 67.0f, -43.5f, 97.9f)
                curveToRelative(-10.7f, 14.7f, -21.7f, 28.0f, -30.8f, 38.5f)
                lineToRelative(-0.6f, 0.7f)
                close()
                moveTo(128.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(416.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _route!!
    }

private var _route: ImageVector? = null
