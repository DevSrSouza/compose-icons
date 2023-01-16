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

public val MaterialDesignIcons.GateArrowLeft: ImageVector
    get() {
        if (_gateArrowLeft != null) {
            return _gateArrowLeft!!
        }
        _gateArrowLeft = Builder(name = "GateArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.81f)
                curveTo(3.62f, 14.45f, 4.3f, 14.21f, 5.0f, 14.09f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.09f)
                curveTo(7.7f, 14.21f, 8.38f, 14.45f, 9.0f, 14.81f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.69f)
                curveTo(11.65f, 17.67f, 12.0f, 18.82f, 12.0f, 20.0f)
                curveTo(12.0f, 20.34f, 11.97f, 20.67f, 11.91f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                moveTo(15.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                moveTo(2.0f, 20.0f)
                lineTo(5.0f, 23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                lineTo(2.0f, 20.0f)
                close()
            }
        }
        .build()
        return _gateArrowLeft!!
    }

private var _gateArrowLeft: ImageVector? = null
