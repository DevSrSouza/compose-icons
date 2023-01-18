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

public val RemixIcons.MenuFoldFill: ImageVector
    get() {
        if (_menuFoldFill != null) {
            return _menuFoldFill!!
        }
        _menuFoldFill = Builder(name = "MenuFoldFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(6.95f, 3.55f)
                verticalLineToRelative(9.9f)
                lineTo(2.0f, 8.5f)
                lineToRelative(4.95f, -4.95f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(12.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _menuFoldFill!!
    }

private var _menuFoldFill: ImageVector? = null
