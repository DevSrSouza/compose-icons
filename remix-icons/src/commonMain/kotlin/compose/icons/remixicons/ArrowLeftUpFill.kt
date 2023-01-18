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

public val RemixIcons.ArrowLeftUpFill: ImageVector
    get() {
        if (_arrowLeftUpFill != null) {
            return _arrowLeftUpFill!!
        }
        _arrowLeftUpFill = Builder(name = "ArrowLeftUpFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.36f, 10.947f)
                lineToRelative(5.658f, 5.656f)
                lineToRelative(-1.415f, 1.415f)
                lineToRelative(-5.656f, -5.657f)
                lineToRelative(-4.95f, 4.95f)
                verticalLineTo(5.997f)
                horizontalLineTo(17.31f)
                close()
            }
        }
        .build()
        return _arrowLeftUpFill!!
    }

private var _arrowLeftUpFill: ImageVector? = null
