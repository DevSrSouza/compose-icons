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

public val MaterialDesignIcons.PowerSocketCh: ImageVector
    get() {
        if (_powerSocketCh != null) {
            return _powerSocketCh!!
        }
        _powerSocketCh = Builder(name = "PowerSocketCh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.78f, 2.0f)
                horizontalLineTo(4.22f)
                curveTo(3.0f, 2.0f, 2.0f, 3.0f, 2.0f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(2.0f, 21.0f, 3.0f, 22.0f, 4.22f, 22.0f)
                horizontalLineTo(19.78f)
                curveTo(21.0f, 22.0f, 22.0f, 21.0f, 22.0f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(22.0f, 3.0f, 21.0f, 2.0f, 19.78f, 2.0f)
                moveTo(20.0f, 13.0f)
                lineTo(16.55f, 16.45f)
                curveTo(16.19f, 16.81f, 15.75f, 17.0f, 15.3f, 17.0f)
                horizontalLineTo(8.7f)
                curveTo(8.25f, 17.0f, 7.81f, 16.81f, 7.45f, 16.45f)
                lineTo(4.0f, 13.0f)
                curveTo(3.5f, 12.5f, 3.5f, 11.5f, 4.0f, 11.0f)
                lineTo(7.45f, 7.55f)
                curveTo(7.81f, 7.19f, 8.25f, 7.0f, 8.7f, 7.0f)
                horizontalLineTo(15.3f)
                curveTo(15.75f, 7.0f, 16.19f, 7.19f, 16.55f, 7.55f)
                lineTo(20.0f, 11.0f)
                curveTo(20.5f, 11.5f, 20.5f, 12.5f, 20.0f, 13.0f)
                moveTo(10.5f, 14.0f)
                curveTo(10.5f, 13.17f, 11.17f, 12.5f, 12.0f, 12.5f)
                reflectiveCurveTo(13.5f, 13.17f, 13.5f, 14.0f)
                reflectiveCurveTo(12.83f, 15.5f, 12.0f, 15.5f)
                reflectiveCurveTo(10.5f, 14.83f, 10.5f, 14.0f)
                moveTo(15.5f, 12.0f)
                curveTo(15.5f, 11.17f, 16.17f, 10.5f, 17.0f, 10.5f)
                reflectiveCurveTo(18.5f, 11.17f, 18.5f, 12.0f)
                reflectiveCurveTo(17.83f, 13.5f, 17.0f, 13.5f)
                reflectiveCurveTo(15.5f, 12.83f, 15.5f, 12.0f)
                moveTo(5.5f, 12.0f)
                curveTo(5.5f, 11.17f, 6.17f, 10.5f, 7.0f, 10.5f)
                reflectiveCurveTo(8.5f, 11.17f, 8.5f, 12.0f)
                reflectiveCurveTo(7.83f, 13.5f, 7.0f, 13.5f)
                reflectiveCurveTo(5.5f, 12.83f, 5.5f, 12.0f)
                close()
            }
        }
        .build()
        return _powerSocketCh!!
    }

private var _powerSocketCh: ImageVector? = null
