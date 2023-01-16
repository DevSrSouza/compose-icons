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

public val MaterialDesignIcons.Lipstick: ImageVector
    get() {
        if (_lipstick != null) {
            return _lipstick!!
        }
        _lipstick = Builder(name = "Lipstick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 23.0f)
                curveTo(8.45f, 23.0f, 8.0f, 22.55f, 8.0f, 22.0f)
                verticalLineTo(13.0f)
                curveTo(8.0f, 12.45f, 8.45f, 12.0f, 9.0f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(15.55f, 12.0f, 16.0f, 12.45f, 16.0f, 13.0f)
                verticalLineTo(22.0f)
                curveTo(16.0f, 22.55f, 15.55f, 23.0f, 15.0f, 23.0f)
                horizontalLineTo(9.0f)
                moveTo(10.0f, 11.0f)
                curveTo(9.45f, 11.0f, 9.0f, 10.55f, 9.0f, 10.0f)
                verticalLineTo(5.25f)
                curveTo(9.0f, 5.25f, 11.0f, 3.0f, 11.75f, 1.0f)
                curveTo(12.83f, 1.67f, 13.92f, 2.33f, 14.46f, 3.83f)
                curveTo(15.0f, 5.33f, 15.0f, 7.67f, 15.0f, 10.0f)
                curveTo(15.0f, 10.55f, 14.55f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _lipstick!!
    }

private var _lipstick: ImageVector? = null
