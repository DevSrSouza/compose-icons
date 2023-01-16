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

public val MaterialDesignIcons.Grass: ImageVector
    get() {
        if (_grass != null) {
            return _grass!!
        }
        _grass = Builder(name = "Grass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.75f)
                curveTo(7.0f, 15.19f, 4.81f, 13.0f, 2.0f, 12.26f)
                curveTo(2.64f, 12.1f, 3.31f, 12.0f, 4.0f, 12.0f)
                curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f)
                moveTo(22.0f, 12.26f)
                curveTo(21.36f, 12.1f, 20.69f, 12.0f, 20.0f, 12.0f)
                curveTo(17.07f, 12.0f, 14.5f, 13.58f, 13.12f, 15.93f)
                curveTo(13.41f, 16.59f, 13.65f, 17.28f, 13.79f, 18.0f)
                curveTo(13.92f, 18.65f, 14.0f, 19.32f, 14.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.24f)
                curveTo(17.0f, 15.19f, 19.19f, 13.0f, 22.0f, 12.26f)
                moveTo(15.64f, 11.0f)
                curveTo(16.42f, 8.93f, 17.87f, 7.18f, 19.73f, 6.0f)
                curveTo(15.44f, 6.16f, 12.0f, 9.67f, 12.0f, 14.0f)
                verticalLineTo(14.0f)
                curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.0f)
                moveTo(11.42f, 8.85f)
                curveTo(10.58f, 6.66f, 8.88f, 4.89f, 6.7f, 4.0f)
                curveTo(8.14f, 5.86f, 9.0f, 8.18f, 9.0f, 10.71f)
                curveTo(9.0f, 10.92f, 8.97f, 11.12f, 8.96f, 11.32f)
                curveTo(9.39f, 11.56f, 9.79f, 11.84f, 10.18f, 12.14f)
                curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f)
                close()
            }
        }
        .build()
        return _grass!!
    }

private var _grass: ImageVector? = null
