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

public val MaterialDesignIcons.CarEmergency: ImageVector
    get() {
        if (_carEmergency != null) {
            return _carEmergency!!
        }
        _carEmergency = Builder(name = "CarEmergency", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(11.0f)
                moveTo(7.88f, 1.46f)
                lineTo(6.46f, 2.87f)
                lineTo(8.59f, 5.0f)
                lineTo(10.0f, 3.58f)
                lineTo(7.88f, 1.46f)
                moveTo(16.12f, 1.46f)
                lineTo(14.0f, 3.58f)
                lineTo(15.41f, 5.0f)
                lineTo(17.54f, 2.88f)
                lineTo(16.12f, 1.46f)
                moveTo(12.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 8.0f, 5.28f, 8.42f, 5.08f, 9.0f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 24.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 24.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 23.0f)
                verticalLineTo(15.0f)
                lineTo(18.92f, 9.0f)
                curveTo(18.72f, 8.42f, 18.16f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 5.0f)
                moveTo(6.5f, 9.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 14.0f)
                horizontalLineTo(5.0f)
                lineTo(6.5f, 9.5f)
                moveTo(6.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 16.0f)
                moveTo(17.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 16.0f)
                close()
            }
        }
        .build()
        return _carEmergency!!
    }

private var _carEmergency: ImageVector? = null
