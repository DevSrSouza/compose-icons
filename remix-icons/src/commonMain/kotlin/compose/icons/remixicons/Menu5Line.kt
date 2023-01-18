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

public val RemixIcons.Menu5Line: ImageVector
    get() {
        if (_menu5Line != null) {
            return _menu5Line!!
        }
        _menu5Line = Builder(name = "Menu5Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(18.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 6.0f)
                lineTo(6.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _menu5Line!!
    }

private var _menu5Line: ImageVector? = null
