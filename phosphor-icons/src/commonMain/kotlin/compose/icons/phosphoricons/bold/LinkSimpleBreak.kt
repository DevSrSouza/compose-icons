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

public val BoldGroup.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) {
            return _linkSimpleBreak!!
        }
        _linkSimpleBreak = Builder(name = "LinkSimpleBreak", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.4f, 170.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-28.2f, 28.3f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -84.9f, -84.9f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineTo(57.3f, 147.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.9f, 50.9f)
                lineToRelative(28.3f, -28.3f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 153.4f, 170.4f)
                close()
                moveTo(215.7f, 40.3f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, false, -84.9f, 0.0f)
                lineTo(102.5f, 68.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 50.9f, 50.9f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.5f, 20.5f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 8.5f, -3.6f)
                lineToRelative(28.3f, -28.2f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, -84.9f)
                close()
            }
        }
        .build()
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
