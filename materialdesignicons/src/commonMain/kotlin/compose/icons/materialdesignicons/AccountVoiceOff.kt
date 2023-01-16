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

public val MaterialDesignIcons.AccountVoiceOff: ImageVector
    get() {
        if (_accountVoiceOff != null) {
            return _accountVoiceOff!!
        }
        _accountVoiceOff = Builder(name = "AccountVoiceOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.27f)
                lineTo(3.28f, 2.0f)
                lineTo(22.0f, 20.72f)
                lineTo(20.73f, 22.0f)
                lineTo(16.73f, 18.0f)
                curveTo(16.9f, 18.31f, 17.0f, 18.64f, 17.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 16.34f, 6.33f, 15.0f, 9.0f, 15.0f)
                curveTo(10.77f, 15.0f, 13.72f, 15.59f, 15.5f, 16.77f)
                lineTo(11.12f, 12.39f)
                curveTo(10.5f, 12.78f, 9.78f, 13.0f, 9.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 9.0f)
                curveTo(5.0f, 8.22f, 5.22f, 7.5f, 5.61f, 6.88f)
                lineTo(2.0f, 3.27f)
                moveTo(9.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 9.0f)
                verticalLineTo(9.17f)
                lineTo(8.83f, 5.0f)
                horizontalLineTo(9.0f)
                moveTo(16.76f, 5.36f)
                curveTo(18.78f, 7.56f, 18.78f, 10.61f, 16.76f, 12.63f)
                lineTo(15.08f, 10.94f)
                curveTo(15.92f, 9.76f, 15.92f, 8.23f, 15.08f, 7.05f)
                lineTo(16.76f, 5.36f)
                moveTo(20.07f, 2.0f)
                curveTo(24.0f, 6.05f, 23.97f, 12.11f, 20.07f, 16.0f)
                lineTo(18.44f, 14.37f)
                curveTo(21.21f, 11.19f, 21.21f, 6.65f, 18.44f, 3.63f)
                lineTo(20.07f, 2.0f)
                close()
            }
        }
        .build()
        return _accountVoiceOff!!
    }

private var _accountVoiceOff: ImageVector? = null
