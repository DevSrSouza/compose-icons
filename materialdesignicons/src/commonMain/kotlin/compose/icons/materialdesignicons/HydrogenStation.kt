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

public val MaterialDesignIcons.HydrogenStation: ImageVector
    get() {
        if (_hydrogenStation != null) {
            return _hydrogenStation!!
        }
        _hydrogenStation = Builder(name = "HydrogenStation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.89f, 3.0f, 4.0f, 3.9f, 4.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(18.5f)
                curveTo(15.5f, 19.88f, 16.62f, 21.0f, 18.0f, 21.0f)
                reflectiveCurveTo(20.5f, 19.88f, 20.5f, 18.5f)
                verticalLineTo(9.0f)
                curveTo(20.5f, 8.31f, 20.22f, 7.68f, 19.77f, 7.23f)
                lineTo(19.78f, 7.22f)
                lineTo(16.06f, 3.5f)
                lineTo(15.0f, 4.56f)
                lineTo(17.11f, 6.67f)
                curveTo(16.17f, 7.03f, 15.5f, 7.93f, 15.5f, 9.0f)
                curveTo(15.5f, 10.38f, 16.62f, 11.5f, 18.0f, 11.5f)
                curveTo(18.36f, 11.5f, 18.69f, 11.42f, 19.0f, 11.29f)
                verticalLineTo(18.5f)
                curveTo(19.0f, 19.05f, 18.55f, 19.5f, 18.0f, 19.5f)
                reflectiveCurveTo(17.0f, 19.05f, 17.0f, 18.5f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 12.9f, 16.11f, 12.0f, 15.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                curveTo(14.0f, 3.9f, 13.11f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                moveTo(18.0f, 8.0f)
                curveTo(18.55f, 8.0f, 19.0f, 8.45f, 19.0f, 9.0f)
                reflectiveCurveTo(18.55f, 10.0f, 18.0f, 10.0f)
                reflectiveCurveTo(17.0f, 9.55f, 17.0f, 9.0f)
                reflectiveCurveTo(17.45f, 8.0f, 18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _hydrogenStation!!
    }

private var _hydrogenStation: ImageVector? = null
