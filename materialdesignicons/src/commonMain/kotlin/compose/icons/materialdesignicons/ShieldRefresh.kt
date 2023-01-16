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

public val MaterialDesignIcons.ShieldRefresh: ImageVector
    get() {
        if (_shieldRefresh != null) {
            return _shieldRefresh!!
        }
        _shieldRefresh = Builder(name = "ShieldRefresh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveTo(19.0f, 12.0f, 20.0f, 12.2f, 20.9f, 12.7f)
                curveTo(21.0f, 12.1f, 21.0f, 11.6f, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.5f, 6.8f, 21.7f, 12.0f, 23.0f)
                curveTo(12.4f, 22.9f, 12.7f, 22.8f, 13.0f, 22.7f)
                curveTo(12.0f, 21.5f, 11.5f, 20.0f, 11.5f, 18.5f)
                curveTo(11.5f, 14.9f, 14.4f, 12.0f, 18.0f, 12.0f)
                moveTo(18.0f, 14.5f)
                curveTo(19.1f, 14.5f, 20.1f, 14.9f, 20.8f, 15.7f)
                lineTo(22.0f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.0f)
                lineTo(19.8f, 16.7f)
                curveTo(19.3f, 16.3f, 18.7f, 16.0f, 18.0f, 16.0f)
                curveTo(16.6f, 16.0f, 15.5f, 17.1f, 15.5f, 18.5f)
                reflectiveCurveTo(16.6f, 21.0f, 18.0f, 21.0f)
                curveTo(18.8f, 21.0f, 19.5f, 20.6f, 20.0f, 20.0f)
                horizontalLineTo(21.7f)
                curveTo(21.1f, 21.5f, 19.7f, 22.5f, 18.0f, 22.5f)
                curveTo(15.8f, 22.5f, 14.0f, 20.7f, 14.0f, 18.5f)
                reflectiveCurveTo(15.8f, 14.5f, 18.0f, 14.5f)
                close()
            }
        }
        .build()
        return _shieldRefresh!!
    }

private var _shieldRefresh: ImageVector? = null
