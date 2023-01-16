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

public val MaterialDesignIcons.ArrowLeftCircle: ImageVector
    get() {
        if (_arrowLeftCircle != null) {
            return _arrowLeftCircle!!
        }
        _arrowLeftCircle = Builder(name = "ArrowLeftCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(10.0f)
                lineTo(13.5f, 7.5f)
                lineTo(12.08f, 6.08f)
                lineTo(6.16f, 12.0f)
                lineTo(12.08f, 17.92f)
                lineTo(13.5f, 16.5f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _arrowLeftCircle!!
    }

private var _arrowLeftCircle: ImageVector? = null
