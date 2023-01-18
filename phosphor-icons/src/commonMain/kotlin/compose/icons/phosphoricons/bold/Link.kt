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

public val BoldGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.9f, 122.3f)
                lineToRelative(-30.3f, 30.3f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -79.2f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.9f, -16.9f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, 45.3f, 0.0f)
                lineToRelative(30.3f, -30.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.3f, -45.3f)
                lineTo(141.0f, 69.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(9.7f, -9.7f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 79.2f, 79.2f)
                close()
                moveTo(115.0f, 186.2f)
                lineToRelative(-9.6f, 9.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -45.3f, -45.3f)
                lineToRelative(30.3f, -30.3f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, true, 45.3f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, -16.9f)
                arcToRelative(55.9f, 55.9f, 0.0f, false, false, -79.2f, 0.0f)
                lineTo(43.1f, 133.7f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 79.2f, 79.2f)
                lineToRelative(9.7f, -9.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
