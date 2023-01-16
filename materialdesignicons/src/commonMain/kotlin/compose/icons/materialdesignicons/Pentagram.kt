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

public val MaterialDesignIcons.Pentagram: ImageVector
    get() {
        if (_pentagram != null) {
            return _pentagram!!
        }
        _pentagram = Builder(name = "Pentagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.15f, 14.4f)
                lineTo(18.71f, 22.26f)
                lineTo(12.0f, 17.4f)
                lineTo(5.28f, 22.3f)
                lineTo(7.85f, 14.37f)
                lineTo(1.15f, 9.5f)
                horizontalLineTo(9.44f)
                lineTo(12.0f, 1.61f)
                lineTo(14.56f, 9.5f)
                horizontalLineTo(22.89f)
                lineTo(16.15f, 14.4f)
                moveTo(13.3f, 16.47f)
                lineTo(15.86f, 18.33f)
                lineTo(14.88f, 15.32f)
                lineTo(13.3f, 16.47f)
                moveTo(11.0f, 9.5f)
                horizontalLineTo(13.0f)
                lineTo(12.0f, 6.47f)
                lineTo(11.0f, 9.5f)
                moveTo(10.74f, 16.47f)
                lineTo(9.13f, 15.3f)
                lineTo(8.13f, 18.37f)
                lineTo(10.74f, 16.47f)
                moveTo(18.28f, 11.0f)
                horizontalLineTo(15.05f)
                lineTo(15.67f, 12.9f)
                lineTo(18.28f, 11.0f)
                moveTo(10.53f, 11.0f)
                lineTo(9.62f, 13.8f)
                lineTo(12.0f, 15.54f)
                lineTo(14.39f, 13.82f)
                lineTo(13.47f, 11.0f)
                horizontalLineTo(10.53f)
                moveTo(5.76f, 11.0f)
                lineTo(8.34f, 12.87f)
                lineTo(8.95f, 11.0f)
                horizontalLineTo(5.76f)
                close()
            }
        }
        .build()
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
