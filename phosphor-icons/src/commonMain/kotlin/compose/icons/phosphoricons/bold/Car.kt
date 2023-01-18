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

public val BoldGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 108.0f)
                horizontalLineToRelative(-8.2f)
                lineTo(205.1f, 47.9f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 186.8f, 36.0f)
                lineTo(69.2f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 50.9f, 47.9f)
                lineTo(24.2f, 108.0f)
                lineTo(16.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(64.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(84.0f, 188.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 132.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(71.8f, 60.0f)
                lineTo(184.2f, 60.0f)
                lineToRelative(21.3f, 48.0f)
                lineTo(50.5f, 108.0f)
                close()
                moveTo(60.0f, 204.0f)
                lineTo(44.0f, 204.0f)
                lineTo(44.0f, 188.0f)
                lineTo(60.0f, 188.0f)
                close()
                moveTo(196.0f, 204.0f)
                lineTo(196.0f, 188.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(212.0f, 164.0f)
                lineTo(44.0f, 164.0f)
                lineTo(44.0f, 132.0f)
                lineTo(212.0f, 132.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
