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

public val MaterialDesignIcons.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                verticalLineTo(11.26f)
                curveTo(3.2f, 11.9f, 2.0f, 13.6f, 2.0f, 15.5f)
                curveTo(2.0f, 18.0f, 4.0f, 20.0f, 6.5f, 20.0f)
                curveTo(8.79f, 20.0f, 10.71f, 18.28f, 10.97f, 16.0f)
                horizontalLineTo(15.17f)
                curveTo(15.06f, 16.32f, 15.0f, 16.66f, 15.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 17.0f)
                curveTo(21.0f, 16.66f, 20.94f, 16.32f, 20.82f, 16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 11.89f, 21.11f, 11.0f, 20.0f, 11.0f)
                horizontalLineTo(15.04f)
                lineTo(13.65f, 4.0f)
                horizontalLineTo(5.0f)
                moveTo(7.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(13.0f, 11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.74f)
                curveTo(10.16f, 12.38f, 8.71f, 11.23f, 7.0f, 11.03f)
                verticalLineTo(6.0f)
                moveTo(6.5f, 13.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 8.75f, 15.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 6.5f, 17.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 4.25f, 15.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 6.5f, 13.25f)
                moveTo(18.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 15.5f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null
