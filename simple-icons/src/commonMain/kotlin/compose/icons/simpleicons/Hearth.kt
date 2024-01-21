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

public val SimpleIcons.Hearth: ImageVector
    get() {
        if (_hearth != null) {
            return _hearth!!
        }
        _hearth = Builder(name = "Hearth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1958f, 10.318f)
                verticalLineToRelative(9.576f)
                lineTo(0.4531f, 24.0f)
                verticalLineToRelative(-9.3298f)
                close()
                moveTo(15.8549f, 6.156f)
                lineTo(23.5469f, 10.3176f)
                verticalLineToRelative(9.5736f)
                lineTo(15.8532f, 24.0f)
                verticalLineToRelative(-9.3302f)
                lineToRelative(-7.6577f, -4.3522f)
                close()
                moveTo(8.196f, 0.0f)
                verticalLineToRelative(9.576f)
                lineTo(0.453f, 13.8027f)
                verticalLineToRelative(-9.648f)
                close()
            }
        }
        .build()
        return _hearth!!
    }

private var _hearth: ImageVector? = null
