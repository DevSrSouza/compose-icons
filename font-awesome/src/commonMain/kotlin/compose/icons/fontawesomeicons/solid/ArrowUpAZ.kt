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

public val SolidGroup.ArrowUpAZ: ImageVector
    get() {
        if (_arrowUpAZ != null) {
            return _arrowUpAZ!!
        }
        _arrowUpAZ = Builder(name = "ArrowUpAZ", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.6f, 42.4f)
                curveTo(177.5f, 35.8f, 169.0f, 32.0f, 160.0f, 32.0f)
                reflectiveCurveToRelative(-17.5f, 3.8f, -23.6f, 10.4f)
                lineToRelative(-88.0f, 96.0f)
                curveToRelative(-11.9f, 13.0f, -11.1f, 33.3f, 2.0f, 45.2f)
                reflectiveCurveToRelative(33.3f, 11.1f, 45.2f, -2.0f)
                lineTo(128.0f, 146.3f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(146.3f)
                lineToRelative(32.4f, 35.4f)
                curveToRelative(11.9f, 13.0f, 32.2f, 13.9f, 45.2f, 2.0f)
                reflectiveCurveToRelative(13.9f, -32.2f, 2.0f, -45.2f)
                lineToRelative(-88.0f, -96.0f)
                close()
                moveTo(320.0f, 320.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(50.7f)
                lineToRelative(-73.4f, 73.4f)
                curveToRelative(-9.2f, 9.2f, -11.9f, 22.9f, -6.9f, 34.9f)
                reflectiveCurveToRelative(16.6f, 19.8f, 29.6f, 19.8f)
                horizontalLineTo(480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(429.3f)
                lineToRelative(73.4f, -73.4f)
                curveToRelative(9.2f, -9.2f, 11.9f, -22.9f, 6.9f, -34.9f)
                reflectiveCurveToRelative(-16.6f, -19.8f, -29.6f, -19.8f)
                horizontalLineTo(352.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(416.0f, 32.0f)
                curveToRelative(-12.1f, 0.0f, -23.2f, 6.8f, -28.6f, 17.7f)
                lineToRelative(-64.0f, 128.0f)
                lineToRelative(-16.0f, 32.0f)
                curveToRelative(-7.9f, 15.8f, -1.5f, 35.0f, 14.3f, 42.9f)
                reflectiveCurveToRelative(35.0f, 1.5f, 42.9f, -14.3f)
                lineToRelative(7.2f, -14.3f)
                horizontalLineToRelative(88.4f)
                lineToRelative(7.2f, 14.3f)
                curveToRelative(7.9f, 15.8f, 27.1f, 22.2f, 42.9f, 14.3f)
                reflectiveCurveToRelative(22.2f, -27.1f, 14.3f, -42.9f)
                lineToRelative(-16.0f, -32.0f)
                lineToRelative(-64.0f, -128.0f)
                curveTo(439.2f, 38.8f, 428.1f, 32.0f, 416.0f, 32.0f)
                close()
                moveTo(395.8f, 176.0f)
                lineTo(416.0f, 135.6f)
                lineTo(436.2f, 176.0f)
                horizontalLineTo(395.8f)
                close()
            }
        }
        .build()
        return _arrowUpAZ!!
    }

private var _arrowUpAZ: ImageVector? = null
