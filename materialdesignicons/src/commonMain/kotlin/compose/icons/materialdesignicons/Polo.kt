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

public val MaterialDesignIcons.Polo: ImageVector
    get() {
        if (_polo != null) {
            return _polo!!
        }
        _polo = Builder(name = "Polo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.5f)
                curveTo(22.0f, 10.88f, 20.88f, 12.0f, 19.5f, 12.0f)
                reflectiveCurveTo(17.0f, 10.88f, 17.0f, 9.5f)
                reflectiveCurveTo(18.12f, 7.0f, 19.5f, 7.0f)
                reflectiveCurveTo(22.0f, 8.12f, 22.0f, 9.5f)
                moveTo(11.0f, 17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                lineTo(6.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                moveTo(16.0f, 17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _polo!!
    }

private var _polo: ImageVector? = null
