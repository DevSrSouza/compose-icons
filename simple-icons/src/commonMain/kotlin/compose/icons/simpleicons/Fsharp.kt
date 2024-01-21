package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Fsharp: ImageVector
    get() {
        if (_fsharp != null) {
            return _fsharp!!
        }
        _fsharp = Builder(name = "Fsharp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                lineTo(11.39f, 0.61f)
                verticalLineToRelative(5.695f)
                lineTo(5.695f, 12.0f)
                lineToRelative(5.695f, 5.695f)
                verticalLineToRelative(5.695f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(7.322f, 12.0f)
                lineTo(11.39f, 7.932f)
                verticalLineToRelative(8.136f)
                lineTo(7.322f, 12.0f)
                close()
                moveTo(24.0f, 12.0f)
                lineTo(12.203f, 0.61f)
                verticalLineToRelative(5.695f)
                lineTo(17.898f, 12.0f)
                lineToRelative(-5.695f, 5.695f)
                verticalLineToRelative(5.695f)
                lineTo(24.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fsharp!!
    }

private var _fsharp: ImageVector? = null
