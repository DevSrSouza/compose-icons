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

public val MaterialDesignIcons.PhoneIncomingOutgoing: ImageVector
    get() {
        if (_phoneIncomingOutgoing != null) {
            return _phoneIncomingOutgoing!!
        }
        _phoneIncomingOutgoing = Builder(name = "PhoneIncomingOutgoing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.5f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.55f, 19.55f, 22.0f, 19.0f, 22.0f)
                curveTo(9.61f, 22.0f, 2.0f, 14.39f, 2.0f, 5.0f)
                curveTo(2.0f, 4.45f, 2.45f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(6.5f)
                curveTo(7.05f, 4.0f, 7.5f, 4.45f, 7.5f, 5.0f)
                curveTo(7.5f, 6.25f, 7.7f, 7.45f, 8.07f, 8.57f)
                curveTo(8.18f, 8.92f, 8.1f, 9.31f, 7.82f, 9.57f)
                lineTo(5.62f, 11.78f)
                curveTo(7.06f, 14.62f, 9.38f, 16.93f, 12.21f, 18.37f)
                lineTo(14.41f, 16.17f)
                curveTo(14.69f, 15.9f, 15.08f, 15.82f, 15.43f, 15.93f)
                curveTo(16.55f, 16.3f, 17.75f, 16.5f, 19.0f, 16.5f)
                curveTo(19.55f, 16.5f, 20.0f, 16.95f, 20.0f, 17.5f)
                moveTo(16.0f, 7.5f)
                horizontalLineTo(12.5f)
                lineTo(18.0f, 2.0f)
                lineTo(17.0f, 1.0f)
                lineTo(11.5f, 6.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.5f)
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
        return _phoneIncomingOutgoing!!
    }

private var _phoneIncomingOutgoing: ImageVector? = null
