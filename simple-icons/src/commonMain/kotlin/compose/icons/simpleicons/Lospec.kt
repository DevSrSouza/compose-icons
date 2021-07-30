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

public val SimpleIcons.Lospec: ImageVector
    get() {
        if (_lospec != null) {
            return _lospec!!
        }
        _lospec = Builder(name = "Lospec", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.23f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(15.541f)
                verticalLineToRelative(-8.4004f)
                horizontalLineToRelative(-7.1719f)
                verticalLineToRelative(3.5996f)
                horizontalLineTo(11.402f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _lospec!!
    }

private var _lospec: ImageVector? = null
