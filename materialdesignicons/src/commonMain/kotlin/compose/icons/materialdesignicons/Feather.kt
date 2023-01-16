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

public val MaterialDesignIcons.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                curveTo(22.0f, 2.0f, 14.36f, 1.63f, 8.34f, 9.88f)
                curveTo(3.72f, 16.21f, 2.0f, 22.0f, 2.0f, 22.0f)
                lineTo(3.94f, 21.0f)
                curveTo(5.38f, 18.5f, 6.13f, 17.47f, 7.54f, 16.0f)
                curveTo(10.07f, 16.74f, 12.71f, 16.65f, 15.0f, 14.0f)
                curveTo(13.0f, 13.44f, 11.4f, 13.57f, 9.04f, 13.81f)
                curveTo(11.69f, 12.0f, 13.5f, 11.6f, 16.0f, 12.0f)
                lineTo(17.0f, 10.0f)
                curveTo(15.2f, 9.66f, 14.0f, 9.63f, 12.22f, 10.04f)
                curveTo(14.19f, 8.65f, 15.56f, 7.87f, 18.0f, 8.0f)
                lineTo(19.21f, 6.07f)
                curveTo(17.65f, 5.96f, 16.71f, 6.13f, 14.92f, 6.57f)
                curveTo(16.53f, 5.11f, 18.0f, 4.45f, 20.14f, 4.32f)
                curveTo(20.14f, 4.32f, 21.19f, 2.43f, 22.0f, 2.0f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
