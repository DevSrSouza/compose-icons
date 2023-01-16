package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.GlassCocktailOff: ImageVector
    get() {
        if (_glassCocktailOff != null) {
            return _glassCocktailOff!!
        }
        _glassCocktailOff = Builder(name = "GlassCocktailOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.33f, 12.67f)
                lineTo(7.66f, 7.0f)
                lineTo(6.13f, 5.47f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.0f, 4.89f)
                verticalLineTo(5.0f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(13.33f, 12.67f)
                moveTo(13.0f, 19.0f)
                verticalLineTo(14.89f)
                lineTo(17.11f, 19.0f)
                horizontalLineTo(13.0f)
                moveTo(8.2f, 5.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                lineTo(14.6f, 11.4f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(16.5f)
                lineTo(18.5f, 5.0f)
                horizontalLineTo(8.2f)
                close()
            }
        }
        .build()
        return _glassCocktailOff!!
    }

private var _glassCocktailOff: ImageVector? = null
