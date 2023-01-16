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

public val MaterialDesignIcons.ReflectHorizontal: ImageVector
    get() {
        if (_reflectHorizontal != null) {
            return _reflectHorizontal!!
        }
        _reflectHorizontal = Builder(name = "ReflectHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 19.0f)
                verticalLineTo(4.97f)
                curveTo(13.0f, 4.5f, 13.31f, 4.12f, 13.74f, 4.0f)
                curveTo(14.19f, 3.88f, 14.65f, 4.08f, 14.87f, 4.47f)
                lineTo(22.89f, 18.5f)
                curveTo(23.07f, 18.81f, 23.07f, 19.19f, 22.89f, 19.5f)
                curveTo(22.71f, 19.81f, 22.38f, 20.0f, 22.0f, 20.0f)
                moveTo(2.0f, 20.0f)
                curveTo(1.62f, 20.0f, 1.29f, 19.81f, 1.11f, 19.5f)
                curveTo(0.93f, 19.19f, 0.93f, 18.81f, 1.11f, 18.5f)
                lineTo(9.13f, 4.47f)
                curveTo(9.35f, 4.08f, 9.81f, 3.88f, 10.26f, 4.0f)
                curveTo(10.69f, 4.12f, 11.0f, 4.5f, 11.0f, 4.97f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 20.0f)
                horizontalLineTo(2.0f)
                moveTo(9.0f, 18.0f)
                verticalLineTo(8.74f)
                lineTo(3.71f, 18.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _reflectHorizontal!!
    }

private var _reflectHorizontal: ImageVector? = null
