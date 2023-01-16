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

public val MaterialDesignIcons.ArrowTopRightThick: ImageVector
    get() {
        if (_arrowTopRightThick != null) {
            return _arrowTopRightThick!!
        }
        _arrowTopRightThick = Builder(name = "ArrowTopRightThick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 18.31f)
                lineTo(5.69f, 15.5f)
                lineTo(12.06f, 9.12f)
                horizontalLineTo(7.11f)
                verticalLineTo(5.69f)
                horizontalLineTo(18.31f)
                verticalLineTo(16.89f)
                horizontalLineTo(14.89f)
                verticalLineTo(11.94f)
                lineTo(8.5f, 18.31f)
                close()
            }
        }
        .build()
        return _arrowTopRightThick!!
    }

private var _arrowTopRightThick: ImageVector? = null
