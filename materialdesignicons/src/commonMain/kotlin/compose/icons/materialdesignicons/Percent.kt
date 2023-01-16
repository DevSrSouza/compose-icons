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

public val MaterialDesignIcons.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.5f)
                lineTo(3.5f, 18.5f)
                lineTo(5.5f, 20.5f)
                lineTo(20.5f, 5.5f)
                moveTo(7.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 4.0f)
                moveTo(17.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 14.0f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
