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

public val MaterialDesignIcons.BloodBag: ImageVector
    get() {
        if (_bloodBag != null) {
            return _bloodBag!!
        }
        _bloodBag = Builder(name = "BloodBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                curveTo(20.0f, 7.0f, 20.0f, 6.0f, 20.0f, 6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 4.27f, 14.75f, 1.0f, 10.0f, 1.0f)
                curveTo(5.25f, 1.0f, 4.0f, 4.27f, 4.0f, 6.0f)
                verticalLineTo(19.0f)
                curveTo(4.0f, 19.33f, 3.9f, 21.0f, 2.0f, 21.0f)
                verticalLineTo(23.0f)
                curveTo(4.93f, 23.0f, 6.0f, 20.61f, 6.0f, 19.0f)
                verticalLineTo(6.0f)
                curveTo(6.0f, 5.88f, 6.05f, 3.0f, 10.0f, 3.0f)
                curveTo(13.83f, 3.0f, 14.0f, 5.7f, 14.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                curveTo(10.0f, 6.0f, 10.0f, 7.0f, 9.0f, 7.0f)
                curveTo(8.0f, 7.0f, 8.0f, 8.0f, 8.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(8.0f, 20.0f, 8.0f, 22.0f, 13.0f, 22.0f)
                curveTo(13.24f, 22.0f, 14.13f, 22.0f, 17.0f, 22.0f)
                curveTo(22.0f, 22.0f, 22.0f, 20.0f, 22.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 8.0f, 22.0f, 7.0f, 21.0f, 7.0f)
                moveTo(15.0f, 19.4f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 16.4f)
                curveTo(12.0f, 14.4f, 15.0f, 11.0f, 15.0f, 11.0f)
                curveTo(15.0f, 11.0f, 18.0f, 14.4f, 18.0f, 16.4f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 19.4f)
                close()
            }
        }
        .build()
        return _bloodBag!!
    }

private var _bloodBag: ImageVector? = null
