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

public val SolidGroup.Sliders: ImageVector
    get() {
        if (_sliders != null) {
            return _sliders!!
        }
        _sliders = Builder(name = "Sliders", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 416.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(54.7f, 0.0f)
                curveToRelative(12.3f, 28.3f, 40.5f, 48.0f, 73.3f, 48.0f)
                reflectiveCurveToRelative(61.0f, -19.7f, 73.3f, -48.0f)
                lineTo(480.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-246.7f, 0.0f)
                curveToRelative(-12.3f, -28.3f, -40.5f, -48.0f, -73.3f, -48.0f)
                reflectiveCurveToRelative(-61.0f, 19.7f, -73.3f, 48.0f)
                lineTo(32.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(128.0f, 416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(320.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(352.0f, 176.0f)
                curveToRelative(-32.8f, 0.0f, -61.0f, 19.7f, -73.3f, 48.0f)
                lineTo(32.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(246.7f, 0.0f)
                curveToRelative(12.3f, 28.3f, 40.5f, 48.0f, 73.3f, 48.0f)
                reflectiveCurveToRelative(61.0f, -19.7f, 73.3f, -48.0f)
                lineToRelative(54.7f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-54.7f, 0.0f)
                curveToRelative(-12.3f, -28.3f, -40.5f, -48.0f, -73.3f, -48.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                close()
                moveTo(265.3f, 64.0f)
                curveTo(253.0f, 35.7f, 224.8f, 16.0f, 192.0f, 16.0f)
                reflectiveCurveToRelative(-61.0f, 19.7f, -73.3f, 48.0f)
                lineTo(32.0f, 64.0f)
                curveTo(14.3f, 64.0f, 0.0f, 78.3f, 0.0f, 96.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(86.7f, 0.0f)
                curveToRelative(12.3f, 28.3f, 40.5f, 48.0f, 73.3f, 48.0f)
                reflectiveCurveToRelative(61.0f, -19.7f, 73.3f, -48.0f)
                lineTo(480.0f, 128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(265.3f, 64.0f)
                close()
            }
        }
        .build()
        return _sliders!!
    }

private var _sliders: ImageVector? = null
