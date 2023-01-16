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

public val MaterialDesignIcons.Hulu: ImageVector
    get() {
        if (_hulu != null) {
            return _hulu!!
        }
        _hulu = Builder(name = "Hulu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 12.8f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.7f)
                verticalLineTo(13.9f)
                curveTo(14.7f, 13.2f, 14.1f, 12.6f, 13.4f, 12.6f)
                horizontalLineTo(10.5f)
                curveTo(9.8f, 12.6f, 9.2f, 13.2f, 9.2f, 13.9f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.3f)
                verticalLineTo(8.4f)
                curveTo(9.6f, 8.3f, 9.9f, 8.2f, 10.2f, 8.2f)
                horizontalLineTo(15.0f)
                curveTo(17.5f, 8.2f, 19.5f, 10.3f, 19.5f, 12.8f)
                close()
            }
        }
        .build()
        return _hulu!!
    }

private var _hulu: ImageVector? = null
