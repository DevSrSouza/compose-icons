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

public val MaterialDesignIcons.BottleWine: ImageVector
    get() {
        if (_bottleWine != null) {
            return _bottleWine!!
        }
        _bottleWine = Builder(name = "BottleWine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 9.0f, 10.0f, 7.25f, 11.0f, 7.0f)
                verticalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 2.0f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 2.5f)
                verticalLineTo(7.0f)
                curveTo(14.0f, 7.25f, 15.0f, 9.0f, 15.0f, 11.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _bottleWine!!
    }

private var _bottleWine: ImageVector? = null
