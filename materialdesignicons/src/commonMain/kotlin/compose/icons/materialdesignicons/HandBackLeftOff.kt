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

public val MaterialDesignIcons.HandBackLeftOff: ImageVector
    get() {
        if (_handBackLeftOff != null) {
            return _handBackLeftOff!!
        }
        _handBackLeftOff = Builder(name = "HandBackLeftOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.21f, 5.1f)
                curveTo(3.09f, 5.29f, 3.0f, 5.5f, 3.0f, 5.75f)
                verticalLineTo(16.0f)
                curveTo(3.0f, 20.42f, 6.58f, 24.0f, 11.0f, 24.0f)
                curveTo(13.93f, 24.0f, 16.58f, 22.39f, 17.97f, 19.86f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5.5f, 12.0f)
                verticalLineTo(7.39f)
                lineTo(6.5f, 8.39f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.5f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.89f)
                lineTo(10.0f, 11.89f)
                verticalLineTo(12.0f)
                moveTo(16.0f, 12.8f)
                lineTo(13.5f, 10.3f)
                verticalLineTo(3.25f)
                curveTo(13.5f, 2.56f, 14.06f, 2.0f, 14.75f, 2.0f)
                reflectiveCurveTo(16.0f, 2.56f, 16.0f, 3.25f)
                verticalLineTo(12.8f)
                moveTo(19.5f, 16.28f)
                lineTo(17.16f, 13.96f)
                lineTo(18.16f, 11.47f)
                curveTo(18.38f, 10.92f, 18.84f, 10.5f, 19.4f, 10.31f)
                lineTo(20.19f, 10.05f)
                curveTo(21.0f, 9.79f, 21.74f, 10.58f, 21.43f, 11.37f)
                lineTo(19.5f, 16.28f)
                moveTo(9.0f, 5.8f)
                lineTo(6.5f, 3.3f)
                verticalLineTo(2.75f)
                curveTo(6.5f, 2.06f, 7.06f, 1.5f, 7.75f, 1.5f)
                reflectiveCurveTo(9.0f, 2.06f, 9.0f, 2.75f)
                verticalLineTo(5.8f)
                moveTo(12.5f, 9.3f)
                lineTo(10.0f, 6.8f)
                verticalLineTo(1.25f)
                curveTo(10.0f, 0.56f, 10.56f, 0.0f, 11.25f, 0.0f)
                reflectiveCurveTo(12.5f, 0.56f, 12.5f, 1.25f)
                verticalLineTo(9.3f)
                close()
            }
        }
        .build()
        return _handBackLeftOff!!
    }

private var _handBackLeftOff: ImageVector? = null
