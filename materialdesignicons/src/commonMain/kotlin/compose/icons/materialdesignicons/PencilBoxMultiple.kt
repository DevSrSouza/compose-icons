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

public val MaterialDesignIcons.PencilBoxMultiple: ImageVector
    get() {
        if (_pencilBoxMultiple != null) {
            return _pencilBoxMultiple!!
        }
        _pencilBoxMultiple = Builder(name = "PencilBoxMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.22f, 2.0f)
                horizontalLineTo(7.78f)
                curveTo(6.8f, 2.0f, 6.0f, 2.8f, 6.0f, 3.78f)
                verticalLineTo(16.22f)
                curveTo(6.0f, 17.2f, 6.8f, 18.0f, 7.78f, 18.0f)
                horizontalLineTo(20.22f)
                curveTo(21.2f, 18.0f, 22.0f, 17.21f, 22.0f, 16.22f)
                verticalLineTo(3.78f)
                curveTo(22.0f, 2.8f, 21.2f, 2.0f, 20.22f, 2.0f)
                moveTo(11.06f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.94f)
                lineTo(15.06f, 6.88f)
                lineTo(17.12f, 8.94f)
                lineTo(11.06f, 15.0f)
                moveTo(18.7f, 7.35f)
                lineTo(17.7f, 8.35f)
                lineTo(15.65f, 6.3f)
                lineTo(16.65f, 5.3f)
                curveTo(16.86f, 5.08f, 17.21f, 5.08f, 17.42f, 5.3f)
                lineTo(18.7f, 6.58f)
                curveTo(18.92f, 6.79f, 18.92f, 7.14f, 18.7f, 7.35f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _pencilBoxMultiple!!
    }

private var _pencilBoxMultiple: ImageVector? = null
