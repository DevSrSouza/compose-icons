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

public val MaterialDesignIcons.MicrosoftXboxControllerOff: ImageVector
    get() {
        if (_microsoftXboxControllerOff != null) {
            return _microsoftXboxControllerOff!!
        }
        _microsoftXboxControllerOff = Builder(name = "MicrosoftXboxControllerOff", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(12.5f, 15.75f)
                horizontalLineTo(8.75f)
                curveTo(6.75f, 15.75f, 6.0f, 18.0f, 4.0f, 19.0f)
                curveTo(2.0f, 19.0f, 0.5f, 16.04f, 4.42f, 7.69f)
                lineTo(2.0f, 5.27f)
                moveTo(9.33f, 6.23f)
                horizontalLineTo(14.67f)
                curveTo(16.0f, 5.0f, 18.81f, 6.67f, 18.81f, 6.67f)
                lineTo(19.25f, 7.5f)
                horizontalLineTo(19.5f)
                curveTo(23.0f, 15.0f, 22.28f, 18.2f, 20.69f, 18.87f)
                lineTo(7.62f, 5.8f)
                curveTo(8.25f, 5.73f, 8.87f, 5.81f, 9.33f, 6.23f)
                moveTo(12.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _microsoftXboxControllerOff!!
    }

private var _microsoftXboxControllerOff: ImageVector? = null
