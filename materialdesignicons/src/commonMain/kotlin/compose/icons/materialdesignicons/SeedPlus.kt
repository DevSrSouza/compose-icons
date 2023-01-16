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

public val MaterialDesignIcons.SeedPlus: ImageVector
    get() {
        if (_seedPlus != null) {
            return _seedPlus!!
        }
        _seedPlus = Builder(name = "SeedPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                moveTo(12.0f, 18.0f)
                curveTo(12.0f, 14.69f, 14.69f, 12.0f, 18.0f, 12.0f)
                curveTo(18.77f, 12.0f, 19.5f, 12.15f, 20.17f, 12.41f)
                curveTo(21.63f, 7.9f, 20.7f, 3.3f, 20.7f, 3.3f)
                reflectiveCurveTo(19.3f, 3.0f, 17.2f, 3.0f)
                curveTo(11.7f, 3.0f, 1.6f, 5.1f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21.0f, 6.4f, 21.0f)
                curveTo(8.76f, 21.0f, 10.74f, 20.69f, 12.41f, 20.15f)
                curveTo(12.15f, 19.5f, 12.0f, 18.76f, 12.0f, 18.0f)
                moveTo(7.0f, 17.0f)
                curveTo(7.0f, 17.0f, 7.0f, 7.0f, 17.0f, 7.0f)
                curveTo(17.0f, 7.0f, 11.0f, 9.0f, 7.0f, 17.0f)
                close()
            }
        }
        .build()
        return _seedPlus!!
    }

private var _seedPlus: ImageVector? = null
