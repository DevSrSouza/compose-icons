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

public val RemixIcons.ArrowRightUpFill: ImageVector
    get() {
        if (_arrowRightUpFill != null) {
            return _arrowRightUpFill!!
        }
        _arrowRightUpFill = Builder(name = "ArrowRightUpFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.05f, 12.36f)
                lineToRelative(-5.656f, 5.658f)
                lineToRelative(-1.414f, -1.415f)
                lineToRelative(5.657f, -5.656f)
                lineToRelative(-4.95f, -4.95f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.31f)
                close()
            }
        }
        .build()
        return _arrowRightUpFill!!
    }

private var _arrowRightUpFill: ImageVector? = null
