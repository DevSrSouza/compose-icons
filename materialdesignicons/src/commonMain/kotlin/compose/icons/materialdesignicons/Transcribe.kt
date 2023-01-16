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

public val MaterialDesignIcons.Transcribe: ImageVector
    get() {
        if (_transcribe != null) {
            return _transcribe!!
        }
        _transcribe = Builder(name = "Transcribe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 19.0f, 2.0f, 18.1f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.89f, 2.89f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(20.0f)
                moveTo(18.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.5f)
                lineTo(10.5f, 17.0f)
                horizontalLineTo(18.0f)
                moveTo(6.0f, 17.0f)
                horizontalLineTo(8.5f)
                lineTo(15.35f, 10.12f)
                curveTo(15.55f, 9.93f, 15.55f, 9.61f, 15.35f, 9.41f)
                lineTo(13.59f, 7.65f)
                curveTo(13.39f, 7.45f, 13.07f, 7.45f, 12.88f, 7.65f)
                lineTo(6.0f, 14.53f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _transcribe!!
    }

private var _transcribe: ImageVector? = null
