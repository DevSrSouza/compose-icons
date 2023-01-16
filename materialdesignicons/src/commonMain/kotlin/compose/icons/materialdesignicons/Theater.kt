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

public val MaterialDesignIcons.Theater: ImageVector
    get() {
        if (_theater != null) {
            return _theater!!
        }
        _theater = Builder(name = "Theater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 15.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 15.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 15.0f)
                moveTo(11.0f, 7.0f)
                lineTo(15.0f, 10.0f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(7.0f)
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(13.54f)
                curveTo(21.41f, 13.19f, 20.73f, 13.0f, 20.0f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                curveTo(3.27f, 13.0f, 2.59f, 13.19f, 2.0f, 13.54f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                close()
            }
        }
        .build()
        return _theater!!
    }

private var _theater: ImageVector? = null
