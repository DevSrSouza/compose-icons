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

public val MaterialDesignIcons.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                horizontalLineTo(4.75f)
                curveTo(4.75f, 22.0f, 4.0f, 22.0f, 3.81f, 20.65f)
                lineTo(2.04f, 3.81f)
                lineTo(2.0f, 3.5f)
                curveTo(2.0f, 2.67f, 2.9f, 2.0f, 4.0f, 2.0f)
                curveTo(5.1f, 2.0f, 6.0f, 2.67f, 6.0f, 3.5f)
                curveTo(6.0f, 2.67f, 6.9f, 2.0f, 8.0f, 2.0f)
                curveTo(9.1f, 2.0f, 10.0f, 2.67f, 10.0f, 3.5f)
                curveTo(10.0f, 2.67f, 10.9f, 2.0f, 12.0f, 2.0f)
                curveTo(13.09f, 2.0f, 14.0f, 2.66f, 14.0f, 3.5f)
                verticalLineTo(3.5f)
                curveTo(14.0f, 2.67f, 14.9f, 2.0f, 16.0f, 2.0f)
                curveTo(17.1f, 2.0f, 18.0f, 2.67f, 18.0f, 3.5f)
                curveTo(18.0f, 2.67f, 18.9f, 2.0f, 20.0f, 2.0f)
                curveTo(21.1f, 2.0f, 22.0f, 2.67f, 22.0f, 3.5f)
                lineTo(21.96f, 3.81f)
                lineTo(20.19f, 20.65f)
                curveTo(20.0f, 22.0f, 19.25f, 22.0f, 19.25f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(16.5f, 22.0f)
                horizontalLineTo(13.75f)
                lineTo(10.25f, 22.0f)
                horizontalLineTo(7.5f)
                lineTo(7.0f, 22.0f)
                moveTo(17.85f, 4.93f)
                curveTo(17.55f, 4.39f, 16.84f, 4.0f, 16.0f, 4.0f)
                curveTo(15.19f, 4.0f, 14.36f, 4.36f, 14.0f, 4.87f)
                lineTo(13.78f, 20.0f)
                horizontalLineTo(16.66f)
                lineTo(17.85f, 4.93f)
                moveTo(10.0f, 4.87f)
                curveTo(9.64f, 4.36f, 8.81f, 4.0f, 8.0f, 4.0f)
                curveTo(7.16f, 4.0f, 6.45f, 4.39f, 6.15f, 4.93f)
                lineTo(7.34f, 20.0f)
                horizontalLineTo(10.22f)
                lineTo(10.0f, 4.87f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
