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

public val SimpleIcons.Purescript: ImageVector
    get() {
        if (_purescript != null) {
            return _purescript!!
        }
        _purescript = Builder(name = "Purescript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.166f, 4.6f)
                lineToRelative(-1.24f, 1.24f)
                lineToRelative(3.97f, 3.97f)
                lineToRelative(-3.97f, 3.97f)
                lineToRelative(1.24f, 1.24f)
                lineToRelative(4.58f, -4.6f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, 0.0f, -1.23f)
                close()
                moveTo(6.955f, 6.74f)
                lineToRelative(1.87f, 1.75f)
                horizontalLineToRelative(8.23f)
                lineToRelative(-1.87f, -1.75f)
                close()
                moveTo(4.855f, 8.98f)
                lineToRelative(-4.6f, 4.6f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, 0.0f, 1.23f)
                lineToRelative(4.6f, 4.59f)
                lineToRelative(1.23f, -1.24f)
                lineToRelative(-3.97f, -3.97f)
                lineToRelative(3.97f, -3.97f)
                lineToRelative(-1.24f, -1.24f)
                close()
                moveTo(8.825f, 11.12f)
                lineToRelative(-1.87f, 1.76f)
                horizontalLineToRelative(8.23f)
                lineToRelative(1.87f, -1.76f)
                close()
                moveTo(6.955f, 15.51f)
                lineToRelative(1.87f, 1.75f)
                horizontalLineToRelative(8.23f)
                lineToRelative(-1.87f, -1.75f)
                close()
            }
        }
        .build()
        return _purescript!!
    }

private var _purescript: ImageVector? = null
