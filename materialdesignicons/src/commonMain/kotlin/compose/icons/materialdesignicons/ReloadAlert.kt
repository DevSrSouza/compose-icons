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

public val MaterialDesignIcons.ReloadAlert: ImageVector
    get() {
        if (_reloadAlert != null) {
            return _reloadAlert!!
        }
        _reloadAlert = Builder(name = "ReloadAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.0f, 6.0f, 21.0f, 11.0f, 21.0f)
                curveTo(13.4f, 21.0f, 15.7f, 20.1f, 17.4f, 18.4f)
                lineTo(15.9f, 16.9f)
                curveTo(14.6f, 18.3f, 12.9f, 19.0f, 11.0f, 19.0f)
                curveTo(4.8f, 19.0f, 1.6f, 11.5f, 6.1f, 7.1f)
                reflectiveCurveTo(18.0f, 5.8f, 18.0f, 12.0f)
                horizontalLineTo(15.0f)
                lineTo(19.0f, 16.0f)
                horizontalLineTo(19.1f)
                lineTo(23.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.0f, 16.0f, 3.0f, 11.0f, 3.0f)
                reflectiveCurveTo(2.0f, 7.0f, 2.0f, 12.0f)
                moveTo(10.0f, 15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
            }
        }
        .build()
        return _reloadAlert!!
    }

private var _reloadAlert: ImageVector? = null
