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

public val RemixIcons.FileMarkFill: ImageVector
    get() {
        if (_fileMarkFill != null) {
            return _fileMarkFill!!
        }
        _fileMarkFill = Builder(name = "FileMarkFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.992f)
                verticalLineToRelative(18.016f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, 0.992f)
                horizontalLineTo(3.993f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.993f, 2.0f)
                horizontalLineToRelative(16.014f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.444f, 0.993f, 0.992f)
                close()
                moveTo(7.0f, 4.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(3.5f, -2.0f)
                lineToRelative(3.5f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _fileMarkFill!!
    }

private var _fileMarkFill: ImageVector? = null
