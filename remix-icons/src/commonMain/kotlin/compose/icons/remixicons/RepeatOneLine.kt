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

public val RemixIcons.RepeatOneLine: ImageVector
    get() {
        if (_repeatOneLine != null) {
            return _repeatOneLine!!
        }
        _repeatOneLine = Builder(name = "RepeatOneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 20.0f)
                verticalLineToRelative(1.932f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.82f, 0.385f)
                lineToRelative(-4.12f, -3.433f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.382f, 18.0f)
                lineTo(18.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(8.0f, 20.0f)
                close()
                moveTo(16.0f, 2.068f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.82f, -0.385f)
                lineToRelative(4.12f, 3.433f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.321f, 0.884f)
                lineTo(6.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(10.0f)
                lineTo(16.0f, 2.068f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 9.0f)
                lineToRelative(2.0f, -1.0f)
                close()
            }
        }
        .build()
        return _repeatOneLine!!
    }

private var _repeatOneLine: ImageVector? = null
