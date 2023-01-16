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

public val MaterialDesignIcons.EmailSearch: ImageVector
    get() {
        if (_emailSearch != null) {
            return _emailSearch!!
        }
        _emailSearch = Builder(name = "EmailSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 6.0f)
                verticalLineTo(10.82f)
                curveTo(20.0f, 9.85f, 18.7f, 9.23f, 17.31f, 9.06f)
                lineTo(19.0f, 8.0f)
                verticalLineTo(6.0f)
                lineTo(11.0f, 11.0f)
                lineTo(3.0f, 6.0f)
                verticalLineTo(8.0f)
                lineTo(10.62f, 12.76f)
                curveTo(10.21f, 13.62f, 10.0f, 14.55f, 10.0f, 15.5f)
                curveTo(10.0f, 17.18f, 10.65f, 18.79f, 11.81f, 20.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.89f, 1.89f, 4.0f, 3.0f, 4.0f)
                moveTo(16.5f, 11.0f)
                curveTo(19.0f, 11.0f, 21.0f, 13.0f, 21.0f, 15.5f)
                curveTo(21.0f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21.0f)
                lineTo(22.0f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20.0f, 16.5f, 20.0f)
                curveTo(14.0f, 20.0f, 12.0f, 18.0f, 12.0f, 15.5f)
                curveTo(12.0f, 13.0f, 14.0f, 11.0f, 16.5f, 11.0f)
                moveTo(16.5f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 13.0f)
                close()
            }
        }
        .build()
        return _emailSearch!!
    }

private var _emailSearch: ImageVector? = null
