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

public val MaterialDesignIcons.EarthArrowRight: ImageVector
    get() {
        if (_earthArrowRight != null) {
            return _earthArrowRight!!
        }
        _earthArrowRight = Builder(name = "EarthArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                lineTo(22.0f, 18.0f)
                lineTo(19.0f, 21.0f)
                moveTo(12.0f, 18.0f)
                curveTo(12.0f, 15.8f, 13.2f, 13.9f, 15.0f, 12.8f)
                curveTo(14.9f, 12.3f, 14.5f, 12.0f, 14.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                curveTo(10.6f, 10.0f, 11.0f, 9.6f, 11.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1f, 7.0f, 15.0f, 6.1f, 15.0f, 5.0f)
                verticalLineTo(4.6f)
                curveTo(17.9f, 5.8f, 20.0f, 8.6f, 20.0f, 12.0f)
                verticalLineTo(12.3f)
                curveTo(20.7f, 12.5f, 21.3f, 12.9f, 21.9f, 13.4f)
                curveTo(22.0f, 13.0f, 22.0f, 12.5f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5f, 22.0f, 13.0f, 22.0f, 13.4f, 21.9f)
                curveTo(12.5f, 20.8f, 12.0f, 19.5f, 12.0f, 18.0f)
                moveTo(11.0f, 19.9f)
                curveTo(7.0f, 19.4f, 4.0f, 16.1f, 4.0f, 12.0f)
                curveTo(4.0f, 11.4f, 4.1f, 10.8f, 4.2f, 10.2f)
                lineTo(9.0f, 15.0f)
                verticalLineTo(16.0f)
                curveTo(9.0f, 17.1f, 9.9f, 18.0f, 11.0f, 18.0f)
                verticalLineTo(19.9f)
                close()
            }
        }
        .build()
        return _earthArrowRight!!
    }

private var _earthArrowRight: ImageVector? = null
