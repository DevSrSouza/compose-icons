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

public val MaterialDesignIcons.AvTimer: ImageVector
    get() {
        if (_avTimer != null) {
            return _avTimer!!
        }
        _avTimer = Builder(name = "AvTimer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 17.0f)
                moveTo(11.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.08f)
                curveTo(16.39f, 5.57f, 19.0f, 8.47f, 19.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 12.0f)
                curveTo(5.0f, 10.32f, 5.59f, 8.78f, 6.58f, 7.58f)
                lineTo(12.0f, 13.0f)
                lineTo(13.41f, 11.59f)
                lineTo(6.61f, 4.79f)
                verticalLineTo(4.81f)
                curveTo(4.42f, 6.45f, 3.0f, 9.05f, 3.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(18.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 12.0f)
                moveTo(6.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 12.0f)
                close()
            }
        }
        .build()
        return _avTimer!!
    }

private var _avTimer: ImageVector? = null
