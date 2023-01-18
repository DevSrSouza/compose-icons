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

public val RemixIcons.Bookmark2Fill: ImageVector
    get() {
        if (_bookmark2Fill != null) {
            return _bookmark2Fill!!
        }
        _bookmark2Fill = Builder(name = "Bookmark2Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bookmark2Fill!!
    }

private var _bookmark2Fill: ImageVector? = null
