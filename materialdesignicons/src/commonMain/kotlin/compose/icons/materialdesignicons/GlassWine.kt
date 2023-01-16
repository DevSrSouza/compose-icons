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

public val MaterialDesignIcons.GlassWine: ImageVector
    get() {
        if (_glassWine != null) {
            return _glassWine!!
        }
        _glassWine = Builder(name = "GlassWine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 21.27f)
                lineTo(14.66f, 21.18f)
                curveTo(13.9f, 21.11f, 13.25f, 20.6f, 13.0f, 19.87f)
                curveTo(12.47f, 17.91f, 12.47f, 15.83f, 13.0f, 13.87f)
                curveTo(15.32f, 13.4f, 17.0f, 11.37f, 17.0f, 9.0f)
                curveTo(17.0f, 7.0f, 15.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 2.0f, 7.0f, 7.0f, 7.0f, 9.0f)
                curveTo(7.0f, 11.38f, 8.67f, 13.42f, 11.0f, 13.9f)
                curveTo(11.53f, 15.86f, 11.53f, 17.94f, 11.0f, 19.9f)
                curveTo(10.76f, 20.62f, 10.12f, 21.13f, 9.37f, 21.21f)
                lineTo(8.5f, 21.3f)
                curveTo(8.5f, 21.3f, 8.0f, 21.28f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 21.28f, 15.5f, 21.27f, 15.5f, 21.27f)
                moveTo(9.44f, 7.0f)
                lineTo(10.44f, 4.0f)
                horizontalLineTo(13.56f)
                lineTo(14.56f, 7.0f)
                horizontalLineTo(9.44f)
                close()
            }
        }
        .build()
        return _glassWine!!
    }

private var _glassWine: ImageVector? = null
