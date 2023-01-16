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

public val MaterialDesignIcons.GateArrowRight: ImageVector
    get() {
        if (_gateArrowRight != null) {
            return _gateArrowRight!!
        }
        _gateArrowRight = Builder(name = "GateArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.09f)
                curveTo(12.03f, 20.67f, 12.0f, 20.34f, 12.0f, 20.0f)
                curveTo(12.0f, 18.82f, 12.35f, 17.67f, 13.0f, 16.69f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.81f)
                curveTo(15.62f, 14.45f, 16.3f, 14.21f, 17.0f, 14.09f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.09f)
                curveTo(19.7f, 14.21f, 20.38f, 14.45f, 21.0f, 14.81f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                moveTo(9.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                moveTo(19.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                lineTo(22.0f, 20.0f)
                lineTo(19.0f, 17.0f)
                close()
            }
        }
        .build()
        return _gateArrowRight!!
    }

private var _gateArrowRight: ImageVector? = null
