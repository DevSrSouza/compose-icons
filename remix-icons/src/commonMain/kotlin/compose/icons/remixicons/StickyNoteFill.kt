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

public val RemixIcons.StickyNoteFill: ImageVector
    get() {
        if (_stickyNoteFill != null) {
            return _stickyNoteFill!!
        }
        _stickyNoteFill = Builder(name = "StickyNoteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.876f, 0.876f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.998f, 21.0f)
                arcTo(0.996f, 0.996f, 0.0f, false, true, 3.0f, 20.007f)
                lineTo(3.0f, 3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                horizontalLineToRelative(16.014f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.447f, 0.993f, 0.999f)
                lineTo(21.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineToRelative(-5.0f, 4.997f)
                lineTo(16.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _stickyNoteFill!!
    }

private var _stickyNoteFill: ImageVector? = null
