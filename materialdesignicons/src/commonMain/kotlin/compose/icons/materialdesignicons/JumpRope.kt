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

public val MaterialDesignIcons.JumpRope: ImageVector
    get() {
        if (_jumpRope != null) {
            return _jumpRope!!
        }
        _jumpRope = Builder(name = "JumpRope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.5f)
                verticalLineTo(10.5f)
                curveTo(21.0f, 11.2f, 20.5f, 11.9f, 19.8f, 12.0f)
                verticalLineTo(17.3f)
                curveTo(19.8f, 18.6f, 19.0f, 21.1f, 16.0f, 21.1f)
                horizontalLineTo(14.5f)
                curveTo(14.9f, 20.7f, 15.3f, 20.2f, 15.5f, 19.6f)
                horizontalLineTo(16.0f)
                curveTo(18.1f, 19.6f, 18.2f, 17.7f, 18.2f, 17.4f)
                verticalLineTo(12.0f)
                curveTo(17.5f, 11.9f, 17.0f, 11.3f, 17.0f, 10.5f)
                verticalLineTo(4.5f)
                curveTo(17.0f, 3.7f, 17.7f, 3.0f, 18.5f, 3.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3f, 3.0f, 21.0f, 3.7f, 21.0f, 4.5f)
                moveTo(14.8f, 18.2f)
                curveTo(14.8f, 19.7f, 13.6f, 21.0f, 12.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(5.0f, 21.0f, 4.2f, 18.5f, 4.2f, 17.2f)
                verticalLineTo(12.0f)
                curveTo(3.5f, 11.9f, 3.0f, 11.2f, 3.0f, 10.5f)
                verticalLineTo(4.5f)
                curveTo(3.0f, 3.7f, 3.7f, 3.0f, 4.5f, 3.0f)
                horizontalLineTo(5.5f)
                curveTo(6.3f, 3.0f, 7.0f, 3.7f, 7.0f, 4.5f)
                verticalLineTo(10.5f)
                curveTo(7.0f, 11.2f, 6.5f, 11.9f, 5.8f, 12.0f)
                verticalLineTo(17.3f)
                curveTo(5.8f, 17.7f, 5.9f, 19.5f, 8.0f, 19.5f)
                horizontalLineTo(9.6f)
                curveTo(9.4f, 19.1f, 9.3f, 18.7f, 9.3f, 18.3f)
                verticalLineTo(8.3f)
                curveTo(9.3f, 6.8f, 10.5f, 5.5f, 12.1f, 5.5f)
                reflectiveCurveTo(14.8f, 6.7f, 14.8f, 8.3f)
                moveTo(13.2f, 8.2f)
                curveTo(13.2f, 7.6f, 12.7f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(10.8f, 7.6f, 10.8f, 8.2f)
                verticalLineTo(18.2f)
                curveTo(10.8f, 18.9f, 11.4f, 19.4f, 12.0f, 19.4f)
                reflectiveCurveTo(13.2f, 18.8f, 13.2f, 18.2f)
                verticalLineTo(8.2f)
                close()
            }
        }
        .build()
        return _jumpRope!!
    }

private var _jumpRope: ImageVector? = null
