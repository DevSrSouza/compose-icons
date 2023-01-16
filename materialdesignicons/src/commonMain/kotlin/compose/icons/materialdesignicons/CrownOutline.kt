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

public val MaterialDesignIcons.CrownOutline: ImageVector
    get() {
        if (_crownOutline != null) {
            return _crownOutline!!
        }
        _crownOutline = Builder(name = "CrownOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                lineTo(15.0f, 13.2f)
                lineTo(18.0f, 10.5f)
                lineTo(17.3f, 14.0f)
                horizontalLineTo(6.7f)
                lineTo(6.0f, 10.5f)
                lineTo(9.0f, 13.2f)
                lineTo(12.0f, 8.0f)
                moveTo(12.0f, 4.0f)
                lineTo(8.5f, 10.0f)
                lineTo(3.0f, 5.0f)
                lineTo(5.0f, 16.0f)
                horizontalLineTo(19.0f)
                lineTo(21.0f, 5.0f)
                lineTo(15.5f, 10.0f)
                lineTo(12.0f, 4.0f)
                moveTo(19.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 19.6f, 5.4f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                curveTo(18.6f, 20.0f, 19.0f, 19.6f, 19.0f, 19.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _crownOutline!!
    }

private var _crownOutline: ImageVector? = null
