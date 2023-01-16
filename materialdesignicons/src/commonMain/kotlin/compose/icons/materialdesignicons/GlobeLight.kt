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

public val MaterialDesignIcons.GlobeLight: ImageVector
    get() {
        if (_globeLight != null) {
            return _globeLight!!
        }
        _globeLight = Builder(name = "GlobeLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1f, 10.0f)
                curveTo(8.1f, 9.0f, 9.5f, 8.3f, 11.0f, 8.1f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.1f)
                curveTo(14.5f, 8.3f, 15.9f, 9.0f, 16.9f, 10.0f)
                horizontalLineTo(7.1f)
                moveTo(5.3f, 13.0f)
                curveTo(5.1f, 13.6f, 5.0f, 14.3f, 5.0f, 15.0f)
                curveTo(5.0f, 18.9f, 8.1f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(19.0f, 18.9f, 19.0f, 15.0f)
                curveTo(19.0f, 14.3f, 18.9f, 13.6f, 18.7f, 13.0f)
                horizontalLineTo(5.3f)
                close()
            }
        }
        .build()
        return _globeLight!!
    }

private var _globeLight: ImageVector? = null
