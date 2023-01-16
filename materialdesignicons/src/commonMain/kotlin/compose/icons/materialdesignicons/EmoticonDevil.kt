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

public val MaterialDesignIcons.EmoticonDevil: ImageVector
    get() {
        if (_emoticonDevil != null) {
            return _emoticonDevil!!
        }
        _emoticonDevil = Builder(name = "EmoticonDevil", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 2.09f)
                curveTo(21.6f, 3.0f, 20.13f, 3.73f, 18.31f, 4.25f)
                curveTo(16.59f, 2.84f, 14.39f, 2.0f, 12.0f, 2.0f)
                curveTo(9.61f, 2.0f, 7.41f, 2.84f, 5.69f, 4.25f)
                curveTo(3.87f, 3.73f, 2.4f, 3.0f, 1.5f, 2.09f)
                curveTo(1.53f, 3.72f, 2.35f, 5.21f, 3.72f, 6.4f)
                curveTo(2.63f, 8.0f, 2.0f, 9.92f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                curveTo(22.0f, 9.92f, 21.37f, 8.0f, 20.28f, 6.4f)
                curveTo(21.65f, 5.21f, 22.47f, 3.72f, 22.5f, 2.09f)
                moveTo(7.5f, 8.5f)
                lineTo(10.5f, 10.0f)
                curveTo(10.5f, 10.8f, 9.8f, 11.5f, 9.0f, 11.5f)
                curveTo(8.2f, 11.5f, 7.5f, 10.8f, 7.5f, 10.0f)
                verticalLineTo(8.5f)
                moveTo(12.0f, 17.23f)
                curveTo(10.25f, 17.23f, 8.71f, 16.5f, 7.81f, 15.42f)
                lineTo(9.23f, 14.0f)
                curveTo(9.68f, 14.72f, 10.75f, 15.23f, 12.0f, 15.23f)
                curveTo(13.25f, 15.23f, 14.32f, 14.72f, 14.77f, 14.0f)
                lineTo(16.19f, 15.42f)
                curveTo(15.29f, 16.5f, 13.75f, 17.23f, 12.0f, 17.23f)
                moveTo(16.5f, 10.0f)
                curveTo(16.5f, 10.8f, 15.8f, 11.5f, 15.0f, 11.5f)
                curveTo(14.2f, 11.5f, 13.5f, 10.8f, 13.5f, 10.0f)
                lineTo(16.5f, 8.5f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _emoticonDevil!!
    }

private var _emoticonDevil: ImageVector? = null
