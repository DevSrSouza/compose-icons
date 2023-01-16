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

public val MaterialDesignIcons.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.71f, 20.29f)
                lineTo(20.29f, 21.71f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.88f, 21.71f)
                lineTo(7.0f, 9.85f)
                arcTo(3.81f, 3.81f, 0.0f, false, true, 6.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 2.22f, 4.7f)
                lineTo(4.76f, 7.24f)
                lineTo(5.29f, 6.71f)
                lineTo(6.71f, 5.29f)
                lineTo(7.24f, 4.76f)
                lineTo(4.7f, 2.22f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 6.0f)
                arcTo(3.81f, 3.81f, 0.0f, false, true, 9.85f, 7.0f)
                lineTo(21.71f, 18.88f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.71f, 20.29f)
                moveTo(2.29f, 18.88f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.29f, 20.29f)
                lineTo(3.71f, 21.71f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.12f, 21.71f)
                lineTo(10.59f, 16.25f)
                lineTo(7.76f, 13.42f)
                moveTo(20.0f, 2.0f)
                lineTo(16.0f, 4.0f)
                verticalLineTo(6.0f)
                lineTo(13.83f, 8.17f)
                lineTo(15.83f, 10.17f)
                lineTo(18.0f, 8.0f)
                horizontalLineTo(20.0f)
                lineTo(22.0f, 4.0f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
