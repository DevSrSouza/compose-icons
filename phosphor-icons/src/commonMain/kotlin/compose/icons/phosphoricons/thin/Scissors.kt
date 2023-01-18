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

public val ThinGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.0f, 110.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 1.1f, -5.6f)
                lineTo(229.7f, 59.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.6f, 6.6f)
                lineToRelative(-67.7f, 46.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.3f, 0.7f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 161.0f, 110.9f)
                close()
                moveTo(235.3f, 195.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 1.1f)
                lineTo(136.0f, 132.8f)
                lineTo(88.5f, 165.4f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 60.0f, 212.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -22.6f, -54.6f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 45.2f, 0.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, 1.3f, 1.4f)
                lineToRelative(45.0f, -30.8f)
                lineToRelative(-45.0f, -30.8f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, -1.3f, 1.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, -45.2f, 0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, -45.2f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 45.2f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 5.9f, 37.2f)
                lineToRelative(49.7f, 34.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(96.1f, 65.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 235.3f, 195.9f)
                close()
                moveTo(77.0f, 93.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, 2.8f, -3.4f)
                horizontalLineToRelative(0.0f)
                arcTo(23.7f, 23.7f, 0.0f, false, false, 84.0f, 76.0f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, false, -7.0f, -17.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -34.0f, 0.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 77.0f, 93.0f)
                close()
                moveTo(84.0f, 180.0f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, false, -4.1f, -13.5f)
                horizontalLineToRelative(-0.1f)
                arcTo(29.7f, 29.7f, 0.0f, false, false, 77.0f, 163.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -34.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 34.0f, 34.0f)
                horizontalLineToRelative(0.0f)
                arcTo(24.2f, 24.2f, 0.0f, false, false, 84.0f, 180.0f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
