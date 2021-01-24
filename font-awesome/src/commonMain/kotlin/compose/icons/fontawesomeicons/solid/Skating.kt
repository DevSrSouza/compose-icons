package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Skating: ImageVector
    get() {
        if (_skating != null) {
            return _skating!!
        }
        _skating = Builder(name = "Skating", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(400.0f, 448.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(117.8f, 456.6f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.3f, -22.6f, 0.0f)
                lineToRelative(-67.9f, -67.9f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(67.9f, 67.9f)
                curveToRelative(9.4f, 9.4f, 21.7f, 14.0f, 34.0f, 14.0f)
                reflectiveCurveToRelative(24.6f, -4.7f, 33.9f, -14.0f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(-16.4f, -6.3f, -22.7f, 0.0f)
                close()
                moveTo(173.9f, 276.8f)
                lineToRelative(-93.7f, 93.7f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.2f)
                curveToRelative(6.2f, 6.2f, 14.4f, 9.4f, 22.6f, 9.4f)
                reflectiveCurveToRelative(16.4f, -3.1f, 22.6f, -9.4f)
                lineToRelative(91.9f, -91.9f)
                lineToRelative(-30.2f, -30.2f)
                curveToRelative(-5.0f, -5.0f, -9.4f, -10.7f, -13.2f, -16.8f)
                close()
                moveTo(128.0f, 160.0f)
                horizontalLineToRelative(105.5f)
                lineToRelative(-20.1f, 17.2f)
                curveToRelative(-13.5f, 11.5f, -21.6f, 28.4f, -22.3f, 46.1f)
                curveToRelative(-0.7f, 17.8f, 6.1f, 35.2f, 18.7f, 47.7f)
                lineToRelative(78.2f, 78.2f)
                lineTo(288.0f, 432.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineToRelative(-89.4f)
                curveToRelative(0.0f, -12.6f, -5.1f, -25.0f, -14.1f, -33.9f)
                lineToRelative(-61.0f, -61.0f)
                curveToRelative(0.5f, -0.4f, 1.2f, -0.6f, 1.7f, -1.1f)
                lineToRelative(82.3f, -82.3f)
                curveToRelative(11.5f, -11.5f, 14.9f, -28.6f, 8.7f, -43.6f)
                curveToRelative(-6.2f, -15.0f, -20.7f, -24.7f, -37.0f, -24.7f)
                lineTo(128.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _skating!!
    }

private var _skating: ImageVector? = null
