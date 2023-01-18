package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BookmarkSharp: ImageVector
    get() {
        if (_bookmarkSharp != null) {
            return _bookmarkSharp!!
        }
        _bookmarkSharp = Builder(name = "BookmarkSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 480.0f)
                lineTo(256.0f, 357.41f)
                lineTo(96.0f, 480.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _bookmarkSharp!!
    }

private var _bookmarkSharp: ImageVector? = null
