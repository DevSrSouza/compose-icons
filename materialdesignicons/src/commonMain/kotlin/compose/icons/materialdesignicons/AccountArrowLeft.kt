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

public val MaterialDesignIcons.AccountArrowLeft: ImageVector
    get() {
        if (_accountArrowLeft != null) {
            return _accountArrowLeft!!
        }
        _accountArrowLeft = Builder(name = "AccountArrowLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                lineTo(14.0f, 17.0f)
                lineTo(17.0f, 20.0f)
                verticalLineTo(18.0f)
                moveTo(11.0f, 4.0f)
                curveTo(8.8f, 4.0f, 7.0f, 5.8f, 7.0f, 8.0f)
                reflectiveCurveTo(8.8f, 12.0f, 11.0f, 12.0f)
                reflectiveCurveTo(15.0f, 10.2f, 15.0f, 8.0f)
                reflectiveCurveTo(13.2f, 4.0f, 11.0f, 4.0f)
                moveTo(11.0f, 14.0f)
                curveTo(6.6f, 14.0f, 3.0f, 15.8f, 3.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.5f)
                curveTo(12.2f, 19.2f, 12.0f, 18.4f, 12.0f, 17.5f)
                curveTo(12.0f, 16.3f, 12.3f, 15.2f, 12.9f, 14.1f)
                curveTo(12.3f, 14.1f, 11.7f, 14.0f, 11.0f, 14.0f)
            }
        }
        .build()
        return _accountArrowLeft!!
    }

private var _accountArrowLeft: ImageVector? = null
