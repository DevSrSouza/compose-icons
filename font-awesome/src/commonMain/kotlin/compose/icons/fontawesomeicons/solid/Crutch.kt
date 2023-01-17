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

public val SolidGroup.Crutch: ImageVector
    get() {
        if (_crutch != null) {
            return _crutch!!
        }
        _crutch = Builder(name = "Crutch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.4f, 9.4f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(160.0f, 160.0f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-160.0f, -160.0f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                close()
                moveTo(201.4f, 153.4f)
                lineToRelative(-34.8f, 34.8f)
                curveToRelative(-12.9f, 12.9f, -21.9f, 29.2f, -25.8f, 47.1f)
                lineTo(116.8f, 342.9f)
                curveToRelative(-1.3f, 5.9f, -4.3f, 11.4f, -8.6f, 15.7f)
                lineTo(9.4f, 457.4f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(98.8f, -98.8f)
                curveToRelative(4.3f, -4.3f, 9.7f, -7.3f, 15.7f, -8.6f)
                lineToRelative(107.6f, -23.9f)
                curveToRelative(17.8f, -4.0f, 34.1f, -12.9f, 47.1f, -25.8f)
                lineToRelative(34.7f, -34.7f)
                curveToRelative(0.0f, 0.0f, 0.1f, -0.1f, 0.1f, -0.1f)
                reflectiveCurveToRelative(0.1f, -0.1f, 0.1f, -0.1f)
                lineToRelative(74.6f, -74.6f)
                lineToRelative(-45.3f, -45.3f)
                lineTo(336.0f, 242.7f)
                lineTo(269.3f, 176.0f)
                lineToRelative(52.1f, -52.1f)
                lineTo(276.1f, 78.6f)
                lineToRelative(-74.7f, 74.7f)
                close()
                moveTo(224.0f, 221.3f)
                lineTo(290.7f, 288.0f)
                lineToRelative(-12.2f, 12.2f)
                curveToRelative(-4.3f, 4.3f, -9.7f, 7.3f, -15.7f, 8.6f)
                lineToRelative(-76.7f, 17.0f)
                lineToRelative(17.0f, -76.7f)
                curveToRelative(1.3f, -5.9f, 4.3f, -11.4f, 8.6f, -15.7f)
                lineTo(224.0f, 221.3f)
                close()
            }
        }
        .build()
        return _crutch!!
    }

private var _crutch: ImageVector? = null
