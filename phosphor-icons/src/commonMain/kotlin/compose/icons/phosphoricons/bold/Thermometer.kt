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

public val BoldGroup.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(name = "Thermometer", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                close()
                moveTo(132.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.8f)
                lineTo(96.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(75.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 132.0f, 188.0f)
                close()
                moveTo(160.0f, 56.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 56.0f, 56.0f)
                verticalLineToRelative(94.7f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 104.0f, 0.0f)
                close()
                moveTo(108.0f, 228.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -30.9f, -65.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 2.9f, -7.8f)
                lineTo(80.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(98.8f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 2.8f, 7.6f)
                arcTo(40.6f, 40.6f, 0.0f, false, true, 148.0f, 188.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 108.0f, 228.0f)
                close()
            }
        }
        .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
