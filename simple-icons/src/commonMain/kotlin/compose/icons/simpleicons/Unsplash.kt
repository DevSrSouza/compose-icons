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

public val SimpleIcons.Unsplash: ImageVector
    get() {
        if (_unsplash != null) {
            return _unsplash!!
        }
        _unsplash = Builder(name = "Unsplash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 6.75f)
                lineTo(7.5f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(16.5f, 10.5f)
                lineTo(24.0f, 10.5f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(9.0f)
                lineTo(16.5f, 10.5f)
                close()
            }
        }
        .build()
        return _unsplash!!
    }

private var _unsplash: ImageVector? = null
