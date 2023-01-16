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

public val MaterialDesignIcons.SignCaution: ImageVector
    get() {
        if (_signCaution != null) {
            return _signCaution!!
        }
        _signCaution = Builder(name = "SignCaution", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                moveTo(18.97f, 11.0f)
                lineTo(20.0f, 9.97f)
                verticalLineTo(7.15f)
                lineTo(16.15f, 11.0f)
                horizontalLineTo(18.97f)
                moveTo(13.32f, 11.0f)
                lineTo(19.32f, 5.0f)
                horizontalLineTo(16.5f)
                lineTo(10.5f, 11.0f)
                horizontalLineTo(13.32f)
                moveTo(7.66f, 11.0f)
                lineTo(13.66f, 5.0f)
                horizontalLineTo(10.83f)
                lineTo(4.83f, 11.0f)
                horizontalLineTo(7.66f)
                moveTo(5.18f, 5.0f)
                lineTo(4.0f, 6.18f)
                verticalLineTo(9.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineTo(5.18f)
                close()
            }
        }
        .build()
        return _signCaution!!
    }

private var _signCaution: ImageVector? = null
