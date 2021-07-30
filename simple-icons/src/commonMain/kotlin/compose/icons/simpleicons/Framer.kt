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

public val SimpleIcons.Framer: ImageVector
    get() {
        if (_framer != null) {
            return _framer!!
        }
        _framer = Builder(name = "Framer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(8.0f, 8.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _framer!!
    }

private var _framer: ImageVector? = null
