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

public val MaterialDesignIcons.MotherNurse: ImageVector
    get() {
        if (_motherNurse != null) {
            return _motherNurse!!
        }
        _motherNurse = Builder(name = "MotherNurse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(20.0f, 18.0f)
                lineTo(18.0f, 12.56f)
                curveTo(17.65f, 11.57f, 17.34f, 10.71f, 16.0f, 10.0f)
                curveTo(14.62f, 9.3f, 13.62f, 9.0f, 12.0f, 9.0f)
                curveTo(10.37f, 9.0f, 9.38f, 9.3f, 8.0f, 10.0f)
                curveTo(6.66f, 10.71f, 6.35f, 11.57f, 6.0f, 12.56f)
                lineTo(4.0f, 18.0f)
                curveTo(3.68f, 19.35f, 6.36f, 20.44f, 8.11f, 21.19f)
                verticalLineTo(19.0f)
                curveTo(8.11f, 18.05f, 8.97f, 17.38f, 10.69f, 16.97f)
                curveTo(10.85f, 16.93f, 11.0f, 16.91f, 11.12f, 16.89f)
                curveTo(10.58f, 16.07f, 10.36f, 15.34f, 10.34f, 15.28f)
                lineTo(12.11f, 14.68f)
                curveTo(12.12f, 14.7f, 12.63f, 16.27f, 13.84f, 17.06f)
                curveTo(14.05f, 17.13f, 14.26f, 17.21f, 14.46f, 17.3f)
                curveTo(15.23f, 17.64f, 15.69f, 18.08f, 15.84f, 18.61f)
                curveTo(14.5f, 19.14f, 13.22f, 19.41f, 12.0f, 19.41f)
                lineTo(11.0f, 19.31f)
                verticalLineTo(21.94f)
                lineTo(12.0f, 22.0f)
                curveTo(13.37f, 22.0f, 14.67f, 21.72f, 15.89f, 21.19f)
                curveTo(17.64f, 20.44f, 20.25f, 19.13f, 20.0f, 18.0f)
                moveTo(15.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 17.0f)
                close()
            }
        }
        .build()
        return _motherNurse!!
    }

private var _motherNurse: ImageVector? = null
