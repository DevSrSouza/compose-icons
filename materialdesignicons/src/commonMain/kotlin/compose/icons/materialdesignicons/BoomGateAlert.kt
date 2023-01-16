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

public val MaterialDesignIcons.BoomGateAlert: ImageVector
    get() {
        if (_boomGateAlert != null) {
            return _boomGateAlert!!
        }
        _boomGateAlert = Builder(name = "BoomGateAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 3.0f)
                curveTo(19.3f, 2.0f, 18.1f, 1.7f, 17.2f, 2.3f)
                lineTo(6.9f, 8.2f)
                curveTo(6.6f, 8.1f, 6.3f, 8.0f, 6.0f, 8.0f)
                curveTo(4.3f, 8.0f, 3.0f, 9.3f, 3.0f, 11.0f)
                verticalLineTo(20.0f)
                curveTo(2.4f, 20.0f, 2.0f, 20.4f, 2.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                curveTo(10.0f, 20.4f, 9.6f, 20.0f, 9.0f, 20.0f)
                verticalLineTo(11.6f)
                lineTo(19.1f, 5.8f)
                curveTo(20.1f, 5.2f, 20.4f, 4.0f, 19.9f, 3.0f)
                moveTo(6.0f, 12.5f)
                curveTo(5.2f, 12.5f, 4.5f, 11.8f, 4.5f, 11.0f)
                reflectiveCurveTo(5.2f, 9.5f, 6.0f, 9.5f)
                reflectiveCurveTo(7.5f, 10.2f, 7.5f, 11.0f)
                reflectiveCurveTo(6.8f, 12.5f, 6.0f, 12.5f)
                moveTo(10.4f, 9.6f)
                lineTo(8.1f, 8.6f)
                lineTo(9.4f, 7.8f)
                lineTo(11.7f, 8.8f)
                lineTo(10.4f, 9.6f)
                moveTo(13.9f, 7.6f)
                lineTo(11.6f, 6.6f)
                lineTo(12.9f, 5.8f)
                lineTo(15.2f, 6.8f)
                lineTo(13.9f, 7.6f)
                moveTo(17.3f, 5.6f)
                lineTo(15.0f, 4.6f)
                lineTo(16.3f, 3.8f)
                lineTo(18.6f, 4.8f)
                lineTo(17.3f, 5.6f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                moveTo(20.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _boomGateAlert!!
    }

private var _boomGateAlert: ImageVector? = null
