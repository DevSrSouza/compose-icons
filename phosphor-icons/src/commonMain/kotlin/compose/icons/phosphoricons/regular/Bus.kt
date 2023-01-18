package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 32.0f)
                lineTo(66.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 34.0f, 64.0f)
                lineTo(34.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(74.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(90.0f, 200.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(222.0f, 64.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 190.0f, 32.0f)
                close()
                moveTo(50.0f, 184.0f)
                lineTo(50.0f, 128.0f)
                lineTo(206.0f, 128.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(50.0f, 80.0f)
                lineTo(206.0f, 80.0f)
                verticalLineToRelative(32.0f)
                lineTo(50.0f, 112.0f)
                close()
                moveTo(66.0f, 48.0f)
                lineTo(190.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(50.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 66.0f, 48.0f)
                close()
                moveTo(74.0f, 216.0f)
                lineTo(50.0f, 216.0f)
                lineTo(50.0f, 200.0f)
                lineTo(74.0f, 200.0f)
                close()
                moveTo(182.0f, 216.0f)
                lineTo(182.0f, 200.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(94.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 94.0f, 156.0f)
                close()
                moveTo(186.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 186.0f, 156.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
