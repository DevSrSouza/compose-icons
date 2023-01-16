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

public val MaterialDesignIcons.AccountSwitchOutline: ImageVector
    get() {
        if (_accountSwitchOutline != null) {
            return _accountSwitchOutline!!
        }
        _accountSwitchOutline = Builder(name = "AccountSwitchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveTo(22.0f, 9.0f, 22.0f, 13.0f, 22.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 13.0f, 16.0f, 11.31f, 14.85f, 9.8f)
                curveTo(14.68f, 9.57f, 14.47f, 9.35f, 14.25f, 9.14f)
                curveTo(14.77f, 9.06f, 15.34f, 9.0f, 16.0f, 9.0f)
                moveTo(8.0f, 11.0f)
                curveTo(11.5f, 11.0f, 11.94f, 12.56f, 12.0f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(4.06f, 12.56f, 4.5f, 11.0f, 8.0f, 11.0f)
                moveTo(8.0f, 9.0f)
                curveTo(2.0f, 9.0f, 2.0f, 13.0f, 2.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                curveTo(14.0f, 13.0f, 14.0f, 9.0f, 8.0f, 9.0f)
                moveTo(9.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                lineTo(18.0f, 20.0f)
                lineTo(15.0f, 23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                lineTo(6.0f, 20.0f)
                lineTo(9.0f, 17.0f)
                moveTo(8.0f, 3.0f)
                curveTo(8.55f, 3.0f, 9.0f, 3.45f, 9.0f, 4.0f)
                reflectiveCurveTo(8.55f, 5.0f, 8.0f, 5.0f)
                reflectiveCurveTo(7.0f, 4.55f, 7.0f, 4.0f)
                reflectiveCurveTo(7.45f, 3.0f, 8.0f, 3.0f)
                moveTo(8.0f, 1.0f)
                curveTo(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f)
                reflectiveCurveTo(6.34f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveTo(11.0f, 5.66f, 11.0f, 4.0f)
                reflectiveCurveTo(9.66f, 1.0f, 8.0f, 1.0f)
                moveTo(16.0f, 1.0f)
                curveTo(14.34f, 1.0f, 13.0f, 2.34f, 13.0f, 4.0f)
                reflectiveCurveTo(14.34f, 7.0f, 16.0f, 7.0f)
                reflectiveCurveTo(19.0f, 5.66f, 19.0f, 4.0f)
                reflectiveCurveTo(17.66f, 1.0f, 16.0f, 1.0f)
                close()
            }
        }
        .build()
        return _accountSwitchOutline!!
    }

private var _accountSwitchOutline: ImageVector? = null
