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

public val MaterialDesignIcons.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                horizontalLineTo(14.0f)
                lineTo(17.29f, 2.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.71f, 2.7f)
                lineTo(21.29f, 5.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.29f, 6.7f)
                lineTo(19.0f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 6.0f)
                moveTo(5.0f, 11.0f)
                verticalLineTo(15.0f)
                lineTo(2.71f, 17.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.71f, 18.7f)
                lineTo(5.29f, 21.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.71f, 21.29f)
                lineTo(11.0f, 17.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 14.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 12.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
