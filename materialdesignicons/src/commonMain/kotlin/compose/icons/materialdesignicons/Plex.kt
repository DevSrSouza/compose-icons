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

public val MaterialDesignIcons.Plex: ImageVector
    get() {
        if (_plex != null) {
            return _plex!!
        }
        _plex = Builder(name = "Plex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.89f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.11f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                moveTo(8.56f, 6.0f)
                horizontalLineTo(12.06f)
                lineTo(15.5f, 12.0f)
                lineTo(12.06f, 18.0f)
                horizontalLineTo(8.56f)
                lineTo(12.0f, 12.0f)
                lineTo(8.56f, 6.0f)
                close()
            }
        }
        .build()
        return _plex!!
    }

private var _plex: ImageVector? = null
