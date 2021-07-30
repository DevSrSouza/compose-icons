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
                moveTo(6.8505f, 13.4005f)
                curveTo(5.7459f, 13.4005f, 4.8505f, 12.5051f, 4.8505f, 11.4005f)
                verticalLineTo(3.4005f)
                horizontalLineTo(2.8505f)
                verticalLineTo(11.4005f)
                curveTo(2.8505f, 13.6097f, 4.6413f, 15.4005f, 6.8505f, 15.4005f)
                horizontalLineTo(17.156f)
                lineTo(13.3714f, 19.1852f)
                lineTo(14.7856f, 20.5994f)
                lineTo(21.1495f, 14.2354f)
                lineTo(14.7856f, 7.8715f)
                lineTo(13.3714f, 9.2857f)
                lineTo(17.4862f, 13.4005f)
                horizontalLineTo(6.8505f)
                close()
            }
        }
        .build()
        return _cornerDownRight!!
    }

private var _cornerDownRight: ImageVector? = null
