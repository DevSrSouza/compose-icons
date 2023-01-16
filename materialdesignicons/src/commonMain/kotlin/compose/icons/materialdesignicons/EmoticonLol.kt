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

public val MaterialDesignIcons.EmoticonLol: ImageVector
    get() {
        if (_emoticonLol != null) {
            return _emoticonLol!!
        }
        _emoticonLol = Builder(name = "EmoticonLol", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.07f, 8.93f)
                verticalLineTo(4.93f)
                arcTo(4.06f, 4.06f, 0.0f, false, true, 15.73f, 2.72f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.73f, 15.72f)
                arcTo(4.06f, 4.06f, 0.0f, false, true, 4.94f, 15.06f)
                horizontalLineTo(8.94f)
                verticalLineTo(19.06f)
                arcTo(4.06f, 4.06f, 0.0f, false, true, 8.28f, 21.27f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 21.28f, 8.27f)
                arcTo(4.06f, 4.06f, 0.0f, false, true, 19.07f, 8.93f)
                moveTo(11.0f, 6.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                moveTo(7.5f, 14.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                moveTo(15.89f, 15.9f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 9.8f, 17.0f)
                lineTo(17.0f, 9.8f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 15.89f, 15.89f)
                moveTo(4.89f, 21.08f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.89f, 19.08f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.89f, 17.08f)
                horizontalLineTo(6.89f)
                verticalLineTo(19.08f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.93f, 21.07f)
                moveTo(19.07f, 2.93f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.07f, 4.93f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.07f, 6.93f)
                horizontalLineTo(17.07f)
                verticalLineTo(4.93f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.07f, 2.93f)
                close()
            }
        }
        .build()
        return _emoticonLol!!
    }

private var _emoticonLol: ImageVector? = null
