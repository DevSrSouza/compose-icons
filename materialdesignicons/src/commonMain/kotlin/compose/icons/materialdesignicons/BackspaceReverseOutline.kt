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

public val MaterialDesignIcons.BackspaceReverseOutline: ImageVector
    get() {
        if (_backspaceReverseOutline != null) {
            return _backspaceReverseOutline!!
        }
        _backspaceReverseOutline = Builder(name = "BackspaceReverseOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.59f)
                lineTo(6.41f, 17.0f)
                lineTo(10.0f, 13.41f)
                lineTo(13.59f, 17.0f)
                lineTo(15.0f, 15.59f)
                lineTo(11.41f, 12.0f)
                lineTo(15.0f, 8.41f)
                lineTo(13.59f, 7.0f)
                lineTo(10.0f, 10.59f)
                lineTo(6.41f, 7.0f)
                lineTo(5.0f, 8.41f)
                lineTo(8.59f, 12.0f)
                lineTo(5.0f, 15.59f)
                moveTo(2.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(17.69f, 21.0f, 18.23f, 20.64f, 18.59f, 20.11f)
                lineTo(24.0f, 12.0f)
                lineTo(18.59f, 3.88f)
                curveTo(18.23f, 3.35f, 17.69f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(2.0f)
                moveTo(2.0f, 5.0f)
                horizontalLineTo(17.0f)
                lineTo(21.72f, 12.0f)
                lineTo(17.0f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _backspaceReverseOutline!!
    }

private var _backspaceReverseOutline: ImageVector? = null
