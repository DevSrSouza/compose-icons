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

public val MaterialDesignIcons.PhoneAlert: ImageVector
    get() {
        if (_phoneAlert != null) {
            return _phoneAlert!!
        }
        _phoneAlert = Builder(name = "PhoneAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.62f, 10.79f)
                curveTo(8.06f, 13.62f, 10.38f, 15.94f, 13.21f, 17.38f)
                lineTo(15.41f, 15.18f)
                curveTo(15.69f, 14.9f, 16.08f, 14.82f, 16.43f, 14.93f)
                curveTo(17.55f, 15.3f, 18.75f, 15.5f, 20.0f, 15.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 16.5f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 21.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, true, 3.0f, 4.0f)
                curveTo(3.0f, 3.44f, 3.45f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.5f, 4.0f)
                curveTo(8.5f, 5.24f, 8.7f, 6.45f, 9.07f, 7.57f)
                curveTo(9.18f, 7.92f, 9.1f, 8.31f, 8.82f, 8.58f)
                lineTo(6.62f, 10.79f)
                moveTo(17.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _phoneAlert!!
    }

private var _phoneAlert: ImageVector? = null
