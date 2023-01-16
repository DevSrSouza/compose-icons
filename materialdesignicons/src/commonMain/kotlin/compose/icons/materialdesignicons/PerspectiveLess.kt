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

public val MaterialDesignIcons.PerspectiveLess: ImageVector
    get() {
        if (_perspectiveLess != null) {
            return _perspectiveLess!!
        }
        _perspectiveLess = Builder(name = "PerspectiveLess", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.56f, 12.0f)
                lineTo(19.23f, 20.0f)
                horizontalLineTo(4.78f)
                lineTo(7.44f, 12.0f)
                horizontalLineTo(16.56f)
                moveTo(7.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                lineTo(7.0f, 9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(1.0f)
                moveTo(17.0f, 1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                lineTo(21.0f, 5.0f)
                lineTo(17.0f, 1.0f)
                moveTo(18.0f, 10.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 22.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 10.0f)
                close()
            }
        }
        .build()
        return _perspectiveLess!!
    }

private var _perspectiveLess: ImageVector? = null
