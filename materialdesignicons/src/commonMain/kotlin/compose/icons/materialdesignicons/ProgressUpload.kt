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

public val MaterialDesignIcons.ProgressUpload: ImageVector
    get() {
        if (_progressUpload != null) {
            return _progressUpload!!
        }
        _progressUpload = Builder(name = "ProgressUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.03f)
                curveTo(17.73f, 2.5f, 21.5f, 6.25f, 21.95f, 11.0f)
                curveTo(22.5f, 16.5f, 18.5f, 21.38f, 13.0f, 21.93f)
                verticalLineTo(19.93f)
                curveTo(16.64f, 19.5f, 19.5f, 16.61f, 19.96f, 12.97f)
                curveTo(20.5f, 8.58f, 17.39f, 4.59f, 13.0f, 4.05f)
                verticalLineTo(2.05f)
                lineTo(13.0f, 2.03f)
                moveTo(11.0f, 2.06f)
                verticalLineTo(4.06f)
                curveTo(9.57f, 4.26f, 8.22f, 4.84f, 7.1f, 5.74f)
                lineTo(5.67f, 4.26f)
                curveTo(7.19f, 3.0f, 9.05f, 2.25f, 11.0f, 2.06f)
                moveTo(4.26f, 5.67f)
                lineTo(5.69f, 7.1f)
                curveTo(4.8f, 8.23f, 4.24f, 9.58f, 4.05f, 11.0f)
                horizontalLineTo(2.05f)
                curveTo(2.25f, 9.04f, 3.0f, 7.19f, 4.26f, 5.67f)
                moveTo(2.06f, 13.0f)
                horizontalLineTo(4.06f)
                curveTo(4.24f, 14.42f, 4.81f, 15.77f, 5.69f, 16.9f)
                lineTo(4.27f, 18.33f)
                curveTo(3.03f, 16.81f, 2.26f, 14.96f, 2.06f, 13.0f)
                moveTo(7.1f, 18.37f)
                curveTo(8.23f, 19.25f, 9.58f, 19.82f, 11.0f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(9.04f, 21.79f, 7.18f, 21.0f, 5.67f, 19.74f)
                lineTo(7.1f, 18.37f)
                moveTo(12.0f, 7.5f)
                lineTo(7.5f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                lineTo(12.0f, 7.5f)
                close()
            }
        }
        .build()
        return _progressUpload!!
    }

private var _progressUpload: ImageVector? = null
