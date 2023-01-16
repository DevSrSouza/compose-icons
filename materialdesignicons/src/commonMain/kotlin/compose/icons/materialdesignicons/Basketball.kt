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

public val MaterialDesignIcons.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.34f, 14.63f)
                curveTo(2.94f, 14.41f, 3.56f, 14.3f, 4.22f, 14.3f)
                curveTo(5.56f, 14.3f, 6.73f, 14.72f, 7.73f, 15.56f)
                lineTo(4.59f, 18.7f)
                curveTo(3.53f, 17.5f, 2.78f, 16.13f, 2.34f, 14.63f)
                moveTo(15.56f, 9.8f)
                curveTo(17.53f, 11.27f, 19.66f, 11.63f, 21.94f, 10.88f)
                curveTo(21.97f, 11.09f, 22.0f, 11.47f, 22.0f, 12.0f)
                curveTo(22.0f, 13.03f, 21.75f, 14.18f, 21.28f, 15.45f)
                curveTo(20.81f, 16.71f, 20.23f, 17.73f, 19.55f, 18.5f)
                lineTo(13.22f, 12.19f)
                lineTo(15.56f, 9.8f)
                moveTo(8.77f, 16.64f)
                curveTo(9.83f, 18.17f, 10.05f, 19.84f, 9.42f, 21.66f)
                curveTo(8.0f, 21.25f, 6.73f, 20.61f, 5.67f, 19.73f)
                lineTo(8.77f, 16.64f)
                moveTo(12.19f, 13.22f)
                lineTo(18.5f, 19.55f)
                curveTo(16.33f, 21.45f, 13.78f, 22.25f, 10.88f, 21.94f)
                curveTo(11.09f, 21.28f, 11.2f, 20.56f, 11.2f, 19.78f)
                curveTo(11.2f, 19.16f, 11.06f, 18.43f, 10.78f, 17.6f)
                curveTo(10.5f, 16.77f, 10.17f, 16.09f, 9.8f, 15.56f)
                lineTo(12.19f, 13.22f)
                moveTo(8.81f, 14.5f)
                curveTo(7.88f, 13.67f, 6.8f, 13.15f, 5.58f, 12.91f)
                curveTo(4.36f, 12.68f, 3.19f, 12.75f, 2.06f, 13.13f)
                curveTo(2.03f, 12.91f, 2.0f, 12.53f, 2.0f, 12.0f)
                curveTo(2.0f, 10.97f, 2.25f, 9.82f, 2.72f, 8.55f)
                curveTo(3.19f, 7.29f, 3.77f, 6.27f, 4.45f, 5.5f)
                lineTo(11.11f, 12.19f)
                lineTo(8.81f, 14.5f)
                moveTo(15.56f, 7.73f)
                curveTo(14.22f, 6.08f, 13.91f, 4.28f, 14.63f, 2.34f)
                curveTo(15.25f, 2.5f, 15.96f, 2.8f, 16.76f, 3.26f)
                curveTo(17.55f, 3.71f, 18.2f, 4.16f, 18.7f, 4.59f)
                lineTo(15.56f, 7.73f)
                moveTo(21.66f, 9.38f)
                curveTo(21.06f, 9.59f, 20.44f, 9.7f, 19.78f, 9.7f)
                curveTo(18.69f, 9.7f, 17.64f, 9.38f, 16.64f, 8.72f)
                lineTo(19.73f, 5.67f)
                curveTo(20.61f, 6.77f, 21.25f, 8.0f, 21.66f, 9.38f)
                moveTo(12.19f, 11.11f)
                lineTo(5.5f, 4.45f)
                curveTo(7.67f, 2.55f, 10.22f, 1.75f, 13.13f, 2.06f)
                curveTo(12.91f, 2.72f, 12.8f, 3.44f, 12.8f, 4.22f)
                curveTo(12.8f, 4.94f, 12.96f, 5.75f, 13.29f, 6.66f)
                curveTo(13.62f, 7.56f, 14.0f, 8.28f, 14.5f, 8.81f)
                lineTo(12.19f, 11.11f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
