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

public val MaterialDesignIcons.InvertColorsOff: ImageVector
    get() {
        if (_invertColorsOff != null) {
            return _invertColorsOff!!
        }
        _invertColorsOff = Builder(name = "InvertColorsOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.65f, 20.87f)
                lineTo(18.3f, 18.5f)
                lineTo(12.0f, 12.23f)
                lineTo(8.44f, 8.66f)
                lineTo(7.0f, 7.25f)
                lineTo(4.27f, 4.5f)
                lineTo(3.0f, 5.77f)
                lineTo(5.78f, 8.55f)
                curveTo(3.23f, 11.69f, 3.42f, 16.31f, 6.34f, 19.24f)
                curveTo(7.9f, 20.8f, 9.95f, 21.58f, 12.0f, 21.58f)
                curveTo(13.79f, 21.58f, 15.57f, 21.0f, 17.03f, 19.8f)
                lineTo(19.73f, 22.5f)
                lineTo(21.0f, 21.23f)
                lineTo(20.65f, 20.87f)
                moveTo(12.0f, 19.59f)
                curveTo(10.4f, 19.59f, 8.89f, 18.97f, 7.76f, 17.83f)
                curveTo(6.62f, 16.69f, 6.0f, 15.19f, 6.0f, 13.59f)
                curveTo(6.0f, 12.27f, 6.43f, 11.0f, 7.21f, 10.0f)
                lineTo(12.0f, 14.77f)
                verticalLineTo(19.59f)
                moveTo(12.0f, 5.1f)
                verticalLineTo(9.68f)
                lineTo(19.25f, 16.94f)
                curveTo(20.62f, 14.0f, 20.09f, 10.37f, 17.65f, 7.93f)
                lineTo(12.0f, 2.27f)
                lineTo(8.3f, 5.97f)
                lineTo(9.71f, 7.38f)
                lineTo(12.0f, 5.1f)
                close()
            }
        }
        .build()
        return _invertColorsOff!!
    }

private var _invertColorsOff: ImageVector? = null
