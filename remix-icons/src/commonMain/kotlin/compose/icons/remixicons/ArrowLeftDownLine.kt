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

public val RemixIcons.ArrowLeftDownLine: ImageVector
    get() {
        if (_arrowLeftDownLine != null) {
            return _arrowLeftDownLine!!
        }
        _arrowLeftDownLine = Builder(name = "ArrowLeftDownLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.59f)
                lineToRelative(8.607f, -8.607f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-8.607f, 8.607f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.585f)
                close()
            }
        }
        .build()
        return _arrowLeftDownLine!!
    }

private var _arrowLeftDownLine: ImageVector? = null
