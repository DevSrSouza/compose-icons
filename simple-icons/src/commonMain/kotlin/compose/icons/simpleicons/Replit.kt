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

public val SimpleIcons.Replit: ImageVector
    get() {
        if (_replit != null) {
            return _replit!!
        }
        _replit = Builder(name = "Replit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 1.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 6.5f)
                close()
                moveTo(12.0f, 8.0f)
                horizontalLineToRelative(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 9.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(12.0f)
                close()
                moveTo(2.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 22.5f)
                close()
            }
        }
        .build()
        return _replit!!
    }

private var _replit: ImageVector? = null
