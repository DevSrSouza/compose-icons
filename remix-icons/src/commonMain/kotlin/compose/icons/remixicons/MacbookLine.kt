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

public val RemixIcons.MacbookLine: ImageVector
    get() {
        if (_macbookLine != null) {
            return _macbookLine!!
        }
        _macbookLine = Builder(name = "MacbookLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(2.0f, 4.007f)
                curveTo(2.0f, 3.451f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.449f, 0.992f, 1.007f)
                lineTo(22.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 4.007f)
                close()
                moveTo(1.0f, 19.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _macbookLine!!
    }

private var _macbookLine: ImageVector? = null
