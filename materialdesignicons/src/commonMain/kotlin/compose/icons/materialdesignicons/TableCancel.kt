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

public val MaterialDesignIcons.TableCancel: ImageVector
    get() {
        if (_tableCancel != null) {
            return _tableCancel!!
        }
        _tableCancel = Builder(name = "TableCancel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 3.0f, 19.0f, 3.9f, 19.0f, 5.0f)
                verticalLineTo(12.08f)
                curveTo(17.45f, 11.82f, 15.92f, 12.18f, 14.68f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.08f)
                curveTo(11.97f, 17.68f, 11.97f, 18.35f, 12.08f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 19.0f, 1.0f, 18.11f, 1.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 3.9f, 1.9f, 3.0f, 3.0f, 3.0f)
                moveTo(3.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                moveTo(11.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                moveTo(3.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                moveTo(18.5f, 14.0f)
                curveTo(16.0f, 14.0f, 14.0f, 16.0f, 14.0f, 18.5f)
                reflectiveCurveTo(16.0f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(23.0f, 21.0f, 23.0f, 18.5f)
                reflectiveCurveTo(21.0f, 14.0f, 18.5f, 14.0f)
                moveTo(18.5f, 21.5f)
                curveTo(16.84f, 21.5f, 15.5f, 20.16f, 15.5f, 18.5f)
                curveTo(15.5f, 17.94f, 15.65f, 17.42f, 15.92f, 17.0f)
                lineTo(20.0f, 21.08f)
                curveTo(19.58f, 21.35f, 19.06f, 21.5f, 18.5f, 21.5f)
                moveTo(21.08f, 20.0f)
                lineTo(17.0f, 15.92f)
                curveTo(17.42f, 15.65f, 17.94f, 15.5f, 18.5f, 15.5f)
                curveTo(20.16f, 15.5f, 21.5f, 16.84f, 21.5f, 18.5f)
                curveTo(21.5f, 19.06f, 21.35f, 19.58f, 21.08f, 20.0f)
                close()
            }
        }
        .build()
        return _tableCancel!!
    }

private var _tableCancel: ImageVector? = null
