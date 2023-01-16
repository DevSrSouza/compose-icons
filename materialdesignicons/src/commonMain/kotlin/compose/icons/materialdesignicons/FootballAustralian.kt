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

public val MaterialDesignIcons.FootballAustralian: ImageVector
    get() {
        if (_footballAustralian != null) {
            return _footballAustralian!!
        }
        _footballAustralian = Builder(name = "FootballAustralian", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 7.5f)
                curveTo(9.17f, 5.87f, 11.29f, 4.69f, 13.37f, 4.18f)
                curveTo(18.0f, 3.0f, 21.0f, 6.0f, 19.82f, 10.63f)
                curveTo(19.31f, 12.71f, 18.13f, 14.83f, 16.5f, 16.5f)
                curveTo(14.83f, 18.13f, 12.71f, 19.31f, 10.63f, 19.82f)
                curveTo(6.0f, 21.0f, 3.0f, 18.0f, 4.18f, 13.37f)
                curveTo(4.69f, 11.29f, 5.87f, 9.17f, 7.5f, 7.5f)
                moveTo(10.62f, 11.26f)
                lineTo(10.26f, 11.62f)
                lineTo(12.38f, 13.74f)
                lineTo(12.74f, 13.38f)
                lineTo(10.62f, 11.26f)
                moveTo(11.62f, 10.26f)
                lineTo(11.26f, 10.62f)
                lineTo(13.38f, 12.74f)
                lineTo(13.74f, 12.38f)
                lineTo(11.62f, 10.26f)
                moveTo(9.62f, 12.26f)
                lineTo(9.26f, 12.62f)
                lineTo(11.38f, 14.74f)
                lineTo(11.74f, 14.38f)
                lineTo(9.62f, 12.26f)
                moveTo(12.63f, 9.28f)
                lineTo(12.28f, 9.63f)
                lineTo(14.4f, 11.75f)
                lineTo(14.75f, 11.4f)
                lineTo(12.63f, 9.28f)
                moveTo(8.63f, 13.28f)
                lineTo(8.28f, 13.63f)
                lineTo(10.4f, 15.75f)
                lineTo(10.75f, 15.4f)
                lineTo(8.63f, 13.28f)
                moveTo(13.63f, 8.28f)
                lineTo(13.28f, 8.63f)
                lineTo(15.4f, 10.75f)
                lineTo(15.75f, 10.4f)
                lineTo(13.63f, 8.28f)
                close()
            }
        }
        .build()
        return _footballAustralian!!
    }

private var _footballAustralian: ImageVector? = null
