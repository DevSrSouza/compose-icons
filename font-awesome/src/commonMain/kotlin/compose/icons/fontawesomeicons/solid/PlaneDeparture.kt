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

public val SolidGroup.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.0f, 114.9f)
                lineTo(186.1f, 41.8f)
                curveToRelative(-16.7f, -6.2f, -35.2f, -5.3f, -51.1f, 2.7f)
                lineTo(89.1f, 67.4f)
                curveTo(78.0f, 73.0f, 77.2f, 88.5f, 87.6f, 95.2f)
                lineToRelative(146.9f, 94.5f)
                lineTo(136.0f, 240.0f)
                lineTo(77.8f, 214.1f)
                curveToRelative(-8.7f, -3.9f, -18.8f, -3.7f, -27.3f, 0.6f)
                lineTo(18.3f, 230.8f)
                curveToRelative(-9.3f, 4.7f, -11.8f, 16.8f, -5.0f, 24.7f)
                lineToRelative(73.1f, 85.3f)
                curveToRelative(6.1f, 7.1f, 15.0f, 11.2f, 24.3f, 11.2f)
                horizontalLineTo(248.4f)
                curveToRelative(5.0f, 0.0f, 9.9f, -1.2f, 14.3f, -3.4f)
                lineTo(535.6f, 212.2f)
                curveToRelative(46.5f, -23.3f, 82.5f, -63.3f, 100.8f, -112.0f)
                curveTo(645.9f, 75.0f, 627.2f, 48.0f, 600.2f, 48.0f)
                horizontalLineTo(542.8f)
                curveToRelative(-20.2f, 0.0f, -40.2f, 4.8f, -58.2f, 14.0f)
                lineTo(381.0f, 114.9f)
                close()
                moveTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(608.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
