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

public val MaterialDesignIcons.ThoughtBubble: ImageVector
    get() {
        if (_thoughtBubble != null) {
            return _thoughtBubble!!
        }
        _thoughtBubble = Builder(name = "ThoughtBubble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 19.0f)
                moveTo(8.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 16.0f)
                moveTo(14.5f, 15.0f)
                curveTo(13.31f, 15.0f, 12.23f, 14.5f, 11.5f, 13.65f)
                curveTo(10.77f, 14.5f, 9.69f, 15.0f, 8.5f, 15.0f)
                curveTo(6.54f, 15.0f, 4.91f, 13.59f, 4.57f, 11.74f)
                curveTo(3.07f, 11.16f, 2.0f, 9.7f, 2.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 4.0f)
                curveTo(6.26f, 4.0f, 6.5f, 4.03f, 6.77f, 4.07f)
                curveTo(7.5f, 3.41f, 8.45f, 3.0f, 9.5f, 3.0f)
                curveTo(10.69f, 3.0f, 11.77f, 3.5f, 12.5f, 4.35f)
                curveTo(13.23f, 3.5f, 14.31f, 3.0f, 15.5f, 3.0f)
                curveTo(17.46f, 3.0f, 19.09f, 4.41f, 19.43f, 6.26f)
                curveTo(20.93f, 6.84f, 22.0f, 8.3f, 22.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 14.0f)
                lineTo(17.23f, 13.93f)
                curveTo(16.5f, 14.59f, 15.55f, 15.0f, 14.5f, 15.0f)
                close()
            }
        }
        .build()
        return _thoughtBubble!!
    }

private var _thoughtBubble: ImageVector? = null
