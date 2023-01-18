package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 128.0f)
                arcToRelative(77.9f, 77.9f, 0.0f, false, false, -32.5f, -63.3f)
                lineToRelative(-6.4f, -35.2f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 153.3f, 18.0f)
                lineTo(102.7f, 18.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 88.9f, 29.5f)
                lineTo(82.5f, 64.7f)
                arcToRelative(77.9f, 77.9f, 0.0f, false, false, 0.0f, 126.6f)
                lineToRelative(6.4f, 35.2f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 102.7f, 238.0f)
                horizontalLineToRelative(50.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.8f, -11.5f)
                lineToRelative(6.4f, -35.2f)
                arcTo(77.9f, 77.9f, 0.0f, false, false, 206.0f, 128.0f)
                close()
                moveTo(100.7f, 31.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.6f)
                horizontalLineToRelative(50.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.6f)
                lineToRelative(4.6f, 25.2f)
                arcToRelative(78.2f, 78.2f, 0.0f, false, false, -63.8f, 0.0f)
                close()
                moveTo(155.3f, 224.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.6f)
                lineTo(102.7f, 226.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.6f)
                lineToRelative(-4.6f, -25.2f)
                arcToRelative(78.2f, 78.2f, 0.0f, false, false, 63.8f, 0.0f)
                close()
                moveTo(128.0f, 194.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, -66.0f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 128.0f, 194.0f)
                close()
                moveTo(174.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(128.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(122.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(34.0f)
                horizontalLineToRelative(34.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 128.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
