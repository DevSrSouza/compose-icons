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

public val CssGgIcons.CornerDownLeft: ImageVector
    get() {
        if (_cornerDownLeft != null) {
            return _cornerDownLeft!!
        }
        _cornerDownLeft = Builder(name = "CornerDownLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.149f, 13.401f)
                curveTo(18.254f, 13.401f, 19.149f, 12.505f, 19.149f, 11.401f)
                verticalLineTo(3.401f)
                horizontalLineTo(21.149f)
                verticalLineTo(11.401f)
                curveTo(21.149f, 13.61f, 19.359f, 15.401f, 17.149f, 15.401f)
                horizontalLineTo(6.844f)
                lineTo(10.629f, 19.185f)
                lineTo(9.214f, 20.599f)
                lineTo(2.85f, 14.235f)
                lineTo(9.214f, 7.871f)
                lineTo(10.629f, 9.286f)
                lineTo(6.514f, 13.401f)
                horizontalLineTo(17.149f)
                close()
            }
        }
        .build()
        return _cornerDownLeft!!
    }

private var _cornerDownLeft: ImageVector? = null
