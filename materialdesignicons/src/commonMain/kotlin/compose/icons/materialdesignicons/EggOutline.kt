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

public val MaterialDesignIcons.EggOutline: ImageVector
    get() {
        if (_eggOutline != null) {
            return _eggOutline!!
        }
        _eggOutline = Builder(name = "EggOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(14.32f, 4.0f, 17.5f, 10.7f, 17.5f, 14.5f)
                curveTo(17.5f, 17.53f, 15.03f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(6.5f, 17.53f, 6.5f, 14.5f)
                curveTo(6.5f, 10.7f, 9.68f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(7.86f, 2.0f, 4.5f, 10.36f, 4.5f, 14.5f)
                curveTo(4.5f, 18.64f, 7.86f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(19.5f, 18.64f, 19.5f, 14.5f)
                curveTo(19.5f, 10.36f, 16.14f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _eggOutline!!
    }

private var _eggOutline: ImageVector? = null
