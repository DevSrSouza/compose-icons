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

public val MaterialDesignIcons.AccountTieVoiceOff: ImageVector
    get() {
        if (_accountTieVoiceOff != null) {
            return _accountTieVoiceOff!!
        }
        _accountTieVoiceOff = Builder(name = "AccountTieVoiceOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7f, 9.5f)
                lineTo(7.5f, 4.3f)
                curveTo(7.96f, 4.11f, 8.46f, 4.0f, 9.0f, 4.0f)
                curveTo(11.2f, 4.0f, 13.0f, 5.79f, 13.0f, 8.0f)
                curveTo(13.0f, 8.53f, 12.89f, 9.04f, 12.7f, 9.5f)
                moveTo(16.75f, 11.63f)
                curveTo(18.77f, 9.61f, 18.77f, 6.56f, 16.75f, 4.36f)
                lineTo(15.07f, 6.05f)
                curveTo(15.91f, 7.23f, 15.91f, 8.76f, 15.07f, 9.94f)
                lineTo(16.75f, 11.63f)
                moveTo(20.06f, 15.0f)
                curveTo(23.96f, 11.11f, 24.0f, 5.05f, 20.06f, 1.0f)
                lineTo(18.43f, 2.63f)
                curveTo(21.2f, 5.65f, 21.2f, 10.19f, 18.43f, 13.37f)
                lineTo(20.06f, 15.0f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.13f, 7.0f)
                curveTo(5.05f, 7.34f, 5.0f, 7.66f, 5.0f, 8.0f)
                curveTo(5.0f, 10.21f, 6.79f, 12.0f, 9.0f, 12.0f)
                curveTo(9.33f, 12.0f, 9.66f, 11.94f, 9.97f, 11.86f)
                lineTo(13.0f, 14.87f)
                curveTo(12.93f, 16.06f, 12.54f, 18.32f, 10.8f, 20.83f)
                lineTo(10.0f, 16.0f)
                lineTo(10.93f, 14.12f)
                curveTo(10.31f, 14.05f, 9.66f, 14.0f, 9.0f, 14.0f)
                curveTo(8.32f, 14.0f, 7.67f, 14.05f, 7.05f, 14.12f)
                lineTo(8.0f, 16.0f)
                lineTo(7.18f, 20.83f)
                curveTo(5.27f, 18.07f, 5.0f, 15.6f, 5.0f, 14.54f)
                curveTo(2.6f, 15.24f, 0.994f, 16.5f, 0.994f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.88f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }
        .build()
        return _accountTieVoiceOff!!
    }

private var _accountTieVoiceOff: ImageVector? = null
