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

public val MaterialDesignIcons.VanPassenger: ImageVector
    get() {
        if (_vanPassenger != null) {
            return _vanPassenger!!
        }
        _vanPassenger = Builder(name = "VanPassenger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                curveTo(1.89f, 7.0f, 1.0f, 7.89f, 1.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 17.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                curveTo(23.0f, 11.89f, 22.11f, 11.0f, 21.0f, 11.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 8.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.5f)
                moveTo(9.0f, 8.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.5f)
                moveTo(15.0f, 8.5f)
                horizontalLineTo(17.5f)
                lineTo(19.46f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.5f)
                moveTo(6.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 15.5f)
                moveTo(18.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 15.5f)
                close()
            }
        }
        .build()
        return _vanPassenger!!
    }

private var _vanPassenger: ImageVector? = null
