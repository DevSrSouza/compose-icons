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

public val MaterialDesignIcons.MicrosoftXboxController: ImageVector
    get() {
        if (_microsoftXboxController != null) {
            return _microsoftXboxController!!
        }
        _microsoftXboxController = Builder(name = "MicrosoftXboxController", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 15.75f)
                curveTo(6.75f, 15.75f, 6.0f, 18.0f, 4.0f, 19.0f)
                curveTo(2.0f, 19.0f, 0.5f, 16.0f, 4.5f, 7.5f)
                horizontalLineTo(4.75f)
                lineTo(5.19f, 6.67f)
                curveTo(5.19f, 6.67f, 8.0f, 5.0f, 9.33f, 6.23f)
                horizontalLineTo(14.67f)
                curveTo(16.0f, 5.0f, 18.81f, 6.67f, 18.81f, 6.67f)
                lineTo(19.25f, 7.5f)
                horizontalLineTo(19.5f)
                curveTo(23.5f, 16.0f, 22.0f, 19.0f, 20.0f, 19.0f)
                curveTo(18.0f, 18.0f, 17.25f, 15.75f, 15.25f, 15.75f)
                horizontalLineTo(8.75f)
                moveTo(12.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _microsoftXboxController!!
    }

private var _microsoftXboxController: ImageVector? = null
