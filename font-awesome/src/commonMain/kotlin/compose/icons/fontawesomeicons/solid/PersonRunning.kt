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

public val SolidGroup.PersonRunning: ImageVector
    get() {
        if (_personRunning != null) {
            return _personRunning!!
        }
        _personRunning = Builder(name = "PersonRunning", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(125.7f, 175.5f)
                curveToRelative(9.9f, -9.9f, 23.4f, -15.5f, 37.5f, -15.5f)
                curveToRelative(1.9f, 0.0f, 3.8f, 0.1f, 5.6f, 0.3f)
                lineTo(137.6f, 254.0f)
                curveToRelative(-9.3f, 28.0f, 1.7f, 58.8f, 26.8f, 74.5f)
                lineToRelative(86.2f, 53.9f)
                lineToRelative(-25.4f, 88.8f)
                curveToRelative(-4.9f, 17.0f, 5.0f, 34.7f, 22.0f, 39.6f)
                reflectiveCurveToRelative(34.7f, -5.0f, 39.6f, -22.0f)
                lineToRelative(28.7f, -100.4f)
                curveToRelative(5.9f, -20.6f, -2.6f, -42.6f, -20.7f, -53.9f)
                lineTo(238.0f, 299.0f)
                lineToRelative(30.9f, -82.4f)
                lineToRelative(5.1f, 12.3f)
                curveTo(289.0f, 264.7f, 323.9f, 288.0f, 362.7f, 288.0f)
                horizontalLineTo(384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(362.7f)
                curveToRelative(-12.9f, 0.0f, -24.6f, -7.8f, -29.5f, -19.7f)
                lineToRelative(-6.3f, -15.0f)
                curveToRelative(-14.6f, -35.1f, -44.1f, -61.9f, -80.5f, -73.1f)
                lineToRelative(-48.7f, -15.0f)
                curveToRelative(-11.1f, -3.4f, -22.7f, -5.2f, -34.4f, -5.2f)
                curveToRelative(-31.0f, 0.0f, -60.8f, 12.3f, -82.7f, 34.3f)
                lineTo(57.4f, 153.4f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(23.1f, -23.1f)
                close()
                moveTo(91.2f, 352.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(69.6f)
                curveToRelative(19.0f, 0.0f, 36.2f, -11.2f, 43.9f, -28.5f)
                lineTo(157.0f, 361.6f)
                lineToRelative(-9.5f, -6.0f)
                curveToRelative(-17.5f, -10.9f, -30.5f, -26.8f, -37.9f, -44.9f)
                lineTo(91.2f, 352.0f)
                close()
            }
        }
        .build()
        return _personRunning!!
    }

private var _personRunning: ImageVector? = null
