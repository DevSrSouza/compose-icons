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

public val SolidGroup.TentArrowDownToLine: ImageVector
    get() {
        if (_tentArrowDownToLine != null) {
            return _tentArrowDownToLine!!
        }
        _tentArrowDownToLine = Builder(name = "TentArrowDownToLine", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.8f, 111.9f)
                curveToRelative(8.9f, 9.9f, 8.1f, 25.0f, -1.8f, 33.9f)
                lineToRelative(-80.0f, 72.0f)
                curveToRelative(-9.1f, 8.2f, -23.0f, 8.2f, -32.1f, 0.0f)
                lineToRelative(-80.0f, -72.0f)
                curveToRelative(-9.9f, -8.9f, -10.7f, -24.0f, -1.8f, -33.9f)
                reflectiveCurveToRelative(24.0f, -10.7f, 33.9f, -1.8f)
                lineToRelative(39.9f, 36.0f)
                lineTo(120.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 122.1f)
                lineToRelative(39.9f, -36.0f)
                curveToRelative(9.9f, -8.9f, 25.0f, -8.1f, 33.9f, 1.8f)
                close()
                moveTo(364.6f, 134.5f)
                curveToRelative(11.5f, -8.7f, 27.3f, -8.7f, 38.8f, 0.0f)
                lineToRelative(168.0f, 128.0f)
                curveToRelative(6.6f, 5.0f, 11.0f, 12.5f, 12.3f, 20.7f)
                lineToRelative(24.0f, 160.0f)
                lineToRelative(0.7f, 4.7f)
                curveToRelative(17.5f, 0.2f, 31.6f, 14.4f, 31.6f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 511.9f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(159.6f, 447.9f)
                lineToRelative(0.7f, -4.7f)
                lineToRelative(24.0f, -160.0f)
                curveToRelative(1.2f, -8.2f, 5.6f, -15.7f, 12.3f, -20.7f)
                lineToRelative(168.0f, -128.0f)
                close()
                moveTo(384.0f, 448.0f)
                horizontalLineToRelative(80.0f)
                lineTo(402.7f, 325.5f)
                curveToRelative(-1.7f, -3.4f, -5.1f, -5.5f, -8.8f, -5.5f)
                curveToRelative(-5.5f, 0.0f, -9.9f, 4.4f, -9.9f, 9.9f)
                lineTo(384.0f, 448.0f)
                close()
            }
        }
        .build()
        return _tentArrowDownToLine!!
    }

private var _tentArrowDownToLine: ImageVector? = null
