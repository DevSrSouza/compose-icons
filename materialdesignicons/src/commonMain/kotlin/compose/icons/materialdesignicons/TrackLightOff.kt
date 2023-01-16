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

public val MaterialDesignIcons.TrackLightOff: ImageVector
    get() {
        if (_trackLightOff != null) {
            return _trackLightOff!!
        }
        _trackLightOff = Builder(name = "TrackLightOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.78f, 13.57f)
                lineTo(22.55f, 14.72f)
                lineTo(21.79f, 16.57f)
                lineTo(19.0f, 15.42f)
                lineTo(19.78f, 13.57f)
                moveTo(22.57f, 8.14f)
                lineTo(21.81f, 6.29f)
                lineTo(19.5f, 7.25f)
                lineTo(20.26f, 9.1f)
                lineTo(22.57f, 8.14f)
                moveTo(14.34f, 19.69f)
                lineTo(15.3f, 22.0f)
                lineTo(17.15f, 21.23f)
                lineTo(16.19f, 18.93f)
                lineTo(14.34f, 19.69f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.64f, 5.53f)
                lineTo(1.43f, 10.84f)
                lineTo(6.97f, 13.14f)
                lineTo(11.94f, 16.82f)
                lineTo(13.79f, 17.59f)
                lineTo(14.35f, 16.24f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(6.2f, 3.0f)
                lineTo(6.0f, 2.8f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.87f)
                lineTo(15.77f, 7.58f)
                lineTo(17.62f, 8.35f)
                lineTo(15.84f, 12.64f)
                lineTo(9.0f, 5.8f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.2f)
                close()
            }
        }
        .build()
        return _trackLightOff!!
    }

private var _trackLightOff: ImageVector? = null
