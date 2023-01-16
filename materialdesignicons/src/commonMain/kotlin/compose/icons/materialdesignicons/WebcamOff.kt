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

public val MaterialDesignIcons.WebcamOff: ImageVector
    get() {
        if (_webcamOff != null) {
            return _webcamOff!!
        }
        _webcamOff = Builder(name = "WebcamOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(13.66f, 6.0f, 15.0f, 7.34f, 15.0f, 9.0f)
                curveTo(15.0f, 9.78f, 14.7f, 10.5f, 14.21f, 11.0f)
                lineTo(10.0f, 6.79f)
                curveTo(10.5f, 6.3f, 11.22f, 6.0f, 12.0f, 6.0f)
                moveTo(12.0f, 4.0f)
                curveTo(14.76f, 4.0f, 17.0f, 6.24f, 17.0f, 9.0f)
                curveTo(17.0f, 10.33f, 16.47f, 11.53f, 15.62f, 12.42f)
                lineTo(17.04f, 13.84f)
                curveTo(18.25f, 12.59f, 19.0f, 10.88f, 19.0f, 9.0f)
                curveTo(19.0f, 5.13f, 15.87f, 2.0f, 12.0f, 2.0f)
                curveTo(10.12f, 2.0f, 8.41f, 2.75f, 7.16f, 3.96f)
                lineTo(8.58f, 5.38f)
                curveTo(9.47f, 4.53f, 10.67f, 4.0f, 12.0f, 4.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.46f, 21.35f)
                curveTo(19.1f, 21.75f, 18.58f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.11f, 4.0f, 20.0f)
                curveTo(4.0f, 19.62f, 4.1f, 19.27f, 4.29f, 18.97f)
                lineTo(6.11f, 15.81f)
                curveTo(7.69f, 17.17f, 9.75f, 18.0f, 12.0f, 18.0f)
                curveTo(13.21f, 18.0f, 14.37f, 17.75f, 15.43f, 17.32f)
                lineTo(13.85f, 15.74f)
                curveTo(13.26f, 15.91f, 12.64f, 16.0f, 12.0f, 16.0f)
                curveTo(8.13f, 16.0f, 5.0f, 12.87f, 5.0f, 9.0f)
                curveTo(5.0f, 8.36f, 5.09f, 7.74f, 5.26f, 7.15f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.1f, 14.0f)
                lineTo(7.0f, 8.9f)
                curveTo(7.0f, 8.93f, 7.0f, 8.97f, 7.0f, 9.0f)
                curveTo(7.0f, 11.76f, 9.24f, 14.0f, 12.0f, 14.0f)
                curveTo(12.03f, 14.0f, 12.07f, 14.0f, 12.1f, 14.0f)
                close()
            }
        }
        .build()
        return _webcamOff!!
    }

private var _webcamOff: ImageVector? = null
