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

public val MaterialDesignIcons.ContentSaveMove: ImageVector
    get() {
        if (_contentSaveMove != null) {
            return _contentSaveMove!!
        }
        _contentSaveMove = Builder(name = "ContentSaveMove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(11.81f)
                curveTo(11.42f, 20.34f, 11.17f, 19.6f, 11.07f, 18.84f)
                curveTo(9.5f, 18.31f, 8.66f, 16.6f, 9.2f, 15.03f)
                curveTo(9.61f, 13.83f, 10.73f, 13.0f, 12.0f, 13.0f)
                curveTo(12.44f, 13.0f, 12.88f, 13.1f, 13.28f, 13.29f)
                curveTo(15.57f, 11.5f, 18.83f, 11.59f, 21.0f, 13.54f)
                verticalLineTo(7.0f)
                lineTo(17.0f, 3.0f)
                moveTo(15.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                moveTo(13.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                lineTo(22.0f, 18.5f)
                lineTo(17.0f, 23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
            }
        }
        .build()
        return _contentSaveMove!!
    }

private var _contentSaveMove: ImageVector? = null
