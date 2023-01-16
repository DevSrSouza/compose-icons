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

public val MaterialDesignIcons.ArrowBottomRightThick: ImageVector
    get() {
        if (_arrowBottomRightThick != null) {
            return _arrowBottomRightThick!!
        }
        _arrowBottomRightThick = Builder(name = "ArrowBottomRightThick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.89f, 12.06f)
                verticalLineTo(7.11f)
                horizontalLineTo(18.31f)
                verticalLineTo(18.31f)
                horizontalLineTo(7.11f)
                verticalLineTo(14.89f)
                horizontalLineTo(12.06f)
                lineTo(5.69f, 8.5f)
                lineTo(8.5f, 5.69f)
                lineTo(14.89f, 12.06f)
                close()
            }
        }
        .build()
        return _arrowBottomRightThick!!
    }

private var _arrowBottomRightThick: ImageVector? = null
