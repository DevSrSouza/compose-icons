package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerDownRight: ImageVector
    get() {
        if (_cornerDownRight != null) {
            return _cornerDownRight!!
        }
        _cornerDownRight = Builder(name = "CornerDownRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.85f, 13.401f)
                curveTo(5.746f, 13.401f, 4.85f, 12.505f, 4.85f, 11.401f)
                verticalLineTo(3.401f)
                horizontalLineTo(2.85f)
                verticalLineTo(11.401f)
                curveTo(2.85f, 13.61f, 4.641f, 15.401f, 6.85f, 15.401f)
                horizontalLineTo(17.156f)
                lineTo(13.371f, 19.185f)
                lineTo(14.786f, 20.599f)
                lineTo(21.149f, 14.235f)
                lineTo(14.786f, 7.871f)
                lineTo(13.371f, 9.286f)
                lineTo(17.486f, 13.401f)
                horizontalLineTo(6.85f)
                close()
            }
        }
        .build()
        return _cornerDownRight!!
    }

private var _cornerDownRight: ImageVector? = null
