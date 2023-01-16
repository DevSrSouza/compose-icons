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

public val MaterialDesignIcons.CarSettings: ImageVector
    get() {
        if (_carSettings != null) {
            return _carSettings!!
        }
        _carSettings = Builder(name = "CarSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                moveTo(5.0f, 11.0f)
                lineTo(6.5f, 6.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 11.0f)
                moveTo(17.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 16.0f)
                moveTo(6.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 16.0f)
                moveTo(18.92f, 6.0f)
                curveTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 5.0f, 5.28f, 5.42f, 5.08f, 6.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 21.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _carSettings!!
    }

private var _carSettings: ImageVector? = null
