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

public val MaterialDesignIcons.ThoughtBubbleOutline: ImageVector
    get() {
        if (_thoughtBubbleOutline != null) {
            return _thoughtBubbleOutline!!
        }
        _thoughtBubbleOutline = Builder(name = "ThoughtBubbleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                lineTo(6.77f, 4.07f)
                curveTo(7.5f, 3.41f, 8.45f, 3.0f, 9.5f, 3.0f)
                curveTo(10.69f, 3.0f, 11.77f, 3.5f, 12.5f, 4.35f)
                curveTo(13.23f, 3.5f, 14.31f, 3.0f, 15.5f, 3.0f)
                curveTo(17.46f, 3.0f, 19.09f, 4.41f, 19.43f, 6.26f)
                curveTo(20.93f, 6.84f, 22.0f, 8.3f, 22.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 14.0f)
                lineTo(17.23f, 13.93f)
                curveTo(16.5f, 14.59f, 15.55f, 15.0f, 14.5f, 15.0f)
                moveTo(6.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 10.0f)
                curveTo(6.33f, 10.0f, 6.64f, 9.92f, 6.92f, 9.78f)
                curveTo(6.66f, 10.12f, 6.5f, 10.54f, 6.5f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.5f, 13.0f)
                curveTo(9.1f, 13.0f, 9.64f, 12.73f, 10.0f, 12.31f)
                verticalLineTo(12.31f)
                lineTo(11.47f, 10.63f)
                lineTo(13.0f, 12.34f)
                verticalLineTo(12.34f)
                curveTo(13.38f, 12.74f, 13.91f, 13.0f, 14.5f, 13.0f)
                curveTo(15.5f, 13.0f, 16.33f, 12.26f, 16.5f, 11.3f)
                curveTo(16.84f, 11.73f, 17.39f, 12.0f, 18.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 8.0f)
                curveTo(17.67f, 8.0f, 17.36f, 8.08f, 17.08f, 8.22f)
                curveTo(17.34f, 7.88f, 17.5f, 7.46f, 17.5f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.5f, 5.0f)
                curveTo(14.91f, 5.0f, 14.38f, 5.26f, 14.0f, 5.66f)
                lineTo(12.47f, 7.37f)
                lineTo(11.0f, 5.69f)
                verticalLineTo(5.69f)
                curveTo(10.64f, 5.27f, 10.1f, 5.0f, 9.5f, 5.0f)
                curveTo(8.5f, 5.0f, 7.67f, 5.74f, 7.5f, 6.7f)
                curveTo(7.16f, 6.27f, 6.61f, 6.0f, 6.0f, 6.0f)
                moveTo(8.5f, 17.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.5f, 18.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.5f, 19.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.5f, 18.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.5f, 17.5f)
                close()
            }
        }
        .build()
        return _thoughtBubbleOutline!!
    }

private var _thoughtBubbleOutline: ImageVector? = null
