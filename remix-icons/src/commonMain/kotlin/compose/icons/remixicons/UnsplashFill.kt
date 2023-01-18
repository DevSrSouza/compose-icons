package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.UnsplashFill: ImageVector
    get() {
        if (_unsplashFill != null) {
            return _unsplashFill!!
        }
        _unsplashFill = Builder(name = "UnsplashFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                lineTo(21.0f, 11.0f)
                verticalLineToRelative(10.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 11.0f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(15.5f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(8.5f, 3.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _unsplashFill!!
    }

private var _unsplashFill: ImageVector? = null