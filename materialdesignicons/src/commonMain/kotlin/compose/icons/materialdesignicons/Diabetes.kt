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

public val MaterialDesignIcons.Diabetes: ImageVector
    get() {
        if (_diabetes != null) {
            return _diabetes!!
        }
        _diabetes = Builder(name = "Diabetes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.73f, 2.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.14f, 3.7f)
                lineTo(13.0f, 6.79f)
                lineTo(13.76f, 7.74f)
                lineTo(15.7f, 12.74f)
                arcTo(1.46f, 1.46f, 0.0f, false, true, 15.36f, 14.29f)
                lineTo(12.27f, 17.38f)
                arcTo(1.55f, 1.55f, 0.0f, false, true, 10.15f, 17.38f)
                lineTo(5.55f, 12.78f)
                arcTo(1.37f, 1.37f, 0.0f, false, true, 5.15f, 11.78f)
                lineTo(4.65f, 5.34f)
                horizontalLineTo(5.72f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.47f, 5.64f)
                lineTo(6.61f, 5.81f)
                lineTo(7.66f, 9.29f)
                moveTo(7.66f, 22.0f)
                lineTo(2.0f, 16.36f)
                lineTo(4.12f, 14.24f)
                lineTo(9.78f, 19.9f)
                moveTo(19.5f, 4.5f)
                reflectiveCurveTo(17.0f, 7.26f, 17.0f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 22.0f, 9.0f)
                curveTo(22.0f, 7.26f, 19.5f, 4.5f, 19.5f, 4.5f)
                close()
            }
        }
        .build()
        return _diabetes!!
    }

private var _diabetes: ImageVector? = null
