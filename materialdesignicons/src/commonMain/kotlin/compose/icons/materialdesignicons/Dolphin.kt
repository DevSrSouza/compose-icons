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

public val MaterialDesignIcons.Dolphin: ImageVector
    get() {
        if (_dolphin != null) {
            return _dolphin!!
        }
        _dolphin = Builder(name = "Dolphin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                curveTo(20.0f, 7.0f, 20.0f, 3.0f, 15.0f, 3.0f)
                curveTo(13.47f, 3.0f, 12.15f, 3.19f, 11.0f, 3.5f)
                curveTo(10.5f, 3.06f, 7.26f, 0.309f, 4.0f, 3.57f)
                lineTo(6.56f, 6.13f)
                curveTo(2.5f, 10.53f, 4.0f, 18.0f, 4.0f, 18.0f)
                reflectiveCurveTo(1.0f, 18.0f, 1.0f, 22.0f)
                curveTo(1.0f, 22.0f, 5.0f, 21.0f, 5.0f, 21.0f)
                curveTo(5.0f, 21.0f, 9.0f, 22.0f, 9.0f, 22.0f)
                curveTo(9.0f, 18.0f, 6.0f, 18.0f, 6.0f, 18.0f)
                reflectiveCurveTo(6.85f, 12.24f, 13.0f, 11.18f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 14.0f, 15.68f, 12.19f, 15.89f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(22.0f, 11.0f, 23.0f, 10.0f, 23.0f, 9.0f)
                reflectiveCurveTo(21.0f, 7.0f, 20.0f, 7.0f)
                moveTo(18.0f, 8.0f)
                curveTo(17.45f, 8.0f, 17.0f, 7.55f, 17.0f, 7.0f)
                reflectiveCurveTo(17.45f, 6.0f, 18.0f, 6.0f)
                reflectiveCurveTo(19.0f, 6.45f, 19.0f, 7.0f)
                reflectiveCurveTo(18.55f, 8.0f, 18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _dolphin!!
    }

private var _dolphin: ImageVector? = null
