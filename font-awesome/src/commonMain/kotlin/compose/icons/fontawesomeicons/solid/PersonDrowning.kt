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

public val SolidGroup.PersonDrowning: ImageVector
    get() {
        if (_personDrowning != null) {
            return _personDrowning!!
        }
        _personDrowning = Builder(name = "PersonDrowning", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(96.2f)
                curveToRelative(0.0f, 54.1f, 23.5f, 104.0f, 62.2f, 138.3f)
                lineToRelative(-21.0f, 146.7f)
                curveToRelative(7.8f, 2.1f, 15.5f, 3.3f, 22.8f, 3.3f)
                curveToRelative(21.1f, 0.0f, 42.0f, -8.5f, 59.2f, -20.3f)
                curveToRelative(22.1f, -15.5f, 51.6f, -15.5f, 73.7f, 0.0f)
                curveToRelative(12.4f, 8.5f, 26.1f, 14.8f, 39.7f, 18.0f)
                lineToRelative(17.7f, -97.6f)
                curveToRelative(10.7f, -1.2f, 21.3f, -3.1f, 31.9f, -5.5f)
                lineToRelative(105.0f, -23.9f)
                curveToRelative(17.2f, -3.9f, 28.0f, -21.1f, 24.1f, -38.3f)
                reflectiveCurveToRelative(-21.1f, -28.0f, -38.3f, -24.1f)
                lineTo(400.0f, 216.6f)
                curveToRelative(-41.0f, 9.3f, -83.7f, 7.5f, -123.7f, -5.2f)
                curveToRelative(-50.2f, -16.0f, -84.3f, -62.6f, -84.3f, -115.3f)
                verticalLineTo(64.0f)
                close()
                moveTo(320.0f, 192.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, -128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 128.0f)
                close()
                moveTo(306.5f, 389.9f)
                curveToRelative(-11.1f, -7.9f, -25.9f, -7.9f, -37.0f, 0.0f)
                curveTo(247.0f, 405.4f, 219.5f, 416.0f, 192.0f, 416.0f)
                curveToRelative(-26.9f, 0.0f, -55.3f, -10.8f, -77.4f, -26.1f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-11.9f, -8.5f, -28.1f, -7.8f, -39.2f, 1.7f)
                curveToRelative(-14.4f, 11.9f, -32.5f, 21.0f, -50.6f, 25.2f)
                curveToRelative(-17.2f, 4.0f, -27.9f, 21.2f, -23.9f, 38.4f)
                reflectiveCurveToRelative(21.2f, 27.9f, 38.4f, 23.9f)
                curveToRelative(24.5f, -5.7f, 44.9f, -16.5f, 58.2f, -25.0f)
                curveTo(126.5f, 469.7f, 159.0f, 480.0f, 192.0f, 480.0f)
                curveToRelative(31.9f, 0.0f, 60.6f, -9.9f, 80.4f, -18.9f)
                curveToRelative(5.8f, -2.7f, 11.1f, -5.3f, 15.6f, -7.7f)
                curveToRelative(4.5f, 2.4f, 9.7f, 5.1f, 15.6f, 7.7f)
                curveToRelative(19.8f, 9.0f, 48.5f, 18.9f, 80.4f, 18.9f)
                curveToRelative(33.0f, 0.0f, 65.5f, -10.3f, 94.5f, -25.8f)
                curveToRelative(13.4f, 8.4f, 33.7f, 19.3f, 58.2f, 25.0f)
                curveToRelative(17.2f, 4.0f, 34.4f, -6.7f, 38.4f, -23.9f)
                reflectiveCurveToRelative(-6.7f, -34.4f, -23.9f, -38.4f)
                curveToRelative(-18.1f, -4.2f, -36.2f, -13.3f, -50.6f, -25.2f)
                curveToRelative(-11.1f, -9.4f, -27.3f, -10.1f, -39.2f, -1.7f)
                lineToRelative(0.0f, 0.0f)
                curveTo(439.4f, 405.2f, 410.9f, 416.0f, 384.0f, 416.0f)
                curveToRelative(-27.5f, 0.0f, -55.0f, -10.6f, -77.5f, -26.1f)
                close()
            }
        }
        .build()
        return _personDrowning!!
    }

private var _personDrowning: ImageVector? = null
