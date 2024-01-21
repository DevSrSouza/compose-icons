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

public val SolidGroup.LiraSign: ImageVector
    get() {
        if (_liraSign != null) {
            return _liraSign!!
        }
        _liraSign = Builder(name = "LiraSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 160.4f)
                curveToRelative(0.0f, -35.5f, 28.8f, -64.4f, 64.4f, -64.4f)
                curveToRelative(6.9f, 0.0f, 13.8f, 1.1f, 20.4f, 3.3f)
                lineToRelative(81.2f, 27.1f)
                curveToRelative(16.8f, 5.6f, 34.9f, -3.5f, 40.5f, -20.2f)
                reflectiveCurveToRelative(-3.5f, -34.9f, -20.2f, -40.5f)
                lineTo(217.0f, 38.6f)
                curveToRelative(-13.1f, -4.4f, -26.8f, -6.6f, -40.6f, -6.6f)
                curveTo(105.5f, 32.0f, 48.0f, 89.5f, 48.0f, 160.4f)
                verticalLineTo(192.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(48.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(46.0f)
                curveToRelative(-2.2f, 10.5f, -6.1f, 20.6f, -11.7f, 29.9f)
                lineTo(4.6f, 431.5f)
                curveToRelative(-5.9f, 9.9f, -6.1f, 22.2f, -0.4f, 32.2f)
                reflectiveCurveTo(20.5f, 480.0f, 32.0f, 480.0f)
                horizontalLineTo(288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(88.5f)
                lineToRelative(0.7f, -1.1f)
                curveToRelative(11.6f, -19.3f, 18.9f, -40.7f, 21.6f, -62.9f)
                horizontalLineTo(224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(256.0f)
                horizontalLineTo(224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(160.4f)
                close()
            }
        }
        .build()
        return _liraSign!!
    }

private var _liraSign: ImageVector? = null
