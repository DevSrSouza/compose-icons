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

public val RegularGroup.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) {
            return _caretDoubleUp!!
        }
        _caretDoubleUp = Builder(name = "CaretDoubleUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.7f, 202.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(128.0f, 139.3f)
                lineTo(53.7f, 213.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, -11.4f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                close()
                moveTo(53.7f, 133.7f)
                lineTo(128.0f, 59.3f)
                lineToRelative(74.3f, 74.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, false, 11.4f, 11.4f)
                close()
            }
        }
        .build()
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null