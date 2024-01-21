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

public val SolidGroup.PenRuler: ImageVector
    get() {
        if (_penRuler != null) {
            return _penRuler!!
        }
        _penRuler = Builder(name = "PenRuler", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.3f, 19.3f)
                lineToRelative(23.4f, 23.4f)
                curveToRelative(25.0f, 25.0f, 25.0f, 65.5f, 0.0f, 90.5f)
                lineToRelative(-56.4f, 56.4f)
                lineTo(322.3f, 75.7f)
                lineToRelative(56.4f, -56.4f)
                curveToRelative(25.0f, -25.0f, 65.5f, -25.0f, 90.5f, 0.0f)
                close()
                moveTo(44.9f, 353.2f)
                lineTo(299.7f, 98.3f)
                lineTo(413.7f, 212.3f)
                lineTo(158.8f, 467.1f)
                curveToRelative(-6.7f, 6.7f, -15.1f, 11.6f, -24.2f, 14.2f)
                lineToRelative(-104.0f, 29.7f)
                curveToRelative(-8.4f, 2.4f, -17.4f, 0.1f, -23.6f, -6.1f)
                reflectiveCurveToRelative(-8.5f, -15.2f, -6.1f, -23.6f)
                lineToRelative(29.7f, -104.0f)
                curveToRelative(2.6f, -9.2f, 7.5f, -17.5f, 14.2f, -24.2f)
                close()
                moveTo(249.4f, 103.4f)
                lineTo(103.4f, 249.4f)
                lineTo(16.0f, 161.9f)
                curveToRelative(-18.7f, -18.7f, -18.7f, -49.1f, 0.0f, -67.9f)
                lineTo(94.1f, 16.0f)
                curveToRelative(18.7f, -18.7f, 49.1f, -18.7f, 67.9f, 0.0f)
                lineToRelative(19.8f, 19.8f)
                curveToRelative(-0.3f, 0.3f, -0.7f, 0.6f, -1.0f, 0.9f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(16.4f, 6.2f, 22.6f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(0.3f, -0.3f, 0.6f, -0.7f, 0.9f, -1.0f)
                lineToRelative(45.1f, 45.1f)
                close()
                moveTo(408.6f, 262.6f)
                lineToRelative(45.1f, 45.1f)
                curveToRelative(-0.3f, 0.3f, -0.7f, 0.6f, -1.0f, 0.9f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(16.4f, 6.2f, 22.6f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(0.3f, -0.3f, 0.6f, -0.7f, 0.9f, -1.0f)
                lineTo(496.0f, 350.1f)
                curveToRelative(18.7f, 18.7f, 18.7f, 49.1f, 0.0f, 67.9f)
                lineTo(417.9f, 496.0f)
                curveToRelative(-18.7f, 18.7f, -49.1f, 18.7f, -67.9f, 0.0f)
                lineToRelative(-87.4f, -87.4f)
                lineTo(408.6f, 262.6f)
                close()
            }
        }
        .build()
        return _penRuler!!
    }

private var _penRuler: ImageVector? = null
