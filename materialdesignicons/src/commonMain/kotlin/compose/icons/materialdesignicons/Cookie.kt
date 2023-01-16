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

public val MaterialDesignIcons.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 12.0f)
                curveTo(21.0f, 11.5f, 20.96f, 11.0f, 20.87f, 10.5f)
                curveTo(20.6f, 10.0f, 20.0f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 8.0f, 17.0f, 8.0f, 17.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 6.0f, 14.0f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 3.0f, 12.0f, 3.0f, 12.0f, 3.0f)
                moveTo(9.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 6.0f)
                moveTo(6.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 10.0f)
                moveTo(11.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 11.0f)
                moveTo(16.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 16.0f)
                horizontalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 14.5f)
                horizontalLineTo(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 13.0f)
                moveTo(11.0f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
