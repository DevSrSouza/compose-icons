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

public val MaterialDesignIcons.CabinAFrame: ImageVector
    get() {
        if (_cabinAFrame != null) {
            return _cabinAFrame!!
        }
        _cabinAFrame = Builder(name = "CabinAFrame", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(4.0f, 21.0f)
                horizontalLineTo(20.0f)
                lineTo(12.0f, 3.0f)
                moveTo(9.0f, 19.0f)
                horizontalLineTo(7.08f)
                lineTo(9.0f, 14.67f)
                verticalLineTo(19.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                moveTo(10.19f, 12.0f)
                lineTo(12.0f, 7.92f)
                lineTo(13.81f, 12.0f)
                horizontalLineTo(10.19f)
                moveTo(15.0f, 14.67f)
                lineTo(16.92f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.67f)
                close()
            }
        }
        .build()
        return _cabinAFrame!!
    }

private var _cabinAFrame: ImageVector? = null
