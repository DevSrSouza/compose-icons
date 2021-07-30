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

public val CssGgIcons.MoveLeft: ImageVector
    get() {
        if (_moveLeft != null) {
            return _moveLeft!!
        }
        _moveLeft = Builder(name = "MoveLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.071f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.071f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 12.9999f)
                verticalLineTo(10.9999f)
                horizontalLineTo(9.0711f)
                verticalLineTo(7.9645f)
                lineTo(5.0f, 11.9644f)
                lineTo(9.0711f, 15.9644f)
                verticalLineTo(12.9999f)
                horizontalLineTo(19.071f)
                close()
            }
        }
        .build()
        return _moveLeft!!
    }

private var _moveLeft: ImageVector? = null
