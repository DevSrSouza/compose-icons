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

public val MaterialDesignIcons.StorageTank: ImageVector
    get() {
        if (_storageTank != null) {
            return _storageTank!!
        }
        _storageTank = Builder(name = "StorageTank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                curveTo(16.0f, 3.9f, 15.1f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 3.0f, 8.0f, 3.9f, 8.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                curveTo(3.69f, 6.0f, 1.0f, 8.69f, 1.0f, 12.0f)
                reflectiveCurveTo(3.69f, 18.0f, 7.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                curveTo(20.31f, 18.0f, 23.0f, 15.31f, 23.0f, 12.0f)
                reflectiveCurveTo(20.31f, 6.0f, 17.0f, 6.0f)
                moveTo(10.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _storageTank!!
    }

private var _storageTank: ImageVector? = null
