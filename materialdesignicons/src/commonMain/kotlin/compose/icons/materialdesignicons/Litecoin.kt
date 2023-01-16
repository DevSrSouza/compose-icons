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

public val MaterialDesignIcons.Litecoin: ImageVector
    get() {
        if (_litecoin != null) {
            return _litecoin!!
        }
        _litecoin = Builder(name = "Litecoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.55f, 15.92f)
                lineTo(13.16f, 13.78f)
                lineTo(14.81f, 13.19f)
                lineTo(16.25f, 7.63f)
                lineTo(14.56f, 8.31f)
                lineTo(16.25f, 2.0f)
                horizontalLineTo(8.0f)
                lineTo(5.38f, 11.77f)
                lineTo(3.72f, 12.34f)
                lineTo(2.22f, 17.91f)
                lineTo(4.0f, 17.27f)
                lineTo(2.66f, 22.0f)
                horizontalLineTo(20.16f)
                lineTo(21.78f, 15.92f)
                horizontalLineTo(12.55f)
                moveTo(19.39f, 21.0f)
                horizontalLineTo(4.0f)
                lineTo(5.46f, 15.65f)
                lineTo(3.72f, 16.3f)
                lineTo(4.58f, 13.11f)
                lineTo(6.24f, 12.54f)
                lineTo(8.74f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(13.13f, 10.0f)
                lineTo(14.83f, 9.3f)
                lineTo(14.0f, 12.42f)
                lineTo(12.33f, 13.0f)
                lineTo(11.22f, 16.91f)
                horizontalLineTo(20.5f)
                lineTo(19.39f, 21.0f)
                close()
            }
        }
        .build()
        return _litecoin!!
    }

private var _litecoin: ImageVector? = null
