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

public val BoldGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 84.0f)
                horizontalLineToRelative(-9.6f)
                lineToRelative(-5.5f, -38.8f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 205.1f, 28.0f)
                lineTo(50.9f, 28.0f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 31.1f, 45.2f)
                lineTo(25.6f, 84.0f)
                lineTo(16.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(68.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(88.0f, 188.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(232.0f, 108.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(54.4f, 52.0f)
                lineTo(201.6f, 52.0f)
                lineToRelative(4.6f, 32.0f)
                lineTo(49.8f, 84.0f)
                close()
                moveTo(64.0f, 204.0f)
                lineTo(48.0f, 204.0f)
                lineTo(48.0f, 188.0f)
                lineTo(64.0f, 188.0f)
                close()
                moveTo(192.0f, 204.0f)
                lineTo(192.0f, 188.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(208.0f, 164.0f)
                lineTo(180.0f, 164.0f)
                lineTo(180.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(28.0f)
                lineTo(140.0f, 164.0f)
                lineTo(140.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(28.0f)
                lineTo(100.0f, 164.0f)
                lineTo(100.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(28.0f)
                lineTo(48.0f, 164.0f)
                lineTo(48.0f, 108.0f)
                lineTo(208.0f, 108.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
