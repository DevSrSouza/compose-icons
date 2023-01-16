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

public val MaterialDesignIcons.RulerSquareCompass: ImageVector
    get() {
        if (_rulerSquareCompass != null) {
            return _rulerSquareCompass!!
        }
        _rulerSquareCompass = Builder(name = "RulerSquareCompass", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.88f)
                verticalLineTo(22.0f)
                lineTo(18.2f, 20.83f)
                lineTo(13.41f, 11.83f)
                arcTo(4.94f, 4.94f, 0.0f, false, false, 15.19f, 10.83f)
                moveTo(15.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(3.27f, 3.27f, 0.0f, false, true, 11.56f, 10.0f)
                lineTo(5.8f, 20.83f)
                lineTo(4.0f, 22.0f)
                verticalLineTo(19.88f)
                lineTo(9.79f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 4.0f)
                verticalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 3.0f)
                verticalLineTo(4.18f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 7.0f)
                moveTo(13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 12.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 7.0f)
                moveTo(4.22f, 10.0f)
                lineTo(6.0f, 11.8f)
                lineTo(4.56f, 14.56f)
                lineTo(2.1f, 12.1f)
                moveTo(12.0f, 17.76f)
                lineTo(10.5f, 16.25f)
                lineTo(9.0f, 19.0f)
                lineTo(12.0f, 22.0f)
                lineTo(15.0f, 19.0f)
                lineTo(13.53f, 16.23f)
                moveTo(19.78f, 10.0f)
                lineTo(18.0f, 11.8f)
                lineTo(19.5f, 14.56f)
                lineTo(21.9f, 12.1f)
                close()
            }
        }
        .build()
        return _rulerSquareCompass!!
    }

private var _rulerSquareCompass: ImageVector? = null
