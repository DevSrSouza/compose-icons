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
                moveTo(17.1495f, 13.4005f)
                curveTo(18.2541f, 13.4005f, 19.1495f, 12.5051f, 19.1495f, 11.4005f)
                verticalLineTo(3.4005f)
                horizontalLineTo(21.1495f)
                verticalLineTo(11.4005f)
                curveTo(21.1495f, 13.6097f, 19.3587f, 15.4005f, 17.1495f, 15.4005f)
                horizontalLineTo(6.844f)
                lineTo(10.6286f, 19.1852f)
                lineTo(9.2144f, 20.5994f)
                lineTo(2.8505f, 14.2354f)
                lineTo(9.2144f, 7.8715f)
                lineTo(10.6286f, 9.2857f)
                lineTo(6.5138f, 13.4005f)
                horizontalLineTo(17.1495f)
                close()
            }
        }
        .build()
        return _cornerDownLeft!!
    }

private var _cornerDownLeft: ImageVector? = null
