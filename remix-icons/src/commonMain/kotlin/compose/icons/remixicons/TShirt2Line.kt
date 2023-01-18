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

public val RemixIcons.TShirt2Line: ImageVector
    get() {
        if (_tShirt2Line != null) {
            return _tShirt2Line!!
        }
        _tShirt2Line = Builder(name = "TShirt2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-2.001f)
                lineTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineToRelative(-0.001f, -8.001f)
                lineTo(3.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(20.0f, 4.999f)
                horizontalLineToRelative(-3.417f)
                lineToRelative(-0.017f, 0.041f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, true, -4.35f, 2.955f)
                lineTo(12.0f, 8.0f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, true, -4.566f, -2.96f)
                lineTo(7.416f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(2.999f, -0.001f)
                lineTo(6.999f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineToRelative(-0.001f, -9.0f)
                lineTo(20.0f, 9.999f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _tShirt2Line!!
    }

private var _tShirt2Line: ImageVector? = null
