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

public val SolidGroup.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(413.5f, 237.5f)
                curveToRelative(-28.2f, 4.8f, -58.2f, -3.6f, -80.0f, -25.4f)
                lineToRelative(-38.1f, -38.1f)
                curveTo(280.4f, 159.0f, 272.0f, 138.8f, 272.0f, 117.6f)
                verticalLineTo(105.5f)
                lineTo(192.3f, 62.0f)
                curveToRelative(-5.3f, -2.9f, -8.6f, -8.6f, -8.3f, -14.7f)
                reflectiveCurveToRelative(3.9f, -11.5f, 9.5f, -14.0f)
                lineToRelative(47.2f, -21.0f)
                curveTo(259.1f, 4.2f, 279.0f, 0.0f, 299.2f, 0.0f)
                horizontalLineToRelative(18.1f)
                curveToRelative(36.7f, 0.0f, 72.0f, 14.0f, 98.7f, 39.1f)
                lineToRelative(44.6f, 42.0f)
                curveToRelative(24.2f, 22.8f, 33.2f, 55.7f, 26.6f, 86.0f)
                lineTo(503.0f, 183.0f)
                lineToRelative(8.0f, -8.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-88.0f, 88.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(-17.5f, -17.5f)
                close()
                moveTo(27.4f, 377.1f)
                lineTo(260.9f, 182.6f)
                curveToRelative(3.5f, 4.9f, 7.5f, 9.6f, 11.8f, 14.0f)
                lineToRelative(38.1f, 38.1f)
                curveToRelative(6.0f, 6.0f, 12.4f, 11.2f, 19.2f, 15.7f)
                lineTo(134.9f, 484.6f)
                curveToRelative(-14.5f, 17.4f, -36.0f, 27.4f, -58.6f, 27.4f)
                curveTo(34.1f, 512.0f, 0.0f, 477.8f, 0.0f, 435.7f)
                curveToRelative(0.0f, -22.6f, 10.1f, -44.1f, 27.4f, -58.6f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
