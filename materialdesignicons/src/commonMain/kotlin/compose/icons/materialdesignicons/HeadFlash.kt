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

public val MaterialDesignIcons.HeadFlash: ImageVector
    get() {
        if (_headFlash != null) {
            return _headFlash!!
        }
        _headFlash = Builder(name = "HeadFlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(9.2f, 3.0f, 6.2f, 6.0f, 6.0f, 9.7f)
                lineTo(4.1f, 12.2f)
                curveTo(3.9f, 12.5f, 4.1f, 13.0f, 4.5f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.1f, 6.9f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.3f)
                curveTo(18.4f, 15.2f, 20.0f, 12.8f, 20.0f, 10.0f)
                curveTo(20.0f, 6.1f, 16.9f, 3.0f, 13.0f, 3.0f)
                moveTo(15.0f, 9.0f)
                lineTo(11.9f, 15.0f)
                lineTo(12.5f, 11.0f)
                horizontalLineTo(10.5f)
                lineTo(12.5f, 6.0f)
                horizontalLineTo(15.0f)
                lineTo(13.5f, 9.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _headFlash!!
    }

private var _headFlash: ImageVector? = null
