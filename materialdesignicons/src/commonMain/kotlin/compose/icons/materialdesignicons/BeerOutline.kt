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

public val MaterialDesignIcons.BeerOutline: ImageVector
    get() {
        if (_beerOutline != null) {
            return _beerOutline!!
        }
        _beerOutline = Builder(name = "BeerOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                lineTo(6.0f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(19.0f, 2.0f)
                horizontalLineTo(4.0f)
                moveTo(6.2f, 4.0f)
                horizontalLineTo(16.8f)
                lineTo(16.5f, 7.23f)
                curveTo(13.18f, 8.5f, 11.85f, 7.67f, 11.38f, 7.31f)
                curveTo(11.13f, 7.12f, 10.77f, 6.69f, 10.11f, 6.39f)
                curveTo(9.45f, 6.08f, 8.55f, 6.0f, 7.5f, 6.32f)
                curveTo(7.09f, 6.43f, 6.77f, 6.61f, 6.5f, 6.79f)
                lineTo(6.2f, 4.0f)
                moveTo(8.86f, 8.11f)
                curveTo(9.05f, 8.11f, 9.16f, 8.15f, 9.27f, 8.2f)
                curveTo(9.5f, 8.3f, 9.71f, 8.55f, 10.17f, 8.9f)
                curveTo(11.03f, 9.56f, 13.03f, 10.36f, 16.26f, 9.41f)
                lineTo(15.2f, 20.0f)
                horizontalLineTo(7.8f)
                lineTo(6.71f, 9.06f)
                curveTo(6.76f, 9.0f, 6.91f, 8.89f, 7.17f, 8.71f)
                curveTo(7.5f, 8.5f, 7.91f, 8.28f, 8.0f, 8.25f)
                lineTo(8.0f, 8.25f)
                horizontalLineTo(8.03f)
                curveTo(8.41f, 8.14f, 8.67f, 8.1f, 8.86f, 8.11f)
                close()
            }
        }
        .build()
        return _beerOutline!!
    }

private var _beerOutline: ImageVector? = null
