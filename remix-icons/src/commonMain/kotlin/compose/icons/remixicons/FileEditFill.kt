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

public val RemixIcons.FileEditFill: ImageVector
    get() {
        if (_fileEditFill != null) {
            return _fileEditFill!!
        }
        _fileEditFill = Builder(name = "FileEditFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.243f)
                verticalLineToRelative(5.765f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.993f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(10.002f)
                curveToRelative(0.551f, 0.0f, 0.998f, 0.455f, 0.998f, 0.992f)
                verticalLineToRelative(3.765f)
                lineToRelative(-8.999f, 9.0f)
                lineToRelative(-0.006f, 4.238f)
                lineToRelative(4.246f, 0.006f)
                lineTo(21.0f, 15.243f)
                close()
                moveTo(21.778f, 8.808f)
                lineToRelative(1.414f, 1.414f)
                lineTo(15.414f, 18.0f)
                lineToRelative(-1.416f, -0.002f)
                lineToRelative(0.002f, -1.412f)
                lineToRelative(7.778f, -7.778f)
                close()
                moveTo(3.0f, 7.0f)
                lineToRelative(5.0f, -4.997f)
                lineTo(8.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                close()
            }
        }
        .build()
        return _fileEditFill!!
    }

private var _fileEditFill: ImageVector? = null
