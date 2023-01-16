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

public val MaterialDesignIcons.Qi: ImageVector
    get() {
        if (_qi != null) {
            return _qi!!
        }
        _qi = Builder(name = "Qi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.09f, 6.56f)
                verticalLineTo(14.64f)
                curveTo(12.09f, 14.72f, 12.0f, 14.79f, 11.94f, 14.79f)
                curveTo(9.62f, 14.79f, 7.75f, 12.91f, 7.75f, 10.6f)
                curveTo(7.75f, 8.28f, 9.62f, 6.4f, 11.94f, 6.4f)
                curveTo(12.0f, 6.4f, 12.09f, 6.47f, 12.09f, 6.56f)
                moveTo(12.09f, 17.86f)
                verticalLineTo(20.29f)
                curveTo(12.06f, 21.69f, 13.12f, 22.87f, 14.5f, 23.0f)
                curveTo(14.66f, 23.0f, 14.78f, 22.89f, 14.79f, 22.73f)
                verticalLineTo(4.47f)
                curveTo(14.78f, 4.3f, 14.68f, 4.15f, 14.5f, 4.09f)
                curveTo(10.92f, 2.67f, 6.86f, 4.44f, 5.44f, 8.03f)
                curveTo(4.0f, 11.63f, 5.79f, 15.69f, 9.38f, 17.11f)
                curveTo(10.16f, 17.42f, 11.0f, 17.58f, 11.81f, 17.6f)
                curveTo(11.95f, 17.59f, 12.07f, 17.71f, 12.08f, 17.87f)
                moveTo(16.19f, 5.5f)
                verticalLineTo(15.72f)
                curveTo(16.19f, 16.0f, 16.19f, 16.2f, 16.46f, 16.0f)
                verticalLineTo(16.0f)
                curveTo(19.42f, 13.5f, 19.81f, 9.09f, 17.33f, 6.13f)
                curveTo(17.07f, 5.81f, 16.77f, 5.5f, 16.46f, 5.26f)
                curveTo(16.19f, 5.05f, 16.19f, 5.26f, 16.19f, 5.53f)
                moveTo(14.79f, 2.43f)
                curveTo(14.79f, 1.66f, 15.42f, 1.03f, 16.19f, 1.03f)
                curveTo(16.96f, 1.03f, 17.59f, 1.66f, 17.59f, 2.43f)
                curveTo(17.59f, 3.2f, 16.96f, 3.83f, 16.19f, 3.83f)
                verticalLineTo(3.83f)
                curveTo(15.42f, 3.83f, 14.79f, 3.2f, 14.79f, 2.43f)
            }
        }
        .build()
        return _qi!!
    }

private var _qi: ImageVector? = null
