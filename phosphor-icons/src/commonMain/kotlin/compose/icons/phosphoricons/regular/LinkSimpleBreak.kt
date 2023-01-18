package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) {
            return _linkSimpleBreak!!
        }
        _linkSimpleBreak = Builder(name = "LinkSimpleBreak", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.6f, 173.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -79.2f, -79.2f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 11.3f)
                lineTo(54.5f, 145.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, 56.5f)
                arcToRelative(39.7f, 39.7f, 0.0f, false, false, 56.5f, 0.0f)
                lineToRelative(28.3f, -28.2f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 150.6f, 173.3f)
                close()
                moveTo(212.9f, 43.1f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -79.2f, 0.0f)
                lineTo(105.4f, 71.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, 11.3f)
                lineTo(145.0f, 54.5f)
                arcToRelative(39.7f, 39.7f, 0.0f, false, true, 56.5f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 56.5f)
                lineToRelative(-28.2f, 28.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 5.6f, 2.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, -2.4f)
                lineToRelative(28.3f, -28.3f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 212.9f, 43.1f)
                close()
            }
        }
        .build()
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
