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

public val MaterialDesignIcons.DivingFlippers: ImageVector
    get() {
        if (_divingFlippers != null) {
            return _divingFlippers!!
        }
        _divingFlippers = Builder(name = "DivingFlippers", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.28f, 3.66f)
                curveTo(19.28f, 3.44f, 18.54f, 2.25f, 17.57f, 2.04f)
                curveTo(16.6f, 1.83f, 15.4f, 2.59f, 14.42f, 2.37f)
                curveTo(13.38f, 2.0f, 12.22f, 2.13f, 11.28f, 2.71f)
                lineTo(11.21f, 17.0f)
                lineTo(11.0f, 18.0f)
                curveTo(10.64f, 19.62f, 11.67f, 21.22f, 13.29f, 21.58f)
                curveTo(14.9f, 21.93f, 16.5f, 20.91f, 16.86f, 19.29f)
                lineTo(17.07f, 18.29f)
                lineTo(23.0f, 5.28f)
                curveTo(22.39f, 4.35f, 21.39f, 3.76f, 20.28f, 3.66f)
                moveTo(14.91f, 18.86f)
                curveTo(14.79f, 19.41f, 14.25f, 19.76f, 13.7f, 19.65f)
                curveTo(13.14f, 19.53f, 12.79f, 19.0f, 12.91f, 18.43f)
                lineTo(13.77f, 14.5f)
                curveTo(13.86f, 13.97f, 14.37f, 13.6f, 14.92f, 13.69f)
                curveTo(15.46f, 13.78f, 15.83f, 14.3f, 15.74f, 14.84f)
                curveTo(15.74f, 14.88f, 15.73f, 14.91f, 15.72f, 14.95f)
                lineTo(14.91f, 18.86f)
                moveTo(9.72f, 21.34f)
                curveTo(9.33f, 20.73f, 9.08f, 20.05f, 9.0f, 19.34f)
                lineTo(8.24f, 16.0f)
                curveTo(8.1f, 15.47f, 8.41f, 14.92f, 9.0f, 14.76f)
                curveTo(9.07f, 14.75f, 9.15f, 14.75f, 9.22f, 14.76f)
                verticalLineTo(3.43f)
                curveTo(8.31f, 3.43f, 7.22f, 2.86f, 6.38f, 3.06f)
                curveTo(5.54f, 3.26f, 4.69f, 4.44f, 3.72f, 4.66f)
                curveTo(2.61f, 4.76f, 1.61f, 5.35f, 1.0f, 6.28f)
                lineTo(6.93f, 19.28f)
                lineTo(7.14f, 20.28f)
                curveTo(7.5f, 21.9f, 9.09f, 22.92f, 10.71f, 22.57f)
                horizontalLineTo(10.81f)
                curveTo(10.38f, 22.22f, 10.0f, 21.81f, 9.72f, 21.34f)
                close()
            }
        }
        .build()
        return _divingFlippers!!
    }

private var _divingFlippers: ImageVector? = null
