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

public val MaterialDesignIcons.BedOutline: ImageVector
    get() {
        if (_bedOutline != null) {
            return _bedOutline!!
        }
        _bedOutline = Builder(name = "BedOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                curveTo(8.66f, 14.0f, 10.0f, 12.66f, 10.0f, 11.0f)
                curveTo(10.0f, 9.34f, 8.66f, 8.0f, 7.0f, 8.0f)
                curveTo(5.34f, 8.0f, 4.0f, 9.34f, 4.0f, 11.0f)
                curveTo(4.0f, 12.66f, 5.34f, 14.0f, 7.0f, 14.0f)
                moveTo(7.0f, 10.0f)
                curveTo(7.55f, 10.0f, 8.0f, 10.45f, 8.0f, 11.0f)
                curveTo(8.0f, 11.55f, 7.55f, 12.0f, 7.0f, 12.0f)
                curveTo(6.45f, 12.0f, 6.0f, 11.55f, 6.0f, 11.0f)
                curveTo(6.0f, 10.45f, 6.45f, 10.0f, 7.0f, 10.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                curveTo(23.0f, 8.79f, 21.21f, 7.0f, 19.0f, 7.0f)
                moveTo(21.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 9.0f, 21.0f, 9.9f, 21.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bedOutline!!
    }

private var _bedOutline: ImageVector? = null
