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

public val RemixIcons.FontSize: ImageVector
    get() {
        if (_fontSize != null) {
            return _fontSize!!
        }
        _fontSize = Builder(name = "FontSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.246f, 15.0f)
                lineTo(4.754f, 15.0f)
                lineToRelative(-2.0f, 5.0f)
                lineTo(0.6f, 20.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(6.4f, 16.0f)
                horizontalLineToRelative(-2.154f)
                lineToRelative(-2.0f, -5.0f)
                close()
                moveTo(10.446f, 13.0f)
                lineTo(8.0f, 6.885f)
                lineTo(5.554f, 13.0f)
                horizontalLineToRelative(4.892f)
                close()
                moveTo(21.0f, 12.535f)
                lineTo(21.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.535f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -6.93f)
                close()
                moveTo(19.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _fontSize!!
    }

private var _fontSize: ImageVector? = null
