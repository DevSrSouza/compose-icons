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

public val MaterialDesignIcons.SignalHspa: ImageVector
    get() {
        if (_signalHspa != null) {
            return _signalHspa!!
        }
        _signalHspa = Builder(name = "SignalHspa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 10.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _signalHspa!!
    }

private var _signalHspa: ImageVector? = null
