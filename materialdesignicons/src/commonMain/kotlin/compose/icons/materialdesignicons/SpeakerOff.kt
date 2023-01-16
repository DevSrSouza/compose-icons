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

public val MaterialDesignIcons.SpeakerOff: ImageVector
    get() {
        if (_speakerOff != null) {
            return _speakerOff!!
        }
        _speakerOff = Builder(name = "SpeakerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(21.0f, 21.72f)
                lineTo(19.73f, 23.0f)
                lineTo(18.27f, 21.54f)
                curveTo(17.93f, 21.83f, 17.5f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 22.0f, 5.0f, 21.1f, 5.0f, 20.0f)
                verticalLineTo(8.27f)
                lineTo(2.0f, 5.27f)
                moveTo(12.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 15.0f)
                curveTo(9.0f, 14.24f, 9.28f, 13.54f, 9.75f, 13.0f)
                lineTo(8.33f, 11.6f)
                curveTo(7.5f, 12.5f, 7.0f, 13.69f, 7.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 20.0f)
                curveTo(13.31f, 20.0f, 14.5f, 19.5f, 15.4f, 18.67f)
                lineTo(14.0f, 17.25f)
                curveTo(13.45f, 17.72f, 12.76f, 18.0f, 12.0f, 18.0f)
                moveTo(17.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 10.0f)
                horizontalLineTo(11.82f)
                lineTo(5.12f, 3.3f)
                curveTo(5.41f, 2.54f, 6.14f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 4.0f)
                verticalLineTo(17.18f)
                lineTo(17.0f, 15.17f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 4.0f)
                curveTo(10.89f, 4.0f, 10.0f, 4.89f, 10.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 6.0f)
                curveTo(14.0f, 4.89f, 13.1f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _speakerOff!!
    }

private var _speakerOff: ImageVector? = null
