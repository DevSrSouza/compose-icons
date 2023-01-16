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

public val MaterialDesignIcons.SignalDistanceVariant: ImageVector
    get() {
        if (_signalDistanceVariant != null) {
            return _signalDistanceVariant!!
        }
        _signalDistanceVariant = Builder(name = "SignalDistanceVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 16.0f, 16.0f)
                horizontalLineTo(14.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 4.0f, 6.0f)
                moveTo(4.0f, 10.0f)
                verticalLineTo(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 16.0f)
                horizontalLineTo(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.0f, 10.0f)
                moveTo(4.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                moveTo(3.0f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                lineTo(22.0f, 19.0f)
                lineTo(19.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _signalDistanceVariant!!
    }

private var _signalDistanceVariant: ImageVector? = null
