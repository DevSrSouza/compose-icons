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

public val MaterialDesignIcons.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) {
            return _truckTrailer!!
        }
        _truckTrailer = Builder(name = "TruckTrailer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                moveTo(7.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 16.0f)
                close()
            }
        }
        .build()
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
