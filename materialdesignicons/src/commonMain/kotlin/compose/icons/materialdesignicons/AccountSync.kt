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

public val MaterialDesignIcons.AccountSync: ImageVector
    get() {
        if (_accountSync != null) {
            return _accountSync!!
        }
        _accountSync = Builder(name = "AccountSync", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(18.0f, 20.0f)
                curveTo(16.6f, 20.0f, 15.5f, 18.9f, 15.5f, 17.5f)
                curveTo(15.5f, 17.1f, 15.6f, 16.7f, 15.8f, 16.4f)
                lineTo(14.7f, 15.3f)
                curveTo(14.3f, 15.9f, 14.0f, 16.7f, 14.0f, 17.5f)
                curveTo(14.0f, 19.7f, 15.8f, 21.5f, 18.0f, 21.5f)
                verticalLineTo(23.0f)
                lineTo(20.2f, 20.8f)
                lineTo(18.0f, 18.5f)
                verticalLineTo(20.0f)
                moveTo(18.0f, 13.5f)
                verticalLineTo(12.0f)
                lineTo(15.8f, 14.2f)
                lineTo(18.0f, 16.4f)
                verticalLineTo(15.0f)
                curveTo(19.4f, 15.0f, 20.5f, 16.1f, 20.5f, 17.5f)
                curveTo(20.5f, 17.9f, 20.4f, 18.3f, 20.2f, 18.6f)
                lineTo(21.3f, 19.7f)
                curveTo(21.7f, 19.1f, 22.0f, 18.3f, 22.0f, 17.5f)
                curveTo(22.0f, 15.3f, 20.2f, 13.5f, 18.0f, 13.5f)
                close()
            }
        }
        .build()
        return _accountSync!!
    }

private var _accountSync: ImageVector? = null
