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

public val SimpleIcons.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) {
            return _lighthouse!!
        }
        _lighthouse = Builder(name = "Lighthouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineToRelative(5.5f, 3.5f)
                verticalLineToRelative(5.0f)
                lineTo(20.0f, 8.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.25f)
                lineToRelative(2.0f, 12.5f)
                lineTo(4.25f, 24.0f)
                lineToRelative(2.0f, -12.5f)
                lineTo(4.0f, 11.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                lineTo(6.5f, 3.53f)
                close()
                moveTo(14.94f, 13.25f)
                lineToRelative(-6.22f, 2.26f)
                lineTo(8.0f, 20.04f)
                lineToRelative(7.5f, -2.75f)
                close()
                moveTo(12.0f, 3.56f)
                lineTo(9.5f, 5.17f)
                lineTo(9.5f, 8.5f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 5.15f)
                close()
            }
        }
        .build()
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
