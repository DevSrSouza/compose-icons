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

public val MaterialDesignIcons.Helicopter: ImageVector
    get() {
        if (_helicopter != null) {
            return _helicopter!!
        }
        _helicopter = Builder(name = "Helicopter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                moveTo(23.0f, 6.0f)
                verticalLineTo(10.5f)
                lineTo(14.75f, 12.2f)
                curveTo(14.91f, 12.6f, 15.0f, 13.04f, 15.0f, 13.5f)
                curveTo(15.0f, 14.9f, 14.18f, 16.1f, 13.0f, 16.66f)
                verticalLineTo(17.0f)
                lineTo(13.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 1.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.74f)
                curveTo(3.25f, 16.13f, 2.0f, 14.46f, 2.0f, 12.5f)
                curveTo(2.0f, 10.0f, 4.0f, 8.0f, 6.5f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(23.0f)
                moveTo(11.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                moveTo(7.5f, 10.0f)
                curveTo(6.12f, 10.0f, 5.0f, 10.9f, 5.0f, 12.0f)
                curveTo(5.0f, 13.1f, 6.12f, 14.0f, 7.5f, 14.0f)
                curveTo(8.88f, 14.0f, 10.0f, 13.1f, 10.0f, 12.0f)
                curveTo(10.0f, 10.9f, 8.88f, 10.0f, 7.5f, 10.0f)
                close()
            }
        }
        .build()
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
