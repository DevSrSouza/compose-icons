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

public val MaterialDesignIcons.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.36f, 2.72f)
                lineTo(20.78f, 4.14f)
                lineTo(15.06f, 9.85f)
                curveTo(16.13f, 11.39f, 16.28f, 13.24f, 15.38f, 14.44f)
                lineTo(9.06f, 8.12f)
                curveTo(10.26f, 7.22f, 12.11f, 7.37f, 13.65f, 8.44f)
                lineTo(19.36f, 2.72f)
                moveTo(5.93f, 17.57f)
                curveTo(3.92f, 15.56f, 2.69f, 13.16f, 2.35f, 10.92f)
                lineTo(7.23f, 8.83f)
                lineTo(14.67f, 16.27f)
                lineTo(12.58f, 21.15f)
                curveTo(10.34f, 20.81f, 7.94f, 19.58f, 5.93f, 17.57f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
