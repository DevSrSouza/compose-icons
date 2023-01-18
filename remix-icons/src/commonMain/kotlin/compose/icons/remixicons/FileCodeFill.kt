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

public val RemixIcons.FileCodeFill: ImageVector
    get() {
        if (_fileCodeFill != null) {
            return _fileCodeFill!!
        }
        _fileCodeFill = Builder(name = "FileCodeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(14.008f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                lineTo(16.0f, 2.0f)
                close()
                moveTo(17.657f, 12.0f)
                lineTo(14.12f, 8.464f)
                lineTo(12.707f, 9.88f)
                lineTo(14.828f, 12.0f)
                lineToRelative(-2.12f, 2.121f)
                lineToRelative(1.413f, 1.415f)
                lineTo(17.657f, 12.0f)
                close()
                moveTo(6.343f, 12.0f)
                lineToRelative(3.536f, 3.536f)
                lineToRelative(1.414f, -1.415f)
                lineTo(9.172f, 12.0f)
                lineToRelative(2.12f, -2.121f)
                lineTo(9.88f, 8.464f)
                lineTo(6.343f, 12.0f)
                close()
            }
        }
        .build()
        return _fileCodeFill!!
    }

private var _fileCodeFill: ImageVector? = null
