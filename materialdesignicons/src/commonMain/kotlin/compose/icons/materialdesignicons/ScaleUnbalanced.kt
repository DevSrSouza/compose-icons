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

public val MaterialDesignIcons.ScaleUnbalanced: ImageVector
    get() {
        if (_scaleUnbalanced != null) {
            return _scaleUnbalanced!!
        }
        _scaleUnbalanced = Builder(name = "ScaleUnbalanced", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                verticalLineTo(8.8f)
                curveTo(13.5f, 8.6f, 14.0f, 8.3f, 14.3f, 7.9f)
                lineTo(17.8f, 9.2f)
                lineTo(14.9f, 16.0f)
                curveTo(14.4f, 18.0f, 15.9f, 19.0f, 18.4f, 19.0f)
                reflectiveCurveTo(22.5f, 18.0f, 21.9f, 16.0f)
                lineTo(19.3f, 9.7f)
                lineTo(20.2f, 10.0f)
                lineTo(20.9f, 8.1f)
                lineTo(15.0f, 6.0f)
                curveTo(15.0f, 4.8f, 14.3f, 3.6f, 13.0f, 3.1f)
                curveTo(11.8f, 2.6f, 10.5f, 3.1f, 9.7f, 4.0f)
                lineTo(3.9f, 2.0f)
                lineTo(3.2f, 3.8f)
                lineTo(4.8f, 4.4f)
                lineTo(2.1f, 11.0f)
                curveTo(1.6f, 13.0f, 3.1f, 14.0f, 5.6f, 14.0f)
                reflectiveCurveTo(9.7f, 13.0f, 9.1f, 11.0f)
                lineTo(6.6f, 5.1f)
                lineTo(9.0f, 6.0f)
                curveTo(9.0f, 7.2f, 9.7f, 8.4f, 11.0f, 8.9f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                moveTo(19.9f, 16.0f)
                horizontalLineTo(16.9f)
                lineTo(18.4f, 12.2f)
                lineTo(19.9f, 16.0f)
                moveTo(7.1f, 11.0f)
                horizontalLineTo(4.1f)
                lineTo(5.6f, 7.2f)
                lineTo(7.1f, 11.0f)
                moveTo(11.1f, 5.7f)
                curveTo(11.3f, 5.2f, 11.9f, 4.9f, 12.4f, 5.1f)
                reflectiveCurveTo(13.2f, 5.9f, 13.0f, 6.4f)
                reflectiveCurveTo(12.2f, 7.2f, 11.7f, 7.0f)
                reflectiveCurveTo(10.9f, 6.2f, 11.1f, 5.7f)
                close()
            }
        }
        .build()
        return _scaleUnbalanced!!
    }

private var _scaleUnbalanced: ImageVector? = null
