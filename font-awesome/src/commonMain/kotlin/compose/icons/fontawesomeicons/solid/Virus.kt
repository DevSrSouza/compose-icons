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

public val SolidGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(224.0f, 43.5f)
                curveToRelative(0.0f, 49.9f, -60.3f, 74.9f, -95.6f, 39.6f)
                lineTo(120.2f, 75.0f)
                curveTo(107.7f, 62.5f, 87.5f, 62.5f, 75.0f, 75.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(8.2f, 8.2f)
                curveTo(118.4f, 163.7f, 93.4f, 224.0f, 43.5f, 224.0f)
                lineTo(32.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(43.5f, 288.0f)
                curveToRelative(49.9f, 0.0f, 74.9f, 60.3f, 39.6f, 95.6f)
                lineTo(75.0f, 391.8f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(8.2f, -8.2f)
                curveToRelative(35.3f, -35.3f, 95.6f, -10.3f, 95.6f, 39.6f)
                lineTo(224.1f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(288.1f, 468.5f)
                curveToRelative(0.0f, -49.9f, 60.3f, -74.9f, 95.6f, -39.6f)
                lineToRelative(8.2f, 8.2f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-8.2f, -8.2f)
                curveToRelative(-35.3f, -35.3f, -10.3f, -95.6f, 39.6f, -95.6f)
                lineTo(480.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(468.5f, 224.0f)
                curveToRelative(-49.9f, 0.0f, -74.9f, -60.3f, -39.6f, -95.6f)
                lineToRelative(8.2f, -8.2f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-8.2f, 8.2f)
                curveTo(348.3f, 118.4f, 288.0f, 93.4f, 288.0f, 43.5f)
                lineTo(288.0f, 32.0f)
                close()
                moveTo(176.0f, 224.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(304.0f, 280.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
