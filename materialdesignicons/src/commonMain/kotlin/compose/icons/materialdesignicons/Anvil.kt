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

public val MaterialDesignIcons.Anvil: ImageVector
    get() {
        if (_anvil != null) {
            return _anvil!!
        }
        _anvil = Builder(name = "Anvil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                verticalLineTo(10.0f)
                curveTo(13.03f, 12.47f, 8.44f, 14.97f, 6.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                curveTo(14.59f, 13.27f, 17.47f, 9.0f, 22.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                moveTo(2.0f, 6.0f)
                curveTo(2.81f, 8.13f, 4.42f, 9.5f, 7.0f, 10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _anvil!!
    }

private var _anvil: ImageVector? = null
