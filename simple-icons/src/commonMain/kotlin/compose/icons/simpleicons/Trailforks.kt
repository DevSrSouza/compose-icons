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

public val SimpleIcons.Trailforks: ImageVector
    get() {
        if (_trailforks != null) {
            return _trailforks!!
        }
        _trailforks = Builder(name = "Trailforks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.608f)
                lineTo(0.0f, 22.392f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(10.708f, 7.306f)
                horizontalLineToRelative(2.584f)
                verticalLineToRelative(5.885f)
                lineToRelative(2.664f, 1.917f)
                verticalLineToRelative(5.587f)
                horizontalLineToRelative(-2.204f)
                lineTo(13.752f, 16.05f)
                lineTo(12.0f, 14.788f)
                lineToRelative(-1.752f, 1.262f)
                verticalLineToRelative(4.645f)
                lineTo(8.044f, 20.695f)
                verticalLineToRelative(-5.587f)
                lineToRelative(2.664f, -1.917f)
                close()
            }
        }
        .build()
        return _trailforks!!
    }

private var _trailforks: ImageVector? = null
