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

public val ThinGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 234.8f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -5.9f, -1.5f)
                lineToRelative(-84.0f, -47.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 32.0f, 175.3f)
                lineTo(32.0f, 80.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 6.1f, -10.5f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, 11.8f, 0.0f)
                lineToRelative(84.0f, 47.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 224.0f, 80.7f)
                verticalLineToRelative(94.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -6.1f, 10.5f)
                lineToRelative(-84.0f, 47.5f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 128.0f, 234.8f)
                close()
                moveTo(128.0f, 29.2f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -2.0f, 0.5f)
                lineTo(42.0f, 77.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 3.5f)
                verticalLineToRelative(94.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.5f)
                lineToRelative(84.0f, 47.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.0f, 0.0f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -3.5f)
                lineTo(216.0f, 80.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, -3.5f)
                lineTo(130.0f, 29.7f)
                arcTo(4.6f, 4.6f, 0.0f, false, false, 128.0f, 29.2f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
