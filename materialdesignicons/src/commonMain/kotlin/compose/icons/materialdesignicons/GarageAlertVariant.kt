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

public val MaterialDesignIcons.GarageAlertVariant: ImageVector
    get() {
        if (_garageAlertVariant != null) {
            return _garageAlertVariant!!
        }
        _garageAlertVariant = Builder(name = "GarageAlertVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(9.0f)
                lineTo(10.0f, 5.0f)
                lineTo(20.0f, 9.0f)
                moveTo(17.0f, 12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                moveTo(17.0f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                moveTo(22.0f, 15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                moveTo(22.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _garageAlertVariant!!
    }

private var _garageAlertVariant: ImageVector? = null
