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

public val MaterialDesignIcons.CarSports: ImageVector
    get() {
        if (_carSports != null) {
            return _carSports!!
        }
        _carSports = Builder(name = "CarSports", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.5f)
                horizontalLineTo(7.0f)
                lineTo(4.0f, 11.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 11.0f, 1.0f, 11.89f, 1.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.17f)
                curveTo(3.6f, 17.2f, 4.73f, 18.0f, 6.0f, 18.0f)
                curveTo(7.27f, 18.0f, 8.4f, 17.2f, 8.82f, 16.0f)
                horizontalLineTo(15.17f)
                curveTo(15.6f, 17.2f, 16.73f, 18.0f, 18.0f, 18.0f)
                curveTo(19.27f, 18.0f, 20.4f, 17.2f, 20.82f, 16.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 13.89f, 21.97f, 13.53f, 21.0f, 13.0f)
                lineTo(12.0f, 8.5f)
                moveTo(5.25f, 12.0f)
                lineTo(7.5f, 10.0f)
                horizontalLineTo(11.5f)
                lineTo(15.5f, 12.0f)
                horizontalLineTo(5.25f)
                moveTo(6.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 13.5f)
                moveTo(18.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 13.5f)
                close()
            }
        }
        .build()
        return _carSports!!
    }

private var _carSports: ImageVector? = null
