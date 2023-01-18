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

public val RemixIcons.ArrowLeftDownFill: ImageVector
    get() {
        if (_arrowLeftDownFill != null) {
            return _arrowLeftDownFill!!
        }
        _arrowLeftDownFill = Builder(name = "ArrowLeftDownFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.36f, 13.05f)
                lineTo(17.31f, 18.0f)
                horizontalLineTo(5.998f)
                verticalLineTo(6.688f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(5.656f, -5.657f)
                lineToRelative(1.415f, 1.414f)
                close()
            }
        }
        .build()
        return _arrowLeftDownFill!!
    }

private var _arrowLeftDownFill: ImageVector? = null
