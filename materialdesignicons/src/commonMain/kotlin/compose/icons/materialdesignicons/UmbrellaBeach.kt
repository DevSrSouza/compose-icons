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

public val MaterialDesignIcons.UmbrellaBeach: ImageVector
    get() {
        if (_umbrellaBeach != null) {
            return _umbrellaBeach!!
        }
        _umbrellaBeach = Builder(name = "UmbrellaBeach", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.13f, 14.56f)
                lineTo(14.56f, 13.13f)
                lineTo(21.0f, 19.57f)
                lineTo(19.57f, 21.0f)
                lineTo(13.13f, 14.56f)
                moveTo(17.42f, 8.83f)
                lineTo(20.28f, 5.97f)
                curveTo(16.33f, 2.0f, 9.93f, 2.0f, 6.0f, 5.95f)
                curveTo(9.91f, 4.65f, 14.29f, 5.7f, 17.42f, 8.83f)
                moveTo(5.95f, 6.0f)
                curveTo(2.0f, 9.93f, 2.0f, 16.33f, 5.97f, 20.28f)
                lineTo(8.83f, 17.42f)
                curveTo(5.7f, 14.29f, 4.65f, 9.91f, 5.95f, 6.0f)
                moveTo(5.97f, 5.96f)
                lineTo(5.96f, 5.97f)
                curveTo(5.58f, 9.0f, 7.13f, 12.85f, 10.26f, 16.0f)
                lineTo(16.0f, 10.26f)
                curveTo(12.86f, 7.13f, 9.0f, 5.58f, 5.97f, 5.96f)
                close()
            }
        }
        .build()
        return _umbrellaBeach!!
    }

private var _umbrellaBeach: ImageVector? = null
