package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Swap: ImageVector
    get() {
        if (_swap != null) {
            return _swap!!
        }
        _swap = Builder(name = "Swap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                lineTo(19.0f, 10.5f)
                lineTo(16.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                lineTo(5.0f, 14.5f)
                lineTo(8.0f, 17.0f)
                close()
            }
        }
        .build()
        return _swap!!
    }

private var _swap: ImageVector? = null
