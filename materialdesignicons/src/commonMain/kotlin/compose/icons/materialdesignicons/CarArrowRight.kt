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

public val MaterialDesignIcons.CarArrowRight: ImageVector
    get() {
        if (_carArrowRight != null) {
            return _carArrowRight!!
        }
        _carArrowRight = Builder(name = "CarArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(12.0f, 14.69f, 14.69f, 12.0f, 18.0f, 12.0f)
                curveTo(19.09f, 12.0f, 20.12f, 12.3f, 21.0f, 12.81f)
                verticalLineTo(12.0f)
                lineTo(18.92f, 6.0f)
                curveTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 5.0f, 5.28f, 5.42f, 5.08f, 6.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.55f, 3.45f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(5.55f, 21.0f, 6.0f, 20.55f, 6.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.09f)
                curveTo(12.04f, 18.67f, 12.0f, 18.34f, 12.0f, 18.0f)
                moveTo(6.5f, 6.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 11.0f)
                horizontalLineTo(5.0f)
                lineTo(6.5f, 6.5f)
                moveTo(6.5f, 16.0f)
                curveTo(5.67f, 16.0f, 5.0f, 15.33f, 5.0f, 14.5f)
                reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f)
                reflectiveCurveTo(8.0f, 13.67f, 8.0f, 14.5f)
                reflectiveCurveTo(7.33f, 16.0f, 6.5f, 16.0f)
                moveTo(19.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                lineTo(22.0f, 18.0f)
                lineTo(19.0f, 21.0f)
            }
        }
        .build()
        return _carArrowRight!!
    }

private var _carArrowRight: ImageVector? = null
