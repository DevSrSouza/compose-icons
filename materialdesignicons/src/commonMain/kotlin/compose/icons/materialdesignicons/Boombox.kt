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

public val MaterialDesignIcons.Boombox: ImageVector
    get() {
        if (_boombox != null) {
            return _boombox!!
        }
        _boombox = Builder(name = "Boombox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(5.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 18.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                moveTo(11.0f, 9.0f)
                horizontalLineTo(13.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 10.0f)
                horizontalLineTo(11.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 9.0f)
                moveTo(7.5f, 10.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.5f, 13.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.5f, 16.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.5f, 13.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.5f, 10.5f)
                moveTo(16.5f, 10.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.5f, 13.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.5f, 16.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.5f, 13.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.5f, 10.5f)
                moveTo(7.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 12.0f)
                moveTo(16.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 12.0f)
                close()
            }
        }
        .build()
        return _boombox!!
    }

private var _boombox: ImageVector? = null
