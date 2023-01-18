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

public val RemixIcons.ArrowGoBackLine: ImageVector
    get() {
        if (_arrowGoBackLine != null) {
            return _arrowGoBackLine!!
        }
        _arrowGoBackLine = Builder(name = "ArrowGoBackLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.828f, 7.0f)
                lineToRelative(2.536f, 2.536f)
                lineTo(6.95f, 10.95f)
                lineTo(2.0f, 6.0f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(1.414f, 1.414f)
                lineTo(5.828f, 5.0f)
                horizontalLineTo(13.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                horizontalLineTo(5.828f)
                close()
            }
        }
        .build()
        return _arrowGoBackLine!!
    }

private var _arrowGoBackLine: ImageVector? = null
