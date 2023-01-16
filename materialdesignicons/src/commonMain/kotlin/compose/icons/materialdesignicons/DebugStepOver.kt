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

public val MaterialDesignIcons.DebugStepOver: ImageVector
    get() {
        if (_debugStepOver != null) {
            return _debugStepOver!!
        }
        _debugStepOver = Builder(name = "DebugStepOver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 14.0f)
                moveTo(23.46f, 8.86f)
                lineTo(21.87f, 15.75f)
                lineTo(15.0f, 14.16f)
                lineTo(18.8f, 11.78f)
                curveTo(17.39f, 9.5f, 14.87f, 8.0f, 12.0f, 8.0f)
                curveTo(8.05f, 8.0f, 4.77f, 10.86f, 4.12f, 14.63f)
                lineTo(2.15f, 14.28f)
                curveTo(2.96f, 9.58f, 7.06f, 6.0f, 12.0f, 6.0f)
                curveTo(15.58f, 6.0f, 18.73f, 7.89f, 20.5f, 10.72f)
                lineTo(23.46f, 8.86f)
                close()
            }
        }
        .build()
        return _debugStepOver!!
    }

private var _debugStepOver: ImageVector? = null
