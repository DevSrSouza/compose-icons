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

public val SolidGroup.YenSign: ImageVector
    get() {
        if (_yenSign != null) {
            return _yenSign!!
        }
        _yenSign = Builder(name = "YenSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(351.2f, 32.0f)
                horizontalLineToRelative(-65.3f)
                curveToRelative(-4.6f, 0.0f, -8.8f, 2.6f, -10.8f, 6.7f)
                lineToRelative(-55.4f, 113.2f)
                curveToRelative(-14.5f, 34.7f, -27.1f, 71.9f, -27.1f, 71.9f)
                horizontalLineToRelative(-1.3f)
                reflectiveCurveToRelative(-12.6f, -37.2f, -27.1f, -71.9f)
                lineTo(108.8f, 38.7f)
                curveToRelative(-2.0f, -4.1f, -6.2f, -6.7f, -10.8f, -6.7f)
                horizontalLineTo(32.8f)
                curveToRelative(-9.1f, 0.0f, -14.8f, 9.7f, -10.6f, 17.6f)
                lineTo(102.3f, 200.0f)
                horizontalLineTo(44.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(88.2f)
                lineToRelative(19.8f, 37.2f)
                verticalLineTo(320.0f)
                horizontalLineTo(44.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(108.0f)
                verticalLineToRelative(92.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-92.0f)
                horizontalLineToRelative(108.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(232.0f)
                verticalLineToRelative(-26.8f)
                lineToRelative(19.8f, -37.2f)
                horizontalLineTo(340.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-58.3f)
                lineToRelative(80.1f, -150.4f)
                curveToRelative(4.3f, -7.9f, -1.5f, -17.6f, -10.6f, -17.6f)
                close()
            }
        }
        .build()
        return _yenSign!!
    }

private var _yenSign: ImageVector? = null
