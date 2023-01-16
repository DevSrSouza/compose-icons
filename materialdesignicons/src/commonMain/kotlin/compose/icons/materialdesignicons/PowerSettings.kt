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

public val MaterialDesignIcons.PowerSettings: ImageVector
    get() {
        if (_powerSettings != null) {
            return _powerSettings!!
        }
        _powerSettings = Builder(name = "PowerSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                moveTo(16.56f, 4.44f)
                lineTo(15.11f, 5.89f)
                curveTo(16.84f, 6.94f, 18.0f, 8.83f, 18.0f, 11.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 17.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 11.0f)
                curveTo(6.0f, 8.83f, 7.16f, 6.94f, 8.88f, 5.88f)
                lineTo(7.44f, 4.44f)
                curveTo(5.36f, 5.88f, 4.0f, 8.28f, 4.0f, 11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 11.0f)
                curveTo(20.0f, 8.28f, 18.64f, 5.88f, 16.56f, 4.44f)
                moveTo(13.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _powerSettings!!
    }

private var _powerSettings: ImageVector? = null
