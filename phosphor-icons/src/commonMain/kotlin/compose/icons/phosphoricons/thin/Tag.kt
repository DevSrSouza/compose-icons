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

public val ThinGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.2f, 129.7f)
                lineTo(132.7f, 25.2f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 121.9f, 22.0f)
                lineTo(41.2f, 38.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -3.1f, 3.1f)
                lineTo(22.0f, 121.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.2f, 10.8f)
                lineTo(129.7f, 237.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(90.5f, -90.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(231.5f, 141.0f)
                lineTo(141.0f, 231.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(30.9f, 127.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -1.1f, -3.7f)
                lineToRelative(15.6f, -78.0f)
                lineToRelative(78.1f, -15.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 3.6f, 1.1f)
                lineTo(231.5f, 135.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.2f, 2.9f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 231.5f, 141.0f)
                close()
                moveTo(92.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 84.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
