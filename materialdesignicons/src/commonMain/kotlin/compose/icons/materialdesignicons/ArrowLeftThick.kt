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

public val MaterialDesignIcons.ArrowLeftThick: ImageVector
    get() {
        if (_arrowLeftThick != null) {
            return _arrowLeftThick!!
        }
        _arrowLeftThick = Builder(name = "ArrowLeftThick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                lineTo(14.5f, 17.5f)
                lineTo(12.08f, 19.92f)
                lineTo(4.16f, 12.0f)
                lineTo(12.08f, 4.08f)
                lineTo(14.5f, 6.5f)
                lineTo(11.0f, 10.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _arrowLeftThick!!
    }

private var _arrowLeftThick: ImageVector? = null
