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

public val MaterialDesignIcons.LocationEnter: ImageVector
    get() {
        if (_locationEnter != null) {
            return _locationEnter!!
        }
        _locationEnter = Builder(name = "LocationEnter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                lineTo(10.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.46f, 15.0f)
                horizontalLineTo(4.59f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 4.59f, 9.0f)
                horizontalLineTo(2.46f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _locationEnter!!
    }

private var _locationEnter: ImageVector? = null
