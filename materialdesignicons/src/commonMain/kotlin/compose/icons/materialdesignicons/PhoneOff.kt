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

public val MaterialDesignIcons.PhoneOff: ImageVector
    get() {
        if (_phoneOff != null) {
            return _phoneOff!!
        }
        _phoneOff = Builder(name = "PhoneOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.22f, 2.5f)
                lineTo(2.5f, 20.22f)
                lineTo(3.77f, 21.5f)
                lineTo(8.65f, 16.62f)
                curveTo(11.76f, 19.43f, 15.81f, 21.0f, 20.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.9f, 15.41f, 15.18f)
                lineTo(13.21f, 17.38f)
                curveTo(12.06f, 16.8f, 11.0f, 16.06f, 10.06f, 15.21f)
                lineTo(21.5f, 3.77f)
                lineTo(20.22f, 2.5f)
                moveTo(4.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 4.0f)
                curveTo(3.0f, 7.57f, 4.14f, 11.05f, 6.24f, 13.94f)
                lineTo(7.66f, 12.5f)
                curveTo(7.28f, 11.97f, 6.93f, 11.39f, 6.62f, 10.79f)
                lineTo(8.82f, 8.59f)
                curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.5f, 3.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _phoneOff!!
    }

private var _phoneOff: ImageVector? = null
