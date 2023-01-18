package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.9f, 55.6f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, -29.5f, -29.5f)
                curveToRelative(-32.2f, -5.5f, -92.7f, -7.9f, -137.5f, 36.8f)
                reflectiveCurveTo(20.6f, 168.2f, 26.1f, 200.4f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 29.5f, 29.5f)
                arcToRelative(202.5f, 202.5f, 0.0f, false, false, 34.0f, 2.9f)
                curveToRelative(31.9f, 0.0f, 71.7f, -8.0f, 103.5f, -39.7f)
                curveTo(237.8f, 148.3f, 235.4f, 87.8f, 229.9f, 55.6f)
                close()
                moveTo(206.3f, 59.6f)
                curveToRelative(1.1f, 7.0f, 1.9f, 13.7f, 2.3f, 20.0f)
                lineTo(176.4f, 47.4f)
                curveToRelative(6.3f, 0.4f, 13.0f, 1.2f, 20.0f, 2.3f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 206.3f, 59.6f)
                close()
                moveTo(49.7f, 196.4f)
                curveToRelative(-1.1f, -7.0f, -1.9f, -13.7f, -2.3f, -20.0f)
                lineToRelative(32.2f, 32.2f)
                curveToRelative(-6.3f, -0.4f, -13.0f, -1.2f, -20.0f, -2.3f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 49.7f, 196.4f)
                close()
                moveTo(176.1f, 176.1f)
                curveToRelative(-10.9f, 10.9f, -31.4f, 26.1f, -63.9f, 31.1f)
                lineTo(48.8f, 143.8f)
                curveToRelative(5.0f, -32.5f, 20.2f, -53.0f, 31.1f, -63.9f)
                reflectiveCurveToRelative(31.4f, -26.1f, 63.9f, -31.1f)
                lineToRelative(63.4f, 63.4f)
                curveTo(202.2f, 144.7f, 187.0f, 165.2f, 176.1f, 176.1f)
                close()
                moveTo(168.5f, 87.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-12.2f, 12.2f)
                lineToRelative(6.1f, 6.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -16.9f, 17.0f)
                lineToRelative(-6.2f, -6.1f)
                lineToRelative(-5.6f, 5.6f)
                lineToRelative(6.1f, 6.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, 16.9f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -8.5f, 3.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -8.5f, -3.5f)
                lineToRelative(-6.1f, -6.1f)
                lineToRelative(-12.2f, 12.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(12.2f, -12.2f)
                lineToRelative(-6.1f, -6.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 16.9f, 0.0f)
                lineToRelative(6.2f, 6.1f)
                lineToRelative(5.6f, -5.6f)
                lineToRelative(-6.1f, -6.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, -16.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(6.1f, 6.1f)
                lineToRelative(12.2f, -12.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.5f, 87.5f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
