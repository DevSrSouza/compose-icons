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

public val SolidGroup.WheelchairMove: ImageVector
    get() {
        if (_wheelchairMove != null) {
            return _wheelchairMove!!
        }
        _wheelchairMove = Builder(name = "WheelchairMove", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(204.5f, 121.3f)
                curveToRelative(-5.4f, -2.5f, -11.7f, -1.9f, -16.4f, 1.7f)
                lineToRelative(-40.9f, 30.7f)
                curveToRelative(-14.1f, 10.6f, -34.2f, 7.7f, -44.8f, -6.4f)
                reflectiveCurveToRelative(-7.7f, -34.2f, 6.4f, -44.8f)
                lineToRelative(40.9f, -30.7f)
                curveToRelative(23.7f, -17.8f, 55.3f, -21.0f, 82.1f, -8.4f)
                lineToRelative(90.4f, 42.5f)
                curveToRelative(29.1f, 13.7f, 36.8f, 51.6f, 15.2f, 75.5f)
                lineTo(299.1f, 224.0f)
                horizontalLineToRelative(97.4f)
                curveToRelative(30.3f, 0.0f, 53.0f, 27.7f, 47.1f, 57.4f)
                lineTo(415.4f, 422.3f)
                curveToRelative(-3.5f, 17.3f, -20.3f, 28.6f, -37.7f, 25.1f)
                reflectiveCurveToRelative(-28.6f, -20.3f, -25.1f, -37.7f)
                lineTo(377.0f, 288.0f)
                horizontalLineTo(306.7f)
                curveToRelative(8.6f, 19.6f, 13.3f, 41.2f, 13.3f, 64.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                reflectiveCurveTo(0.0f, 440.4f, 0.0f, 352.0f)
                reflectiveCurveToRelative(71.6f, -160.0f, 160.0f, -160.0f)
                curveToRelative(11.1f, 0.0f, 22.0f, 1.1f, 32.4f, 3.3f)
                lineToRelative(54.2f, -54.2f)
                lineToRelative(-42.1f, -19.8f)
                close()
                moveTo(160.0f, 448.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, -192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, 192.0f)
                close()
            }
        }
        .build()
        return _wheelchairMove!!
    }

private var _wheelchairMove: ImageVector? = null
