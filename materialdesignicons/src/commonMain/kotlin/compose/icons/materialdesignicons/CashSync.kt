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

public val MaterialDesignIcons.CashSync: ImageVector
    get() {
        if (_cashSync != null) {
            return _cashSync!!
        }
        _cashSync = Builder(name = "CashSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.32f)
                curveTo(13.1f, 17.33f, 13.0f, 16.66f, 13.0f, 16.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 14.9f, 6.11f, 14.0f, 5.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(6.11f, 10.0f, 7.0f, 9.11f, 7.0f, 8.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 9.11f, 17.9f, 10.0f, 19.0f, 10.0f)
                verticalLineTo(10.06f)
                curveTo(19.67f, 10.06f, 20.34f, 10.18f, 21.0f, 10.4f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                moveTo(12.0f, 9.0f)
                curveTo(10.3f, 9.03f, 9.0f, 10.3f, 9.0f, 12.0f)
                reflectiveCurveTo(10.3f, 14.94f, 12.0f, 15.0f)
                curveTo(12.38f, 15.0f, 12.77f, 14.92f, 13.14f, 14.77f)
                curveTo(13.41f, 13.67f, 13.86f, 12.63f, 14.97f, 11.61f)
                curveTo(14.85f, 10.28f, 13.59f, 8.97f, 12.0f, 9.0f)
                moveTo(19.0f, 11.0f)
                lineTo(21.25f, 13.25f)
                lineTo(19.0f, 15.5f)
                verticalLineTo(14.0f)
                curveTo(17.15f, 14.0f, 15.94f, 15.96f, 16.76f, 17.62f)
                lineTo(15.67f, 18.71f)
                curveTo(13.91f, 16.05f, 15.81f, 12.5f, 19.0f, 12.5f)
                verticalLineTo(11.0f)
                moveTo(19.0f, 22.0f)
                lineTo(16.75f, 19.75f)
                lineTo(19.0f, 17.5f)
                verticalLineTo(19.0f)
                curveTo(20.85f, 19.0f, 22.06f, 17.04f, 21.24f, 15.38f)
                lineTo(22.33f, 14.29f)
                curveTo(24.09f, 16.95f, 22.19f, 20.5f, 19.0f, 20.5f)
                verticalLineTo(22.0f)
            }
        }
        .build()
        return _cashSync!!
    }

private var _cashSync: ImageVector? = null
