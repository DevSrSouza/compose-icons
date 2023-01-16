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

public val MaterialDesignIcons.VolcanoOutline: ImageVector
    get() {
        if (_volcanoOutline != null) {
            return _volcanoOutline!!
        }
        _volcanoOutline = Builder(name = "VolcanoOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                horizontalLineTo(11.0f)
                lineTo(9.0f, 13.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 22.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 8.0f)
                moveTo(7.3f, 15.0f)
                horizontalLineTo(10.35f)
                lineTo(10.85f, 13.74f)
                lineTo(12.35f, 10.0f)
                horizontalLineTo(16.5f)
                lineTo(19.35f, 20.0f)
                horizontalLineTo(5.08f)
                lineTo(7.3f, 15.0f)
                moveTo(13.0f, 1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                moveTo(16.12f, 5.47f)
                lineTo(18.95f, 2.64f)
                lineTo(20.36f, 4.05f)
                lineTo(17.54f, 6.88f)
                lineTo(16.12f, 5.47f)
                moveTo(7.64f, 4.05f)
                lineTo(9.05f, 2.64f)
                lineTo(11.88f, 5.46f)
                lineTo(10.47f, 6.88f)
                lineTo(7.64f, 4.05f)
                close()
            }
        }
        .build()
        return _volcanoOutline!!
    }

private var _volcanoOutline: ImageVector? = null
