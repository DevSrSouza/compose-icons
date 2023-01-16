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

public val MaterialDesignIcons.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.22f, 16.22f)
                curveTo(18.25f, 14.19f, 19.33f, 11.5f, 19.45f, 8.2f)
                curveTo(18.36f, 10.61f, 16.81f, 12.81f, 14.81f, 14.81f)
                curveTo(12.81f, 16.81f, 10.61f, 18.36f, 8.2f, 19.45f)
                curveTo(11.5f, 19.36f, 14.16f, 18.28f, 16.22f, 16.22f)
                moveTo(7.78f, 7.78f)
                curveTo(5.75f, 9.81f, 4.67f, 12.5f, 4.55f, 15.8f)
                curveTo(5.0f, 14.8f, 5.7f, 13.65f, 6.61f, 12.35f)
                curveTo(7.5f, 11.05f, 8.38f, 10.0f, 9.19f, 9.19f)
                curveTo(11.19f, 7.19f, 13.39f, 5.64f, 15.8f, 4.55f)
                curveTo(12.5f, 4.64f, 9.84f, 5.72f, 7.78f, 7.78f)
                moveTo(20.5f, 3.5f)
                curveTo(21.0f, 4.05f, 21.34f, 5.11f, 21.47f, 6.7f)
                curveTo(21.59f, 8.3f, 21.35f, 10.16f, 20.74f, 12.3f)
                curveTo(20.13f, 14.45f, 19.11f, 16.23f, 17.67f, 17.67f)
                curveTo(16.36f, 19.0f, 14.8f, 19.95f, 13.0f, 20.55f)
                curveTo(11.21f, 21.16f, 9.44f, 21.47f, 7.69f, 21.47f)
                curveTo(5.56f, 21.47f, 4.17f, 21.14f, 3.5f, 20.5f)
                curveTo(3.0f, 19.95f, 2.66f, 18.89f, 2.53f, 17.3f)
                curveTo(2.41f, 15.7f, 2.65f, 13.84f, 3.26f, 11.7f)
                curveTo(3.87f, 9.55f, 4.89f, 7.77f, 6.33f, 6.33f)
                curveTo(7.64f, 5.0f, 9.2f, 4.05f, 11.0f, 3.45f)
                curveTo(12.79f, 2.84f, 14.56f, 2.53f, 16.31f, 2.53f)
                curveTo(18.44f, 2.53f, 19.83f, 2.86f, 20.5f, 3.5f)
                close()
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
