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

public val RegularGroup.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) {
            return _caretDoubleRight!!
        }
        _caretDoubleRight = Builder(name = "CaretDoubleRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(141.7f, 133.7f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(124.7f, 128.0f)
                lineTo(50.3f, 53.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 61.7f, 42.3f)
                lineToRelative(80.0f, 80.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 141.7f, 133.7f)
                close()
                moveTo(221.7f, 122.3f)
                lineTo(141.7f, 42.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineTo(204.7f, 128.0f)
                lineToRelative(-74.4f, 74.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(80.0f, -80.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 221.7f, 122.3f)
                close()
            }
        }
        .build()
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
