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

public val MaterialDesignIcons.PhoneIncomingOutgoingOutline: ImageVector
    get() {
        if (_phoneIncomingOutgoingOutline != null) {
            return _phoneIncomingOutgoingOutline!!
        }
        _phoneIncomingOutgoingOutline = Builder(name = "PhoneIncomingOutgoingOutline", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.5f)
                curveTo(17.8f, 16.5f, 16.5f, 16.3f, 15.4f, 15.9f)
                horizontalLineTo(15.1f)
                curveTo(14.8f, 15.9f, 14.6f, 16.0f, 14.4f, 16.2f)
                lineTo(12.2f, 18.4f)
                curveTo(9.4f, 16.9f, 7.0f, 14.6f, 5.6f, 11.8f)
                lineTo(7.8f, 9.6f)
                curveTo(8.1f, 9.3f, 8.2f, 8.9f, 8.0f, 8.6f)
                curveTo(7.7f, 7.5f, 7.5f, 6.2f, 7.5f, 5.0f)
                curveTo(7.5f, 4.5f, 7.0f, 4.0f, 6.5f, 4.0f)
                horizontalLineTo(3.0f)
                curveTo(2.5f, 4.0f, 2.0f, 4.5f, 2.0f, 5.0f)
                curveTo(2.0f, 14.4f, 9.6f, 22.0f, 19.0f, 22.0f)
                curveTo(19.5f, 22.0f, 20.0f, 21.5f, 20.0f, 21.0f)
                verticalLineTo(17.5f)
                curveTo(20.0f, 17.0f, 19.5f, 16.5f, 19.0f, 16.5f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(5.5f)
                curveTo(5.6f, 6.9f, 5.8f, 7.8f, 6.0f, 8.6f)
                lineTo(4.8f, 9.8f)
                curveTo(4.4f, 8.6f, 4.1f, 7.3f, 4.0f, 6.0f)
                moveTo(18.0f, 20.0f)
                curveTo(16.7f, 19.9f, 15.4f, 19.6f, 14.2f, 19.2f)
                lineTo(15.4f, 18.0f)
                curveTo(16.2f, 18.2f, 17.1f, 18.4f, 18.0f, 18.4f)
                verticalLineTo(20.0f)
                moveTo(16.0f, 9.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(12.5f)
                lineTo(18.0f, 2.0f)
                lineTo(17.0f, 1.0f)
                lineTo(11.5f, 6.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                moveTo(17.0f, 6.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(20.5f)
                lineTo(15.0f, 13.0f)
                lineTo(16.0f, 14.0f)
                lineTo(21.5f, 8.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _phoneIncomingOutgoingOutline!!
    }

private var _phoneIncomingOutgoingOutline: ImageVector? = null
