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

public val MaterialDesignIcons.VariableBox: ImageVector
    get() {
        if (_variableBox != null) {
            return _variableBox!!
        }
        _variableBox = Builder(name = "VariableBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(7.4f, 18.0f)
                curveTo(5.9f, 16.5f, 5.0f, 14.3f, 5.0f, 12.0f)
                reflectiveCurveTo(5.9f, 7.5f, 7.4f, 6.0f)
                lineTo(9.0f, 6.7f)
                curveTo(7.7f, 7.9f, 7.0f, 9.9f, 7.0f, 12.0f)
                reflectiveCurveTo(7.7f, 16.1f, 9.0f, 17.3f)
                lineTo(7.4f, 18.0f)
                moveTo(12.7f, 15.0f)
                lineTo(11.9f, 13.0f)
                lineTo(10.5f, 15.0f)
                horizontalLineTo(9.0f)
                lineTo(11.3f, 11.9f)
                lineTo(10.0f, 9.0f)
                horizontalLineTo(11.3f)
                lineTo(12.1f, 11.0f)
                lineTo(13.5f, 9.0f)
                horizontalLineTo(15.0f)
                lineTo(12.8f, 12.0f)
                lineTo(14.1f, 15.0f)
                horizontalLineTo(12.7f)
                moveTo(16.6f, 18.0f)
                lineTo(15.0f, 17.3f)
                curveTo(16.3f, 16.0f, 17.0f, 14.1f, 17.0f, 12.0f)
                reflectiveCurveTo(16.3f, 7.9f, 15.0f, 6.7f)
                lineTo(16.6f, 6.0f)
                curveTo(18.1f, 7.5f, 19.0f, 9.7f, 19.0f, 12.0f)
                reflectiveCurveTo(18.1f, 16.5f, 16.6f, 18.0f)
                close()
            }
        }
        .build()
        return _variableBox!!
    }

private var _variableBox: ImageVector? = null
