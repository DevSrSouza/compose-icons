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

public val MaterialDesignIcons.MathCompass: ImageVector
    get() {
        if (_mathCompass != null) {
            return _mathCompass!!
        }
        _mathCompass = Builder(name = "MathCompass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.88f)
                verticalLineTo(22.0f)
                lineTo(18.2f, 20.83f)
                lineTo(13.41f, 11.83f)
                curveTo(14.07f, 11.62f, 14.67f, 11.28f, 15.19f, 10.83f)
                lineTo(20.0f, 19.88f)
                moveTo(15.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 10.0f)
                curveTo(11.85f, 10.0f, 11.71f, 10.0f, 11.56f, 10.0f)
                lineTo(5.8f, 20.83f)
                lineTo(4.0f, 22.0f)
                verticalLineTo(19.88f)
                lineTo(9.79f, 9.0f)
                curveTo(8.69f, 7.77f, 8.79f, 5.87f, 10.03f, 4.76f)
                curveTo(10.57f, 4.28f, 11.27f, 4.0f, 12.0f, 4.0f)
                verticalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 3.0f)
                verticalLineTo(4.18f)
                curveTo(14.2f, 4.6f, 15.0f, 5.73f, 15.0f, 7.0f)
                moveTo(13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 7.0f)
                close()
            }
        }
        .build()
        return _mathCompass!!
    }

private var _mathCompass: ImageVector? = null
