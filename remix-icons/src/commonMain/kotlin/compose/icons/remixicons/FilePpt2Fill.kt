package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FilePpt2Fill: ImageVector
    get() {
        if (_filePpt2Fill != null) {
            return _filePpt2Fill!!
        }
        _filePpt2Fill = Builder(name = "FilePpt2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(2.859f, 2.877f)
                lineToRelative(12.57f, -1.795f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.571f, 0.495f)
                verticalLineToRelative(20.846f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.57f, 0.495f)
                lineTo(2.858f, 21.123f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.859f, -0.99f)
                lineTo(1.999f, 3.867f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.859f, -0.99f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(13.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _filePpt2Fill!!
    }

private var _filePpt2Fill: ImageVector? = null
