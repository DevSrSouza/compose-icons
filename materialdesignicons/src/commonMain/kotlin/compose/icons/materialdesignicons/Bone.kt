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

public val MaterialDesignIcons.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 14.0f)
                curveTo(2.0f, 13.23f, 2.29f, 12.53f, 2.76f, 12.0f)
                curveTo(2.29f, 11.47f, 2.0f, 10.77f, 2.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 10.0f)
                curveTo(9.33f, 10.08f, 10.67f, 10.17f, 12.0f, 10.17f)
                curveTo(13.33f, 10.17f, 14.67f, 10.08f, 16.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 10.0f)
                curveTo(22.0f, 10.77f, 21.71f, 11.47f, 21.24f, 12.0f)
                curveTo(21.71f, 12.53f, 22.0f, 13.23f, 22.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 14.0f)
                curveTo(14.67f, 13.92f, 13.33f, 13.83f, 12.0f, 13.83f)
                curveTo(10.67f, 13.83f, 9.33f, 13.92f, 8.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
