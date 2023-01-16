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

public val MaterialDesignIcons.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 7.0f)
                curveTo(16.0f, 7.73f, 15.81f, 8.41f, 15.46f, 9.0f)
                horizontalLineTo(18.0f)
                curveTo(18.95f, 9.0f, 19.75f, 9.67f, 19.95f, 10.56f)
                curveTo(21.96f, 18.57f, 22.0f, 18.78f, 22.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 19.0f)
                curveTo(2.0f, 18.78f, 2.04f, 18.57f, 4.05f, 10.56f)
                curveTo(4.25f, 9.67f, 5.05f, 9.0f, 6.0f, 9.0f)
                horizontalLineTo(8.54f)
                curveTo(8.19f, 8.41f, 8.0f, 7.73f, 8.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 3.0f)
                moveTo(12.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
