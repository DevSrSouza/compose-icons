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

public val MaterialDesignIcons.Assistant: ImageVector
    get() {
        if (_assistant != null) {
            return _assistant!!
        }
        _assistant = Builder(name = "Assistant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 4.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 23.0f)
                lineTo(15.0f, 20.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 18.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 2.0f)
                moveTo(13.88f, 12.88f)
                lineTo(12.0f, 17.0f)
                lineTo(10.12f, 12.88f)
                lineTo(6.0f, 11.0f)
                lineTo(10.12f, 9.12f)
                lineTo(12.0f, 5.0f)
                lineTo(13.88f, 9.12f)
                lineTo(18.0f, 11.0f)
            }
        }
        .build()
        return _assistant!!
    }

private var _assistant: ImageVector? = null
