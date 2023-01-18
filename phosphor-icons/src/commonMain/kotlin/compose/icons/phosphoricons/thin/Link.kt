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

public val ThinGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.2f, 116.7f)
                lineTo(178.9f, 145.0f)
                arcToRelative(48.2f, 48.2f, 0.0f, false, true, -67.9f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.7f, -5.7f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 56.6f, 0.0f)
                lineTo(201.5f, 111.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -56.5f)
                arcToRelative(39.7f, 39.7f, 0.0f, false, false, -56.5f, 0.0f)
                lineTo(125.2f, 74.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, -5.7f)
                lineToRelative(19.8f, -19.8f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 67.9f, 67.9f)
                close()
                moveTo(130.8f, 181.7f)
                lineTo(111.0f, 201.5f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 54.5f, 145.0f)
                lineToRelative(28.2f, -28.3f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, true, 56.6f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 145.0f, 111.0f)
                arcToRelative(48.1f, 48.1f, 0.0f, false, false, -67.9f, 0.0f)
                lineTo(48.8f, 139.3f)
                arcToRelative(48.1f, 48.1f, 0.0f, false, false, 0.0f, 67.9f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, 67.9f, 0.0f)
                lineToRelative(19.8f, -19.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.7f, -5.7f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
