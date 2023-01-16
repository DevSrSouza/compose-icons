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

public val MaterialDesignIcons.ContentSaveAllOutline: ImageVector
    get() {
        if (_contentSaveAllOutline != null) {
            return _contentSaveAllOutline!!
        }
        _contentSaveAllOutline = Builder(name = "ContentSaveAllOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 23.0f, 1.0f, 22.11f, 1.0f, 21.0f)
                verticalLineTo(7.0f)
                moveTo(19.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 18.1f, 5.89f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 19.0f, 23.0f, 18.1f, 23.0f, 17.0f)
                verticalLineTo(5.0f)
                lineTo(19.0f, 1.0f)
                moveTo(21.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.17f)
                lineTo(21.0f, 5.83f)
                verticalLineTo(17.0f)
                moveTo(14.0f, 10.0f)
                curveTo(12.34f, 10.0f, 11.0f, 11.34f, 11.0f, 13.0f)
                reflectiveCurveTo(12.34f, 16.0f, 14.0f, 16.0f)
                reflectiveCurveTo(17.0f, 14.66f, 17.0f, 13.0f)
                reflectiveCurveTo(15.66f, 10.0f, 14.0f, 10.0f)
                moveTo(8.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _contentSaveAllOutline!!
    }

private var _contentSaveAllOutline: ImageVector? = null
