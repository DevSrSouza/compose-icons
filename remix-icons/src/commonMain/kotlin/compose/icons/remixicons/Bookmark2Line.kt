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

public val RemixIcons.Bookmark2Line: ImageVector
    get() {
        if (_bookmark2Line != null) {
            return _bookmark2Line!!
        }
        _bookmark2Line = Builder(name = "Bookmark2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(19.143f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.766f, 0.424f)
                lineTo(12.0f, 18.03f)
                lineToRelative(-7.234f, 4.536f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 22.143f)
                lineTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(18.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(15.432f)
                lineToRelative(6.0f, -3.761f)
                lineToRelative(6.0f, 3.761f)
                lineTo(18.0f, 4.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bookmark2Line!!
    }

private var _bookmark2Line: ImageVector? = null
