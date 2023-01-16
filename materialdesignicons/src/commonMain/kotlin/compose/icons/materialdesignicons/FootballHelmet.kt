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

public val MaterialDesignIcons.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) {
            return _footballHelmet!!
        }
        _footballHelmet = Builder(name = "FootballHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 12.0f)
                moveTo(13.5f, 3.0f)
                curveTo(18.19f, 3.0f, 22.0f, 6.58f, 22.0f, 11.0f)
                curveTo(22.0f, 12.62f, 22.0f, 14.0f, 21.09f, 16.0f)
                curveTo(17.0f, 16.0f, 16.0f, 20.0f, 12.5f, 20.0f)
                curveTo(10.32f, 20.0f, 9.27f, 18.28f, 9.05f, 16.0f)
                horizontalLineTo(9.0f)
                lineTo(8.24f, 16.0f)
                lineTo(6.96f, 20.3f)
                curveTo(6.81f, 20.79f, 6.33f, 21.08f, 5.84f, 21.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 14.0f)
                horizontalLineTo(6.75f)
                lineTo(7.23f, 12.39f)
                curveTo(6.72f, 12.14f, 6.13f, 12.0f, 5.5f, 12.0f)
                horizontalLineTo(5.07f)
                lineTo(5.0f, 11.0f)
                curveTo(5.0f, 6.58f, 8.81f, 3.0f, 13.5f, 3.0f)
                moveTo(5.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.26f)
                lineTo(6.15f, 16.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
