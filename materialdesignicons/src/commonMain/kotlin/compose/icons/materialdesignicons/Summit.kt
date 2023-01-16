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

public val MaterialDesignIcons.Summit: ImageVector
    get() {
        if (_summit != null) {
            return _summit!!
        }
        _summit = Builder(name = "Summit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(17.0f)
                lineTo(22.0f, 5.0f)
                lineTo(17.0f, 7.0f)
                verticalLineTo(10.17f)
                lineTo(22.0f, 21.0f)
                horizontalLineTo(2.0f)
                lineTo(8.0f, 13.0f)
                lineTo(11.5f, 17.7f)
                lineTo(15.0f, 10.17f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _summit!!
    }

private var _summit: ImageVector? = null
