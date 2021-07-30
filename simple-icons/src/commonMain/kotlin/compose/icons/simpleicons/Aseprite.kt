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

public val SimpleIcons.Aseprite: ImageVector
    get() {
        if (_aseprite != null) {
            return _aseprite!!
        }
        _aseprite = Builder(name = "Aseprite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.006f, 0.0f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(15.988f)
                lineTo(19.994f, 0.0f)
                close()
                moveTo(19.994f, 1.6f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.6f)
                lineTo(21.594f, 1.6f)
                close()
                moveTo(21.594f, 3.2f)
                verticalLineToRelative(14.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(1.6f)
                lineTo(4.006f, 19.2f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.6f)
                lineTo(2.406f, 3.2f)
                lineTo(0.809f, 3.2f)
                verticalLineToRelative(17.6f)
                horizontalLineToRelative(1.599f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.599f)
                lineTo(4.007f, 24.0f)
                horizontalLineToRelative(15.988f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(1.598f)
                lineTo(23.193f, 3.2f)
                close()
                moveTo(2.407f, 3.2f)
                horizontalLineToRelative(1.599f)
                lineTo(4.006f, 1.6f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(7.203f, 6.4f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                lineTo(8.803f, 6.4f)
                close()
                moveTo(15.198f, 6.4f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.599f)
                lineTo(16.797f, 6.4f)
                close()
            }
        }
        .build()
        return _aseprite!!
    }

private var _aseprite: ImageVector? = null
