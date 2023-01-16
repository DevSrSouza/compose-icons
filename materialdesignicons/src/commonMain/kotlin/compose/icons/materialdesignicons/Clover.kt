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

public val MaterialDesignIcons.Clover: ImageVector
    get() {
        if (_clover != null) {
            return _clover!!
        }
        _clover = Builder(name = "Clover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.18f)
                curveTo(15.3f, 8.18f, 17.0f, 6.64f, 17.0f, 4.69f)
                curveTo(17.0f, 3.19f, 15.75f, 2.0f, 14.25f, 2.0f)
                curveTo(13.39f, 2.0f, 12.57f, 2.36f, 12.0f, 3.0f)
                curveTo(11.43f, 2.36f, 10.61f, 2.0f, 9.69f, 2.0f)
                curveTo(8.19f, 2.0f, 7.0f, 3.25f, 7.0f, 4.75f)
                curveTo(7.0f, 6.64f, 8.7f, 8.18f, 12.0f, 11.18f)
                moveTo(11.18f, 12.0f)
                curveTo(8.18f, 8.7f, 6.64f, 7.0f, 4.69f, 7.0f)
                curveTo(3.19f, 7.0f, 2.0f, 8.25f, 2.0f, 9.75f)
                curveTo(2.0f, 10.61f, 2.36f, 11.43f, 3.0f, 12.0f)
                curveTo(2.36f, 12.57f, 2.0f, 13.39f, 2.0f, 14.31f)
                curveTo(2.0f, 15.81f, 3.25f, 17.0f, 4.75f, 17.0f)
                curveTo(6.64f, 17.0f, 8.18f, 15.3f, 11.18f, 12.0f)
                moveTo(12.83f, 12.0f)
                curveTo(15.82f, 15.3f, 17.36f, 17.0f, 19.31f, 17.0f)
                curveTo(20.81f, 17.0f, 22.0f, 15.75f, 22.0f, 14.25f)
                curveTo(22.0f, 13.39f, 21.64f, 12.57f, 21.0f, 12.0f)
                curveTo(21.64f, 11.43f, 22.0f, 10.61f, 22.0f, 9.69f)
                curveTo(22.0f, 8.19f, 20.75f, 7.0f, 19.25f, 7.0f)
                curveTo(17.36f, 7.0f, 15.82f, 8.7f, 12.83f, 12.0f)
                moveTo(12.0f, 12.82f)
                curveTo(8.7f, 15.82f, 7.0f, 17.36f, 7.0f, 19.31f)
                curveTo(7.0f, 20.81f, 8.25f, 22.0f, 9.75f, 22.0f)
                curveTo(10.61f, 22.0f, 11.43f, 21.64f, 12.0f, 21.0f)
                curveTo(12.57f, 21.64f, 13.39f, 22.0f, 14.31f, 22.0f)
                curveTo(15.81f, 22.0f, 17.0f, 20.75f, 17.0f, 19.25f)
                curveTo(17.0f, 17.36f, 15.3f, 15.82f, 12.0f, 12.82f)
                close()
            }
        }
        .build()
        return _clover!!
    }

private var _clover: ImageVector? = null
