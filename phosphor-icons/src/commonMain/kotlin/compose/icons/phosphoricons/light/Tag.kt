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

public val LightGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.6f, 128.3f)
                lineTo(134.1f, 23.8f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 121.5f, 20.0f)
                lineTo(40.8f, 36.1f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -4.7f, 4.7f)
                lineTo(20.0f, 121.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 3.8f, 12.6f)
                lineTo(128.3f, 238.6f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.9f, 4.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(90.5f, -90.5f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 4.1f, -9.9f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 238.6f, 128.3f)
                close()
                moveTo(230.1f, 139.6f)
                lineTo(139.6f, 230.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.8f, 0.0f)
                lineTo(32.3f, 125.6f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.5f, -1.8f)
                lineTo(47.1f, 47.1f)
                lineToRelative(76.7f, -15.3f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.9f, 0.5f)
                lineTo(230.1f, 136.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 2.8f)
                close()
                moveTo(94.0f, 84.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 84.0f, 74.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 84.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
