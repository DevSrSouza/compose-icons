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

public val MaterialDesignIcons.ArrowProjectile: ImageVector
    get() {
        if (_arrowProjectile != null) {
            return _arrowProjectile!!
        }
        _arrowProjectile = Builder(name = "ArrowProjectile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(20.0f, 7.0f)
                lineTo(19.03f, 6.03f)
                lineTo(8.0f, 17.06f)
                verticalLineTo(19.0f)
                lineTo(5.0f, 22.0f)
                lineTo(4.0f, 20.0f)
                lineTo(2.0f, 19.0f)
                lineTo(5.0f, 16.0f)
                horizontalLineTo(6.94f)
                lineTo(17.97f, 4.97f)
                lineTo(17.0f, 4.0f)
                lineTo(22.0f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowProjectile!!
    }

private var _arrowProjectile: ImageVector? = null
