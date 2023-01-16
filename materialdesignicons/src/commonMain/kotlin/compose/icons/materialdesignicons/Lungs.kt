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

public val MaterialDesignIcons.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = Builder(name = "Lungs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.47f, 3.11f)
                curveTo(15.0f, 2.85f, 14.37f, 3.05f, 14.11f, 3.54f)
                curveTo(14.04f, 3.68f, 14.0f, 3.84f, 14.0f, 4.0f)
                verticalLineTo(6.59f)
                lineTo(13.29f, 5.88f)
                curveTo(13.1f, 5.69f, 13.0f, 5.44f, 13.0f, 5.18f)
                verticalLineTo(1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.17f)
                curveTo(11.0f, 5.44f, 10.9f, 5.69f, 10.71f, 5.88f)
                lineTo(10.0f, 6.59f)
                verticalLineTo(4.0f)
                curveTo(10.0f, 3.44f, 9.54f, 3.0f, 9.0f, 3.0f)
                curveTo(8.83f, 3.0f, 8.67f, 3.04f, 8.53f, 3.11f)
                curveTo(4.72f, 5.0f, 2.0f, 9.97f, 2.0f, 15.77f)
                curveTo(2.0f, 17.67f, 2.33f, 19.55f, 3.0f, 21.32f)
                curveTo(3.19f, 21.85f, 3.76f, 22.13f, 4.29f, 21.94f)
                curveTo(4.34f, 21.92f, 4.39f, 21.9f, 4.44f, 21.87f)
                lineTo(9.5f, 19.07f)
                curveTo(9.81f, 18.9f, 10.0f, 18.56f, 10.0f, 18.19f)
                verticalLineTo(9.41f)
                lineTo(11.3f, 8.12f)
                curveTo(11.69f, 7.73f, 12.32f, 7.73f, 12.71f, 8.12f)
                lineTo(14.0f, 9.42f)
                verticalLineTo(18.2f)
                curveTo(14.0f, 18.56f, 14.21f, 18.9f, 14.5f, 19.08f)
                lineTo(19.58f, 21.88f)
                curveTo(20.07f, 22.14f, 20.68f, 21.96f, 20.94f, 21.46f)
                curveTo(20.96f, 21.42f, 21.0f, 21.37f, 21.0f, 21.32f)
                curveTo(21.67f, 19.55f, 22.0f, 17.67f, 22.0f, 15.77f)
                curveTo(22.0f, 9.97f, 19.29f, 5.0f, 15.47f, 3.11f)
                close()
            }
        }
        .build()
        return _lungs!!
    }

private var _lungs: ImageVector? = null
