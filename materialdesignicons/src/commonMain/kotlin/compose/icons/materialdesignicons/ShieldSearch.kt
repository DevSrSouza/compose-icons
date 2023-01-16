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

public val MaterialDesignIcons.ShieldSearch: ImageVector
    get() {
        if (_shieldSearch != null) {
            return _shieldSearch!!
        }
        _shieldSearch = Builder(name = "ShieldSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 9.0f)
                moveTo(17.86f, 19.31f)
                curveTo(16.23f, 21.22f, 14.28f, 22.45f, 12.0f, 23.0f)
                curveTo(9.44f, 22.39f, 7.3f, 20.93f, 5.58f, 18.63f)
                curveTo(3.86f, 16.34f, 3.0f, 13.8f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 13.39f, 20.36f, 15.61f, 19.08f, 17.67f)
                lineTo(16.17f, 14.76f)
                curveTo(16.69f, 13.97f, 17.0f, 13.0f, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                curveTo(13.0f, 17.0f, 13.97f, 16.69f, 14.76f, 16.17f)
                lineTo(17.86f, 19.31f)
                close()
            }
        }
        .build()
        return _shieldSearch!!
    }

private var _shieldSearch: ImageVector? = null
