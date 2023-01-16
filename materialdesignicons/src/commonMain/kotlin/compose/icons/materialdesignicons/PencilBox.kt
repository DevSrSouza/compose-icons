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

public val MaterialDesignIcons.PencilBox: ImageVector
    get() {
        if (_pencilBox != null) {
            return _pencilBox!!
        }
        _pencilBox = Builder(name = "PencilBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.11f, 20.1f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(16.7f, 9.35f)
                curveTo(16.92f, 9.14f, 16.92f, 8.79f, 16.7f, 8.58f)
                lineTo(15.42f, 7.3f)
                curveTo(15.21f, 7.08f, 14.86f, 7.08f, 14.65f, 7.3f)
                lineTo(13.65f, 8.3f)
                lineTo(15.7f, 10.35f)
                lineTo(16.7f, 9.35f)
                moveTo(7.0f, 14.94f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.06f)
                lineTo(15.12f, 10.94f)
                lineTo(13.06f, 8.88f)
                lineTo(7.0f, 14.94f)
                close()
            }
        }
        .build()
        return _pencilBox!!
    }

private var _pencilBox: ImageVector? = null
