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

public val MaterialDesignIcons.AlertOctagramOutline: ImageVector
    get() {
        if (_alertOctagramOutline != null) {
            return _alertOctagramOutline!!
        }
        _alertOctagramOutline = Builder(name = "AlertOctagramOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2f, 16.06f)
                lineTo(3.88f, 12.0f)
                lineTo(2.2f, 7.94f)
                lineTo(6.26f, 6.26f)
                lineTo(7.94f, 2.2f)
                lineTo(12.0f, 3.88f)
                lineTo(16.06f, 2.2f)
                lineTo(17.74f, 6.26f)
                lineTo(21.8f, 7.94f)
                lineTo(20.12f, 12.0f)
                lineTo(21.8f, 16.06f)
                lineTo(17.74f, 17.74f)
                lineTo(16.06f, 21.8f)
                lineTo(12.0f, 20.12f)
                lineTo(7.94f, 21.8f)
                lineTo(6.26f, 17.74f)
                lineTo(2.2f, 16.06f)
                moveTo(4.81f, 9.0f)
                lineTo(6.05f, 12.0f)
                lineTo(4.81f, 15.0f)
                lineTo(7.79f, 16.21f)
                lineTo(9.0f, 19.19f)
                lineTo(12.0f, 17.95f)
                lineTo(15.0f, 19.19f)
                lineTo(16.21f, 16.21f)
                lineTo(19.19f, 15.0f)
                lineTo(17.95f, 12.0f)
                lineTo(19.19f, 9.0f)
                lineTo(16.21f, 7.79f)
                lineTo(15.0f, 4.81f)
                lineTo(12.0f, 6.05f)
                lineTo(9.0f, 4.81f)
                lineTo(7.79f, 7.79f)
                lineTo(4.81f, 9.0f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
            }
        }
        .build()
        return _alertOctagramOutline!!
    }

private var _alertOctagramOutline: ImageVector? = null
