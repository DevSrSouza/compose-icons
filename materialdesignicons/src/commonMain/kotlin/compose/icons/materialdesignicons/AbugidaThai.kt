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

public val MaterialDesignIcons.AbugidaThai: ImageVector
    get() {
        if (_abugidaThai != null) {
            return _abugidaThai!!
        }
        _abugidaThai = Builder(name = "AbugidaThai", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.0f)
                curveTo(9.0f, 17.44f, 10.87f, 12.42f, 13.86f, 7.25f)
                curveTo(14.29f, 6.5f, 15.08f, 6.0f, 16.0f, 6.0f)
                curveTo(17.12f, 6.0f, 18.0f, 6.88f, 18.0f, 8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 5.8f, 18.2f, 4.0f, 16.0f, 4.0f)
                curveTo(14.34f, 4.0f, 12.9f, 4.92f, 12.13f, 6.25f)
                curveTo(10.56f, 8.96f, 9.61f, 11.15f, 9.0f, 13.03f)
                verticalLineTo(6.5f)
                curveTo(9.0f, 5.13f, 7.87f, 4.0f, 6.5f, 4.0f)
                curveTo(5.13f, 4.0f, 4.0f, 5.13f, 4.0f, 6.5f)
                curveTo(4.0f, 7.87f, 5.13f, 9.0f, 6.5f, 9.0f)
                curveTo(6.67f, 9.0f, 6.84f, 9.0f, 7.0f, 8.95f)
                verticalLineTo(20.0f)
                moveTo(6.5f, 6.0f)
                curveTo(6.79f, 6.0f, 7.0f, 6.21f, 7.0f, 6.5f)
                curveTo(7.0f, 6.79f, 6.79f, 7.0f, 6.5f, 7.0f)
                curveTo(6.21f, 7.0f, 6.0f, 6.79f, 6.0f, 6.5f)
                curveTo(6.0f, 6.21f, 6.21f, 6.0f, 6.5f, 6.0f)
                close()
            }
        }
        .build()
        return _abugidaThai!!
    }

private var _abugidaThai: ImageVector? = null
