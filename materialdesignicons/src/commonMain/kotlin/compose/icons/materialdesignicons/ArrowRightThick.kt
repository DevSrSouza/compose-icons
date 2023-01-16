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

public val MaterialDesignIcons.ArrowRightThick: ImageVector
    get() {
        if (_arrowRightThick != null) {
            return _arrowRightThick!!
        }
        _arrowRightThick = Builder(name = "ArrowRightThick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                lineTo(9.5f, 17.5f)
                lineTo(11.92f, 19.92f)
                lineTo(19.84f, 12.0f)
                lineTo(11.92f, 4.08f)
                lineTo(9.5f, 6.5f)
                lineTo(13.0f, 10.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _arrowRightThick!!
    }

private var _arrowRightThick: ImageVector? = null
