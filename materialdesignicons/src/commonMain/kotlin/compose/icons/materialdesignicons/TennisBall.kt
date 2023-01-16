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

public val MaterialDesignIcons.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) {
            return _tennisBall!!
        }
        _tennisBall = Builder(name = "TennisBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(14.5f, 2.0f, 16.75f, 2.9f, 18.5f, 4.4f)
                curveTo(16.36f, 6.23f, 15.0f, 8.96f, 15.0f, 12.0f)
                curveTo(15.0f, 15.04f, 16.36f, 17.77f, 18.5f, 19.6f)
                curveTo(16.75f, 21.1f, 14.5f, 22.0f, 12.0f, 22.0f)
                curveTo(9.5f, 22.0f, 7.25f, 21.1f, 5.5f, 19.6f)
                curveTo(7.64f, 17.77f, 9.0f, 15.04f, 9.0f, 12.0f)
                curveTo(9.0f, 8.96f, 7.64f, 6.23f, 5.5f, 4.4f)
                curveTo(7.25f, 2.9f, 9.5f, 2.0f, 12.0f, 2.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 14.32f, 21.21f, 16.45f, 19.88f, 18.15f)
                curveTo(18.12f, 16.68f, 17.0f, 14.47f, 17.0f, 12.0f)
                curveTo(17.0f, 9.53f, 18.12f, 7.32f, 19.88f, 5.85f)
                curveTo(21.21f, 7.55f, 22.0f, 9.68f, 22.0f, 12.0f)
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 9.68f, 2.79f, 7.55f, 4.12f, 5.85f)
                curveTo(5.88f, 7.32f, 7.0f, 9.53f, 7.0f, 12.0f)
                curveTo(7.0f, 14.47f, 5.88f, 16.68f, 4.12f, 18.15f)
                curveTo(2.79f, 16.45f, 2.0f, 14.32f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
