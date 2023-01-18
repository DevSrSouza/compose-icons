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

public val RemixIcons.Focus3Line: ImageVector
    get() {
        if (_focus3Line != null) {
            return _focus3Line!!
        }
        _focus3Line = Builder(name = "Focus3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 1.0f)
                lineToRelative(0.001f, 3.062f)
                arcTo(8.004f, 8.004f, 0.0f, false, true, 19.938f, 11.0f)
                lineTo(23.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-3.062f, 0.001f)
                arcToRelative(8.004f, 8.004f, 0.0f, false, true, -6.937f, 6.937f)
                lineTo(13.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.062f)
                arcToRelative(8.004f, 8.004f, 0.0f, false, true, -6.938f, -6.937f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.062f)
                arcTo(8.004f, 8.004f, 0.0f, false, true, 11.0f, 4.062f)
                lineTo(11.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _focus3Line!!
    }

private var _focus3Line: ImageVector? = null
