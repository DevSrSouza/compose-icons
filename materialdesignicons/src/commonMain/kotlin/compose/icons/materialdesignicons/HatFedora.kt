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

public val MaterialDesignIcons.HatFedora: ImageVector
    get() {
        if (_hatFedora != null) {
            return _hatFedora!!
        }
        _hatFedora = Builder(name = "HatFedora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.11f, 11.92f)
                curveTo(19.13f, 11.71f, 19.14f, 11.5f, 19.14f, 11.29f)
                curveTo(19.14f, 7.86f, 17.71f, 4.14f, 16.28f, 4.14f)
                curveTo(14.85f, 4.14f, 13.42f, 5.57f, 12.0f, 5.57f)
                curveTo(10.57f, 5.57f, 9.14f, 4.14f, 7.71f, 4.14f)
                curveTo(6.28f, 4.14f, 4.86f, 7.79f, 4.86f, 11.29f)
                curveTo(4.86f, 11.5f, 4.86f, 11.71f, 4.88f, 11.92f)
                curveTo(7.22f, 12.45f, 9.6f, 12.72f, 12.0f, 12.71f)
                curveTo(14.45f, 12.71f, 16.83f, 12.44f, 19.11f, 11.92f)
                moveTo(3.45f, 18.18f)
                curveTo(9.0f, 19.85f, 14.96f, 19.86f, 20.54f, 18.18f)
                curveTo(20.96f, 18.04f, 21.33f, 17.77f, 21.59f, 17.41f)
                curveTo(21.85f, 17.05f, 22.0f, 16.61f, 22.0f, 16.17f)
                curveTo(22.0f, 15.72f, 21.86f, 15.29f, 21.61f, 14.92f)
                curveTo(21.35f, 14.56f, 21.0f, 14.29f, 20.56f, 14.14f)
                curveTo(17.86f, 15.0f, 15.0f, 15.45f, 12.0f, 15.45f)
                curveTo(9.0f, 15.45f, 6.13f, 15.0f, 3.43f, 14.14f)
                curveTo(3.0f, 14.29f, 2.65f, 14.57f, 2.39f, 14.93f)
                curveTo(2.14f, 15.29f, 2.0f, 15.72f, 2.0f, 16.17f)
                curveTo(2.0f, 17.11f, 2.61f, 17.9f, 3.45f, 18.18f)
                verticalLineTo(18.18f)
                close()
            }
        }
        .build()
        return _hatFedora!!
    }

private var _hatFedora: ImageVector? = null
