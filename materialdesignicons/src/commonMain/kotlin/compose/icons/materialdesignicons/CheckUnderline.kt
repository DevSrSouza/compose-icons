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

public val MaterialDesignIcons.CheckUnderline: ImageVector
    get() {
        if (_checkUnderline != null) {
            return _checkUnderline!!
        }
        _checkUnderline = Builder(name = "CheckUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                lineTo(9.0f, 17.0f)
                lineTo(3.5f, 11.5f)
                lineTo(4.91f, 10.09f)
                lineTo(9.0f, 14.17f)
                lineTo(19.59f, 3.59f)
                lineTo(21.0f, 5.0f)
                moveTo(3.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _checkUnderline!!
    }

private var _checkUnderline: ImageVector? = null
