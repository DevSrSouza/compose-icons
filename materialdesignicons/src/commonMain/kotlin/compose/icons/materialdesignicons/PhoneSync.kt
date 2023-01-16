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

public val MaterialDesignIcons.PhoneSync: ImageVector
    get() {
        if (_phoneSync != null) {
            return _phoneSync!!
        }
        _phoneSync = Builder(name = "PhoneSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.0f, 3.0f)
                verticalLineTo(1.5f)
                lineTo(14.75f, 3.75f)
                lineTo(17.0f, 6.0f)
                verticalLineTo(4.5f)
                curveTo(18.38f, 4.5f, 19.5f, 5.62f, 19.5f, 7.0f)
                curveTo(19.5f, 7.4f, 19.41f, 7.78f, 19.24f, 8.12f)
                lineTo(20.33f, 9.21f)
                curveTo(20.75f, 8.58f, 21.0f, 7.82f, 21.0f, 7.0f)
                curveTo(21.0f, 4.79f, 19.21f, 3.0f, 17.0f, 3.0f)
                moveTo(17.0f, 9.5f)
                curveTo(15.62f, 9.5f, 14.5f, 8.38f, 14.5f, 7.0f)
                curveTo(14.5f, 6.6f, 14.59f, 6.22f, 14.76f, 5.88f)
                lineTo(13.67f, 4.79f)
                curveTo(13.25f, 5.42f, 13.0f, 6.18f, 13.0f, 7.0f)
                curveTo(13.0f, 9.21f, 14.79f, 11.0f, 17.0f, 11.0f)
                verticalLineTo(12.5f)
                lineTo(19.25f, 10.25f)
                lineTo(17.0f, 8.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _phoneSync!!
    }

private var _phoneSync: ImageVector? = null
