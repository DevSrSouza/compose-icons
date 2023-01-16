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

public val MaterialDesignIcons.TranscribeClose: ImageVector
    get() {
        if (_transcribeClose != null) {
            return _transcribeClose!!
        }
        _transcribeClose = Builder(name = "TranscribeClose", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                lineTo(8.0f, 19.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 23.0f)
                moveTo(20.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 5.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 17.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 15.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.5f)
                lineTo(10.5f, 15.0f)
                horizontalLineTo(18.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(8.5f)
                lineTo(15.35f, 8.12f)
                curveTo(15.55f, 7.93f, 15.55f, 7.61f, 15.35f, 7.42f)
                lineTo(13.59f, 5.65f)
                curveTo(13.39f, 5.45f, 13.07f, 5.45f, 12.88f, 5.65f)
                lineTo(6.0f, 12.53f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _transcribeClose!!
    }

private var _transcribeClose: ImageVector? = null
