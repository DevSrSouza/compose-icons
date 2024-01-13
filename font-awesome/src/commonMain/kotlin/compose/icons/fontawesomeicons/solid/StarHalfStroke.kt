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

public val SolidGroup.StarHalfStroke: ImageVector
    get() {
        if (_starHalfStroke != null) {
            return _starHalfStroke!!
        }
        _starHalfStroke = Builder(name = "StarHalfStroke", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 376.4f)
                lineToRelative(0.1f, -0.1f)
                lineToRelative(26.4f, 14.1f)
                lineToRelative(85.2f, 45.5f)
                lineToRelative(-16.5f, -97.6f)
                lineToRelative(-4.8f, -28.7f)
                lineToRelative(20.7f, -20.5f)
                lineToRelative(70.1f, -69.3f)
                lineToRelative(-96.1f, -14.2f)
                lineToRelative(-29.3f, -4.3f)
                lineToRelative(-12.9f, -26.6f)
                lineTo(288.1f, 86.9f)
                lineToRelative(-0.1f, 0.3f)
                lineTo(288.0f, 376.4f)
                close()
                moveTo(463.1f, 474.7f)
                curveToRelative(2.0f, 12.0f, -3.0f, 24.2f, -12.9f, 31.3f)
                reflectiveCurveToRelative(-23.0f, 8.0f, -33.8f, 2.3f)
                lineTo(288.1f, 439.8f)
                lineTo(159.8f, 508.3f)
                curveTo(149.0f, 514.0f, 135.9f, 513.1f, 126.0f, 506.0f)
                reflectiveCurveToRelative(-14.9f, -19.3f, -12.9f, -31.3f)
                lineTo(137.8f, 329.0f)
                lineTo(33.6f, 225.9f)
                curveToRelative(-8.6f, -8.5f, -11.7f, -21.2f, -7.9f, -32.7f)
                reflectiveCurveToRelative(13.7f, -19.9f, 25.7f, -21.7f)
                lineTo(195.0f, 150.3f)
                lineTo(259.4f, 18.0f)
                curveToRelative(5.4f, -11.0f, 16.5f, -18.0f, 28.8f, -18.0f)
                reflectiveCurveToRelative(23.4f, 7.0f, 28.8f, 18.0f)
                lineToRelative(64.3f, 132.3f)
                lineToRelative(143.6f, 21.2f)
                curveToRelative(12.0f, 1.8f, 22.0f, 10.2f, 25.7f, 21.7f)
                reflectiveCurveToRelative(0.7f, 24.2f, -7.9f, 32.7f)
                lineTo(438.5f, 329.0f)
                lineToRelative(24.6f, 145.7f)
                close()
            }
        }
        .build()
        return _starHalfStroke!!
    }

private var _starHalfStroke: ImageVector? = null
