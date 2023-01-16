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

public val MaterialDesignIcons.AccountWrenchOutline: ImageVector
    get() {
        if (_accountWrenchOutline != null) {
            return _accountWrenchOutline!!
        }
        _accountWrenchOutline = Builder(name = "AccountWrenchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9f, 21.2f)
                lineTo(18.8f, 17.1f)
                curveTo(19.2f, 16.1f, 19.0f, 14.8f, 18.1f, 14.0f)
                curveTo(17.2f, 13.1f, 15.9f, 12.9f, 14.8f, 13.4f)
                lineTo(16.7f, 15.3f)
                lineTo(15.3f, 16.7f)
                lineTo(13.3f, 14.7f)
                curveTo(12.8f, 15.8f, 13.0f, 17.1f, 13.9f, 18.1f)
                curveTo(14.8f, 19.0f, 16.0f, 19.2f, 17.0f, 18.8f)
                lineTo(21.1f, 22.9f)
                curveTo(21.3f, 23.1f, 21.6f, 23.1f, 21.7f, 22.9f)
                lineTo(22.7f, 21.9f)
                curveTo(23.0f, 21.6f, 23.0f, 21.3f, 22.9f, 21.2f)
                moveTo(10.0f, 12.0f)
                curveTo(12.2f, 12.0f, 14.0f, 10.2f, 14.0f, 8.0f)
                reflectiveCurveTo(12.2f, 4.0f, 10.0f, 4.0f)
                reflectiveCurveTo(6.0f, 5.8f, 6.0f, 8.0f)
                reflectiveCurveTo(7.8f, 12.0f, 10.0f, 12.0f)
                moveTo(10.0f, 6.0f)
                curveTo(11.1f, 6.0f, 12.0f, 6.9f, 12.0f, 8.0f)
                reflectiveCurveTo(11.1f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveTo(8.0f, 9.1f, 8.0f, 8.0f)
                reflectiveCurveTo(8.9f, 6.0f, 10.0f, 6.0f)
                moveTo(13.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 14.3f, 7.3f, 13.0f, 10.0f, 13.0f)
                curveTo(10.5f, 13.0f, 11.2f, 13.1f, 11.9f, 13.2f)
                curveTo(11.5f, 13.7f, 11.3f, 14.3f, 11.1f, 15.0f)
                curveTo(10.7f, 15.0f, 10.4f, 14.9f, 10.0f, 14.9f)
                curveTo(7.0f, 14.9f, 3.9f, 16.4f, 3.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(11.5f)
                curveTo(11.8f, 18.9f, 12.4f, 19.5f, 13.0f, 20.0f)
                close()
            }
        }
        .build()
        return _accountWrenchOutline!!
    }

private var _accountWrenchOutline: ImageVector? = null
