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

public val MaterialDesignIcons.RestoreAlert: ImageVector
    get() {
        if (_restoreAlert != null) {
            return _restoreAlert!!
        }
        _restoreAlert = Builder(name = "RestoreAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(8.0f, 3.0f, 4.0f, 7.0f, 4.0f, 12.0f)
                horizontalLineTo(1.0f)
                lineTo(4.9f, 15.9f)
                lineTo(5.0f, 16.0f)
                lineTo(9.0f, 12.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 8.1f, 9.1f, 5.0f, 13.0f, 5.0f)
                reflectiveCurveTo(20.0f, 8.1f, 20.0f, 12.0f)
                reflectiveCurveTo(16.9f, 19.0f, 13.0f, 19.0f)
                curveTo(11.1f, 19.0f, 9.3f, 18.2f, 8.1f, 16.9f)
                lineTo(6.7f, 18.3f)
                curveTo(8.3f, 20.0f, 10.5f, 21.0f, 13.0f, 21.0f)
                curveTo(18.0f, 21.0f, 22.0f, 17.0f, 22.0f, 12.0f)
                reflectiveCurveTo(18.0f, 3.0f, 13.0f, 3.0f)
                moveTo(12.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
            }
        }
        .build()
        return _restoreAlert!!
    }

private var _restoreAlert: ImageVector? = null
