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

public val MaterialDesignIcons.BabyCarriageOff: ImageVector
    get() {
        if (_babyCarriageOff != null) {
            return _babyCarriageOff!!
        }
        _babyCarriageOff = Builder(name = "BabyCarriageOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                curveTo(22.0f, 5.6f, 18.4f, 2.0f, 14.0f, 2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                moveTo(14.2f, 11.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 12.8f, 21.4f, 14.5f, 20.3f, 15.9f)
                curveTo(21.0f, 16.5f, 21.4f, 17.4f, 21.5f, 18.3f)
                lineTo(14.2f, 11.0f)
                moveTo(20.8f, 22.7f)
                lineTo(22.1f, 21.4f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(9.1f, 11.0f)
                horizontalLineTo(7.4f)
                lineTo(6.5f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.2f)
                curveTo(5.2f, 11.0f, 7.1f, 15.1f, 7.3f, 15.4f)
                curveTo(6.3f, 15.9f, 5.6f, 16.9f, 5.5f, 18.0f)
                curveTo(5.2f, 19.9f, 6.6f, 21.7f, 8.5f, 22.0f)
                curveTo(10.4f, 22.3f, 12.2f, 20.9f, 12.5f, 19.0f)
                horizontalLineTo(14.6f)
                curveTo(14.7f, 19.4f, 14.8f, 19.8f, 15.0f, 20.2f)
                curveTo(15.9f, 21.9f, 18.1f, 22.5f, 19.7f, 21.6f)
                lineTo(20.8f, 22.7f)
                moveTo(10.5f, 18.5f)
                curveTo(10.5f, 19.3f, 9.8f, 20.0f, 9.0f, 20.0f)
                reflectiveCurveTo(7.5f, 19.3f, 7.5f, 18.5f)
                reflectiveCurveTo(8.2f, 17.0f, 9.0f, 17.0f)
                reflectiveCurveTo(10.5f, 17.7f, 10.5f, 18.5f)
                moveTo(18.1f, 20.0f)
                curveTo(17.2f, 20.0f, 16.5f, 19.3f, 16.5f, 18.5f)
                verticalLineTo(18.4f)
                lineTo(18.1f, 20.0f)
                close()
            }
        }
        .build()
        return _babyCarriageOff!!
    }

private var _babyCarriageOff: ImageVector? = null
