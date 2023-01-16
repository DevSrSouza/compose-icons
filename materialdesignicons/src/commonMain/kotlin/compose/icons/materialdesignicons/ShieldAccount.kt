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

public val MaterialDesignIcons.ShieldAccount: ImageVector
    get() {
        if (_shieldAccount != null) {
            return _shieldAccount!!
        }
        _shieldAccount = Builder(name = "ShieldAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.55f, 6.84f, 21.74f, 12.0f, 23.0f)
                curveTo(17.16f, 21.74f, 21.0f, 16.55f, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                moveTo(12.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 5.0f)
                moveTo(17.13f, 17.0f)
                curveTo(15.92f, 18.85f, 14.11f, 20.24f, 12.0f, 20.92f)
                curveTo(9.89f, 20.24f, 8.08f, 18.85f, 6.87f, 17.0f)
                curveTo(6.53f, 16.5f, 6.24f, 16.0f, 6.0f, 15.47f)
                curveTo(6.0f, 13.82f, 8.71f, 12.47f, 12.0f, 12.47f)
                curveTo(15.29f, 12.47f, 18.0f, 13.79f, 18.0f, 15.47f)
                curveTo(17.76f, 16.0f, 17.47f, 16.5f, 17.13f, 17.0f)
                close()
            }
        }
        .build()
        return _shieldAccount!!
    }

private var _shieldAccount: ImageVector? = null