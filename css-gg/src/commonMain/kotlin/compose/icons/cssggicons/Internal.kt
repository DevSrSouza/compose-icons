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

public val CssGgIcons.Internal: ImageVector
    get() {
        if (_internal != null) {
            return _internal!!
        }
        _internal = Builder(name = "Internal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7084f, 4.4117f)
                lineTo(10.4586f, 14.6986f)
                horizontalLineTo(14.0488f)
                verticalLineTo(16.6986f)
                horizontalLineTo(7.0488f)
                verticalLineTo(9.6986f)
                horizontalLineTo(9.0488f)
                verticalLineTo(13.2799f)
                lineTo(19.2916f, 3.0f)
                lineTo(20.7084f, 4.4117f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.7058f)
                verticalLineTo(6.7058f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.7058f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.7058f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.7058f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.7058f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _internal!!
    }

private var _internal: ImageVector? = null
