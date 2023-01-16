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

public val MaterialDesignIcons.MoonWaningCrescent: ImageVector
    get() {
        if (_moonWaningCrescent != null) {
            return _moonWaningCrescent!!
        }
        _moonWaningCrescent = Builder(name = "MoonWaningCrescent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 15.0f, 21.54f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 15.0f, 2.46f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _moonWaningCrescent!!
    }

private var _moonWaningCrescent: ImageVector? = null
