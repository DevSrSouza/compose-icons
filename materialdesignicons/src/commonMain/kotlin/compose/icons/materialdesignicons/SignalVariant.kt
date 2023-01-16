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

public val MaterialDesignIcons.SignalVariant: ImageVector
    get() {
        if (_signalVariant != null) {
            return _signalVariant!!
        }
        _signalVariant = Builder(name = "SignalVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.1f)
                curveTo(12.9f, 4.0f, 20.0f, 11.1f, 20.0f, 19.9f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.9f)
                curveTo(18.0f, 12.2f, 11.8f, 6.0f, 4.0f, 6.0f)
                moveTo(4.0f, 10.0f)
                verticalLineTo(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 16.0f, 20.0f)
                horizontalLineTo(14.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 4.0f, 10.0f)
                moveTo(4.0f, 14.0f)
                verticalLineTo(12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                horizontalLineTo(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.0f, 14.0f)
                moveTo(4.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _signalVariant!!
    }

private var _signalVariant: ImageVector? = null
