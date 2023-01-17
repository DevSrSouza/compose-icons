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

public val SolidGroup.MapLocation: ImageVector
    get() {
        if (_mapLocation != null) {
            return _mapLocation!!
        }
        _mapLocation = Builder(name = "MapLocation", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(302.8f, 312.0f)
                curveTo(334.9f, 271.9f, 408.0f, 174.6f, 408.0f, 120.0f)
                curveTo(408.0f, 53.7f, 354.3f, 0.0f, 288.0f, 0.0f)
                reflectiveCurveTo(168.0f, 53.7f, 168.0f, 120.0f)
                curveToRelative(0.0f, 54.6f, 73.1f, 151.9f, 105.2f, 192.0f)
                curveToRelative(7.7f, 9.6f, 22.0f, 9.6f, 29.6f, 0.0f)
                close()
                moveTo(416.0f, 503.0f)
                lineToRelative(144.9f, -58.0f)
                curveToRelative(9.1f, -3.6f, 15.1f, -12.5f, 15.1f, -22.3f)
                verticalLineTo(152.0f)
                curveToRelative(0.0f, -17.0f, -17.1f, -28.6f, -32.9f, -22.3f)
                lineToRelative(-116.0f, 46.4f)
                curveToRelative(-0.5f, 1.2f, -1.0f, 2.5f, -1.5f, 3.7f)
                curveToRelative(-2.9f, 6.8f, -6.1f, 13.7f, -9.6f, 20.6f)
                verticalLineTo(503.0f)
                close()
                moveTo(15.1f, 187.3f)
                curveTo(6.0f, 191.0f, 0.0f, 199.8f, 0.0f, 209.6f)
                verticalLineTo(480.4f)
                curveToRelative(0.0f, 17.0f, 17.1f, 28.6f, 32.9f, 22.3f)
                lineTo(160.0f, 451.8f)
                verticalLineTo(200.4f)
                curveToRelative(-3.5f, -6.9f, -6.7f, -13.8f, -9.6f, -20.6f)
                curveToRelative(-5.6f, -13.2f, -10.4f, -27.4f, -12.8f, -41.5f)
                lineToRelative(-122.6f, 49.0f)
                close()
                moveTo(384.0f, 255.0f)
                curveToRelative(-20.5f, 31.3f, -42.3f, 59.6f, -56.2f, 77.0f)
                curveToRelative(-20.5f, 25.6f, -59.1f, 25.6f, -79.6f, 0.0f)
                curveToRelative(-13.9f, -17.4f, -35.7f, -45.7f, -56.2f, -77.0f)
                verticalLineTo(449.4f)
                lineToRelative(192.0f, 54.9f)
                verticalLineTo(255.0f)
                close()
            }
        }
        .build()
        return _mapLocation!!
    }

private var _mapLocation: ImageVector? = null
