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

public val MaterialDesignIcons.ToothbrushPaste: ImageVector
    get() {
        if (_toothbrushPaste != null) {
            return _toothbrushPaste!!
        }
        _toothbrushPaste = Builder(name = "ToothbrushPaste", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.86f, 1.5f)
                lineTo(12.91f, 6.43f)
                lineTo(15.03f, 8.55f)
                lineTo(16.09f, 7.5f)
                lineTo(15.03f, 6.43f)
                lineTo(17.86f, 3.6f)
                lineTo(18.92f, 4.66f)
                lineTo(20.0f, 3.6f)
                moveTo(21.4f, 3.6f)
                lineTo(15.56f, 9.44f)
                lineTo(13.43f, 10.15f)
                lineTo(3.0f, 20.57f)
                lineTo(4.43f, 22.0f)
                lineTo(10.08f, 16.33f)
                lineTo(14.33f, 20.57f)
                lineTo(18.57f, 16.33f)
                lineTo(14.33f, 12.09f)
                lineTo(14.5f, 11.9f)
                lineTo(16.63f, 11.19f)
                lineTo(21.4f, 6.43f)
                curveTo(22.18f, 5.65f, 22.18f, 4.38f, 21.4f, 3.6f)
                moveTo(6.55f, 4.31f)
                lineTo(2.31f, 8.55f)
                lineTo(7.26f, 13.5f)
                lineTo(11.5f, 9.26f)
                moveTo(18.22f, 18.1f)
                lineTo(16.09f, 20.22f)
                lineTo(17.5f, 21.63f)
                lineTo(19.63f, 19.5f)
                close()
            }
        }
        .build()
        return _toothbrushPaste!!
    }

private var _toothbrushPaste: ImageVector? = null
