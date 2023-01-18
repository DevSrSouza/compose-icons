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

public val RemixIcons.ArrowLeftLine: ImageVector
    get() {
        if (_arrowLeftLine != null) {
            return _arrowLeftLine!!
        }
        _arrowLeftLine = Builder(name = "ArrowLeftLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.828f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.828f)
                lineToRelative(5.364f, 5.364f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(4.0f, 12.0f)
                lineToRelative(7.778f, -7.778f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _arrowLeftLine!!
    }

private var _arrowLeftLine: ImageVector? = null
