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

public val MaterialDesignIcons.ArrowLeftBoldCircle: ImageVector
    get() {
        if (_arrowLeftBoldCircle != null) {
            return _arrowLeftBoldCircle!!
        }
        _arrowLeftBoldCircle = Builder(name = "ArrowLeftBoldCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                moveTo(7.0f, 12.0f)
                lineTo(12.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                lineTo(7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowLeftBoldCircle!!
    }

private var _arrowLeftBoldCircle: ImageVector? = null
