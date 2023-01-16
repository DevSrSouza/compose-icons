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

public val MaterialDesignIcons.EmoticonTongueOutline: ImageVector
    get() {
        if (_emoticonTongueOutline != null) {
            return _emoticonTongueOutline!!
        }
        _emoticonTongueOutline = Builder(name = "EmoticonTongueOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(9.0f, 10.0f)
                curveTo(8.26f, 10.0f, 7.61f, 10.4f, 7.27f, 11.0f)
                curveTo(7.1f, 10.71f, 7.0f, 10.36f, 7.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 8.0f)
                curveTo(10.11f, 8.0f, 11.0f, 8.9f, 11.0f, 10.0f)
                curveTo(11.0f, 10.36f, 10.9f, 10.71f, 10.73f, 11.0f)
                curveTo(10.39f, 10.4f, 9.74f, 10.0f, 9.0f, 10.0f)
                moveTo(17.0f, 10.0f)
                curveTo(17.0f, 10.36f, 16.9f, 10.71f, 16.73f, 11.0f)
                curveTo(16.39f, 10.4f, 15.74f, 10.0f, 15.0f, 10.0f)
                curveTo(14.26f, 10.0f, 13.61f, 10.4f, 13.27f, 11.0f)
                curveTo(13.1f, 10.71f, 13.0f, 10.36f, 13.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 8.0f)
                curveTo(16.11f, 8.0f, 17.0f, 8.9f, 17.0f, 10.0f)
                moveTo(16.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 17.0f, 14.1f, 18.0f, 13.0f, 18.0f)
                curveTo(11.9f, 18.0f, 11.0f, 17.0f, 11.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _emoticonTongueOutline!!
    }

private var _emoticonTongueOutline: ImageVector? = null
