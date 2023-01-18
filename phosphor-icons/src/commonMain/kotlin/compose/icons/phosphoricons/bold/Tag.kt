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

public val BoldGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.8f, 124.0f)
                lineTo(138.4f, 19.6f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -18.1f, -5.5f)
                lineTo(39.7f, 30.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -9.5f, 9.5f)
                lineTo(14.1f, 120.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 5.5f, 18.1f)
                lineTo(124.0f, 242.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 28.3f, 0.0f)
                lineToRelative(90.5f, -90.5f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 0.0f, -28.3f)
                close()
                moveTo(138.2f, 223.0f)
                lineTo(38.1f, 122.9f)
                lineTo(52.2f, 52.2f)
                lineToRelative(70.7f, -14.1f)
                lineTo(223.0f, 138.2f)
                close()
                moveTo(100.0f, 84.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 84.0f, 68.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 84.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
