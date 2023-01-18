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

public val BoldGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 128.0f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, false, -32.9f, -66.6f)
                lineTo(172.9f, 21.0f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 153.1f, 4.0f)
                lineTo(102.9f, 4.0f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 83.1f, 21.0f)
                lineTo(76.9f, 61.4f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, false, 0.0f, 133.2f)
                lineTo(83.1f, 235.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 19.8f, 17.0f)
                horizontalLineToRelative(50.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 19.8f, -17.0f)
                lineToRelative(6.2f, -40.4f)
                arcTo(83.9f, 83.9f, 0.0f, false, false, 212.0f, 128.0f)
                close()
                moveTo(106.3f, 28.0f)
                horizontalLineToRelative(43.4f)
                lineToRelative(3.0f, 19.7f)
                arcToRelative(84.3f, 84.3f, 0.0f, false, false, -49.4f, 0.0f)
                close()
                moveTo(68.0f, 128.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 68.0f, 128.0f)
                close()
                moveTo(149.7f, 228.0f)
                lineTo(106.3f, 228.0f)
                lineToRelative(-3.0f, -19.7f)
                arcToRelative(84.3f, 84.3f, 0.0f, false, false, 49.4f, 0.0f)
                close()
                moveTo(116.0f, 128.0f)
                lineTo(116.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(128.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
