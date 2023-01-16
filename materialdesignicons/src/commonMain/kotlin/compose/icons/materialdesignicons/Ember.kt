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

public val MaterialDesignIcons.Ember: ImageVector
    get() {
        if (_ember != null) {
            return _ember!!
        }
        _ember = Builder(name = "Ember", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.22f)
                curveTo(22.0f, 14.22f, 17.61f, 17.35f, 14.72f, 17.39f)
                curveTo(11.84f, 17.44f, 12.13f, 15.56f, 12.13f, 15.56f)
                curveTo(12.13f, 15.56f, 22.71f, 11.94f, 19.83f, 4.79f)
                curveTo(18.53f, 2.95f, 17.0f, 2.37f, 14.89f, 2.42f)
                curveTo(12.76f, 2.46f, 10.17f, 3.76f, 8.46f, 7.6f)
                curveTo(7.64f, 9.44f, 7.41f, 11.18f, 7.24f, 12.5f)
                verticalLineTo(12.5f)
                curveTo(7.24f, 12.5f, 5.32f, 12.88f, 4.32f, 12.04f)
                curveTo(3.32f, 11.2f, 2.77f, 12.04f, 2.77f, 12.04f)
                curveTo(2.77f, 12.04f, 1.03f, 14.2f, 2.75f, 14.87f)
                curveTo(4.46f, 15.54f, 7.12f, 15.82f, 7.12f, 15.82f)
                verticalLineTo(15.82f)
                curveTo(7.36f, 17.0f, 8.08f, 19.0f, 10.17f, 20.6f)
                curveTo(13.3f, 23.0f, 19.32f, 20.4f, 19.32f, 20.4f)
                moveTo(11.63f, 12.33f)
                curveTo(11.76f, 7.36f, 15.0f, 5.18f, 16.15f, 6.27f)
                curveTo(17.27f, 7.36f, 16.86f, 9.7f, 14.72f, 11.16f)
                curveTo(12.59f, 12.63f, 11.63f, 12.33f, 11.63f, 12.33f)
                close()
            }
        }
        .build()
        return _ember!!
    }

private var _ember: ImageVector? = null
