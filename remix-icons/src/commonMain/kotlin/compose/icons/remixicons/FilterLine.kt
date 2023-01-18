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

public val RemixIcons.FilterLine: ImageVector
    get() {
        if (_filterLine != null) {
            return _filterLine!!
        }
        _filterLine = Builder(name = "FilterLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-5.0f, 7.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-8.5f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(6.404f, 6.0f)
                lineTo(11.0f, 12.894f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.106f)
                lineTo(17.596f, 6.0f)
                horizontalLineTo(6.404f)
                close()
            }
        }
        .build()
        return _filterLine!!
    }

private var _filterLine: ImageVector? = null
