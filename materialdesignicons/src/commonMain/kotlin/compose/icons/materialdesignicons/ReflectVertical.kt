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

public val MaterialDesignIcons.ReflectVertical: ImageVector
    get() {
        if (_reflectVertical != null) {
            return _reflectVertical!!
        }
        _reflectVertical = Builder(name = "ReflectVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 23.0f)
                horizontalLineTo(6.0f)
                curveTo(5.61f, 23.0f, 5.26f, 22.79f, 5.09f, 22.45f)
                curveTo(4.92f, 22.11f, 4.96f, 21.7f, 5.19f, 21.4f)
                lineTo(11.2f, 13.38f)
                curveTo(11.58f, 12.87f, 12.42f, 12.87f, 12.8f, 13.38f)
                lineTo(18.81f, 21.4f)
                curveTo(19.04f, 21.7f, 19.08f, 22.11f, 18.91f, 22.45f)
                curveTo(18.74f, 22.79f, 18.39f, 23.0f, 18.0f, 23.0f)
                moveTo(18.0f, 1.0f)
                curveTo(18.39f, 1.0f, 18.74f, 1.21f, 18.91f, 1.55f)
                curveTo(19.08f, 1.89f, 19.04f, 2.3f, 18.81f, 2.6f)
                lineTo(12.8f, 10.62f)
                curveTo(12.42f, 11.13f, 11.58f, 11.13f, 11.2f, 10.62f)
                lineTo(5.19f, 2.6f)
                curveTo(4.96f, 2.3f, 4.92f, 1.89f, 5.09f, 1.55f)
                curveTo(5.26f, 1.21f, 5.61f, 1.0f, 6.0f, 1.0f)
                horizontalLineTo(18.0f)
                moveTo(8.0f, 3.0f)
                lineTo(12.0f, 8.35f)
                lineTo(16.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _reflectVertical!!
    }

private var _reflectVertical: ImageVector? = null
