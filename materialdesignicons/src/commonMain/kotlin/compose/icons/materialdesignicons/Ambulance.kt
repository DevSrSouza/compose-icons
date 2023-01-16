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

public val MaterialDesignIcons.Ambulance: ImageVector
    get() {
        if (_ambulance != null) {
            return _ambulance!!
        }
        _ambulance = Builder(name = "Ambulance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 18.5f)
                moveTo(19.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.46f)
                lineTo(19.5f, 9.5f)
                moveTo(6.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 18.5f)
                moveTo(20.0f, 8.0f)
                lineTo(23.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 17.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.89f, 1.89f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(8.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
