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

public val RemixIcons.FileFill: ImageVector
    get() {
        if (_fileFill != null) {
            return _fileFill!!
        }
        _fileFill = Builder(name = "FileFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                lineToRelative(6.003f, -6.0f)
                horizontalLineToRelative(10.995f)
                curveTo(20.55f, 2.0f, 21.0f, 2.455f, 21.0f, 2.992f)
                verticalLineToRelative(18.016f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.993f)
                lineTo(3.0f, 8.0f)
                close()
                moveTo(10.0f, 3.5f)
                lineTo(4.5f, 9.0f)
                lineTo(10.0f, 9.0f)
                lineTo(10.0f, 3.5f)
                close()
            }
        }
        .build()
        return _fileFill!!
    }

private var _fileFill: ImageVector? = null
