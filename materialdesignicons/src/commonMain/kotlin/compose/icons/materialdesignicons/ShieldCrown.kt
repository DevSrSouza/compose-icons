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

public val MaterialDesignIcons.ShieldCrown: ImageVector
    get() {
        if (_shieldCrown != null) {
            return _shieldCrown!!
        }
        _shieldCrown = Builder(name = "ShieldCrown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 16.55f, 17.16f, 21.74f, 12.0f, 23.0f)
                curveTo(6.84f, 21.74f, 3.0f, 16.55f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                moveTo(16.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.5f)
                curveTo(8.0f, 15.77f, 8.19f, 15.96f, 8.47f, 16.0f)
                lineTo(8.57f, 16.0f)
                horizontalLineTo(15.43f)
                curveTo(15.74f, 16.0f, 15.95f, 15.84f, 16.0f, 15.59f)
                lineTo(16.0f, 15.5f)
                verticalLineTo(14.0f)
                moveTo(17.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(14.33f, 10.67f)
                lineTo(12.0f, 8.34f)
                lineTo(9.67f, 10.67f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineTo(16.0f)
                lineTo(17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _shieldCrown!!
    }

private var _shieldCrown: ImageVector? = null
