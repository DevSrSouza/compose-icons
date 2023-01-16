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

public val MaterialDesignIcons.CarBrakeAlert: ImageVector
    get() {
        if (_carBrakeAlert != null) {
            return _carBrakeAlert!!
        }
        _carBrakeAlert = Builder(name = "CarBrakeAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                moveTo(12.0f, 3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(12.0f, 19.0f)
                curveTo(8.14f, 19.0f, 5.0f, 15.86f, 5.0f, 12.0f)
                curveTo(5.0f, 8.14f, 8.14f, 5.0f, 12.0f, 5.0f)
                curveTo(15.86f, 5.0f, 19.0f, 8.14f, 19.0f, 12.0f)
                curveTo(19.0f, 15.86f, 15.86f, 19.0f, 12.0f, 19.0f)
                moveTo(20.5f, 20.5f)
                curveTo(22.66f, 18.31f, 24.0f, 15.31f, 24.0f, 12.0f)
                curveTo(24.0f, 8.69f, 22.66f, 5.69f, 20.5f, 3.5f)
                lineTo(19.42f, 4.58f)
                curveTo(21.32f, 6.5f, 22.5f, 9.11f, 22.5f, 12.0f)
                curveTo(22.5f, 14.9f, 21.32f, 17.5f, 19.42f, 19.42f)
                lineTo(20.5f, 20.5f)
                moveTo(4.58f, 19.42f)
                curveTo(2.68f, 17.5f, 1.5f, 14.9f, 1.5f, 12.0f)
                curveTo(1.5f, 9.11f, 2.68f, 6.5f, 4.58f, 4.58f)
                lineTo(3.5f, 3.5f)
                curveTo(1.34f, 5.69f, 0.0f, 8.69f, 0.0f, 12.0f)
                curveTo(0.0f, 15.31f, 1.34f, 18.31f, 3.5f, 20.5f)
                lineTo(4.58f, 19.42f)
                close()
            }
        }
        .build()
        return _carBrakeAlert!!
    }

private var _carBrakeAlert: ImageVector? = null
