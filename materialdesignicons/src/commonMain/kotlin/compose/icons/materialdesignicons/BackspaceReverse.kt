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

public val MaterialDesignIcons.BackspaceReverse: ImageVector
    get() {
        if (_backspaceReverse != null) {
            return _backspaceReverse!!
        }
        _backspaceReverse = Builder(name = "BackspaceReverse", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(17.7f, 21.0f, 18.2f, 20.6f, 18.6f, 20.1f)
                lineTo(24.0f, 12.0f)
                lineTo(18.6f, 3.9f)
                curveTo(18.2f, 3.4f, 17.7f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 21.0f)
                moveTo(5.0f, 8.4f)
                lineTo(6.4f, 7.0f)
                lineTo(10.0f, 10.6f)
                lineTo(13.6f, 7.0f)
                lineTo(15.0f, 8.4f)
                lineTo(11.4f, 12.0f)
                lineTo(15.0f, 15.6f)
                lineTo(13.6f, 17.0f)
                lineTo(10.0f, 13.4f)
                lineTo(6.4f, 17.0f)
                lineTo(5.0f, 15.6f)
                lineTo(8.6f, 12.0f)
            }
        }
        .build()
        return _backspaceReverse!!
    }

private var _backspaceReverse: ImageVector? = null
