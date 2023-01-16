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

public val MaterialDesignIcons.ArrowTopLeftThick: ImageVector
    get() {
        if (_arrowTopLeftThick != null) {
            return _arrowTopLeftThick!!
        }
        _arrowTopLeftThick = Builder(name = "ArrowTopLeftThick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.12f, 11.94f)
                verticalLineTo(16.89f)
                horizontalLineTo(5.69f)
                verticalLineTo(5.69f)
                horizontalLineTo(16.89f)
                verticalLineTo(9.12f)
                horizontalLineTo(11.94f)
                lineTo(18.31f, 15.5f)
                lineTo(15.5f, 18.31f)
                lineTo(9.12f, 11.94f)
                close()
            }
        }
        .build()
        return _arrowTopLeftThick!!
    }

private var _arrowTopLeftThick: ImageVector? = null
