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

public val MaterialDesignIcons.Om: ImageVector
    get() {
        if (_om != null) {
            return _om!!
        }
        _om = Builder(name = "Om", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineTo(13.5f, 3.5f)
                lineTo(15.0f, 5.0f)
                lineTo(16.5f, 3.5f)
                lineTo(15.0f, 2.0f)
                moveTo(11.0f, 3.0f)
                curveTo(10.0f, 9.0f, 17.0f, 10.0f, 20.0f, 6.0f)
                lineTo(18.0f, 4.5f)
                curveTo(17.0f, 6.0f, 13.0f, 8.0f, 11.0f, 3.0f)
                moveTo(9.0f, 7.0f)
                curveTo(7.0f, 7.0f, 4.5f, 8.5f, 4.5f, 8.5f)
                lineTo(6.0f, 11.0f)
                curveTo(7.0f, 10.0f, 9.0f, 9.5f, 10.0f, 10.0f)
                curveTo(12.0f, 11.0f, 9.0f, 13.0f, 7.0f, 12.0f)
                verticalLineTo(15.5f)
                curveTo(10.0f, 14.0f, 12.0f, 16.0f, 11.0f, 17.5f)
                curveTo(8.0f, 22.0f, 3.0f, 16.0f, 3.0f, 13.0f)
                curveTo(1.0f, 19.0f, 6.0f, 22.0f, 9.0f, 22.0f)
                curveTo(12.0f, 22.0f, 14.0f, 20.0f, 12.5f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(12.5f, 19.5f, 18.0f, 24.0f, 21.0f, 18.0f)
                curveTo(22.0f, 16.0f, 22.0f, 9.5f, 17.0f, 9.5f)
                curveTo(13.0f, 9.5f, 14.0f, 15.0f, 10.5f, 13.5f)
                curveTo(14.0f, 10.0f, 12.0f, 7.0f, 9.0f, 7.0f)
                moveTo(19.0f, 12.0f)
                curveTo(22.0f, 15.0f, 15.0f, 21.0f, 15.0f, 15.0f)
                curveTo(15.0f, 13.0f, 17.0f, 10.5f, 19.0f, 12.0f)
                close()
            }
        }
        .build()
        return _om!!
    }

private var _om: ImageVector? = null
