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

public val SolidGroup.LocationCrosshairs: ImageVector
    get() {
        if (_locationCrosshairs != null) {
            return _locationCrosshairs!!
        }
        _locationCrosshairs = Builder(name = "LocationCrosshairs", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(288.0f, 66.7f)
                curveTo(368.4f, 80.1f, 431.9f, 143.6f, 445.3f, 224.0f)
                lineTo(480.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(445.3f, 288.0f)
                curveTo(431.9f, 368.4f, 368.4f, 431.9f, 288.0f, 445.3f)
                lineTo(288.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(224.0f, 445.3f)
                curveTo(143.6f, 431.9f, 80.1f, 368.4f, 66.7f, 288.0f)
                lineTo(32.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(66.7f, 224.0f)
                curveTo(80.1f, 143.6f, 143.6f, 80.1f, 224.0f, 66.7f)
                lineTo(224.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(128.0f, 256.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, -256.0f, 0.0f)
                close()
                moveTo(256.0f, 176.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _locationCrosshairs!!
    }

private var _locationCrosshairs: ImageVector? = null
