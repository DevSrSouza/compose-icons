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

public val MaterialDesignIcons.IncognitoOff: ImageVector
    get() {
        if (_incognitoOff != null) {
            return _incognitoOff!!
        }
        _incognitoOff = Builder(name = "IncognitoOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(6.31f, 8.2f)
                lineTo(6.0f, 9.0f)
                horizontalLineTo(7.11f)
                lineTo(8.61f, 10.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.11f)
                lineTo(13.5f, 15.37f)
                curveTo(13.38f, 15.61f, 13.3f, 15.85f, 13.24f, 16.1f)
                curveTo(12.29f, 15.69f, 11.41f, 15.8f, 10.76f, 16.09f)
                curveTo(10.35f, 14.31f, 8.79f, 13.0f, 6.94f, 13.0f)
                curveTo(4.77f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f)
                curveTo(3.0f, 19.21f, 4.77f, 21.0f, 6.94f, 21.0f)
                curveTo(9.0f, 21.0f, 10.68f, 19.38f, 10.84f, 17.32f)
                curveTo(11.18f, 17.08f, 12.07f, 16.63f, 13.16f, 17.34f)
                curveTo(13.34f, 19.39f, 15.0f, 21.0f, 17.06f, 21.0f)
                curveTo(17.66f, 21.0f, 18.22f, 20.86f, 18.72f, 20.61f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(6.94f, 19.86f)
                curveTo(5.38f, 19.86f, 4.13f, 18.58f, 4.13f, 17.0f)
                curveTo(4.13f, 15.42f, 5.39f, 14.14f, 6.94f, 14.14f)
                curveTo(8.5f, 14.14f, 9.75f, 15.42f, 9.75f, 17.0f)
                curveTo(9.75f, 18.58f, 8.5f, 19.86f, 6.94f, 19.86f)
                moveTo(17.06f, 19.86f)
                curveTo(15.5f, 19.86f, 14.25f, 18.58f, 14.25f, 17.0f)
                curveTo(14.25f, 16.74f, 14.29f, 16.5f, 14.36f, 16.25f)
                lineTo(17.84f, 19.73f)
                curveTo(17.59f, 19.81f, 17.34f, 19.86f, 17.06f, 19.86f)
                moveTo(22.0f, 12.0f)
                horizontalLineTo(15.2f)
                lineTo(13.7f, 10.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                moveTo(17.06f, 13.0f)
                curveTo(19.23f, 13.0f, 21.0f, 14.79f, 21.0f, 17.0f)
                curveTo(21.0f, 17.25f, 20.97f, 17.5f, 20.93f, 17.73f)
                lineTo(19.84f, 16.64f)
                curveTo(19.68f, 15.34f, 18.66f, 14.32f, 17.38f, 14.17f)
                lineTo(16.29f, 13.09f)
                curveTo(16.54f, 13.03f, 16.8f, 13.0f, 17.06f, 13.0f)
                moveTo(12.2f, 9.0f)
                lineTo(7.72f, 4.5f)
                lineTo(8.43f, 2.68f)
                curveTo(8.63f, 2.17f, 9.19f, 1.89f, 9.72f, 2.04f)
                lineTo(9.77f, 2.05f)
                lineTo(12.0f, 2.79f)
                lineTo(14.22f, 2.05f)
                curveTo(14.75f, 1.88f, 15.32f, 2.14f, 15.54f, 2.63f)
                lineTo(15.56f, 2.68f)
                lineTo(18.0f, 9.0f)
                horizontalLineTo(12.2f)
                close()
            }
        }
        .build()
        return _incognitoOff!!
    }

private var _incognitoOff: ImageVector? = null
