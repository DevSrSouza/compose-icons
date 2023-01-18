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

public val RegularGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 88.0f)
                lineTo(226.9f, 88.0f)
                lineToRelative(-6.0f, -42.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 205.1f, 32.0f)
                lineTo(50.9f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 35.1f, 45.7f)
                lineTo(29.1f, 88.0f)
                lineTo(16.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(28.0f, 104.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(68.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(84.0f, 184.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(228.0f, 104.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(50.9f, 48.0f)
                lineTo(205.1f, 48.0f)
                lineToRelative(5.7f, 40.0f)
                lineTo(45.2f, 88.0f)
                close()
                moveTo(68.0f, 208.0f)
                lineTo(44.0f, 208.0f)
                lineTo(44.0f, 184.0f)
                lineTo(68.0f, 184.0f)
                close()
                moveTo(188.0f, 208.0f)
                lineTo(188.0f, 184.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(212.0f, 168.0f)
                lineTo(152.0f, 168.0f)
                lineTo(152.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                lineTo(120.0f, 168.0f)
                lineTo(120.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                lineTo(44.0f, 168.0f)
                lineTo(44.0f, 104.0f)
                lineTo(212.0f, 104.0f)
                close()
                moveTo(60.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 132.0f)
                close()
                moveTo(172.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 132.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
