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

public val MaterialDesignIcons.GooglePlus: ImageVector
    get() {
        if (_googlePlus != null) {
            return _googlePlus!!
        }
        _googlePlus = Builder(name = "GooglePlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                moveTo(8.0f, 11.0f)
                verticalLineTo(13.4f)
                horizontalLineTo(12.0f)
                curveTo(11.8f, 14.4f, 10.8f, 16.4f, 8.0f, 16.4f)
                curveTo(5.6f, 16.4f, 3.7f, 14.4f, 3.7f, 12.0f)
                curveTo(3.7f, 9.6f, 5.6f, 7.6f, 8.0f, 7.6f)
                curveTo(9.4f, 7.6f, 10.3f, 8.2f, 10.8f, 8.7f)
                lineTo(12.7f, 6.9f)
                curveTo(11.5f, 5.7f, 9.9f, 5.0f, 8.0f, 5.0f)
                curveTo(4.1f, 5.0f, 1.0f, 8.1f, 1.0f, 12.0f)
                curveTo(1.0f, 15.9f, 4.1f, 19.0f, 8.0f, 19.0f)
                curveTo(12.0f, 19.0f, 14.7f, 16.2f, 14.7f, 12.2f)
                curveTo(14.7f, 11.7f, 14.7f, 11.4f, 14.6f, 11.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _googlePlus!!
    }

private var _googlePlus: ImageVector? = null
