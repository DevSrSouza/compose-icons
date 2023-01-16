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

public val MaterialDesignIcons.Aurora: ImageVector
    get() {
        if (_aurora != null) {
            return _aurora!!
        }
        _aurora = Builder(name = "Aurora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                curveTo(2.55f, 3.0f, 3.0f, 3.45f, 3.0f, 4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.45f, 5.45f, 4.0f, 6.0f, 4.0f)
                curveTo(6.55f, 4.0f, 7.0f, 4.45f, 7.0f, 5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                curveTo(9.0f, 5.45f, 9.45f, 5.0f, 10.0f, 5.0f)
                curveTo(10.55f, 5.0f, 11.0f, 5.45f, 11.0f, 6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.5f)
                curveTo(12.67f, 13.0f, 12.84f, 13.0f, 13.0f, 13.05f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 6.45f, 13.45f, 6.0f, 14.0f, 6.0f)
                curveTo(14.55f, 6.0f, 15.0f, 6.45f, 15.0f, 7.0f)
                verticalLineTo(15.5f)
                curveTo(15.0f, 16.88f, 13.88f, 18.0f, 12.5f, 18.0f)
                horizontalLineTo(11.5f)
                curveTo(11.22f, 18.0f, 11.0f, 18.22f, 11.0f, 18.5f)
                curveTo(11.0f, 18.78f, 11.22f, 19.0f, 11.5f, 19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.45f, 17.45f, 7.0f, 18.0f, 7.0f)
                curveTo(18.55f, 7.0f, 19.0f, 7.45f, 19.0f, 8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 8.45f, 21.45f, 8.0f, 22.0f, 8.0f)
                curveTo(22.55f, 8.0f, 23.0f, 8.45f, 23.0f, 9.0f)
                verticalLineTo(20.0f)
                curveTo(23.0f, 20.55f, 22.55f, 21.0f, 22.0f, 21.0f)
                horizontalLineTo(11.5f)
                curveTo(10.12f, 21.0f, 9.0f, 19.88f, 9.0f, 18.5f)
                curveTo(9.0f, 17.12f, 10.12f, 16.0f, 11.5f, 16.0f)
                horizontalLineTo(12.5f)
                curveTo(12.78f, 16.0f, 13.0f, 15.78f, 13.0f, 15.5f)
                curveTo(13.0f, 15.22f, 12.78f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 15.0f, 1.0f, 14.55f, 1.0f, 14.0f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 3.45f, 1.45f, 3.0f, 2.0f, 3.0f)
                close()
            }
        }
        .build()
        return _aurora!!
    }

private var _aurora: ImageVector? = null
