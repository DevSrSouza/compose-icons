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

public val MaterialDesignIcons.CheckboxBlankBadgeOutline: ImageVector
    get() {
        if (_checkboxBlankBadgeOutline != null) {
            return _checkboxBlankBadgeOutline!!
        }
        _checkboxBlankBadgeOutline = Builder(name = "CheckboxBlankBadgeOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.5f)
                curveTo(23.0f, 6.43f, 21.43f, 8.0f, 19.5f, 8.0f)
                reflectiveCurveTo(16.0f, 6.43f, 16.0f, 4.5f)
                reflectiveCurveTo(17.57f, 1.0f, 19.5f, 1.0f)
                reflectiveCurveTo(23.0f, 2.57f, 23.0f, 4.5f)
                moveTo(19.5f, 10.0f)
                curveTo(19.33f, 10.0f, 19.17f, 10.0f, 19.0f, 10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.03f)
                curveTo(14.0f, 4.84f, 14.0f, 4.67f, 14.0f, 4.5f)
                curveTo(14.0f, 4.0f, 14.08f, 3.5f, 14.21f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(9.79f)
                curveTo(20.5f, 9.92f, 20.0f, 10.0f, 19.5f, 10.0f)
                close()
            }
        }
        .build()
        return _checkboxBlankBadgeOutline!!
    }

private var _checkboxBlankBadgeOutline: ImageVector? = null
