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

public val MaterialDesignIcons.MicrophoneVariant: ImageVector
    get() {
        if (_microphoneVariant != null) {
            return _microphoneVariant!!
        }
        _microphoneVariant = Builder(name = "MicrophoneVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 7.0f)
                horizontalLineTo(5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 3.0f)
                moveTo(11.84f, 9.82f)
                lineTo(11.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 19.0f)
                verticalLineTo(14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 10.0f)
                horizontalLineTo(20.0f)
                lineTo(19.0f, 11.0f)
                lineTo(20.0f, 12.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 14.0f)
                verticalLineTo(19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 23.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                lineTo(6.16f, 9.82f)
                curveTo(5.67f, 9.32f, 5.31f, 8.7f, 5.13f, 8.0f)
                horizontalLineTo(12.87f)
                curveTo(12.69f, 8.7f, 12.33f, 9.32f, 11.84f, 9.82f)
                moveTo(9.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 11.0f)
                close()
            }
        }
        .build()
        return _microphoneVariant!!
    }

private var _microphoneVariant: ImageVector? = null
