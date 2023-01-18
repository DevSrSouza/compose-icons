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

public val RemixIcons.MacbookFill: ImageVector
    get() {
        if (_macbookFill != null) {
            return _macbookFill!!
        }
        _macbookFill = Builder(name = "MacbookFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.007f)
                curveTo(2.0f, 3.45f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.45f, 0.992f, 1.007f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.007f)
                close()
                moveTo(1.0f, 19.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _macbookFill!!
    }

private var _macbookFill: ImageVector? = null
