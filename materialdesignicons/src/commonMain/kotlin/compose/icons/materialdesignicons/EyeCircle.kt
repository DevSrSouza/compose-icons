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

public val MaterialDesignIcons.EyeCircle: ImageVector
    get() {
        if (_eyeCircle != null) {
            return _eyeCircle!!
        }
        _eyeCircle = Builder(name = "EyeCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 9.5f)
                moveTo(12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                moveTo(12.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 9.5f)
                moveTo(12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 16.0f)
                curveTo(9.37f, 16.0f, 7.0f, 14.43f, 6.0f, 12.0f)
                curveTo(7.38f, 8.69f, 11.19f, 7.12f, 14.5f, 8.5f)
                curveTo(16.08f, 9.16f, 17.34f, 10.42f, 18.0f, 12.0f)
                curveTo(17.0f, 14.43f, 14.63f, 16.0f, 12.0f, 16.0f)
                moveTo(12.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 9.5f)
                moveTo(12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _eyeCircle!!
    }

private var _eyeCircle: ImageVector? = null
