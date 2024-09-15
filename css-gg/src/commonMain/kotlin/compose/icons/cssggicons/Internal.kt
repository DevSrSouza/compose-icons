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
                moveTo(20.708f, 4.412f)
                lineTo(10.459f, 14.699f)
                horizontalLineTo(14.049f)
                verticalLineTo(16.699f)
                horizontalLineTo(7.049f)
                verticalLineTo(9.699f)
                horizontalLineTo(9.049f)
                verticalLineTo(13.28f)
                lineTo(19.292f, 3.0f)
                lineTo(20.708f, 4.412f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.706f)
                verticalLineTo(6.706f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.706f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.706f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.706f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.706f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _internal!!
    }

private var _internal: ImageVector? = null
