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
                moveTo(440.5f, 88.5f)
                lineToRelative(-52.0f, 52.0f)
                lineTo(415.0f, 167.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-17.4f, 17.4f)
                curveToRelative(11.8f, 26.1f, 18.4f, 55.1f, 18.4f, 85.6f)
                curveToRelative(0.0f, 114.9f, -93.1f, 208.0f, -208.0f, 208.0f)
                reflectiveCurveTo(0.0f, 418.9f, 0.0f, 304.0f)
                reflectiveCurveTo(93.1f, 96.0f, 208.0f, 96.0f)
                curveToRelative(30.5f, 0.0f, 59.5f, 6.6f, 85.6f, 18.4f)
                lineTo(311.0f, 97.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(26.5f, 26.5f)
                lineToRelative(52.0f, -52.0f)
                lineToRelative(17.1f, 17.0f)
                close()
                moveTo(500.0f, 60.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                reflectiveCurveToRelative(5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                reflectiveCurveToRelative(-5.4f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(440.0f, 0.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.4f, 12.0f, -12.0f)
                lineTo(452.0f, 12.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(473.9f, 55.0f)
                lineToRelative(17.0f, -17.0f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0.0f, -17.0f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17.0f, 0.0f)
                lineToRelative(-17.0f, 17.0f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0.0f, 17.0f)
                curveToRelative(4.8f, 4.7f, 12.4f, 4.7f, 17.0f, 0.0f)
                close()
                moveTo(406.1f, 55.0f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17.0f, 0.0f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(-17.0f, -17.0f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17.0f, 0.0f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0.0f, 17.0f)
                lineToRelative(17.0f, 17.0f)
                close()
                moveTo(473.9f, 89.0f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17.0f, 0.0f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0.0f, 17.0f)
                lineToRelative(17.0f, 17.0f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17.0f, 0.0f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(-17.0f, -17.0f)
                close()
                moveTo(112.0f, 272.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                curveToRelative(-52.9f, 0.0f, -96.0f, 43.1f, -96.0f, 96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
