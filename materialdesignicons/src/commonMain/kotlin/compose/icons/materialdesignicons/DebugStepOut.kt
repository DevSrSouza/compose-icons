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

public val MaterialDesignIcons.DebugStepOut: ImageVector
    get() {
        if (_debugStepOut != null) {
            return _debugStepOut!!
        }
        _debugStepOut = Builder(name = "DebugStepOut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 22.0f)
                moveTo(13.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                lineTo(6.5f, 10.5f)
                lineTo(5.08f, 9.08f)
                lineTo(12.0f, 2.16f)
                lineTo(18.92f, 9.08f)
                lineTo(17.5f, 10.5f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _debugStepOut!!
    }

private var _debugStepOut: ImageVector? = null
