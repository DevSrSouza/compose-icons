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

public val BoldGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.8f, 140.8f)
                lineToRelative(49.9f, -18.1f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 220.9f, 104.0f)
                arcToRelative(19.5f, 19.5f, 0.0f, false, false, -13.0f, -18.8f)
                lineTo(52.7f, 26.9f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 26.9f, 52.7f)
                lineTo(85.2f, 207.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 18.7f, 13.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 18.7f, -13.2f)
                lineToRelative(18.1f, -49.9f)
                lineToRelative(58.7f, 58.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(103.8f, 189.4f)
                lineTo(52.5f, 52.5f)
                lineToRelative(136.9f, 51.3f)
                lineToRelative(-54.0f, 19.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.4f, 3.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.7f, 1.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -3.9f, 6.4f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
