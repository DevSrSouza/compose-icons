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

public val MaterialDesignIcons.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(14.17f, 4.5f, 14.58f, 5.07f, 15.5f, 6.32f)
                curveTo(15.88f, 6.85f, 16.32f, 7.44f, 16.94f, 8.06f)
                curveTo(17.43f, 8.55f, 17.86f, 8.93f, 18.21f, 9.24f)
                curveTo(19.3f, 10.19f, 19.5f, 10.36f, 19.5f, 12.0f)
                curveTo(19.5f, 14.93f, 19.5f, 15.38f, 17.94f, 16.94f)
                curveTo(16.0f, 18.86f, 15.38f, 19.5f, 13.0f, 19.5f)
                curveTo(11.88f, 19.5f, 11.5f, 19.18f, 10.89f, 18.69f)
                curveTo(10.27f, 18.19f, 9.43f, 17.5f, 8.0f, 17.5f)
                curveTo(4.96f, 17.5f, 4.5f, 14.05f, 4.5f, 12.0f)
                curveTo(4.5f, 10.65f, 5.0f, 8.91f, 6.47f, 8.42f)
                curveTo(8.25f, 7.83f, 9.2f, 6.71f, 9.96f, 5.81f)
                curveTo(10.75f, 4.88f, 11.11f, 4.5f, 12.0f, 4.5f)
                moveTo(12.0f, 3.0f)
                curveTo(9.0f, 3.0f, 9.0f, 6.0f, 6.0f, 7.0f)
                curveTo(3.88f, 7.71f, 3.0f, 10.0f, 3.0f, 12.0f)
                curveTo(3.0f, 15.0f, 4.0f, 19.0f, 8.0f, 19.0f)
                curveTo(10.0f, 19.0f, 10.0f, 21.0f, 13.0f, 21.0f)
                reflectiveCurveTo(17.0f, 20.0f, 19.0f, 18.0f)
                reflectiveCurveTo(21.0f, 15.0f, 21.0f, 12.0f)
                reflectiveCurveTo(20.0f, 9.0f, 18.0f, 7.0f)
                reflectiveCurveTo(16.0f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 8.0f)
                curveTo(9.79f, 8.0f, 8.0f, 9.79f, 8.0f, 12.0f)
                reflectiveCurveTo(9.79f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(16.0f, 14.21f, 16.0f, 12.0f)
                reflectiveCurveTo(14.21f, 8.0f, 12.0f, 8.0f)
                moveTo(12.0f, 10.0f)
                curveTo(10.9f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 10.35f, 10.35f, 9.0f, 12.0f, 9.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
