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

public val MaterialDesignIcons.MicrophoneSettings: ImageVector
    get() {
        if (_microphoneSettings != null) {
            return _microphoneSettings!!
        }
        _microphoneSettings = Builder(name = "MicrophoneSettings", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                horizontalLineTo(17.3f)
                curveTo(17.3f, 13.0f, 14.76f, 15.1f, 12.0f, 15.1f)
                curveTo(9.24f, 15.1f, 6.7f, 13.0f, 6.7f, 10.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 13.41f, 7.72f, 16.23f, 11.0f, 16.72f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.72f)
                curveTo(16.28f, 16.23f, 19.0f, 13.41f, 19.0f, 10.0f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 10.0f)
                verticalLineTo(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 4.0f)
                verticalLineTo(10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 13.0f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _microphoneSettings!!
    }

private var _microphoneSettings: ImageVector? = null
