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

public val MaterialDesignIcons.WardrobeOutline: ImageVector
    get() {
        if (_wardrobeOutline != null) {
            return _wardrobeOutline!!
        }
        _wardrobeOutline = Builder(name = "WardrobeOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(19.0f)
                curveTo(4.0f, 20.11f, 4.89f, 21.0f, 6.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                curveTo(19.11f, 21.0f, 20.0f, 20.11f, 20.0f, 19.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.11f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                moveTo(13.0f, 4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                moveTo(8.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                moveTo(14.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _wardrobeOutline!!
    }

private var _wardrobeOutline: ImageVector? = null
