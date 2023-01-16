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

public val MaterialDesignIcons.TownHall: ImageVector
    get() {
        if (_townHall != null) {
            return _townHall!!
        }
        _townHall = Builder(name = "TownHall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                lineTo(12.5f, 6.2f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(6.2f)
                lineTo(7.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 10.0f, 2.0f, 10.45f, 2.0f, 11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 10.45f, 21.55f, 10.0f, 21.0f, 10.0f)
                moveTo(8.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                moveTo(8.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 8.0f)
                curveTo(12.55f, 8.0f, 13.0f, 8.45f, 13.0f, 9.0f)
                reflectiveCurveTo(12.55f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(11.0f, 9.55f, 11.0f, 9.0f)
                reflectiveCurveTo(11.45f, 8.0f, 12.0f, 8.0f)
                moveTo(14.0f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _townHall!!
    }

private var _townHall: ImageVector? = null
