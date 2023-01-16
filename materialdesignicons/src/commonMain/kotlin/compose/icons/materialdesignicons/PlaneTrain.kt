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

public val MaterialDesignIcons.PlaneTrain: ImageVector
    get() {
        if (_planeTrain != null) {
            return _planeTrain!!
        }
        _planeTrain = Builder(name = "PlaneTrain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(14.0f)
                curveTo(12.34f, 8.0f, 11.0f, 9.34f, 11.0f, 11.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 19.66f, 12.34f, 21.0f, 14.0f, 21.0f)
                lineTo(13.0f, 22.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(14.0f)
                lineTo(16.0f, 20.97f)
                horizontalLineTo(18.0f)
                lineTo(20.0f, 23.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                lineTo(20.0f, 21.0f)
                curveTo(21.66f, 21.0f, 23.0f, 19.66f, 23.0f, 18.0f)
                verticalLineTo(11.0f)
                curveTo(23.0f, 9.34f, 21.66f, 8.0f, 20.0f, 8.0f)
                moveTo(14.0f, 19.0f)
                curveTo(13.45f, 19.0f, 13.0f, 18.55f, 13.0f, 18.0f)
                reflectiveCurveTo(13.45f, 17.0f, 14.0f, 17.0f)
                reflectiveCurveTo(15.0f, 17.45f, 15.0f, 18.0f)
                reflectiveCurveTo(14.55f, 19.0f, 14.0f, 19.0f)
                moveTo(20.0f, 19.0f)
                curveTo(19.45f, 19.0f, 19.0f, 18.55f, 19.0f, 18.0f)
                reflectiveCurveTo(19.45f, 17.0f, 20.0f, 17.0f)
                reflectiveCurveTo(21.0f, 17.45f, 21.0f, 18.0f)
                reflectiveCurveTo(20.55f, 19.0f, 20.0f, 19.0f)
                moveTo(21.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                moveTo(6.66f, 14.53f)
                lineTo(7.0f, 17.0f)
                lineTo(5.95f, 18.06f)
                lineTo(4.19f, 14.88f)
                lineTo(1.0f, 13.11f)
                lineTo(2.06f, 12.03f)
                lineTo(4.56f, 12.4f)
                lineTo(8.43f, 8.53f)
                lineTo(1.0f, 4.62f)
                lineTo(2.42f, 3.21f)
                lineTo(11.61f, 5.33f)
                lineTo(15.5f, 1.44f)
                curveTo(16.06f, 0.855f, 17.06f, 0.855f, 17.62f, 1.44f)
                curveTo(18.21f, 2.03f, 18.21f, 3.0f, 17.62f, 3.56f)
                lineTo(14.18f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(11.79f, 7.0f, 10.0f, 8.79f, 10.0f, 11.0f)
                verticalLineTo(11.19f)
                lineTo(6.66f, 14.53f)
                close()
            }
        }
        .build()
        return _planeTrain!!
    }

private var _planeTrain: ImageVector? = null
