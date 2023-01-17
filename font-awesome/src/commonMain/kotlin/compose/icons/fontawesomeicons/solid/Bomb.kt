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

public val SolidGroup.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(459.1f, 52.4f)
                lineTo(442.6f, 6.5f)
                curveTo(440.7f, 2.6f, 436.5f, 0.0f, 432.1f, 0.0f)
                reflectiveCurveToRelative(-8.5f, 2.6f, -10.4f, 6.5f)
                lineTo(405.2f, 52.4f)
                lineToRelative(-46.0f, 16.8f)
                curveToRelative(-4.3f, 1.6f, -7.3f, 5.9f, -7.2f, 10.4f)
                curveToRelative(0.0f, 4.5f, 3.0f, 8.7f, 7.2f, 10.2f)
                lineToRelative(45.7f, 16.8f)
                lineToRelative(16.8f, 45.8f)
                curveToRelative(1.5f, 4.4f, 5.8f, 7.5f, 10.4f, 7.5f)
                reflectiveCurveToRelative(8.9f, -3.1f, 10.4f, -7.5f)
                lineToRelative(16.5f, -45.8f)
                lineToRelative(45.7f, -16.8f)
                curveToRelative(4.2f, -1.5f, 7.2f, -5.7f, 7.2f, -10.2f)
                curveToRelative(0.0f, -4.6f, -3.0f, -8.9f, -7.2f, -10.4f)
                lineTo(459.1f, 52.4f)
                close()
                moveTo(326.7f, 105.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-2.9f, 2.9f)
                curveTo(256.5f, 100.3f, 232.7f, 96.0f, 208.0f, 96.0f)
                curveTo(93.1f, 96.0f, 0.0f, 189.1f, 0.0f, 304.0f)
                reflectiveCurveTo(93.1f, 512.0f, 208.0f, 512.0f)
                reflectiveCurveToRelative(208.0f, -93.1f, 208.0f, -208.0f)
                curveToRelative(0.0f, -24.7f, -4.3f, -48.5f, -12.2f, -70.5f)
                lineToRelative(2.9f, -2.9f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-80.0f, -80.0f)
                close()
                moveTo(200.0f, 192.0f)
                curveToRelative(-57.4f, 0.0f, -104.0f, 46.6f, -104.0f, 104.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -75.1f, 60.9f, -136.0f, 136.0f, -136.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
