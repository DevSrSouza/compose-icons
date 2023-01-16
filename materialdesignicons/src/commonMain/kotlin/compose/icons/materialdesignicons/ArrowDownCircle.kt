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

public val MaterialDesignIcons.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) {
            return _arrowDownCircle!!
        }
        _arrowDownCircle = Builder(name = "ArrowDownCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineTo(14.0f)
                lineTo(7.5f, 10.5f)
                lineTo(6.08f, 11.92f)
                lineTo(12.0f, 17.84f)
                lineTo(17.92f, 11.92f)
                lineTo(16.5f, 10.5f)
                lineTo(13.0f, 14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
