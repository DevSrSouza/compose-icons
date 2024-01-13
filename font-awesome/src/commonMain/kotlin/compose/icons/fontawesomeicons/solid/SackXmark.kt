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

public val SolidGroup.SackXmark: ImageVector
    get() {
        if (_sackXmark != null) {
            return _sackXmark!!
        }
        _sackXmark = Builder(name = "SackXmark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                lineTo(320.0f, 96.0f)
                lineToRelative(47.4f, -71.1f)
                curveTo(374.5f, 14.2f, 366.9f, 0.0f, 354.1f, 0.0f)
                lineTo(157.9f, 0.0f)
                curveToRelative(-12.8f, 0.0f, -20.4f, 14.2f, -13.3f, 24.9f)
                lineTo(192.0f, 96.0f)
                close()
                moveTo(320.0f, 128.0f)
                lineTo(192.0f, 128.0f)
                curveToRelative(-3.8f, 2.5f, -8.1f, 5.3f, -13.0f, 8.4f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(122.3f, 172.7f, 0.0f, 250.9f, 0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineTo(416.0f, 512.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                curveToRelative(0.0f, -165.1f, -122.3f, -243.3f, -179.0f, -279.6f)
                curveToRelative(-4.8f, -3.1f, -9.2f, -5.9f, -13.0f, -8.4f)
                close()
                moveTo(289.9f, 336.0f)
                lineToRelative(47.0f, 47.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-47.0f, -47.0f)
                lineToRelative(-47.0f, 47.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(47.0f, -47.0f)
                lineToRelative(-47.0f, -47.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(47.0f, 47.0f)
                lineToRelative(47.0f, -47.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-47.0f, 47.0f)
                close()
            }
        }
        .build()
        return _sackXmark!!
    }

private var _sackXmark: ImageVector? = null
