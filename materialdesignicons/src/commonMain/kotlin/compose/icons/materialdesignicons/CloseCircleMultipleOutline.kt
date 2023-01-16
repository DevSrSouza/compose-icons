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

public val MaterialDesignIcons.CloseCircleMultipleOutline: ImageVector
    get() {
        if (_closeCircleMultipleOutline != null) {
            return _closeCircleMultipleOutline!!
        }
        _closeCircleMultipleOutline = Builder(name = "CloseCircleMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.54f, 9.88f)
                lineTo(17.12f, 8.47f)
                lineTo(15.0f, 10.59f)
                lineTo(12.88f, 8.47f)
                lineTo(11.47f, 9.88f)
                lineTo(13.59f, 12.0f)
                lineTo(11.47f, 14.12f)
                lineTo(12.88f, 15.54f)
                lineTo(15.0f, 13.41f)
                lineTo(17.12f, 15.54f)
                lineTo(18.54f, 14.12f)
                lineTo(16.41f, 12.0f)
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 9.21f, 3.64f, 6.8f, 6.0f, 5.68f)
                verticalLineTo(3.5f)
                curveTo(2.5f, 4.76f, 0.0f, 8.09f, 0.0f, 12.0f)
                reflectiveCurveTo(2.5f, 19.24f, 6.0f, 20.5f)
                verticalLineTo(18.32f)
                curveTo(3.64f, 17.2f, 2.0f, 14.79f, 2.0f, 12.0f)
                moveTo(15.0f, 3.0f)
                curveTo(10.04f, 3.0f, 6.0f, 7.04f, 6.0f, 12.0f)
                reflectiveCurveTo(10.04f, 21.0f, 15.0f, 21.0f)
                reflectiveCurveTo(24.0f, 16.96f, 24.0f, 12.0f)
                reflectiveCurveTo(19.96f, 3.0f, 15.0f, 3.0f)
                moveTo(15.0f, 19.0f)
                curveTo(11.14f, 19.0f, 8.0f, 15.86f, 8.0f, 12.0f)
                reflectiveCurveTo(11.14f, 5.0f, 15.0f, 5.0f)
                reflectiveCurveTo(22.0f, 8.14f, 22.0f, 12.0f)
                reflectiveCurveTo(18.86f, 19.0f, 15.0f, 19.0f)
                close()
            }
        }
        .build()
        return _closeCircleMultipleOutline!!
    }

private var _closeCircleMultipleOutline: ImageVector? = null
