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

public val MaterialDesignIcons.Billiards: ImageVector
    get() {
        if (_billiards != null) {
            return _billiards!!
        }
        _billiards = Builder(name = "Billiards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 15.0f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 10.5f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 7.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 9.0f)
                verticalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 13.5f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 17.0f)
                moveTo(12.0f, 1.0f)
                curveTo(5.92f, 1.0f, 1.0f, 5.92f, 1.0f, 12.0f)
                curveTo(1.0f, 18.08f, 5.92f, 23.0f, 12.0f, 23.0f)
                curveTo(18.08f, 23.0f, 23.0f, 18.08f, 23.0f, 12.0f)
                curveTo(23.0f, 5.92f, 18.08f, 1.0f, 12.0f, 1.0f)
                moveTo(12.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _billiards!!
    }

private var _billiards: ImageVector? = null
