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

public val SimpleIcons.Pyup: ImageVector
    get() {
        if (_pyup != null) {
            return _pyup!!
        }
        _pyup = Builder(name = "Pyup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.608f, 6.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(3.984f, 2.3f)
                verticalLineToRelative(-12.0f)
                lineTo(12.0f, 4.6f)
                lineToRelative(6.408f, 3.7f)
                verticalLineToRelative(7.4f)
                lineTo(12.0f, 19.4f)
                lineToRelative(-2.95f, -1.705f)
                verticalLineToRelative(4.602f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.392f, -6.0f)
                lineTo(22.392f, 6.0f)
                close()
                moveTo(12.0f, 8.593f)
                lineToRelative(-2.95f, 1.703f)
                verticalLineToRelative(3.408f)
                lineTo(12.0f, 15.407f)
                lineToRelative(2.95f, -1.703f)
                verticalLineToRelative(-3.408f)
                close()
            }
        }
        .build()
        return _pyup!!
    }

private var _pyup: ImageVector? = null
