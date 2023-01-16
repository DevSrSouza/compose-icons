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

public val MaterialDesignIcons.DivingHelmet: ImageVector
    get() {
        if (_divingHelmet != null) {
            return _divingHelmet!!
        }
        _divingHelmet = Builder(name = "DivingHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                moveTo(19.45f, 7.89f)
                lineTo(18.07f, 8.58f)
                lineTo(18.32f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.33f)
                curveTo(17.84f, 16.03f, 17.11f, 16.92f, 16.21f, 17.6f)
                curveTo(17.85f, 18.11f, 19.1f, 18.91f, 19.67f, 19.86f)
                curveTo(18.69f, 21.1f, 15.62f, 22.0f, 12.0f, 22.0f)
                curveTo(8.38f, 22.0f, 5.31f, 21.1f, 4.33f, 19.86f)
                curveTo(4.9f, 18.91f, 6.15f, 18.11f, 7.79f, 17.6f)
                curveTo(6.89f, 16.92f, 6.16f, 16.03f, 5.67f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.68f)
                curveTo(6.37f, 7.54f, 7.54f, 6.37f, 9.0f, 5.68f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.68f)
                curveTo(15.68f, 6.0f, 16.29f, 6.46f, 16.82f, 7.0f)
                lineTo(18.55f, 6.14f)
                curveTo(19.93f, 5.42f, 20.0f, 4.1f, 20.0f, 2.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 4.06f, 22.0f, 6.62f, 19.45f, 7.89f)
                moveTo(17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _divingHelmet!!
    }

private var _divingHelmet: ImageVector? = null
