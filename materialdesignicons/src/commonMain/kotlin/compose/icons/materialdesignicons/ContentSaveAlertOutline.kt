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

public val MaterialDesignIcons.ContentSaveAlertOutline: ImageVector
    get() {
        if (_contentSaveAlertOutline != null) {
            return _contentSaveAlertOutline!!
        }
        _contentSaveAlertOutline = Builder(name = "ContentSaveAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 20.1f, 1.9f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 21.0f, 19.0f, 20.1f, 19.0f, 19.0f)
                verticalLineTo(7.0f)
                lineTo(15.0f, 3.0f)
                moveTo(17.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.2f)
                lineTo(17.0f, 7.8f)
                verticalLineTo(19.0f)
                moveTo(10.0f, 12.0f)
                curveTo(8.3f, 12.0f, 7.0f, 13.3f, 7.0f, 15.0f)
                reflectiveCurveTo(8.3f, 18.0f, 10.0f, 18.0f)
                reflectiveCurveTo(13.0f, 16.7f, 13.0f, 15.0f)
                reflectiveCurveTo(11.7f, 12.0f, 10.0f, 12.0f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(23.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                moveTo(23.0f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _contentSaveAlertOutline!!
    }

private var _contentSaveAlertOutline: ImageVector? = null
