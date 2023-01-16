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

public val MaterialDesignIcons.HorizontalRotateClockwise: ImageVector
    get() {
        if (_horizontalRotateClockwise != null) {
            return _horizontalRotateClockwise!!
        }
        _horizontalRotateClockwise = Builder(name = "HorizontalRotateClockwise", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                lineTo(8.0f, 10.0f)
                lineTo(4.0f, 14.0f)
                horizontalLineTo(7.1f)
                curveTo(7.56f, 18.56f, 9.58f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(16.44f, 18.56f, 16.9f, 14.0f)
                horizontalLineTo(14.91f)
                curveTo(14.57f, 17.45f, 13.4f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(9.43f, 17.45f, 9.09f, 14.0f)
                horizontalLineTo(12.0f)
                moveTo(12.0f, 4.0f)
                curveTo(13.4f, 4.0f, 14.57f, 6.55f, 14.91f, 10.0f)
                horizontalLineTo(16.9f)
                curveTo(16.44f, 5.44f, 14.42f, 2.0f, 12.0f, 2.0f)
                curveTo(9.84f, 2.0f, 8.0f, 4.74f, 7.3f, 8.58f)
                lineTo(8.0f, 7.88f)
                lineTo(9.21f, 9.08f)
                curveTo(9.64f, 6.11f, 10.73f, 4.0f, 12.0f, 4.0f)
                moveTo(22.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                lineTo(13.0f, 13.0f)
                horizontalLineTo(22.0f)
                moveTo(2.0f, 13.0f)
                horizontalLineTo(3.0f)
                lineTo(5.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _horizontalRotateClockwise!!
    }

private var _horizontalRotateClockwise: ImageVector? = null
