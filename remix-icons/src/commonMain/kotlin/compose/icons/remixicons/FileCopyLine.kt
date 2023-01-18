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

public val RemixIcons.FileCopyLine: ImageVector
    get() {
        if (_fileCopyLine != null) {
            return _fileCopyLine!!
        }
        _fileCopyLine = Builder(name = "FileCopyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.45f, 1.0f, -1.007f, 1.0f)
                horizontalLineTo(4.007f)
                arcTo(1.001f, 1.001f, 0.0f, false, true, 3.0f, 21.0f)
                lineToRelative(0.003f, -14.0f)
                curveToRelative(0.0f, -0.552f, 0.45f, -1.0f, 1.007f, -1.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(5.003f, 8.0f)
                lineTo(5.0f, 20.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.003f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _fileCopyLine!!
    }

private var _fileCopyLine: ImageVector? = null
