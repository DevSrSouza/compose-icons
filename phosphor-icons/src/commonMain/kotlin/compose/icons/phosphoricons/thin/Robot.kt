package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Robot: ImageVector
    get() {
        if (_robot != null) {
            return _robot!!
        }
        _robot = Builder(name = "Robot", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 52.0f)
                lineTo(132.0f, 52.0f)
                lineTo(132.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 52.0f)
                lineTo(56.0f, 52.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 28.0f, 80.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(228.0f, 80.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 200.0f, 52.0f)
                close()
                moveTo(220.0f, 192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(56.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(36.0f, 80.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 56.0f, 60.0f)
                lineTo(200.0f, 60.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(164.0f, 140.0f)
                lineTo(92.0f, 140.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                close()
                moveTo(144.0f, 148.0f)
                verticalLineToRelative(32.0f)
                lineTo(112.0f, 180.0f)
                lineTo(112.0f, 148.0f)
                close()
                moveTo(76.0f, 164.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(32.0f)
                lineTo(92.0f, 180.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 164.0f)
                close()
                moveTo(164.0f, 180.0f)
                lineTo(152.0f, 180.0f)
                lineTo(152.0f, 148.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(76.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 108.0f)
                close()
                moveTo(164.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 108.0f)
                close()
            }
        }
        .build()
        return _robot!!
    }

private var _robot: ImageVector? = null
