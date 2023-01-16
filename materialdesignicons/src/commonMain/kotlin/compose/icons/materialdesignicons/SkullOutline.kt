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

public val MaterialDesignIcons.SkullOutline: ImageVector
    get() {
        if (_skullOutline != null) {
            return _skullOutline!!
        }
        _skullOutline = Builder(name = "SkullOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 15.0f)
                moveTo(10.5f, 17.0f)
                lineTo(12.0f, 14.0f)
                lineTo(13.5f, 17.0f)
                horizontalLineTo(10.5f)
                moveTo(16.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 15.0f)
                moveTo(22.0f, 11.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 11.0f)
                curveTo(2.0f, 13.8f, 3.2f, 16.3f, 5.0f, 18.1f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.1f)
                curveTo(20.8f, 16.3f, 22.0f, 13.8f, 22.0f, 11.0f)
                moveTo(17.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.2f)
                curveTo(5.2f, 15.7f, 4.0f, 13.5f, 4.0f, 11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 3.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 11.0f)
                curveTo(20.0f, 13.5f, 18.8f, 15.8f, 17.0f, 17.2f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _skullOutline!!
    }

private var _skullOutline: ImageVector? = null
