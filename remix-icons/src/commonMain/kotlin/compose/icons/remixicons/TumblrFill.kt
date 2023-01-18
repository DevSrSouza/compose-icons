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

public val RemixIcons.TumblrFill: ImageVector
    get() {
        if (_tumblrFill != null) {
            return _tumblrFill!!
        }
        _tumblrFill = Builder(name = "TumblrFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.27f, 7.63f)
                arcTo(5.76f, 5.76f, 0.0f, false, false, 10.815f, 2.0f)
                horizontalLineToRelative(3.03f)
                verticalLineToRelative(5.152f)
                horizontalLineToRelative(3.637f)
                verticalLineToRelative(3.636f)
                horizontalLineToRelative(-3.636f)
                verticalLineToRelative(5.454f)
                curveToRelative(0.0f, 0.515f, 0.197f, 1.207f, 0.909f, 1.667f)
                curveToRelative(0.474f, 0.307f, 1.484f, 0.458f, 3.03f, 0.455f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-4.242f)
                arcToRelative(4.545f, 4.545f, 0.0f, false, true, -4.546f, -4.545f)
                verticalLineToRelative(-6.667f)
                horizontalLineTo(6.27f)
                verticalLineTo(7.63f)
                close()
            }
        }
        .build()
        return _tumblrFill!!
    }

private var _tumblrFill: ImageVector? = null
