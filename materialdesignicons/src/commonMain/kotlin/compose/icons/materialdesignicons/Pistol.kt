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

public val MaterialDesignIcons.Pistol: ImageVector
    get() {
        if (_pistol != null) {
            return _pistol!!
        }
        _pistol = Builder(name = "Pistol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 11.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 14.0f)
                horizontalLineTo(9.62f)
                curveTo(9.24f, 14.0f, 8.89f, 14.22f, 8.72f, 14.56f)
                lineTo(6.27f, 19.45f)
                curveTo(6.1f, 19.79f, 5.76f, 20.0f, 5.38f, 20.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 20.0f, -1.0f, 20.0f, 3.0f, 14.0f)
                curveTo(3.0f, 14.0f, 6.0f, 10.0f, 2.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                lineTo(3.5f, 4.0f)
                horizontalLineTo(6.5f)
                lineTo(7.0f, 5.0f)
                moveTo(14.0f, 12.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 10.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 10.0f, 11.0f, 11.0f, 12.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 11.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 13.0f)
                horizontalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _pistol!!
    }

private var _pistol: ImageVector? = null
