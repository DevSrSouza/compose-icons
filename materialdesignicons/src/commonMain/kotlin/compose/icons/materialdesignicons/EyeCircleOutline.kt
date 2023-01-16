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

public val MaterialDesignIcons.EyeCircleOutline: ImageVector
    get() {
        if (_eyeCircleOutline != null) {
            return _eyeCircleOutline!!
        }
        _eyeCircleOutline = Builder(name = "EyeCircleOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                moveTo(12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 11.0f)
                moveTo(12.0f, 8.0f)
                curveTo(14.63f, 8.0f, 17.0f, 9.57f, 18.0f, 12.0f)
                curveTo(16.62f, 15.31f, 12.81f, 16.88f, 9.5f, 15.5f)
                curveTo(7.92f, 14.84f, 6.66f, 13.58f, 6.0f, 12.0f)
                curveTo(7.0f, 9.57f, 9.37f, 8.0f, 12.0f, 8.0f)
                moveTo(12.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 9.5f)
            }
        }
        .build()
        return _eyeCircleOutline!!
    }

private var _eyeCircleOutline: ImageVector? = null
