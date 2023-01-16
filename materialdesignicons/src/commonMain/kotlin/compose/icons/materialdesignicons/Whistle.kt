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

public val MaterialDesignIcons.Whistle: ImageVector
    get() {
        if (_whistle != null) {
            return _whistle!!
        }
        _whistle = Builder(name = "Whistle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 9.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 2.0f, 15.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 8.5f, 22.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 15.0f, 15.5f)
                verticalLineTo(13.91f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.5f)
                moveTo(11.0f, 2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                moveTo(6.35f, 7.28f)
                curveTo(5.68f, 7.44f, 5.04f, 7.68f, 4.43f, 8.0f)
                lineTo(2.14f, 4.88f)
                lineTo(3.76f, 3.7f)
                lineTo(6.35f, 7.28f)
                moveTo(17.86f, 4.88f)
                lineTo(16.32f, 7.0f)
                horizontalLineTo(13.85f)
                lineTo(16.24f, 3.7f)
                lineTo(17.86f, 4.88f)
                close()
            }
        }
        .build()
        return _whistle!!
    }

private var _whistle: ImageVector? = null
