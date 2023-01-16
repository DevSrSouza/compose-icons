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

public val MaterialDesignIcons.Buffet: ImageVector
    get() {
        if (_buffet != null) {
            return _buffet!!
        }
        _buffet = Builder(name = "Buffet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                curveTo(9.55f, 14.0f, 10.0f, 14.45f, 10.0f, 15.0f)
                curveTo(10.0f, 15.55f, 9.55f, 16.0f, 9.0f, 16.0f)
                curveTo(8.45f, 16.0f, 8.0f, 15.55f, 8.0f, 15.0f)
                curveTo(8.0f, 14.45f, 8.45f, 14.0f, 9.0f, 14.0f)
                moveTo(15.0f, 14.0f)
                curveTo(15.55f, 14.0f, 16.0f, 14.45f, 16.0f, 15.0f)
                curveTo(16.0f, 15.55f, 15.55f, 16.0f, 15.0f, 16.0f)
                curveTo(14.45f, 16.0f, 14.0f, 15.55f, 14.0f, 15.0f)
                curveTo(14.0f, 14.45f, 14.45f, 14.0f, 15.0f, 14.0f)
                moveTo(3.0f, 22.0f)
                lineTo(4.0f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 19.0f, 2.0f, 18.55f, 2.0f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 11.45f, 2.45f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 11.0f, 22.0f, 11.45f, 22.0f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.55f, 21.55f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 22.0f)
                horizontalLineTo(19.0f)
                lineTo(18.0f, 19.0f)
                horizontalLineTo(6.0f)
                lineTo(5.0f, 22.0f)
                horizontalLineTo(3.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                moveTo(4.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _buffet!!
    }

private var _buffet: ImageVector? = null
