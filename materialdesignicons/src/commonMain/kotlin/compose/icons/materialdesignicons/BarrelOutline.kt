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

public val MaterialDesignIcons.BarrelOutline: ImageVector
    get() {
        if (_barrelOutline != null) {
            return _barrelOutline!!
        }
        _barrelOutline = Builder(name = "BarrelOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.05f)
                curveTo(9.0f, 14.68f, 10.34f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(15.0f, 14.68f, 15.0f, 13.05f)
                curveTo(15.0f, 11.74f, 14.47f, 11.36f, 12.0f, 8.5f)
                curveTo(9.5f, 11.38f, 9.0f, 11.75f, 9.0f, 13.05f)
                moveTo(20.0f, 13.0f)
                curveTo(20.55f, 13.0f, 21.0f, 12.55f, 21.0f, 12.0f)
                reflectiveCurveTo(20.55f, 11.0f, 20.0f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 5.0f, 21.0f, 4.55f, 21.0f, 4.0f)
                reflectiveCurveTo(20.55f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 3.0f, 3.0f, 3.45f, 3.0f, 4.0f)
                reflectiveCurveTo(3.45f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 11.0f, 3.0f, 11.45f, 3.0f, 12.0f)
                reflectiveCurveTo(3.45f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 19.0f, 3.0f, 19.45f, 3.0f, 20.0f)
                reflectiveCurveTo(3.45f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 21.0f, 21.0f, 20.55f, 21.0f, 20.0f)
                reflectiveCurveTo(20.55f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                moveTo(17.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                curveTo(7.55f, 13.0f, 8.0f, 12.55f, 8.0f, 12.0f)
                reflectiveCurveTo(7.55f, 11.0f, 7.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                curveTo(16.45f, 11.0f, 16.0f, 11.45f, 16.0f, 12.0f)
                reflectiveCurveTo(16.45f, 13.0f, 17.0f, 13.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _barrelOutline!!
    }

private var _barrelOutline: ImageVector? = null
