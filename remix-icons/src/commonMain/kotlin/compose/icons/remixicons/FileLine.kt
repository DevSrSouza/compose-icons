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

public val RemixIcons.FileLine: ImageVector
    get() {
        if (_fileLine != null) {
            return _fileLine!!
        }
        _fileLine = Builder(name = "FileLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.003f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(10.998f)
                curveTo(20.55f, 2.0f, 21.0f, 2.455f, 21.0f, 2.992f)
                verticalLineToRelative(18.016f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                horizontalLineTo(3.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.993f)
                verticalLineTo(8.0f)
                lineToRelative(6.0f, -5.997f)
                close()
                moveTo(5.83f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.83f)
                lineTo(5.83f, 8.0f)
                close()
                moveTo(11.0f, 4.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _fileLine!!
    }

private var _fileLine: ImageVector? = null
