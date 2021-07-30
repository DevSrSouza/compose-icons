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

public val SimpleIcons.Snapcraft: ImageVector
    get() {
        if (_snapcraft != null) {
            return _snapcraft!!
        }
        _snapcraft = Builder(name = "Snapcraft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.804f, 13.367f)
                verticalLineTo(5.69f)
                lineToRelative(5.292f, 2.362f)
                lineToRelative(-5.292f, 5.315f)
                close()
                moveTo(3.701f, 23.514f)
                lineToRelative(6.49f, -12.22f)
                lineToRelative(2.847f, 2.843f)
                lineTo(3.7f, 23.514f)
                close()
                moveTo(0.0f, 0.486f)
                lineToRelative(13.355f, 4.848f)
                verticalLineToRelative(8.484f)
                lineTo(0.0f, 0.486f)
                close()
                moveTo(21.803f, 5.334f)
                horizontalLineTo(14.11f)
                lineTo(24.0f, 9.748f)
                close()
            }
        }
        .build()
        return _snapcraft!!
    }

private var _snapcraft: ImageVector? = null
