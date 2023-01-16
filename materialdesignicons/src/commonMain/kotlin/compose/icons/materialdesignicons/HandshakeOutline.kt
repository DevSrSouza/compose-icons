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

public val MaterialDesignIcons.HandshakeOutline: ImageVector
    get() {
        if (_handshakeOutline != null) {
            return _handshakeOutline!!
        }
        _handshakeOutline = Builder(name = "HandshakeOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.71f, 8.71f)
                curveTo(22.96f, 7.46f, 22.39f, 6.0f, 21.71f, 5.29f)
                lineTo(18.71f, 2.29f)
                curveTo(17.45f, 1.04f, 16.0f, 1.61f, 15.29f, 2.29f)
                lineTo(13.59f, 4.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1f, 4.0f, 8.0f, 5.0f, 7.44f, 6.15f)
                lineTo(3.0f, 10.59f)
                verticalLineTo(14.59f)
                lineTo(2.29f, 15.29f)
                curveTo(1.04f, 16.55f, 1.61f, 18.0f, 2.29f, 18.71f)
                lineTo(5.29f, 21.71f)
                curveTo(5.83f, 22.25f, 6.41f, 22.45f, 6.96f, 22.45f)
                curveTo(7.67f, 22.45f, 8.32f, 22.1f, 8.71f, 21.71f)
                lineTo(11.41f, 19.0f)
                horizontalLineTo(15.0f)
                curveTo(16.7f, 19.0f, 17.56f, 17.94f, 17.87f, 16.9f)
                curveTo(19.0f, 16.6f, 19.62f, 15.74f, 19.87f, 14.9f)
                curveTo(21.42f, 14.5f, 22.0f, 13.03f, 22.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.41f)
                lineTo(21.71f, 8.71f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 12.45f, 19.81f, 13.0f, 19.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                lineTo(18.0f, 14.0f)
                curveTo(18.0f, 14.45f, 17.81f, 15.0f, 17.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                lineTo(16.0f, 16.0f)
                curveTo(16.0f, 16.45f, 15.81f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(10.59f)
                lineTo(7.31f, 20.28f)
                curveTo(7.0f, 20.57f, 6.82f, 20.4f, 6.71f, 20.29f)
                lineTo(3.72f, 17.31f)
                curveTo(3.43f, 17.0f, 3.6f, 16.82f, 3.71f, 16.71f)
                lineTo(5.0f, 15.41f)
                verticalLineTo(11.41f)
                lineTo(7.0f, 9.41f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 12.21f, 7.8f, 14.0f, 10.0f, 14.0f)
                reflectiveCurveTo(13.0f, 12.21f, 13.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                moveTo(20.29f, 7.29f)
                lineTo(18.59f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                curveTo(11.0f, 11.45f, 10.81f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(9.0f, 11.45f, 9.0f, 11.0f)
                verticalLineTo(8.0f)
                curveTo(9.0f, 7.54f, 9.17f, 6.0f, 11.0f, 6.0f)
                horizontalLineTo(14.41f)
                lineTo(16.69f, 3.72f)
                curveTo(17.0f, 3.43f, 17.18f, 3.6f, 17.29f, 3.71f)
                lineTo(20.28f, 6.69f)
                curveTo(20.57f, 7.0f, 20.4f, 7.18f, 20.29f, 7.29f)
                close()
            }
        }
        .build()
        return _handshakeOutline!!
    }

private var _handshakeOutline: ImageVector? = null
