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

public val MaterialDesignIcons.BombOff: ImageVector
    get() {
        if (_bombOff != null) {
            return _bombOff!!
        }
        _bombOff = Builder(name = "BombOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.75f)
                curveTo(12.7f, 2.75f, 11.25f, 4.2f, 11.25f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.29f)
                curveTo(9.31f, 7.5f, 8.67f, 7.81f, 8.08f, 8.2f)
                lineTo(17.79f, 17.91f)
                curveTo(18.58f, 16.76f, 19.0f, 15.39f, 19.0f, 14.0f)
                curveTo(19.0f, 10.83f, 16.89f, 8.15f, 14.0f, 7.29f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.5f, 4.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 16.25f, 6.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 18.5f, 8.25f)
                curveTo(19.74f, 8.25f, 20.74f, 7.24f, 20.74f, 6.0f)
                verticalLineTo(5.25f)
                horizontalLineTo(19.25f)
                verticalLineTo(6.0f)
                curveTo(19.25f, 6.42f, 18.91f, 6.75f, 18.5f, 6.75f)
                curveTo(18.08f, 6.75f, 17.75f, 6.42f, 17.75f, 6.0f)
                curveTo(17.75f, 4.2f, 16.29f, 2.75f, 14.5f, 2.75f)
                moveTo(3.41f, 6.36f)
                lineTo(2.0f, 7.77f)
                lineTo(5.55f, 11.32f)
                curveTo(5.2f, 12.14f, 5.0f, 13.04f, 5.0f, 14.0f)
                curveTo(5.0f, 17.86f, 8.13f, 21.0f, 12.0f, 21.0f)
                curveTo(12.92f, 21.0f, 13.83f, 20.81f, 14.68f, 20.45f)
                lineTo(18.23f, 24.0f)
                lineTo(19.64f, 22.59f)
                lineTo(3.41f, 6.36f)
                close()
            }
        }
        .build()
        return _bombOff!!
    }

private var _bombOff: ImageVector? = null
