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

public val MaterialDesignIcons.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = Builder(name = "Sphere", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5f, 22.0f, 22.0f, 17.5f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 14.0f)
                curveTo(7.58f, 14.0f, 4.0f, 13.11f, 4.0f, 12.0f)
                curveTo(4.0f, 10.9f, 7.58f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(20.0f, 10.9f, 20.0f, 12.0f)
                curveTo(20.0f, 13.11f, 16.42f, 14.0f, 12.0f, 14.0f)
                moveTo(12.0f, 4.0f)
                curveTo(15.37f, 4.0f, 18.25f, 6.09f, 19.43f, 9.05f)
                curveTo(17.93f, 8.43f, 15.61f, 8.0f, 12.0f, 8.0f)
                curveTo(9.8f, 8.0f, 6.73f, 8.19f, 4.57f, 9.05f)
                curveTo(5.75f, 6.09f, 8.63f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                curveTo(8.63f, 20.0f, 5.75f, 17.91f, 4.57f, 14.95f)
                curveTo(6.07f, 15.57f, 8.39f, 16.0f, 12.0f, 16.0f)
                curveTo(14.2f, 16.0f, 17.27f, 15.81f, 19.43f, 14.95f)
                curveTo(18.25f, 17.91f, 15.37f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
