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

public val MaterialDesignIcons.StarDavid: ImageVector
    get() {
        if (_starDavid != null) {
            return _starDavid!!
        }
        _starDavid = Builder(name = "StarDavid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(9.1f, 7.0f)
                horizontalLineTo(3.3f)
                lineTo(6.3f, 12.0f)
                lineTo(3.3f, 17.0f)
                horizontalLineTo(9.1f)
                lineTo(12.0f, 22.0f)
                lineTo(14.9f, 17.0f)
                horizontalLineTo(20.7f)
                lineTo(17.7f, 12.0f)
                lineTo(20.7f, 7.0f)
                horizontalLineTo(14.9f)
                lineTo(12.0f, 2.0f)
                moveTo(12.0f, 5.0f)
                lineTo(13.2f, 7.0f)
                horizontalLineTo(10.8f)
                lineTo(12.0f, 5.0f)
                moveTo(8.2f, 8.5f)
                lineTo(7.1f, 10.5f)
                lineTo(5.9f, 8.5f)
                horizontalLineTo(8.2f)
                moveTo(10.0f, 8.5f)
                horizontalLineTo(14.0f)
                lineTo(16.0f, 12.0f)
                lineTo(14.0f, 15.5f)
                horizontalLineTo(10.0f)
                lineTo(8.0f, 12.0f)
                lineTo(10.0f, 8.5f)
                moveTo(18.0f, 8.5f)
                lineTo(16.8f, 10.5f)
                lineTo(15.7f, 8.5f)
                horizontalLineTo(18.0f)
                moveTo(7.1f, 13.5f)
                lineTo(8.2f, 15.5f)
                horizontalLineTo(6.0f)
                lineTo(7.1f, 13.5f)
                moveTo(16.9f, 13.5f)
                lineTo(18.1f, 15.5f)
                horizontalLineTo(15.8f)
                lineTo(16.9f, 13.5f)
                moveTo(13.3f, 17.0f)
                lineTo(12.0f, 19.0f)
                lineTo(10.8f, 17.0f)
                horizontalLineTo(13.3f)
                close()
            }
        }
        .build()
        return _starDavid!!
    }

private var _starDavid: ImageVector? = null
