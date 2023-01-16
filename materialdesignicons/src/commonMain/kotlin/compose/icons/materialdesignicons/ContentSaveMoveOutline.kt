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

public val MaterialDesignIcons.ContentSaveMoveOutline: ImageVector
    get() {
        if (_contentSaveMoveOutline != null) {
            return _contentSaveMoveOutline!!
        }
        _contentSaveMoveOutline = Builder(name = "ContentSaveMoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                lineTo(22.0f, 18.5f)
                lineTo(17.0f, 23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                moveTo(14.0f, 12.8f)
                curveTo(13.5f, 12.31f, 12.78f, 12.0f, 12.0f, 12.0f)
                curveTo(10.34f, 12.0f, 9.0f, 13.34f, 9.0f, 15.0f)
                curveTo(9.0f, 16.31f, 9.84f, 17.41f, 11.0f, 17.82f)
                curveTo(11.07f, 15.67f, 12.27f, 13.8f, 14.0f, 12.8f)
                moveTo(11.09f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.17f)
                lineTo(19.0f, 7.83f)
                verticalLineTo(12.35f)
                curveTo(19.75f, 12.61f, 20.42f, 13.0f, 21.0f, 13.54f)
                verticalLineTo(7.0f)
                lineTo(17.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(11.81f)
                curveTo(11.46f, 20.39f, 11.21f, 19.72f, 11.09f, 19.0f)
                moveTo(6.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _contentSaveMoveOutline!!
    }

private var _contentSaveMoveOutline: ImageVector? = null
