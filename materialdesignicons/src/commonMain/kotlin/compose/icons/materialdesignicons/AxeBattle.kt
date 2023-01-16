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

public val MaterialDesignIcons.AxeBattle: ImageVector
    get() {
        if (_axeBattle != null) {
            return _axeBattle!!
        }
        _axeBattle = Builder(name = "AxeBattle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.47f, 12.43f)
                curveTo(19.35f, 14.55f, 15.82f, 13.84f, 15.82f, 13.84f)
                verticalLineTo(9.6f)
                lineTo(3.41f, 22.0f)
                lineTo(2.0f, 20.59f)
                lineTo(14.4f, 8.18f)
                horizontalLineTo(10.16f)
                curveTo(10.16f, 8.18f, 9.45f, 4.65f, 11.57f, 2.53f)
                curveTo(13.69f, 0.406f, 17.23f, 1.11f, 17.23f, 1.11f)
                verticalLineTo(5.36f)
                lineTo(17.94f, 4.65f)
                lineTo(19.35f, 6.06f)
                lineTo(18.64f, 6.77f)
                horizontalLineTo(22.89f)
                curveTo(22.89f, 6.77f, 23.59f, 10.31f, 21.47f, 12.43f)
                close()
            }
        }
        .build()
        return _axeBattle!!
    }

private var _axeBattle: ImageVector? = null
