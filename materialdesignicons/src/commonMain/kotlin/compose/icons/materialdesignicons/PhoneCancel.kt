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

public val MaterialDesignIcons.PhoneCancel: ImageVector
    get() {
        if (_phoneCancel != null) {
            return _phoneCancel!!
        }
        _phoneCancel = Builder(name = "PhoneCancel", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(16.5f, 2.0f)
                curveTo(14.0f, 2.0f, 12.0f, 4.0f, 12.0f, 6.5f)
                reflectiveCurveTo(14.0f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(21.0f, 9.0f, 21.0f, 6.5f)
                reflectiveCurveTo(19.0f, 2.0f, 16.5f, 2.0f)
                moveTo(16.5f, 9.5f)
                curveTo(14.84f, 9.5f, 13.5f, 8.16f, 13.5f, 6.5f)
                curveTo(13.5f, 5.94f, 13.65f, 5.42f, 13.92f, 5.0f)
                lineTo(18.0f, 9.08f)
                curveTo(17.58f, 9.35f, 17.06f, 9.5f, 16.5f, 9.5f)
                moveTo(19.08f, 8.0f)
                lineTo(15.0f, 3.92f)
                curveTo(15.42f, 3.65f, 15.94f, 3.5f, 16.5f, 3.5f)
                curveTo(18.16f, 3.5f, 19.5f, 4.84f, 19.5f, 6.5f)
                curveTo(19.5f, 7.06f, 19.35f, 7.58f, 19.08f, 8.0f)
                close()
            }
        }
        .build()
        return _phoneCancel!!
    }

private var _phoneCancel: ImageVector? = null
