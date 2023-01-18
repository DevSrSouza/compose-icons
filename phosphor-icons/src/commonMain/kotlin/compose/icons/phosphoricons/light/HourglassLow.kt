package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.HourglassLow: ImageVector
    get() {
        if (_hourglassLow != null) {
            return _hourglassLow!!
        }
        _hourglassLow = Builder(name = "HourglassLow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 75.6f)
                lineTo(198.0f, 40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(72.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 40.0f)
                lineTo(58.0f, 76.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 5.6f, 11.2f)
                lineTo(118.0f, 128.0f)
                lineTo(63.6f, 168.8f)
                arcTo(14.2f, 14.2f, 0.0f, false, false, 58.0f, 179.3f)
                verticalLineToRelative(0.7f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(184.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(198.0f, 180.4f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.6f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, -5.6f, -10.5f)
                lineTo(138.0f, 128.0f)
                lineToRelative(54.4f, -41.2f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 198.0f, 75.6f)
                close()
                moveTo(179.3f, 174.3f)
                lineTo(76.6f, 174.0f)
                lineTo(128.0f, 135.5f)
                close()
                moveTo(184.0f, 218.0f)
                lineTo(72.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(70.0f, 186.0f)
                lineToRelative(116.0f, 0.3f)
                lineTo(186.0f, 216.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 184.0f, 218.0f)
                close()
                moveTo(186.0f, 75.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.8f, 1.6f)
                lineTo(128.0f, 120.5f)
                lineTo(70.8f, 77.6f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 70.0f, 76.0f)
                lineTo(70.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(184.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _hourglassLow!!
    }

private var _hourglassLow: ImageVector? = null
