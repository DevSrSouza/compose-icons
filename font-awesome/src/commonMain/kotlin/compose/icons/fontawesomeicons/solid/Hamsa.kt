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

public val SolidGroup.Hamsa: ImageVector
    get() {
        if (_hamsa != null) {
            return _hamsa!!
        }
        _hamsa = Builder(name = "Hamsa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.6f, 288.0f)
                lineTo(80.0f, 288.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(96.0f, 72.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                lineTo(176.0f, 204.0f)
                curveToRelative(0.0f, 11.0f, 9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                lineTo(216.0f, 40.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                lineTo(296.0f, 204.0f)
                curveToRelative(0.0f, 11.0f, 9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                lineTo(336.0f, 72.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                lineTo(416.0f, 272.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(45.4f)
                curveToRelative(19.1f, 0.0f, 34.6f, 15.5f, 34.6f, 34.6f)
                curveToRelative(0.0f, 8.6f, -3.2f, 16.9f, -9.0f, 23.3f)
                lineTo(416.6f, 441.0f)
                curveToRelative(-41.1f, 45.2f, -99.4f, 71.0f, -160.6f, 71.0f)
                reflectiveCurveToRelative(-119.4f, -25.8f, -160.6f, -71.0f)
                lineTo(9.0f, 345.9f)
                curveToRelative(-5.8f, -6.4f, -9.0f, -14.7f, -9.0f, -23.3f)
                curveTo(0.0f, 303.5f, 15.5f, 288.0f, 34.6f, 288.0f)
                close()
                moveTo(256.0f, 288.0f)
                curveToRelative(-38.4f, 0.0f, -76.8f, 35.8f, -90.6f, 50.2f)
                curveToRelative(-3.6f, 3.7f, -5.4f, 8.7f, -5.4f, 13.8f)
                reflectiveCurveToRelative(1.8f, 10.1f, 5.4f, 13.8f)
                curveTo(179.2f, 380.2f, 217.6f, 416.0f, 256.0f, 416.0f)
                reflectiveCurveToRelative(76.8f, -35.8f, 90.6f, -50.2f)
                curveToRelative(3.6f, -3.7f, 5.4f, -8.7f, 5.4f, -13.8f)
                reflectiveCurveToRelative(-1.8f, -10.1f, -5.4f, -13.8f)
                curveTo(332.8f, 323.8f, 294.4f, 288.0f, 256.0f, 288.0f)
                close()
                moveTo(256.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _hamsa!!
    }

private var _hamsa: ImageVector? = null
