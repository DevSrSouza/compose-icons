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

public val MaterialDesignIcons.AccountEditOutline: ImageVector
    get() {
        if (_accountEditOutline != null) {
            return _accountEditOutline!!
        }
        _accountEditOutline = Builder(name = "AccountEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.11f)
                horizontalLineTo(3.9f)
                verticalLineTo(17.0f)
                curveTo(3.9f, 16.36f, 7.03f, 14.9f, 10.0f, 14.9f)
                curveTo(10.96f, 14.91f, 11.91f, 15.04f, 12.83f, 15.28f)
                lineTo(14.35f, 13.76f)
                curveTo(12.95f, 13.29f, 11.5f, 13.03f, 10.0f, 13.0f)
                curveTo(7.33f, 13.0f, 2.0f, 14.33f, 2.0f, 17.0f)
                moveTo(10.0f, 4.0f)
                curveTo(7.79f, 4.0f, 6.0f, 5.79f, 6.0f, 8.0f)
                reflectiveCurveTo(7.79f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(14.0f, 10.21f, 14.0f, 8.0f)
                reflectiveCurveTo(12.21f, 4.0f, 10.0f, 4.0f)
                moveTo(10.0f, 10.0f)
                curveTo(8.9f, 10.0f, 8.0f, 9.11f, 8.0f, 8.0f)
                reflectiveCurveTo(8.9f, 6.0f, 10.0f, 6.0f)
                reflectiveCurveTo(12.0f, 6.9f, 12.0f, 8.0f)
                reflectiveCurveTo(11.11f, 10.0f, 10.0f, 10.0f)
                moveTo(21.7f, 13.35f)
                lineTo(20.7f, 14.35f)
                lineTo(18.65f, 12.35f)
                lineTo(19.65f, 11.35f)
                curveTo(19.86f, 11.14f, 20.21f, 11.14f, 20.42f, 11.35f)
                lineTo(21.7f, 12.63f)
                curveTo(21.91f, 12.84f, 21.91f, 13.19f, 21.7f, 13.4f)
                moveTo(12.0f, 18.94f)
                lineTo(18.06f, 12.88f)
                lineTo(20.11f, 14.88f)
                lineTo(14.11f, 20.95f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.94f)
            }
        }
        .build()
        return _accountEditOutline!!
    }

private var _accountEditOutline: ImageVector? = null
