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

public val MaterialDesignIcons.Protocol: ImageVector
    get() {
        if (_protocol != null) {
            return _protocol!!
        }
        _protocol = Builder(name = "Protocol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                horizontalLineTo(14.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineTo(22.0f)
                moveTo(16.0f, 4.0f)
                horizontalLineTo(12.0f)
                lineTo(8.0f, 20.0f)
                horizontalLineTo(12.0f)
                moveTo(2.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 16.5f)
                moveTo(2.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 9.5f)
                close()
            }
        }
        .build()
        return _protocol!!
    }

private var _protocol: ImageVector? = null
