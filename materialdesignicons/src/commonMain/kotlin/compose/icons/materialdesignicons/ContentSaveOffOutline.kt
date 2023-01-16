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

public val MaterialDesignIcons.ContentSaveOffOutline: ImageVector
    get() {
        if (_contentSaveOffOutline != null) {
            return _contentSaveOffOutline!!
        }
        _contentSaveOffOutline = Builder(name = "ContentSaveOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2f, 5.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(17.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(17.8f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(7.83f)
                lineTo(16.17f, 5.0f)
                horizontalLineTo(8.2f)
                moveTo(15.0f, 10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.2f)
                lineTo(13.2f, 10.0f)
                horizontalLineTo(15.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21.0f)
                curveTo(19.07f, 21.0f, 19.03f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.97f, 3.0f, 4.93f, 3.0f, 4.9f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(17.11f, 19.0f)
                lineTo(14.59f, 16.5f)
                curveTo(14.08f, 17.39f, 13.12f, 18.0f, 12.0f, 18.0f)
                curveTo(10.34f, 18.0f, 9.0f, 16.66f, 9.0f, 15.0f)
                curveTo(9.0f, 13.88f, 9.61f, 12.92f, 10.5f, 12.41f)
                lineTo(8.11f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.89f)
                lineTo(5.0f, 6.89f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.11f)
                close()
            }
        }
        .build()
        return _contentSaveOffOutline!!
    }

private var _contentSaveOffOutline: ImageVector? = null
