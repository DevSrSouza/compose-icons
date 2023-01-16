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

public val MaterialDesignIcons.BilliardsRack: ImageVector
    get() {
        if (_billiardsRack != null) {
            return _billiardsRack!!
        }
        _billiardsRack = Builder(name = "BilliardsRack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.31f, 16.44f)
                lineTo(14.54f, 6.47f)
                curveTo(13.72f, 5.04f, 11.89f, 4.55f, 10.46f, 5.38f)
                curveTo(10.0f, 5.64f, 9.63f, 6.0f, 9.36f, 6.47f)
                lineTo(3.6f, 16.44f)
                curveTo(2.77f, 17.87f, 3.26f, 19.69f, 4.69f, 20.5f)
                curveTo(5.14f, 20.78f, 5.65f, 20.92f, 6.18f, 20.92f)
                horizontalLineTo(17.73f)
                curveTo(19.38f, 20.91f, 20.72f, 19.57f, 20.71f, 17.92f)
                curveTo(20.71f, 17.4f, 20.57f, 16.89f, 20.31f, 16.44f)
                moveTo(5.37f, 17.43f)
                lineTo(11.11f, 7.47f)
                curveTo(11.38f, 7.0f, 12.0f, 6.82f, 12.46f, 7.1f)
                curveTo(12.62f, 7.18f, 12.75f, 7.31f, 12.84f, 7.47f)
                lineTo(18.58f, 17.43f)
                curveTo(18.85f, 17.91f, 18.69f, 18.5f, 18.21f, 18.79f)
                curveTo(18.06f, 18.88f, 17.89f, 18.93f, 17.72f, 18.93f)
                horizontalLineTo(6.21f)
                curveTo(5.66f, 18.92f, 5.21f, 18.47f, 5.22f, 17.92f)
                curveTo(5.22f, 17.75f, 5.26f, 17.58f, 5.35f, 17.43f)
                horizontalLineTo(5.37f)
                moveTo(11.97f, 13.45f)
                curveTo(10.87f, 13.45f, 10.0f, 12.56f, 10.0f, 11.46f)
                curveTo(10.0f, 10.35f, 10.87f, 9.46f, 11.97f, 9.46f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.97f, 11.46f)
                curveTo(13.97f, 12.56f, 13.07f, 13.45f, 11.95f, 13.45f)
                horizontalLineTo(11.97f)
                moveTo(9.46f, 17.93f)
                curveTo(8.36f, 17.93f, 7.47f, 17.04f, 7.47f, 15.94f)
                curveTo(7.47f, 14.84f, 8.36f, 13.95f, 9.46f, 13.95f)
                curveTo(10.56f, 13.95f, 11.46f, 14.84f, 11.46f, 15.94f)
                curveTo(11.46f, 17.04f, 10.56f, 17.93f, 9.46f, 17.93f)
                moveTo(14.44f, 17.93f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.45f, 15.94f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.44f, 13.95f)
                curveTo(15.54f, 13.95f, 16.44f, 14.84f, 16.44f, 15.94f)
                curveTo(16.44f, 17.04f, 15.54f, 17.93f, 14.44f, 17.93f)
                close()
            }
        }
        .build()
        return _billiardsRack!!
    }

private var _billiardsRack: ImageVector? = null
