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

public val RemixIcons.SkipBackLine: ImageVector
    get() {
        if (_skipBackLine != null) {
            return _skipBackLine!!
        }
        _skipBackLine = Builder(name = "SkipBackLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.333f)
                lineToRelative(10.223f, -6.815f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.777f, 0.416f)
                verticalLineToRelative(14.132f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.777f, 0.416f)
                lineTo(8.0f, 12.667f)
                lineTo(8.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(6.333f)
                close()
                moveTo(17.0f, 16.263f)
                lineTo(17.0f, 7.737f)
                lineTo(10.606f, 12.0f)
                lineTo(17.0f, 16.263f)
                close()
            }
        }
        .build()
        return _skipBackLine!!
    }

private var _skipBackLine: ImageVector? = null
