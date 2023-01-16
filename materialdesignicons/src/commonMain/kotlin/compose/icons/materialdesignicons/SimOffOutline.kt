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

public val MaterialDesignIcons.SimOffOutline: ImageVector
    get() {
        if (_simOffOutline != null) {
            return _simOffOutline!!
        }
        _simOffOutline = Builder(name = "SimOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.06f, 6.95f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.58f, 22.0f, 19.1f, 21.75f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.83f)
                lineTo(6.47f, 8.36f)
                lineTo(18.0f, 19.89f)
                verticalLineTo(20.0f)
                moveTo(10.83f, 4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.8f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.11f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(10.0f)
                lineTo(7.6f, 4.4f)
                lineTo(9.0f, 5.81f)
                lineTo(10.83f, 4.0f)
                close()
            }
        }
        .build()
        return _simOffOutline!!
    }

private var _simOffOutline: ImageVector? = null
