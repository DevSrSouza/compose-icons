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

public val ThinGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 128.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, -32.3f, -62.2f)
                lineToRelative(-6.6f, -35.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 153.3f, 20.0f)
                lineTo(102.7f, 20.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -11.8f, 9.9f)
                lineTo(84.3f, 65.8f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, 124.4f)
                lineToRelative(6.6f, 35.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.8f, 9.9f)
                horizontalLineToRelative(50.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.8f, -9.9f)
                lineToRelative(6.6f, -35.9f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 204.0f, 128.0f)
                close()
                moveTo(98.7f, 31.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 4.0f, -3.3f)
                horizontalLineToRelative(50.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 4.0f, 3.3f)
                lineToRelative(5.2f, 29.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, false, -69.0f, 0.0f)
                close()
                moveTo(157.3f, 224.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.0f, 3.3f)
                lineTo(102.7f, 228.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.0f, -3.3f)
                lineToRelative(-5.2f, -29.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, false, 69.0f, 0.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 196.0f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(128.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(124.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 128.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
