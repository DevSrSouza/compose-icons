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

public val MaterialDesignIcons.ArrowBottomLeftThick: ImageVector
    get() {
        if (_arrowBottomLeftThick != null) {
            return _arrowBottomLeftThick!!
        }
        _arrowBottomLeftThick = Builder(name = "ArrowBottomLeftThick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 5.69f)
                lineTo(18.31f, 8.5f)
                lineTo(11.94f, 14.89f)
                horizontalLineTo(16.89f)
                verticalLineTo(18.31f)
                horizontalLineTo(5.69f)
                verticalLineTo(7.11f)
                horizontalLineTo(9.12f)
                verticalLineTo(12.06f)
                lineTo(15.5f, 5.69f)
                close()
            }
        }
        .build()
        return _arrowBottomLeftThick!!
    }

private var _arrowBottomLeftThick: ImageVector? = null
