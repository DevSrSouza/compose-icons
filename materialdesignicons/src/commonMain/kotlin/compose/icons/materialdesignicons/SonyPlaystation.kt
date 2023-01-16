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

public val MaterialDesignIcons.SonyPlaystation: ImageVector
    get() {
        if (_sonyPlaystation != null) {
            return _sonyPlaystation!!
        }
        _sonyPlaystation = Builder(name = "SonyPlaystation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 4.27f)
                curveTo(10.88f, 4.53f, 12.9f, 5.14f, 14.0f, 5.5f)
                curveTo(16.75f, 6.45f, 17.69f, 7.63f, 17.69f, 10.29f)
                curveTo(17.69f, 12.89f, 16.09f, 13.87f, 14.05f, 12.89f)
                verticalLineTo(8.05f)
                curveTo(14.05f, 7.5f, 13.95f, 6.97f, 13.41f, 6.82f)
                curveTo(13.0f, 6.69f, 12.76f, 7.07f, 12.76f, 7.63f)
                verticalLineTo(19.73f)
                lineTo(9.5f, 18.69f)
                verticalLineTo(4.27f)
                moveTo(13.37f, 17.62f)
                lineTo(18.62f, 15.75f)
                curveTo(19.22f, 15.54f, 19.31f, 15.24f, 18.83f, 15.08f)
                curveTo(18.34f, 14.92f, 17.47f, 14.97f, 16.87f, 15.18f)
                lineTo(13.37f, 16.41f)
                verticalLineTo(14.45f)
                lineTo(13.58f, 14.38f)
                curveTo(13.58f, 14.38f, 14.59f, 14.0f, 16.0f, 13.87f)
                curveTo(17.43f, 13.71f, 19.17f, 13.89f, 20.53f, 14.4f)
                curveTo(22.07f, 14.89f, 22.25f, 15.61f, 21.86f, 16.1f)
                curveTo(21.46f, 16.6f, 20.5f, 16.95f, 20.5f, 16.95f)
                lineTo(13.37f, 19.5f)
                verticalLineTo(17.62f)
                moveTo(3.5f, 17.42f)
                curveTo(1.93f, 17.0f, 1.66f, 16.05f, 2.38f, 15.5f)
                curveTo(3.05f, 15.0f, 4.18f, 14.65f, 4.18f, 14.65f)
                lineTo(8.86f, 13.0f)
                verticalLineTo(14.88f)
                lineTo(5.5f, 16.09f)
                curveTo(4.9f, 16.3f, 4.81f, 16.6f, 5.29f, 16.76f)
                curveTo(5.77f, 16.92f, 6.65f, 16.88f, 7.24f, 16.66f)
                lineTo(8.86f, 16.08f)
                verticalLineTo(17.77f)
                lineTo(8.54f, 17.83f)
                curveTo(6.92f, 18.09f, 5.2f, 18.0f, 3.5f, 17.42f)
                close()
            }
        }
        .build()
        return _sonyPlaystation!!
    }

private var _sonyPlaystation: ImageVector? = null
