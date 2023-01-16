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

public val MaterialDesignIcons.ContentSaveOff: ImageVector
    get() {
        if (_contentSaveOff != null) {
            return _contentSaveOff!!
        }
        _contentSaveOff = Builder(name = "ContentSaveOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2f, 5.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(17.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(17.8f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.2f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21.0f)
                curveTo(19.07f, 21.0f, 19.03f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.97f, 3.0f, 4.93f, 3.0f, 4.9f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7.11f, 9.0f)
                lineTo(5.0f, 6.89f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.11f)
                moveTo(14.89f, 16.78f)
                lineTo(11.22f, 13.11f)
                curveTo(9.95f, 13.46f, 9.0f, 14.61f, 9.0f, 16.0f)
                curveTo(9.0f, 17.66f, 10.34f, 19.0f, 12.0f, 19.0f)
                curveTo(13.39f, 19.0f, 14.54f, 18.05f, 14.89f, 16.78f)
                close()
            }
        }
        .build()
        return _contentSaveOff!!
    }

private var _contentSaveOff: ImageVector? = null
