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

public val RemixIcons.MenuAddLine: ImageVector
    get() {
        if (_menuAddLine != null) {
            return _menuAddLine!!
        }
        _menuAddLine = Builder(name = "MenuAddLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                lineToRelative(-0.001f, 3.0f)
                lineTo(21.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.001f)
                lineTo(18.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.001f, -3.0f)
                lineTo(13.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.999f)
                lineTo(16.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 4.0f)
                horizontalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _menuAddLine!!
    }

private var _menuAddLine: ImageVector? = null
