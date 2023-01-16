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

public val MaterialDesignIcons.Stomach: ImageVector
    get() {
        if (_stomach != null) {
            return _stomach!!
        }
        _stomach = Builder(name = "Stomach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                curveTo(4.67f, 19.85f, 6.07f, 22.0f, 12.0f, 22.0f)
                curveTo(14.36f, 22.0f, 17.07f, 21.93f, 19.0f, 20.0f)
                curveTo(20.0f, 19.0f, 22.0f, 17.0f, 22.0f, 11.0f)
                reflectiveCurveTo(20.0f, 4.0f, 18.0f, 4.0f)
                curveTo(16.62f, 4.0f, 15.0f, 4.0f, 14.0f, 6.0f)
                verticalLineTo(6.03f)
                arcTo(1.82f, 1.82f, 0.0f, false, true, 12.13f, 6.95f)
                curveTo(11.0f, 6.81f, 11.0f, 6.37f, 11.0f, 6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                arcTo(2.92f, 2.92f, 0.0f, false, false, 12.0f, 9.0f)
                curveTo(13.0f, 9.0f, 13.0f, 10.78f, 13.0f, 12.0f)
                curveTo(13.0f, 13.89f, 12.5f, 15.26f, 11.0f, 16.0f)
                curveTo(8.69f, 17.15f, 6.39f, 17.0f, 5.61f, 15.47f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.14f, 14.87f)
                arcTo(3.67f, 3.67f, 0.0f, false, false, 2.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _stomach!!
    }

private var _stomach: ImageVector? = null
