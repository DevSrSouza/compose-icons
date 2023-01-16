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

public val MaterialDesignIcons.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8f, 2.0f)
                horizontalLineTo(16.2f)
                curveTo(19.4f, 2.0f, 22.0f, 4.6f, 22.0f, 7.8f)
                verticalLineTo(16.2f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 16.2f, 22.0f)
                horizontalLineTo(7.8f)
                curveTo(4.6f, 22.0f, 2.0f, 19.4f, 2.0f, 16.2f)
                verticalLineTo(7.8f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 7.8f, 2.0f)
                moveTo(7.6f, 4.0f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 4.0f, 7.6f)
                verticalLineTo(16.4f)
                curveTo(4.0f, 18.39f, 5.61f, 20.0f, 7.6f, 20.0f)
                horizontalLineTo(16.4f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 20.0f, 16.4f)
                verticalLineTo(7.6f)
                curveTo(20.0f, 5.61f, 18.39f, 4.0f, 16.4f, 4.0f)
                horizontalLineTo(7.6f)
                moveTo(17.25f, 5.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 18.5f, 6.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 17.25f, 8.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 16.0f, 6.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 17.25f, 5.5f)
                moveTo(12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 7.0f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
