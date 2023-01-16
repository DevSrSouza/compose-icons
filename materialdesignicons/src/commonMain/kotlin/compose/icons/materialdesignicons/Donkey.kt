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

public val MaterialDesignIcons.Donkey: ImageVector
    get() {
        if (_donkey != null) {
            return _donkey!!
        }
        _donkey = Builder(name = "Donkey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.34f, 10.35f)
                lineTo(21.27f, 10.28f)
                lineTo(21.18f, 10.19f)
                lineTo(18.0f, 7.0f)
                verticalLineTo(6.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.5f, 5.5f)
                curveTo(17.36f, 5.5f, 17.22f, 5.56f, 17.13f, 5.66f)
                lineTo(13.46f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(6.32f, 9.0f, 5.69f, 9.35f, 5.32f, 9.92f)
                lineTo(2.62f, 12.59f)
                curveTo(2.29f, 13.04f, 2.39f, 13.66f, 2.84f, 14.0f)
                curveTo(3.18f, 14.24f, 3.65f, 14.25f, 4.0f, 14.0f)
                lineTo(5.0f, 13.07f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.83f)
                curveTo(16.0f, 13.3f, 16.21f, 12.79f, 16.59f, 12.42f)
                lineTo(18.0f, 11.0f)
                lineTo(20.0f, 12.0f)
                verticalLineTo(12.0f)
                curveTo(20.15f, 12.08f, 20.32f, 12.13f, 20.5f, 12.13f)
                curveTo(21.1f, 12.11f, 21.59f, 11.61f, 21.58f, 11.0f)
                curveTo(21.57f, 10.76f, 21.5f, 10.53f, 21.34f, 10.35f)
                close()
            }
        }
        .build()
        return _donkey!!
    }

private var _donkey: ImageVector? = null
