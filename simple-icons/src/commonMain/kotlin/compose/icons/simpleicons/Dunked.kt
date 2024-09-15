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

public val SimpleIcons.Dunked: ImageVector
    get() {
        if (_dunked != null) {
            return _dunked!!
        }
        _dunked = Builder(name = "Dunked", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.799f, 0.0f)
                verticalLineToRelative(19.86f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 18.0f, 24.0f)
                horizontalLineToRelative(4.2f)
                verticalLineTo(4.141f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 17.999f, 0.0f)
                horizontalLineTo(13.798f)
                close()
                moveTo(6.298f, 15.001f)
                arcToRelative(4.501f, 4.501f, 0.0f, false, false, -4.499f, 4.391f)
                verticalLineToRelative(0.222f)
                arcToRelative(4.501f, 4.501f, 0.0f, false, false, 8.999f, 0.0f)
                verticalLineToRelative(-0.215f)
                arcToRelative(4.501f, 4.501f, 0.0f, false, false, -4.5f, -4.399f)
                close()
            }
        }
        .build()
        return _dunked!!
    }

private var _dunked: ImageVector? = null
