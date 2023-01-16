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

public val MaterialDesignIcons.Lectern: ImageVector
    get() {
        if (_lectern != null) {
            return _lectern!!
        }
        _lectern = Builder(name = "Lectern", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                moveTo(17.5f, 6.0f)
                curveTo(17.5f, 4.39f, 16.41f, 3.05f, 14.93f, 2.64f)
                curveTo(14.78f, 2.27f, 14.43f, 2.0f, 14.0f, 2.0f)
                curveTo(13.45f, 2.0f, 13.0f, 2.45f, 13.0f, 3.0f)
                curveTo(13.0f, 3.55f, 13.45f, 4.0f, 14.0f, 4.0f)
                curveTo(14.31f, 4.0f, 14.58f, 3.85f, 14.76f, 3.63f)
                curveTo(15.77f, 3.95f, 16.5f, 4.89f, 16.5f, 6.0f)
                horizontalLineTo(4.0f)
                lineTo(5.0f, 10.0f)
                horizontalLineTo(19.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _lectern!!
    }

private var _lectern: ImageVector? = null
