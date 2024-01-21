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

public val SolidGroup.FilterCircleXmark: ImageVector
    get() {
        if (_filterCircleXmark != null) {
            return _filterCircleXmark!!
        }
        _filterCircleXmark = Builder(name = "FilterCircleXmark", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9f, 22.9f)
                curveTo(10.5f, 8.9f, 24.5f, 0.0f, 40.0f, 0.0f)
                lineTo(472.0f, 0.0f)
                curveToRelative(15.5f, 0.0f, 29.5f, 8.9f, 36.1f, 22.9f)
                reflectiveCurveToRelative(4.6f, 30.5f, -5.2f, 42.5f)
                lineTo(396.4f, 195.6f)
                curveTo(316.2f, 212.1f, 256.0f, 283.0f, 256.0f, 368.0f)
                curveToRelative(0.0f, 27.4f, 6.3f, 53.4f, 17.5f, 76.5f)
                curveToRelative(-1.6f, -0.8f, -3.2f, -1.8f, -4.7f, -2.9f)
                lineToRelative(-64.0f, -48.0f)
                curveToRelative(-8.1f, -6.0f, -12.8f, -15.5f, -12.8f, -25.6f)
                lineTo(192.0f, 288.9f)
                lineTo(9.0f, 65.3f)
                curveTo(-0.7f, 53.4f, -2.8f, 36.8f, 3.9f, 22.9f)
                close()
                moveTo(432.0f, 224.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, 288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, -288.0f)
                close()
                moveTo(491.3f, 331.3f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(-16.4f, -6.2f, -22.6f, 0.0f)
                lineTo(432.0f, 345.4f)
                lineToRelative(-36.7f, -36.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineTo(409.4f, 368.0f)
                lineToRelative(-36.7f, 36.7f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(16.4f, 6.2f, 22.6f, 0.0f)
                lineTo(432.0f, 390.6f)
                lineToRelative(36.7f, 36.7f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, -16.4f, 0.0f, -22.6f)
                lineTo(454.6f, 368.0f)
                lineToRelative(36.7f, -36.7f)
                close()
            }
        }
        .build()
        return _filterCircleXmark!!
    }

private var _filterCircleXmark: ImageVector? = null
