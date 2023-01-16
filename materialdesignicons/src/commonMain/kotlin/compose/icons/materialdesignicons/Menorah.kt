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

public val MaterialDesignIcons.Menorah: ImageVector
    get() {
        if (_menorah != null) {
            return _menorah!!
        }
        _menorah = Builder(name = "Menorah", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                verticalLineTo(6.0f)
                lineTo(19.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                lineTo(15.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                lineTo(11.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                lineTo(7.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(2.45f, 11.0f, 2.0f, 11.45f, 2.0f, 12.0f)
                reflectiveCurveTo(2.45f, 13.0f, 3.0f, 13.0f)
                horizontalLineTo(4.25f)
                curveTo(4.95f, 14.92f, 6.94f, 17.58f, 11.0f, 17.95f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 20.0f, 8.0f, 20.9f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 20.9f, 15.11f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.95f)
                curveTo(17.06f, 17.57f, 19.05f, 14.92f, 19.75f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 13.0f, 22.0f, 12.55f, 22.0f, 12.0f)
                reflectiveCurveTo(21.55f, 11.0f, 21.0f, 11.0f)
                moveTo(11.0f, 15.94f)
                curveTo(8.34f, 15.63f, 7.05f, 14.11f, 6.45f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.94f)
                moveTo(13.0f, 15.94f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.55f)
                curveTo(16.95f, 14.11f, 15.66f, 15.63f, 13.0f, 15.94f)
                close()
            }
        }
        .build()
        return _menorah!!
    }

private var _menorah: ImageVector? = null
