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

public val LightGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.6f, 118.1f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(50.1f, 50.1f, 0.0f, false, true, -70.7f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -8.5f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 53.7f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -53.7f, -53.7f)
                lineTo(126.6f, 75.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.5f, -8.5f)
                lineToRelative(19.8f, -19.8f)
                arcToRelative(49.9f, 49.9f, 0.0f, false, true, 70.7f, 0.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 208.6f, 118.1f)
                close()
                moveTo(129.4f, 180.3f)
                lineTo(109.6f, 200.1f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -53.7f, -53.7f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 53.7f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.5f, -8.5f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, -70.7f, 0.0f)
                lineTo(47.4f, 137.9f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, 70.7f)
                arcToRelative(50.1f, 50.1f, 0.0f, false, false, 70.7f, 0.0f)
                lineToRelative(19.8f, -19.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -8.5f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
