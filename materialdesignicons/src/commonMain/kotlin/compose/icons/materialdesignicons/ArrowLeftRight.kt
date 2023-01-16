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

public val MaterialDesignIcons.ArrowLeftRight: ImageVector
    get() {
        if (_arrowLeftRight != null) {
            return _arrowLeftRight!!
        }
        _arrowLeftRight = Builder(name = "ArrowLeftRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.45f, 17.45f)
                lineTo(1.0f, 12.0f)
                lineTo(6.45f, 6.55f)
                lineTo(7.86f, 7.96f)
                lineTo(4.83f, 11.0f)
                horizontalLineTo(19.17f)
                lineTo(16.14f, 7.96f)
                lineTo(17.55f, 6.55f)
                lineTo(23.0f, 12.0f)
                lineTo(17.55f, 17.45f)
                lineTo(16.14f, 16.04f)
                lineTo(19.17f, 13.0f)
                horizontalLineTo(4.83f)
                lineTo(7.86f, 16.04f)
                lineTo(6.45f, 17.45f)
                close()
            }
        }
        .build()
        return _arrowLeftRight!!
    }

private var _arrowLeftRight: ImageVector? = null
