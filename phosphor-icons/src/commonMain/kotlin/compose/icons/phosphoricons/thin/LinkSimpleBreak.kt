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

public val ThinGroup.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) {
            return _linkSimpleBreak!!
        }
        _linkSimpleBreak = Builder(name = "LinkSimpleBreak", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.8f, 176.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineTo(119.5f, 210.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 46.0f, 210.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, -73.5f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.7f)
                lineTo(51.6f, 142.1f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 62.3f, 62.3f)
                lineToRelative(28.2f, -28.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 147.8f, 176.1f)
                close()
                moveTo(210.0f, 46.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -73.5f, 0.0f)
                lineTo(108.2f, 74.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.7f, 0.0f)
                lineToRelative(28.2f, -28.3f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, true, 62.3f, 62.3f)
                lineToRelative(-28.3f, 28.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.8f, 6.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, -1.2f)
                lineTo(210.0f, 119.5f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 210.0f, 46.0f)
                close()
            }
        }
        .build()
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
