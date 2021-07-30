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

public val SolidGroup.Trademark: ImageVector
    get() {
        if (_trademark != null) {
            return _trademark!!
        }
        _trademark = Builder(name = "Trademark", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(260.6f, 96.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(43.1f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(85.1f)
                verticalLineTo(404.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(54.3f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineTo(163.1f)
                horizontalLineToRelative(85.1f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineTo(108.0f)
                curveToRelative(0.1f, -6.6f, -5.3f, -12.0f, -11.9f, -12.0f)
                close()
                moveTo(640.0f, 403.0f)
                lineToRelative(-24.0f, -296.0f)
                curveToRelative(-0.5f, -6.2f, -5.7f, -11.0f, -12.0f, -11.0f)
                horizontalLineToRelative(-65.4f)
                curveToRelative(-5.1f, 0.0f, -9.7f, 3.3f, -11.3f, 8.1f)
                lineToRelative(-43.8f, 127.1f)
                curveToRelative(-7.2f, 20.6f, -16.1f, 52.8f, -16.1f, 52.8f)
                horizontalLineToRelative(-0.9f)
                reflectiveCurveToRelative(-8.9f, -32.2f, -16.1f, -52.8f)
                lineToRelative(-43.8f, -127.1f)
                curveToRelative(-1.7f, -4.8f, -6.2f, -8.1f, -11.3f, -8.1f)
                horizontalLineToRelative(-65.4f)
                curveToRelative(-6.2f, 0.0f, -11.4f, 4.8f, -12.0f, 11.0f)
                lineToRelative(-24.4f, 296.0f)
                curveToRelative(-0.6f, 7.0f, 4.9f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(360.0f)
                curveToRelative(6.3f, 0.0f, 11.5f, -4.9f, 12.0f, -11.2f)
                lineToRelative(9.1f, -132.9f)
                curveToRelative(1.8f, -24.2f, 0.0f, -53.7f, 0.0f, -53.7f)
                horizontalLineToRelative(0.9f)
                reflectiveCurveToRelative(10.7f, 33.6f, 17.9f, 53.7f)
                lineToRelative(30.7f, 84.7f)
                curveToRelative(1.7f, 4.7f, 6.2f, 7.9f, 11.3f, 7.9f)
                horizontalLineToRelative(50.3f)
                curveToRelative(5.1f, 0.0f, 9.6f, -3.2f, 11.3f, -7.9f)
                lineToRelative(30.7f, -84.7f)
                curveToRelative(7.2f, -20.1f, 17.9f, -53.7f, 17.9f, -53.7f)
                horizontalLineToRelative(0.9f)
                reflectiveCurveToRelative(-1.8f, 29.5f, 0.0f, 53.7f)
                lineToRelative(9.1f, 132.9f)
                curveToRelative(0.4f, 6.3f, 5.7f, 11.2f, 12.0f, 11.2f)
                horizontalLineTo(628.0f)
                curveToRelative(7.0f, 0.0f, 12.5f, -6.0f, 12.0f, -13.0f)
                close()
            }
        }
        .build()
        return _trademark!!
    }

private var _trademark: ImageVector? = null
