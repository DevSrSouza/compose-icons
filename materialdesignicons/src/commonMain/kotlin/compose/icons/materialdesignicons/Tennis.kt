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

public val MaterialDesignIcons.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 23.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 15.0f)
                moveTo(18.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 17.0f)
                moveTo(6.05f, 14.54f)
                curveTo(6.05f, 14.54f, 7.46f, 13.12f, 7.47f, 10.3f)
                curveTo(7.11f, 8.11f, 7.97f, 5.54f, 9.94f, 3.58f)
                curveTo(12.87f, 0.65f, 17.14f, 0.17f, 19.5f, 2.5f)
                curveTo(21.83f, 4.86f, 21.35f, 9.13f, 18.42f, 12.06f)
                curveTo(16.46f, 14.03f, 13.89f, 14.89f, 11.7f, 14.53f)
                curveTo(8.88f, 14.54f, 7.46f, 15.95f, 7.46f, 15.95f)
                lineTo(3.22f, 20.19f)
                lineTo(1.81f, 18.78f)
                lineTo(6.05f, 14.54f)
                moveTo(18.07f, 3.93f)
                curveTo(16.5f, 2.37f, 13.5f, 2.84f, 11.35f, 5.0f)
                curveTo(9.21f, 7.14f, 8.73f, 10.15f, 10.29f, 11.71f)
                curveTo(11.86f, 13.27f, 14.86f, 12.79f, 17.0f, 10.65f)
                curveTo(19.16f, 8.5f, 19.63f, 5.5f, 18.07f, 3.93f)
                close()
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
