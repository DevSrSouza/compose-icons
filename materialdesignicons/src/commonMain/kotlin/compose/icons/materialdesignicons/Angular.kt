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

public val MaterialDesignIcons.Angular: ImageVector
    get() {
        if (_angular != null) {
            return _angular!!
        }
        _angular = Builder(name = "Angular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                lineTo(20.84f, 5.65f)
                lineTo(19.5f, 17.35f)
                lineTo(12.0f, 21.5f)
                lineTo(4.5f, 17.35f)
                lineTo(3.16f, 5.65f)
                lineTo(12.0f, 2.5f)
                moveTo(12.0f, 4.6f)
                lineTo(6.47f, 17.0f)
                horizontalLineTo(8.53f)
                lineTo(9.64f, 14.22f)
                horizontalLineTo(14.34f)
                lineTo(15.45f, 17.0f)
                horizontalLineTo(17.5f)
                lineTo(12.0f, 4.6f)
                moveTo(13.62f, 12.5f)
                horizontalLineTo(10.39f)
                lineTo(12.0f, 8.63f)
                lineTo(13.62f, 12.5f)
                close()
            }
        }
        .build()
        return _angular!!
    }

private var _angular: ImageVector? = null
