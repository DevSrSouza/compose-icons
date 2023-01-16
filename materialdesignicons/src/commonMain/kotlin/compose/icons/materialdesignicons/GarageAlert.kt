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

public val MaterialDesignIcons.GarageAlert: ImageVector
    get() {
        if (_garageAlert != null) {
            return _garageAlert!!
        }
        _garageAlert = Builder(name = "GarageAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                lineTo(10.0f, 5.0f)
                lineTo(17.0f, 9.0f)
                verticalLineTo(20.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                moveTo(19.0f, 15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _garageAlert!!
    }

private var _garageAlert: ImageVector? = null
