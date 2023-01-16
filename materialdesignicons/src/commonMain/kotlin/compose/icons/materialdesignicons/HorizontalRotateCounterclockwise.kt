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

public val MaterialDesignIcons.HorizontalRotateCounterclockwise: ImageVector
    get() {
        if (_horizontalRotateCounterclockwise != null) {
            return _horizontalRotateCounterclockwise!!
        }
        _horizontalRotateCounterclockwise = Builder(name = "HorizontalRotateCounterclockwise",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                horizontalLineTo(9.09f)
                curveTo(9.43f, 6.55f, 10.6f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(14.57f, 6.55f, 14.91f, 10.0f)
                horizontalLineTo(16.9f)
                curveTo(16.44f, 5.44f, 14.42f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(7.56f, 5.44f, 7.1f, 10.0f)
                horizontalLineTo(4.0f)
                lineTo(8.0f, 14.0f)
                lineTo(12.0f, 10.0f)
                moveTo(12.0f, 20.0f)
                curveTo(10.73f, 20.0f, 9.64f, 17.89f, 9.21f, 14.92f)
                lineTo(8.0f, 16.12f)
                lineTo(7.3f, 15.42f)
                curveTo(8.0f, 19.26f, 9.84f, 22.0f, 12.0f, 22.0f)
                curveTo(14.42f, 22.0f, 16.44f, 18.56f, 16.9f, 14.0f)
                horizontalLineTo(14.91f)
                curveTo(14.57f, 17.45f, 13.4f, 20.0f, 12.0f, 20.0f)
                moveTo(22.0f, 11.0f)
                horizontalLineTo(13.0f)
                lineTo(11.0f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                moveTo(2.0f, 13.0f)
                horizontalLineTo(5.0f)
                lineTo(3.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
            }
        }
        .build()
        return _horizontalRotateCounterclockwise!!
    }

private var _horizontalRotateCounterclockwise: ImageVector? = null
