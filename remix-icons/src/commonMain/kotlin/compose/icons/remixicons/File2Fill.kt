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

public val RemixIcons.File2Fill: ImageVector
    get() {
        if (_file2Fill != null) {
            return _file2Fill!!
        }
        _file2Fill = Builder(name = "File2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(10.002f)
                curveToRelative(0.551f, 0.0f, 0.998f, 0.455f, 0.998f, 0.992f)
                verticalLineToRelative(18.016f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.993f)
                lineTo(3.0f, 9.0f)
                close()
                moveTo(3.0f, 7.0f)
                lineToRelative(5.0f, -4.997f)
                lineTo(8.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                close()
            }
        }
        .build()
        return _file2Fill!!
    }

private var _file2Fill: ImageVector? = null
