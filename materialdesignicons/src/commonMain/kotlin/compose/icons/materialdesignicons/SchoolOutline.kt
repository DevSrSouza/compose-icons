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

public val MaterialDesignIcons.SchoolOutline: ImageVector
    get() {
        if (_schoolOutline != null) {
            return _schoolOutline!!
        }
        _schoolOutline = Builder(name = "SchoolOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(1.0f, 9.0f)
                lineTo(5.0f, 11.18f)
                verticalLineTo(17.18f)
                lineTo(12.0f, 21.0f)
                lineTo(19.0f, 17.18f)
                verticalLineTo(11.18f)
                lineTo(21.0f, 10.09f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 3.0f)
                moveTo(18.82f, 9.0f)
                lineTo(12.0f, 12.72f)
                lineTo(5.18f, 9.0f)
                lineTo(12.0f, 5.28f)
                lineTo(18.82f, 9.0f)
                moveTo(17.0f, 16.0f)
                lineTo(12.0f, 18.72f)
                lineTo(7.0f, 16.0f)
                verticalLineTo(12.27f)
                lineTo(12.0f, 15.0f)
                lineTo(17.0f, 12.27f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _schoolOutline!!
    }

private var _schoolOutline: ImageVector? = null
