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

public val MaterialDesignIcons.LinkVariant: ImageVector
    get() {
        if (_linkVariant != null) {
            return _linkVariant!!
        }
        _linkVariant = Builder(name = "LinkVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.59f, 13.41f)
                curveTo(11.0f, 13.8f, 11.0f, 14.44f, 10.59f, 14.83f)
                curveTo(10.2f, 15.22f, 9.56f, 15.22f, 9.17f, 14.83f)
                curveTo(7.22f, 12.88f, 7.22f, 9.71f, 9.17f, 7.76f)
                verticalLineTo(7.76f)
                lineTo(12.71f, 4.22f)
                curveTo(14.66f, 2.27f, 17.83f, 2.27f, 19.78f, 4.22f)
                curveTo(21.73f, 6.17f, 21.73f, 9.34f, 19.78f, 11.29f)
                lineTo(18.29f, 12.78f)
                curveTo(18.3f, 11.96f, 18.17f, 11.14f, 17.89f, 10.36f)
                lineTo(18.36f, 9.88f)
                curveTo(19.54f, 8.71f, 19.54f, 6.81f, 18.36f, 5.64f)
                curveTo(17.19f, 4.46f, 15.29f, 4.46f, 14.12f, 5.64f)
                lineTo(10.59f, 9.17f)
                curveTo(9.41f, 10.34f, 9.41f, 12.24f, 10.59f, 13.41f)
                moveTo(13.41f, 9.17f)
                curveTo(13.8f, 8.78f, 14.44f, 8.78f, 14.83f, 9.17f)
                curveTo(16.78f, 11.12f, 16.78f, 14.29f, 14.83f, 16.24f)
                verticalLineTo(16.24f)
                lineTo(11.29f, 19.78f)
                curveTo(9.34f, 21.73f, 6.17f, 21.73f, 4.22f, 19.78f)
                curveTo(2.27f, 17.83f, 2.27f, 14.66f, 4.22f, 12.71f)
                lineTo(5.71f, 11.22f)
                curveTo(5.7f, 12.04f, 5.83f, 12.86f, 6.11f, 13.65f)
                lineTo(5.64f, 14.12f)
                curveTo(4.46f, 15.29f, 4.46f, 17.19f, 5.64f, 18.36f)
                curveTo(6.81f, 19.54f, 8.71f, 19.54f, 9.88f, 18.36f)
                lineTo(13.41f, 14.83f)
                curveTo(14.59f, 13.66f, 14.59f, 11.76f, 13.41f, 10.59f)
                curveTo(13.0f, 10.2f, 13.0f, 9.56f, 13.41f, 9.17f)
                close()
            }
        }
        .build()
        return _linkVariant!!
    }

private var _linkVariant: ImageVector? = null
