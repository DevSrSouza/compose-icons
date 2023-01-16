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

public val MaterialDesignIcons.CircleOffOutline: ImageVector
    get() {
        if (_circleOffOutline != null) {
            return _circleOffOutline!!
        }
        _circleOffOutline = Builder(name = "CircleOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.06f, 5.95f)
                curveTo(2.78f, 7.63f, 2.0f, 9.72f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(14.28f, 22.0f, 16.37f, 21.23f, 18.05f, 19.94f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.0f, 20.0f)
                curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f)
                curveTo(4.0f, 10.27f, 4.56f, 8.68f, 5.5f, 7.38f)
                lineTo(16.62f, 18.5f)
                curveTo(15.32f, 19.45f, 13.73f, 20.0f, 12.0f, 20.0f)
                moveTo(8.17f, 4.97f)
                lineTo(6.72f, 3.5f)
                curveTo(8.25f, 2.56f, 10.06f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 13.94f, 21.44f, 15.75f, 20.5f, 17.28f)
                lineTo(19.03f, 15.83f)
                curveTo(19.65f, 14.69f, 20.0f, 13.39f, 20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                curveTo(10.61f, 4.0f, 9.31f, 4.35f, 8.17f, 4.97f)
                close()
            }
        }
        .build()
        return _circleOffOutline!!
    }

private var _circleOffOutline: ImageVector? = null
