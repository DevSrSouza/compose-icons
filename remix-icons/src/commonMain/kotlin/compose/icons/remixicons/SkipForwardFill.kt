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

public val RemixIcons.SkipForwardFill: ImageVector
    get() {
        if (_skipForwardFill != null) {
            return _skipForwardFill!!
        }
        _skipForwardFill = Builder(name = "SkipForwardFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.667f)
                lineTo(5.777f, 19.482f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 19.066f)
                verticalLineTo(4.934f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.777f, -0.416f)
                lineTo(16.0f, 11.333f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-6.333f)
                close()
            }
        }
        .build()
        return _skipForwardFill!!
    }

private var _skipForwardFill: ImageVector? = null
