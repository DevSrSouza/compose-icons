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

public val MaterialDesignIcons.Pumpkin: ImageVector
    get() {
        if (_pumpkin != null) {
            return _pumpkin!!
        }
        _pumpkin = Builder(name = "Pumpkin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 6.0f)
                curveTo(7.47f, 6.0f, 8.37f, 6.5f, 9.11f, 7.38f)
                curveTo(9.66f, 6.79f, 10.31f, 6.36f, 11.0f, 6.15f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.15f)
                curveTo(13.69f, 6.36f, 14.34f, 6.79f, 14.89f, 7.38f)
                curveTo(15.63f, 6.5f, 16.53f, 6.0f, 17.5f, 6.0f)
                curveTo(20.0f, 6.0f, 22.0f, 9.36f, 22.0f, 13.5f)
                curveTo(22.0f, 17.64f, 20.0f, 21.0f, 17.5f, 21.0f)
                curveTo(16.53f, 21.0f, 15.63f, 20.5f, 14.89f, 19.62f)
                curveTo(14.08f, 20.5f, 13.08f, 21.0f, 12.0f, 21.0f)
                curveTo(10.92f, 21.0f, 9.92f, 20.5f, 9.11f, 19.62f)
                curveTo(8.37f, 20.5f, 7.47f, 21.0f, 6.5f, 21.0f)
                curveTo(4.0f, 21.0f, 2.0f, 17.64f, 2.0f, 13.5f)
                curveTo(2.0f, 9.36f, 4.0f, 6.0f, 6.5f, 6.0f)
                close()
            }
        }
        .build()
        return _pumpkin!!
    }

private var _pumpkin: ImageVector? = null
