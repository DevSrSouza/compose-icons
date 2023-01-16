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

public val MaterialDesignIcons.PhoneMessage: ImageVector
    get() {
        if (_phoneMessage != null) {
            return _phoneMessage!!
        }
        _phoneMessage = Builder(name = "PhoneMessage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.9f, 15.41f, 15.17f)
                lineTo(13.21f, 17.37f)
                curveTo(10.38f, 15.93f, 8.06f, 13.62f, 6.62f, 10.79f)
                lineTo(8.82f, 8.58f)
                curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f)
                curveTo(8.5f, 3.45f, 8.05f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 3.0f, 3.0f, 3.45f, 3.0f, 4.0f)
                curveTo(3.0f, 13.39f, 10.61f, 21.0f, 20.0f, 21.0f)
                curveTo(20.55f, 21.0f, 21.0f, 20.55f, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 15.95f, 20.55f, 15.5f, 20.0f, 15.5f)
                moveTo(12.0f, 3.0f)
                verticalLineTo(13.0f)
                lineTo(15.0f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _phoneMessage!!
    }

private var _phoneMessage: ImageVector? = null
