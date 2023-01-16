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

public val MaterialDesignIcons.EyeMinusOutline: ImageVector
    get() {
        if (_eyeMinusOutline != null) {
            return _eyeMinusOutline!!
        }
        _eyeMinusOutline = Builder(name = "EyeMinusOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 1.0f, 12.0f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 12.0f, 19.5f)
                horizontalLineTo(13.1f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 13.0f, 18.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 13.1f, 17.4f)
                horizontalLineTo(12.0f)
                arcTo(9.6f, 9.6f, 0.0f, false, true, 3.2f, 12.0f)
                arcTo(9.6f, 9.6f, 0.0f, false, true, 12.0f, 6.5f)
                arcTo(9.6f, 9.6f, 0.0f, false, true, 20.8f, 12.0f)
                lineTo(20.4f, 12.7f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 22.3f, 13.5f)
                arcTo(10.1f, 10.1f, 0.0f, false, false, 23.0f, 12.0f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 12.0f, 4.5f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 15.0f, 12.0f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 12.0f, 9.0f)
                moveTo(15.0f, 17.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _eyeMinusOutline!!
    }

private var _eyeMinusOutline: ImageVector? = null
