package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.7f, 88.0f)
                lineTo(226.9f, 88.0f)
                lineToRelative(-6.0f, -42.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 205.1f, 32.0f)
                lineTo(50.9f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 35.1f, 45.7f)
                lineTo(29.1f, 88.0f)
                lineTo(16.3f, 88.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 8.0f, 95.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.5f)
                lineTo(28.0f, 104.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(68.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(84.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(104.0f, 128.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 7.5f, -8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.5f, 8.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(136.0f, 128.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 7.5f, -8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.5f, 8.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(228.0f, 104.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.5f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 239.7f, 88.0f)
                close()
                moveTo(72.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 144.0f)
                close()
                moveTo(184.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 144.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
