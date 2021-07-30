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

public val SimpleIcons.Pagekit: ImageVector
    get() {
        if (_pagekit != null) {
            return _pagekit!!
        }
        _pagekit = Builder(name = "Pagekit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.401f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(9.6f)
                verticalLineToRelative(-3.527f)
                horizontalLineTo(5.929f)
                verticalLineTo(3.526f)
                horizontalLineToRelative(12.146f)
                verticalLineToRelative(13.421f)
                horizontalLineToRelative(-6.073f)
                verticalLineToRelative(3.525f)
                horizontalLineTo(21.6f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.401f)
                close()
            }
        }
        .build()
        return _pagekit!!
    }

private var _pagekit: ImageVector? = null
