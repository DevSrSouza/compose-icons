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

public val SolidGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(627.6f, 57.3f)
                curveToRelative(14.0f, -10.9f, 16.5f, -31.0f, 5.6f, -44.9f)
                reflectiveCurveToRelative(-31.0f, -16.5f, -44.9f, -5.6f)
                lineToRelative(-144.0f, 112.0f)
                lineToRelative(-72.0f, 56.0f)
                lineToRelative(-8.7f, 6.8f)
                lineToRelative(-30.8f, -39.4f)
                curveToRelative(-3.7f, -4.8f, -9.8f, -7.0f, -15.8f, -5.8f)
                reflectiveCurveToRelative(-10.7f, 5.7f, -12.3f, 11.5f)
                lineToRelative(-12.5f, 46.3f)
                lineTo(371.1f, 295.0f)
                lineToRelative(48.0f, -0.9f)
                curveToRelative(6.1f, -0.1f, 11.5f, -3.7f, 14.1f, -9.1f)
                reflectiveCurveToRelative(1.9f, -11.9f, -1.8f, -16.7f)
                lineTo(403.0f, 231.9f)
                lineToRelative(8.6f, -6.7f)
                lineToRelative(72.0f, -56.0f)
                lineToRelative(144.0f, -112.0f)
                close()
                moveTo(16.7f, 507.7f)
                curveToRelative(37.4f, 2.8f, 196.8f, 12.0f, 252.3f, -31.4f)
                curveToRelative(57.7f, -45.1f, 76.8f, -161.5f, 76.8f, -161.5f)
                lineTo(267.1f, 213.9f)
                reflectiveCurveToRelative(-117.6f, -9.6f, -175.3f, 35.5f)
                curveTo(69.0f, 267.1f, 50.5f, 304.1f, 36.3f, 344.0f)
                curveToRelative(-2.4f, 6.7f, 4.7f, 12.8f, 11.0f, 9.4f)
                lineTo(86.2f, 333.0f)
                curveToRelative(4.1f, -2.2f, 9.2f, -1.1f, 12.0f, 2.6f)
                reflectiveCurveToRelative(2.7f, 8.8f, -0.4f, 12.3f)
                lineTo(24.4f, 430.4f)
                curveTo(13.2f, 442.9f, 5.5f, 458.1f, 2.4f, 474.5f)
                curveToRelative(-0.9f, 4.8f, -1.6f, 8.9f, -2.2f, 12.1f)
                curveToRelative(-0.9f, 5.0f, 0.5f, 10.1f, 3.6f, 14.1f)
                reflectiveCurveToRelative(7.7f, 6.6f, 12.8f, 7.0f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
