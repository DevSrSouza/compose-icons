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

public val CssGgIcons.MoveUp: ImageVector
    get() {
        if (_moveUp != null) {
            return _moveUp!!
        }
        _moveUp = Builder(name = "MoveUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 19.071f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.071f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 19.071f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.071f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.071f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.071f)
                horizontalLineTo(7.965f)
                lineTo(11.964f, 5.0f)
                lineTo(15.964f, 9.071f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.071f)
                close()
            }
        }
        .build()
        return _moveUp!!
    }

private var _moveUp: ImageVector? = null
