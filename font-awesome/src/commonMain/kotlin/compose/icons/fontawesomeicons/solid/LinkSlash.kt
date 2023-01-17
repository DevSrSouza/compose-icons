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

public val SolidGroup.LinkSlash: ImageVector
    get() {
        if (_linkSlash != null) {
            return _linkSlash!!
        }
        _linkSlash = Builder(name = "LinkSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(489.3f, 358.2f)
                lineToRelative(90.5f, -90.5f)
                curveToRelative(56.5f, -56.5f, 56.5f, -148.0f, 0.0f, -204.5f)
                curveToRelative(-50.0f, -50.0f, -128.8f, -56.5f, -186.3f, -15.4f)
                lineToRelative(-1.6f, 1.1f)
                curveToRelative(-14.4f, 10.3f, -17.7f, 30.3f, -7.4f, 44.6f)
                reflectiveCurveToRelative(30.3f, 17.7f, 44.6f, 7.4f)
                lineToRelative(1.6f, -1.1f)
                curveToRelative(32.1f, -22.9f, 76.0f, -19.3f, 103.8f, 8.6f)
                curveToRelative(31.5f, 31.5f, 31.5f, 82.5f, 0.0f, 114.0f)
                lineToRelative(-96.0f, 96.0f)
                lineToRelative(-31.9f, -25.0f)
                curveTo(430.9f, 239.6f, 420.1f, 175.1f, 377.0f, 132.0f)
                curveToRelative(-52.2f, -52.3f, -134.5f, -56.2f, -191.3f, -11.7f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(239.0f, 162.0f)
                curveToRelative(30.1f, -14.9f, 67.7f, -9.9f, 92.8f, 15.3f)
                curveToRelative(20.0f, 20.0f, 27.5f, 48.3f, 21.7f, 74.5f)
                lineTo(239.0f, 162.0f)
                close()
                moveTo(406.6f, 416.4f)
                lineTo(220.9f, 270.0f)
                curveToRelative(-2.1f, 39.8f, 12.2f, 80.1f, 42.2f, 110.0f)
                curveToRelative(38.9f, 38.9f, 94.4f, 51.0f, 143.6f, 36.3f)
                close()
                moveTo(116.6f, 187.9f)
                lineTo(60.2f, 244.3f)
                curveToRelative(-56.5f, 56.5f, -56.5f, 148.0f, 0.0f, 204.5f)
                curveToRelative(50.0f, 50.0f, 128.8f, 56.5f, 186.3f, 15.4f)
                lineToRelative(1.6f, -1.1f)
                curveToRelative(14.4f, -10.3f, 17.7f, -30.3f, 7.4f, -44.6f)
                reflectiveCurveToRelative(-30.3f, -17.7f, -44.6f, -7.4f)
                lineToRelative(-1.6f, 1.1f)
                curveToRelative(-32.1f, 22.9f, -76.0f, 19.3f, -103.8f, -8.6f)
                curveTo(74.0f, 372.0f, 74.0f, 321.0f, 105.5f, 289.5f)
                lineToRelative(61.8f, -61.8f)
                lineToRelative(-50.6f, -39.9f)
                close()
            }
        }
        .build()
        return _linkSlash!!
    }

private var _linkSlash: ImageVector? = null
