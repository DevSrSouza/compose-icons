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

public val MaterialDesignIcons.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.79f, 11.5f)
                horizontalLineTo(9.72f)
                verticalLineTo(8.19f)
                horizontalLineTo(12.19f)
                curveTo(13.45f, 8.19f, 14.15f, 8.75f, 14.15f, 9.78f)
                curveTo(14.15f, 10.9f, 13.32f, 11.5f, 11.79f, 11.5f)
                moveTo(12.16f, 12.63f)
                horizontalLineTo(9.72f)
                verticalLineTo(16.27f)
                lineTo(12.28f, 16.27f)
                curveTo(13.84f, 16.27f, 14.66f, 15.64f, 14.66f, 14.44f)
                reflectiveCurveTo(13.81f, 12.63f, 12.16f, 12.63f)
                moveTo(22.0f, 5.31f)
                verticalLineTo(18.69f)
                curveTo(22.0f, 20.5f, 20.5f, 22.0f, 18.69f, 22.0f)
                horizontalLineTo(5.31f)
                curveTo(3.5f, 22.0f, 2.0f, 20.5f, 2.0f, 18.69f)
                verticalLineTo(5.31f)
                curveTo(2.0f, 3.5f, 3.5f, 2.0f, 5.31f, 2.0f)
                horizontalLineTo(18.69f)
                curveTo(20.5f, 2.0f, 22.0f, 3.5f, 22.0f, 5.31f)
                moveTo(16.0f, 14.5f)
                curveTo(16.0f, 13.12f, 15.08f, 12.13f, 13.67f, 11.95f)
                verticalLineTo(11.89f)
                curveTo(14.67f, 11.71f, 15.46f, 10.71f, 15.46f, 9.63f)
                curveTo(15.46f, 8.08f, 14.26f, 7.05f, 12.5f, 7.05f)
                horizontalLineTo(8.43f)
                verticalLineTo(17.41f)
                horizontalLineTo(12.47f)
                curveTo(14.68f, 17.41f, 16.0f, 16.32f, 16.0f, 14.5f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
