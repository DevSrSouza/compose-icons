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

public val SolidGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(120.5f, 247.2f)
                curveToRelative(12.4f, -4.7f, 18.7f, -18.5f, 14.0f, -30.9f)
                reflectiveCurveToRelative(-18.5f, -18.7f, -30.9f, -14.0f)
                curveTo(43.1f, 225.1f, 0.0f, 283.5f, 0.0f, 352.0f)
                curveToRelative(0.0f, 88.4f, 71.6f, 160.0f, 160.0f, 160.0f)
                curveToRelative(61.2f, 0.0f, 114.3f, -34.3f, 141.2f, -84.7f)
                curveToRelative(6.2f, -11.7f, 1.8f, -26.2f, -9.9f, -32.5f)
                reflectiveCurveToRelative(-26.2f, -1.8f, -32.5f, 9.9f)
                curveTo(240.0f, 440.0f, 202.8f, 464.0f, 160.0f, 464.0f)
                curveTo(98.1f, 464.0f, 48.0f, 413.9f, 48.0f, 352.0f)
                curveToRelative(0.0f, -47.9f, 30.1f, -88.8f, 72.5f, -104.8f)
                close()
                moveTo(259.8f, 176.0f)
                lineToRelative(-1.9f, -9.7f)
                curveToRelative(-4.5f, -22.3f, -24.0f, -38.3f, -46.8f, -38.3f)
                curveToRelative(-30.1f, 0.0f, -52.7f, 27.5f, -46.8f, 57.0f)
                lineToRelative(23.1f, 115.5f)
                curveToRelative(6.0f, 29.9f, 32.2f, 51.4f, 62.8f, 51.4f)
                horizontalLineToRelative(5.1f)
                curveToRelative(0.4f, 0.0f, 0.8f, 0.0f, 1.3f, 0.0f)
                horizontalLineToRelative(94.1f)
                curveToRelative(6.7f, 0.0f, 12.6f, 4.1f, 15.0f, 10.4f)
                lineTo(402.0f, 459.2f)
                curveToRelative(6.0f, 16.1f, 23.8f, 24.6f, 40.1f, 19.1f)
                lineToRelative(48.0f, -16.0f)
                curveToRelative(16.8f, -5.6f, 25.8f, -23.7f, 20.2f, -40.5f)
                reflectiveCurveToRelative(-23.7f, -25.8f, -40.5f, -20.2f)
                lineToRelative(-18.7f, 6.2f)
                lineToRelative(-25.5f, -68.0f)
                curveToRelative(-11.7f, -31.2f, -41.6f, -51.9f, -74.9f, -51.9f)
                horizontalLineTo(282.2f)
                lineToRelative(-9.6f, -48.0f)
                horizontalLineTo(336.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(259.8f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
