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

public val MaterialDesignIcons.Doorbell: ImageVector
    get() {
        if (_doorbell != null) {
            return _doorbell!!
        }
        _doorbell = Builder(name = "Doorbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(10.9f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                reflectiveCurveTo(10.9f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(14.0f, 13.1f, 14.0f, 12.0f)
                reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f)
                moveTo(16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(6.0f, 21.1f, 6.9f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1f, 22.0f, 18.0f, 21.1f, 18.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 2.9f, 17.1f, 2.0f, 16.0f, 2.0f)
                moveTo(16.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _doorbell!!
    }

private var _doorbell: ImageVector? = null
