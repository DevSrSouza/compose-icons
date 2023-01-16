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

public val MaterialDesignIcons.PokemonGo: ImageVector
    get() {
        if (_pokemonGo != null) {
            return _pokemonGo!!
        }
        _pokemonGo = Builder(name = "PokemonGo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 9.0f)
                curveTo(19.0f, 10.4f, 18.59f, 11.71f, 17.88f, 12.8f)
                lineTo(12.0f, 22.21f)
                lineTo(6.12f, 12.8f)
                curveTo(5.41f, 11.71f, 5.0f, 10.4f, 5.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 3.5f)
                curveTo(9.3f, 3.5f, 7.06f, 5.44f, 6.59f, 8.0f)
                horizontalLineTo(9.17f)
                curveTo(9.58f, 6.83f, 10.69f, 6.0f, 12.0f, 6.0f)
                curveTo(13.31f, 6.0f, 14.42f, 6.83f, 14.83f, 8.0f)
                horizontalLineTo(17.41f)
                curveTo(16.94f, 5.44f, 14.7f, 3.5f, 12.0f, 3.5f)
                moveTo(12.0f, 12.0f)
                curveTo(10.69f, 12.0f, 9.58f, 11.17f, 9.17f, 10.0f)
                horizontalLineTo(6.59f)
                curveTo(6.72f, 10.69f, 6.97f, 11.34f, 7.34f, 11.91f)
                verticalLineTo(11.91f)
                lineTo(7.38f, 12.0f)
                curveTo(8.36f, 13.5f, 10.06f, 14.5f, 12.0f, 14.5f)
                curveTo(13.94f, 14.5f, 15.64f, 13.5f, 16.62f, 12.0f)
                lineTo(16.66f, 11.91f)
                verticalLineTo(11.91f)
                curveTo(17.03f, 11.34f, 17.28f, 10.69f, 17.41f, 10.0f)
                horizontalLineTo(14.83f)
                curveTo(14.42f, 11.17f, 13.31f, 12.0f, 12.0f, 12.0f)
                moveTo(12.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 7.5f)
                close()
            }
        }
        .build()
        return _pokemonGo!!
    }

private var _pokemonGo: ImageVector? = null
