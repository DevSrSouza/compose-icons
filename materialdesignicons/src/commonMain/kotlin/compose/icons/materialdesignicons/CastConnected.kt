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

public val MaterialDesignIcons.CastConnected: ImageVector
    get() {
        if (_castConnected != null) {
            return _castConnected!!
        }
        _castConnected = Builder(name = "CastConnected", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 3.0f, 1.0f, 3.89f, 1.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.89f, 22.1f, 3.0f, 21.0f, 3.0f)
                moveTo(1.0f, 10.0f)
                verticalLineTo(12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 10.0f, 21.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 14.92f, 7.07f, 10.0f, 1.0f, 10.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.63f)
                curveTo(8.96f, 9.91f, 12.09f, 13.04f, 13.37f, 17.0f)
                horizontalLineTo(19.0f)
                moveTo(1.0f, 14.0f)
                verticalLineTo(16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 14.0f)
                moveTo(1.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.0f, 18.0f)
                close()
            }
        }
        .build()
        return _castConnected!!
    }

private var _castConnected: ImageVector? = null
