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

public val MaterialDesignIcons.SmokeDetector: ImageVector
    get() {
        if (_smokeDetector != null) {
            return _smokeDetector!!
        }
        _smokeDetector = Builder(name = "SmokeDetector", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 12.0f)
                curveTo(18.0f, 8.68f, 15.31f, 6.0f, 12.0f, 6.0f)
                curveTo(8.68f, 6.0f, 6.0f, 8.68f, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 18.0f)
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                close()
            }
        }
        .build()
        return _smokeDetector!!
    }

private var _smokeDetector: ImageVector? = null
