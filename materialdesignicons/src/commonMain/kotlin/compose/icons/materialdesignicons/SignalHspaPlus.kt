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

public val MaterialDesignIcons.SignalHspaPlus: ImageVector
    get() {
        if (_signalHspaPlus != null) {
            return _signalHspaPlus!!
        }
        _signalHspaPlus = Builder(name = "SignalHspaPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                moveTo(5.0f, 10.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _signalHspaPlus!!
    }

private var _signalHspaPlus: ImageVector? = null
