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

public val MaterialDesignIcons.TransitConnection: ImageVector
    get() {
        if (_transitConnection != null) {
            return _transitConnection!!
        }
        _transitConnection = Builder(name = "TransitConnection", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 10.7f, 14.16f, 9.6f, 13.0f, 9.18f)
                verticalLineTo(6.82f)
                curveTo(14.16f, 6.4f, 15.0f, 5.3f, 15.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 4.0f)
                curveTo(9.0f, 5.3f, 9.84f, 6.4f, 11.0f, 6.82f)
                verticalLineTo(9.19f)
                curveTo(9.84f, 9.6f, 9.0f, 10.7f, 9.0f, 12.0f)
                curveTo(9.0f, 13.3f, 9.84f, 14.4f, 11.0f, 14.82f)
                verticalLineTo(17.18f)
                curveTo(9.84f, 17.6f, 9.0f, 18.7f, 9.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 23.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 20.0f)
                curveTo(15.0f, 18.7f, 14.16f, 17.6f, 13.0f, 17.18f)
                verticalLineTo(14.82f)
                curveTo(14.16f, 14.4f, 15.0f, 13.3f, 15.0f, 12.0f)
                moveTo(12.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 3.0f)
                moveTo(12.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _transitConnection!!
    }

private var _transitConnection: ImageVector? = null
