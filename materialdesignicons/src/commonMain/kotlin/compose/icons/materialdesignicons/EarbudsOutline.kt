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

public val MaterialDesignIcons.EarbudsOutline: ImageVector
    get() {
        if (_earbudsOutline != null) {
            return _earbudsOutline!!
        }
        _earbudsOutline = Builder(name = "EarbudsOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.0f, 3.0f, 2.0f, 5.0f, 2.0f, 6.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 12.0f, 3.0f, 14.0f, 5.0f, 14.0f)
                curveTo(5.61f, 14.0f, 6.32f, 13.72f, 7.0f, 13.27f)
                verticalLineTo(20.0f)
                curveTo(7.0f, 20.55f, 7.45f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(9.55f, 21.0f, 10.0f, 20.55f, 10.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(10.0f, 6.0f, 7.0f, 3.0f, 5.0f, 3.0f)
                moveTo(8.0f, 10.23f)
                lineTo(5.91f, 11.6f)
                curveTo(5.4f, 11.93f, 5.08f, 12.0f, 5.0f, 12.0f)
                curveTo(4.3f, 12.0f, 4.0f, 11.08f, 4.0f, 11.0f)
                lineTo(4.0f, 6.03f)
                curveTo(4.0f, 5.92f, 4.3f, 5.0f, 5.0f, 5.0f)
                curveTo(5.9f, 5.0f, 8.0f, 7.1f, 8.0f, 8.0f)
                verticalLineTo(10.23f)
                moveTo(16.5f, 15.0f)
                curveTo(17.2f, 15.0f, 17.87f, 14.89f, 18.5f, 14.68f)
                verticalLineTo(20.0f)
                curveTo(18.5f, 20.55f, 18.05f, 21.0f, 17.5f, 21.0f)
                horizontalLineTo(15.5f)
                curveTo(14.95f, 21.0f, 14.5f, 20.55f, 14.5f, 20.0f)
                verticalLineTo(14.68f)
                curveTo(15.13f, 14.89f, 15.8f, 15.0f, 16.5f, 15.0f)
                moveTo(16.5f, 3.0f)
                curveTo(13.46f, 3.0f, 11.0f, 5.46f, 11.0f, 8.5f)
                reflectiveCurveTo(13.46f, 14.0f, 16.5f, 14.0f)
                reflectiveCurveTo(22.0f, 11.54f, 22.0f, 8.5f)
                reflectiveCurveTo(19.54f, 3.0f, 16.5f, 3.0f)
                moveTo(16.5f, 12.0f)
                curveTo(14.57f, 12.0f, 13.0f, 10.43f, 13.0f, 8.5f)
                reflectiveCurveTo(14.57f, 5.0f, 16.5f, 5.0f)
                reflectiveCurveTo(20.0f, 6.57f, 20.0f, 8.5f)
                reflectiveCurveTo(18.43f, 12.0f, 16.5f, 12.0f)
                close()
            }
        }
        .build()
        return _earbudsOutline!!
    }

private var _earbudsOutline: ImageVector? = null
