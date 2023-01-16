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

public val MaterialDesignIcons.Handball: ImageVector
    get() {
        if (_handball != null) {
            return _handball!!
        }
        _handball = Builder(name = "Handball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.83f, 10.43f)
                arcTo(6.93f, 6.93f, 0.0f, false, true, 18.39f, 14.86f)
                arcTo(6.64f, 6.64f, 0.0f, false, true, 17.5f, 19.5f)
                lineTo(15.78f, 18.5f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.44f, 16.0f)
                arcTo(5.22f, 5.22f, 0.0f, false, false, 15.46f, 13.06f)
                lineTo(9.18f, 23.93f)
                lineTo(7.44f, 22.95f)
                lineTo(10.44f, 17.75f)
                lineTo(8.71f, 16.76f)
                lineTo(7.21f, 19.34f)
                lineTo(5.5f, 18.36f)
                lineTo(10.63f, 9.45f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.8f, 5.46f)
                arcTo(6.91f, 6.91f, 0.0f, false, true, 9.69f, 1.1f)
                lineTo(11.43f, 2.13f)
                arcTo(4.84f, 4.84f, 0.0f, false, false, 10.91f, 5.9f)
                arcTo(4.74f, 4.74f, 0.0f, false, false, 13.21f, 8.93f)
                moveTo(16.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 18.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 5.0f)
                moveTo(13.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 15.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 1.0f)
                close()
            }
        }
        .build()
        return _handball!!
    }

private var _handball: ImageVector? = null
