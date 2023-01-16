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

public val MaterialDesignIcons.PencilRulerOutline: ImageVector
    get() {
        if (_pencilRulerOutline != null) {
            return _pencilRulerOutline!!
        }
        _pencilRulerOutline = Builder(name = "PencilRulerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.61f, 18.36f)
                lineTo(18.36f, 22.61f)
                lineTo(13.16f, 17.41f)
                lineTo(14.93f, 15.64f)
                lineTo(15.93f, 16.64f)
                lineTo(18.4f, 14.16f)
                lineTo(19.82f, 15.58f)
                lineTo(18.36f, 17.0f)
                lineTo(19.42f, 18.0f)
                lineTo(20.84f, 16.6f)
                lineTo(22.61f, 18.36f)
                moveTo(6.61f, 10.83f)
                lineTo(1.39f, 5.64f)
                lineTo(5.64f, 1.39f)
                lineTo(7.4f, 3.16f)
                lineTo(4.93f, 5.64f)
                lineTo(6.0f, 6.7f)
                lineTo(8.46f, 4.22f)
                lineTo(9.88f, 5.64f)
                lineTo(8.46f, 7.05f)
                lineTo(9.46f, 8.05f)
                lineTo(6.61f, 10.83f)
                moveTo(14.06f, 9.0f)
                lineTo(15.0f, 9.93f)
                lineTo(5.92f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.08f)
                lineTo(14.06f, 9.0f)
                moveTo(17.67f, 3.0f)
                curveTo(17.42f, 3.0f, 17.16f, 3.09f, 16.96f, 3.29f)
                lineTo(15.12f, 5.12f)
                lineTo(18.87f, 8.87f)
                lineTo(20.71f, 7.0f)
                curveTo(21.1f, 6.61f, 21.1f, 6.0f, 20.71f, 5.59f)
                lineTo(18.37f, 3.29f)
                curveTo(18.18f, 3.1f, 17.93f, 3.0f, 17.67f, 3.0f)
                moveTo(14.06f, 6.18f)
                lineTo(3.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.75f)
                lineTo(17.81f, 9.93f)
                lineTo(14.06f, 6.18f)
                close()
            }
        }
        .build()
        return _pencilRulerOutline!!
    }

private var _pencilRulerOutline: ImageVector? = null
