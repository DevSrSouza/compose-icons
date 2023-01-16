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

public val MaterialDesignIcons.PhoneRefresh: ImageVector
    get() {
        if (_phoneRefresh != null) {
            return _phoneRefresh!!
        }
        _phoneRefresh = Builder(name = "PhoneRefresh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.62f, 10.79f)
                curveTo(8.06f, 13.62f, 10.38f, 15.94f, 13.21f, 17.38f)
                lineTo(15.41f, 15.18f)
                curveTo(15.69f, 14.9f, 16.08f, 14.82f, 16.43f, 14.93f)
                curveTo(17.55f, 15.3f, 18.75f, 15.5f, 20.0f, 15.5f)
                curveTo(20.55f, 15.5f, 21.0f, 15.95f, 21.0f, 16.5f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.55f, 20.55f, 21.0f, 20.0f, 21.0f)
                curveTo(10.61f, 21.0f, 3.0f, 13.39f, 3.0f, 4.0f)
                curveTo(3.0f, 3.45f, 3.45f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(7.5f)
                curveTo(8.05f, 3.0f, 8.5f, 3.45f, 8.5f, 4.0f)
                curveTo(8.5f, 5.25f, 8.7f, 6.45f, 9.07f, 7.57f)
                curveTo(9.18f, 7.92f, 9.1f, 8.31f, 8.82f, 8.59f)
                lineTo(6.62f, 10.79f)
                moveTo(17.0f, 7.0f)
                lineTo(18.77f, 5.23f)
                curveTo(18.32f, 4.78f, 17.69f, 4.5f, 17.0f, 4.5f)
                curveTo(15.62f, 4.5f, 14.5f, 5.62f, 14.5f, 7.0f)
                reflectiveCurveTo(15.62f, 9.5f, 17.0f, 9.5f)
                curveTo(17.82f, 9.5f, 18.54f, 9.11f, 19.0f, 8.5f)
                horizontalLineTo(20.71f)
                curveTo(20.12f, 9.97f, 18.68f, 11.0f, 17.0f, 11.0f)
                curveTo(14.79f, 11.0f, 13.0f, 9.21f, 13.0f, 7.0f)
                reflectiveCurveTo(14.79f, 3.0f, 17.0f, 3.0f)
                curveTo(18.11f, 3.0f, 19.11f, 3.45f, 19.83f, 4.17f)
                lineTo(21.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _phoneRefresh!!
    }

private var _phoneRefresh: ImageVector? = null
