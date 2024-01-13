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

public val SolidGroup.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.3f, 144.0f)
                curveToRelative(3.2f, -17.2f, 14.0f, -30.1f, 33.7f, -38.6f)
                curveToRelative(21.1f, -9.0f, 51.8f, -12.3f, 88.6f, -6.5f)
                curveToRelative(11.9f, 1.9f, 48.8f, 9.1f, 60.1f, 12.0f)
                curveToRelative(17.1f, 4.5f, 34.6f, -5.6f, 39.2f, -22.7f)
                reflectiveCurveToRelative(-5.6f, -34.6f, -22.7f, -39.2f)
                curveToRelative(-14.3f, -3.8f, -53.6f, -11.4f, -66.6f, -13.4f)
                curveToRelative(-44.7f, -7.0f, -88.3f, -4.2f, -123.7f, 10.9f)
                curveToRelative(-36.5f, 15.6f, -64.4f, 44.8f, -71.8f, 87.3f)
                curveToRelative(-0.1f, 0.6f, -0.2f, 1.1f, -0.2f, 1.7f)
                curveToRelative(-2.8f, 23.9f, 0.5f, 45.6f, 10.1f, 64.6f)
                curveToRelative(4.5f, 9.0f, 10.2f, 16.9f, 16.7f, 23.9f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(270.1f)
                curveToRelative(-0.1f, 0.0f, -0.3f, -0.1f, -0.4f, -0.1f)
                lineToRelative(-1.1f, -0.3f)
                curveToRelative(-36.0f, -10.8f, -65.2f, -19.6f, -85.2f, -33.1f)
                curveToRelative(-9.3f, -6.3f, -15.0f, -12.6f, -18.2f, -19.1f)
                curveToRelative(-3.1f, -6.1f, -5.2f, -14.6f, -3.8f, -27.4f)
                close()
                moveTo(348.9f, 337.2f)
                curveToRelative(2.7f, 6.5f, 4.4f, 15.8f, 1.9f, 30.1f)
                curveToRelative(-3.0f, 17.6f, -13.8f, 30.8f, -33.9f, 39.4f)
                curveToRelative(-21.1f, 9.0f, -51.7f, 12.3f, -88.5f, 6.5f)
                curveToRelative(-18.0f, -2.9f, -49.1f, -13.5f, -74.4f, -22.1f)
                curveToRelative(-5.6f, -1.9f, -11.0f, -3.7f, -15.9f, -5.4f)
                curveToRelative(-16.8f, -5.6f, -34.9f, 3.5f, -40.5f, 20.3f)
                reflectiveCurveToRelative(3.5f, 34.9f, 20.3f, 40.5f)
                curveToRelative(3.6f, 1.2f, 7.9f, 2.7f, 12.7f, 4.3f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(24.9f, 8.5f, 63.6f, 21.7f, 87.6f, 25.6f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.2f, 0.0f)
                curveToRelative(44.7f, 7.0f, 88.3f, 4.2f, 123.7f, -10.9f)
                curveToRelative(36.5f, -15.6f, 64.4f, -44.8f, 71.8f, -87.3f)
                curveToRelative(3.6f, -21.0f, 2.7f, -40.4f, -3.1f, -58.1f)
                horizontalLineTo(335.1f)
                curveToRelative(7.0f, 5.6f, 11.4f, 11.2f, 13.9f, 17.2f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
