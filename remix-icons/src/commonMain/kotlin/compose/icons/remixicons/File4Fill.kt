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

public val RemixIcons.File4Fill: ImageVector
    get() {
        if (_file4Fill != null) {
            return _file4Fill!!
        }
        _file4Fill = Builder(name = "File4Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.998f, 22.0f)
                curveTo(3.447f, 22.0f, 3.0f, 21.545f, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineToRelative(16.014f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 3.007f)
                lineTo(21.0f, 15.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineToRelative(-5.0f, 4.997f)
                lineTo(16.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _file4Fill!!
    }

private var _file4Fill: ImageVector? = null