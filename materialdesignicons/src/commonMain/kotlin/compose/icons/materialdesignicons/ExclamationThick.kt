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

public val MaterialDesignIcons.ExclamationThick: ImageVector
    get() {
        if (_exclamationThick != null) {
            return _exclamationThick!!
        }
        _exclamationThick = Builder(name = "ExclamationThick", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                moveTo(10.0f, 21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _exclamationThick!!
    }

private var _exclamationThick: ImageVector? = null
