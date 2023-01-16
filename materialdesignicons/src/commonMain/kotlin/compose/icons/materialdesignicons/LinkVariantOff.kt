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

public val MaterialDesignIcons.LinkVariantOff: ImageVector
    get() {
        if (_linkVariantOff != null) {
            return _linkVariantOff!!
        }
        _linkVariantOff = Builder(name = "LinkVariantOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(13.9f, 17.17f)
                lineTo(11.29f, 19.78f)
                curveTo(9.34f, 21.73f, 6.17f, 21.73f, 4.22f, 19.78f)
                curveTo(2.27f, 17.83f, 2.27f, 14.66f, 4.22f, 12.71f)
                lineTo(5.71f, 11.22f)
                curveTo(5.7f, 12.04f, 5.83f, 12.86f, 6.11f, 13.65f)
                lineTo(5.64f, 14.12f)
                curveTo(4.46f, 15.29f, 4.46f, 17.19f, 5.64f, 18.36f)
                curveTo(6.81f, 19.54f, 8.71f, 19.54f, 9.88f, 18.36f)
                lineTo(12.5f, 15.76f)
                lineTo(10.88f, 14.15f)
                curveTo(10.87f, 14.39f, 10.77f, 14.64f, 10.59f, 14.83f)
                curveTo(10.2f, 15.22f, 9.56f, 15.22f, 9.17f, 14.83f)
                curveTo(8.12f, 13.77f, 7.63f, 12.37f, 7.72f, 11.0f)
                lineTo(2.0f, 5.27f)
                moveTo(12.71f, 4.22f)
                curveTo(14.66f, 2.27f, 17.83f, 2.27f, 19.78f, 4.22f)
                curveTo(21.73f, 6.17f, 21.73f, 9.34f, 19.78f, 11.29f)
                lineTo(18.29f, 12.78f)
                curveTo(18.3f, 11.96f, 18.17f, 11.14f, 17.89f, 10.36f)
                lineTo(18.36f, 9.88f)
                curveTo(19.54f, 8.71f, 19.54f, 6.81f, 18.36f, 5.64f)
                curveTo(17.19f, 4.46f, 15.29f, 4.46f, 14.12f, 5.64f)
                lineTo(10.79f, 8.97f)
                lineTo(9.38f, 7.55f)
                lineTo(12.71f, 4.22f)
                moveTo(13.41f, 9.17f)
                curveTo(13.8f, 8.78f, 14.44f, 8.78f, 14.83f, 9.17f)
                curveTo(16.2f, 10.54f, 16.61f, 12.5f, 16.06f, 14.23f)
                lineTo(14.28f, 12.46f)
                curveTo(14.23f, 11.78f, 13.94f, 11.11f, 13.41f, 10.59f)
                curveTo(13.0f, 10.2f, 13.0f, 9.56f, 13.41f, 9.17f)
                close()
            }
        }
        .build()
        return _linkVariantOff!!
    }

private var _linkVariantOff: ImageVector? = null
