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

public val BoldGroup.Columns: ImageVector
    get() {
        if (_columns != null) {
            return _columns!!
        }
        _columns = Builder(name = "Columns", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 28.0f)
                lineTo(64.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 44.0f, 48.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(120.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 100.0f, 28.0f)
                close()
                moveTo(96.0f, 204.0f)
                lineTo(68.0f, 204.0f)
                lineTo(68.0f, 52.0f)
                lineTo(96.0f, 52.0f)
                close()
                moveTo(192.0f, 28.0f)
                lineTo(156.0f, 28.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(136.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(212.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 192.0f, 28.0f)
                close()
                moveTo(188.0f, 204.0f)
                lineTo(160.0f, 204.0f)
                lineTo(160.0f, 52.0f)
                horizontalLineToRelative(28.0f)
                close()
            }
        }
        .build()
        return _columns!!
    }

private var _columns: ImageVector? = null
