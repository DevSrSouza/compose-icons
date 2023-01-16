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

public val MaterialDesignIcons.Vimeo: ImageVector
    get() {
        if (_vimeo != null) {
            return _vimeo!!
        }
        _vimeo = Builder(name = "Vimeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.42f)
                curveTo(21.91f, 9.37f, 20.55f, 12.04f, 17.92f, 15.44f)
                curveTo(15.2f, 19.0f, 12.9f, 20.75f, 11.0f, 20.75f)
                curveTo(9.85f, 20.75f, 8.86f, 19.67f, 8.05f, 17.5f)
                curveTo(7.5f, 15.54f, 7.0f, 13.56f, 6.44f, 11.58f)
                curveTo(5.84f, 9.42f, 5.2f, 8.34f, 4.5f, 8.34f)
                curveTo(4.36f, 8.34f, 3.84f, 8.66f, 2.94f, 9.29f)
                lineTo(2.0f, 8.07f)
                curveTo(3.0f, 7.2f, 3.96f, 6.33f, 4.92f, 5.46f)
                curveTo(6.24f, 4.32f, 7.23f, 3.72f, 7.88f, 3.66f)
                curveTo(9.44f, 3.5f, 10.4f, 4.58f, 10.76f, 6.86f)
                curveTo(11.15f, 9.33f, 11.42f, 10.86f, 11.57f, 11.46f)
                curveTo(12.0f, 13.5f, 12.5f, 14.5f, 13.05f, 14.5f)
                curveTo(13.47f, 14.5f, 14.1f, 13.86f, 14.94f, 12.53f)
                curveTo(15.78f, 11.21f, 16.23f, 10.2f, 16.29f, 9.5f)
                curveTo(16.41f, 8.36f, 15.96f, 7.79f, 14.94f, 7.79f)
                curveTo(14.46f, 7.79f, 13.97f, 7.9f, 13.46f, 8.12f)
                curveTo(14.44f, 4.89f, 16.32f, 3.32f, 19.09f, 3.41f)
                curveTo(21.15f, 3.47f, 22.12f, 4.81f, 22.0f, 7.42f)
                close()
            }
        }
        .build()
        return _vimeo!!
    }

private var _vimeo: ImageVector? = null
