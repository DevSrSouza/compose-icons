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

public val MaterialDesignIcons.Update: ImageVector
    get() {
        if (_update != null) {
            return _update!!
        }
        _update = Builder(name = "Update", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.12f)
                horizontalLineTo(14.22f)
                lineTo(16.96f, 7.3f)
                curveTo(14.23f, 4.6f, 9.81f, 4.5f, 7.08f, 7.2f)
                curveTo(4.35f, 9.91f, 4.35f, 14.28f, 7.08f, 17.0f)
                curveTo(9.81f, 19.7f, 14.23f, 19.7f, 16.96f, 17.0f)
                curveTo(18.32f, 15.65f, 19.0f, 14.08f, 19.0f, 12.1f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 14.08f, 20.12f, 16.65f, 18.36f, 18.39f)
                curveTo(14.85f, 21.87f, 9.15f, 21.87f, 5.64f, 18.39f)
                curveTo(2.14f, 14.92f, 2.11f, 9.28f, 5.62f, 5.81f)
                curveTo(9.13f, 2.34f, 14.76f, 2.34f, 18.27f, 5.81f)
                lineTo(21.0f, 3.0f)
                verticalLineTo(10.12f)
                moveTo(12.5f, 8.0f)
                verticalLineTo(12.25f)
                lineTo(16.0f, 14.33f)
                lineTo(15.28f, 15.54f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _update!!
    }

private var _update: ImageVector? = null
