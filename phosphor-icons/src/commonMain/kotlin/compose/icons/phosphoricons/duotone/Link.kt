package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.3f, 82.7f)
                arcTo(51.8f, 51.8f, 0.0f, false, true, 210.0f, 119.5f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -73.5f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.3f, -11.3f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 50.9f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -50.9f, -50.9f)
                lineTo(128.0f, 77.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -11.3f)
                lineTo(136.5f, 46.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, true, 88.8f, 36.7f)
                close()
                moveTo(128.0f, 178.9f)
                lineToRelative(-19.8f, 19.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -50.9f, -50.9f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, 50.9f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, -11.3f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -73.5f, 0.0f)
                lineTo(46.0f, 136.5f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 119.5f, 210.0f)
                lineToRelative(19.8f, -19.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 178.9f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
