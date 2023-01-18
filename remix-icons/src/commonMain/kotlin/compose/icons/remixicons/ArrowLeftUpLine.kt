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

public val RemixIcons.ArrowLeftUpLine: ImageVector
    get() {
        if (_arrowLeftUpLine != null) {
            return _arrowLeftUpLine!!
        }
        _arrowLeftUpLine = Builder(name = "ArrowLeftUpLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.414f, 8.0f)
                lineToRelative(8.607f, 8.607f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(8.0f, 9.414f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _arrowLeftUpLine!!
    }

private var _arrowLeftUpLine: ImageVector? = null