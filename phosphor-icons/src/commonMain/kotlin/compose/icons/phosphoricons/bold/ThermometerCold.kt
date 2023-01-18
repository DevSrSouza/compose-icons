package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) {
            return _thermometerCold!!
        }
        _thermometerCold = Builder(name = "ThermometerCold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.8f)
                verticalLineTo(120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(47.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 132.0f, 188.0f)
                close()
                moveTo(253.8f, 66.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.1f, -7.7f)
                lineTo(224.0f, 63.5f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(63.5f)
                lineToRelative(-14.7f, -4.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -7.4f, 22.8f)
                lineToRelative(14.7f, 4.8f)
                lineToRelative(-9.1f, 12.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 2.6f, 16.8f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 7.1f, 2.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 9.7f, -5.0f)
                lineToRelative(9.1f, -12.5f)
                lineToRelative(9.1f, 12.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 9.7f, 5.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 7.1f, -2.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 2.6f, -16.8f)
                lineToRelative(-9.1f, -12.5f)
                lineToRelative(14.7f, -4.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 253.8f, 66.4f)
                close()
                moveTo(160.0f, 150.7f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -104.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f)
                close()
                moveTo(148.0f, 188.0f)
                arcToRelative(40.6f, 40.6f, 0.0f, false, false, -9.2f, -25.6f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -2.8f, -7.6f)
                verticalLineTo(56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(98.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -2.9f, 7.8f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 148.0f, 188.0f)
                close()
            }
        }
        .build()
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
