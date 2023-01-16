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

public val MaterialDesignIcons.TranslateOff: ImageVector
    get() {
        if (_translateOff != null) {
            return _translateOff!!
        }
        _translateOff = Builder(name = "TranslateOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.17f, 5.81f)
                curveTo(11.87f, 6.69f, 11.47f, 7.55f, 11.0f, 8.39f)
                lineTo(12.35f, 9.74f)
                curveTo(13.11f, 8.5f, 13.71f, 7.18f, 14.13f, 5.81f)
                horizontalLineTo(17.16f)
                verticalLineTo(3.75f)
                horizontalLineTo(9.94f)
                verticalLineTo(1.69f)
                horizontalLineTo(7.87f)
                verticalLineTo(3.75f)
                horizontalLineTo(6.37f)
                lineTo(8.43f, 5.81f)
                horizontalLineTo(12.17f)
                moveTo(15.53f, 12.91f)
                lineTo(17.03f, 14.41f)
                lineTo(17.67f, 12.69f)
                lineTo(19.08f, 16.47f)
                lineTo(22.39f, 19.77f)
                lineTo(18.7f, 9.94f)
                horizontalLineTo(16.64f)
                lineTo(15.53f, 12.91f)
                moveTo(1.31f, 1.31f)
                lineTo(0.0f, 2.62f)
                lineTo(1.13f, 3.75f)
                horizontalLineTo(0.65f)
                verticalLineTo(5.81f)
                horizontalLineTo(3.19f)
                lineTo(5.26f, 7.88f)
                horizontalLineTo(4.46f)
                curveTo(5.21f, 9.56f, 6.24f, 11.15f, 7.53f, 12.58f)
                lineTo(2.28f, 17.76f)
                lineTo(3.75f, 19.22f)
                lineTo(8.91f, 14.07f)
                lineTo(12.11f, 17.27f)
                lineTo(12.8f, 15.43f)
                lineTo(14.1f, 16.72f)
                lineTo(12.0f, 22.31f)
                horizontalLineTo(14.06f)
                lineTo(15.22f, 19.22f)
                horizontalLineTo(16.6f)
                lineTo(21.38f, 24.0f)
                lineTo(22.69f, 22.69f)
                lineTo(1.31f, 1.31f)
                close()
            }
        }
        .build()
        return _translateOff!!
    }

private var _translateOff: ImageVector? = null
