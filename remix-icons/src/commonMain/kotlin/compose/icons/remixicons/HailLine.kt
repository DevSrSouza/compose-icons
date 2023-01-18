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

public val RemixIcons.HailLine: ImageVector
    get() {
        if (_hailLine != null) {
            return _hailLine!!
        }
        _hailLine = Builder(name = "HailLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 17.418f)
                arcTo(8.003f, 8.003f, 0.0f, false, true, 9.0f, 2.0f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, true, 7.458f, 5.099f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 19.0f, 17.793f)
                verticalLineToRelative(-2.13f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -4.0f, -5.612f)
                lineTo(15.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.0f, 5.197f)
                verticalLineToRelative(2.221f)
                close()
                moveTo(10.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(15.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(10.0f, 23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _hailLine!!
    }

private var _hailLine: ImageVector? = null