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

public val MaterialDesignIcons.WrenchClockOutline: ImageVector
    get() {
        if (_wrenchClockOutline != null) {
            return _wrenchClockOutline!!
        }
        _wrenchClockOutline = Builder(name = "WrenchClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveTo(14.8f, 8.03f, 13.67f, 8.35f, 12.68f, 8.89f)
                curveTo(12.88f, 8.29f, 13.0f, 7.66f, 13.0f, 7.0f)
                curveTo(13.0f, 4.03f, 10.84f, 1.57f, 8.0f, 1.09f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.09f)
                curveTo(3.16f, 1.57f, 1.0f, 4.03f, 1.0f, 7.0f)
                curveTo(1.0f, 9.22f, 2.21f, 11.15f, 4.0f, 12.19f)
                verticalLineTo(21.0f)
                curveTo(4.0f, 21.55f, 4.45f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(9.55f, 22.0f, 10.0f, 21.55f, 10.0f, 21.0f)
                verticalLineTo(18.62f)
                curveTo(11.22f, 20.65f, 13.43f, 22.0f, 16.0f, 22.0f)
                curveTo(19.9f, 22.0f, 23.0f, 18.9f, 23.0f, 15.0f)
                reflectiveCurveTo(19.9f, 8.0f, 16.0f, 8.0f)
                moveTo(8.0f, 11.04f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.04f)
                lineTo(5.0f, 10.46f)
                curveTo(3.77f, 9.74f, 3.0f, 8.42f, 3.0f, 7.0f)
                curveTo(3.0f, 6.0f, 3.37f, 5.06f, 4.0f, 4.35f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.35f)
                curveTo(10.63f, 5.06f, 11.0f, 6.0f, 11.0f, 7.0f)
                curveTo(11.0f, 8.42f, 10.23f, 9.74f, 9.0f, 10.46f)
                lineTo(8.0f, 11.04f)
                moveTo(16.0f, 20.0f)
                curveTo(13.2f, 20.0f, 11.0f, 17.8f, 11.0f, 15.0f)
                reflectiveCurveTo(13.2f, 10.0f, 16.0f, 10.0f)
                reflectiveCurveTo(21.0f, 12.2f, 21.0f, 15.0f)
                reflectiveCurveTo(18.8f, 20.0f, 16.0f, 20.0f)
                moveTo(16.5f, 15.3f)
                lineTo(19.4f, 17.0f)
                lineTo(18.6f, 18.2f)
                lineTo(15.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.3f)
                close()
            }
        }
        .build()
        return _wrenchClockOutline!!
    }

private var _wrenchClockOutline: ImageVector? = null
