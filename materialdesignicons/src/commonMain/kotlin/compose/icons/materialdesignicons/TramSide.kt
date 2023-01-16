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

public val MaterialDesignIcons.TramSide: ImageVector
    get() {
        if (_tramSide != null) {
            return _tramSide!!
        }
        _tramSide = Builder(name = "TramSide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 1.0f)
                lineTo(5.0f, 4.0f)
                lineTo(7.5f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 6.0f, 2.0f, 6.0f, 2.0f, 9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 19.0f, 7.0f, 17.0f, 9.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                lineTo(13.0f, 4.0f)
                lineTo(9.0f, 1.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                moveTo(11.0f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                moveTo(4.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                moveTo(9.0f, 19.0f)
                verticalLineTo(19.5f)
                curveTo(9.0f, 20.88f, 10.12f, 22.0f, 11.5f, 22.0f)
                curveTo(12.5f, 22.0f, 13.39f, 21.41f, 13.79f, 20.5f)
                horizontalLineTo(15.21f)
                curveTo(15.61f, 21.41f, 16.5f, 22.0f, 17.5f, 22.0f)
                curveTo(18.88f, 22.0f, 20.0f, 20.88f, 20.0f, 19.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _tramSide!!
    }

private var _tramSide: ImageVector? = null
