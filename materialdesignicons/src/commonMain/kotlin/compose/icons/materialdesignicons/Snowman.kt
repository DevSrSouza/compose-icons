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

public val MaterialDesignIcons.Snowman: ImageVector
    get() {
        if (_snowman != null) {
            return _snowman!!
        }
        _snowman = Builder(name = "Snowman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 17.0f)
                curveTo(7.0f, 15.5f, 7.65f, 14.17f, 8.69f, 13.25f)
                curveTo(8.26f, 12.61f, 8.0f, 11.83f, 8.0f, 11.0f)
                curveTo(8.0f, 10.86f, 8.0f, 10.73f, 8.0f, 10.59f)
                lineTo(5.04f, 8.87f)
                lineTo(4.83f, 8.71f)
                lineTo(2.29f, 9.39f)
                lineTo(2.03f, 8.43f)
                lineTo(4.24f, 7.84f)
                lineTo(2.26f, 6.69f)
                lineTo(2.76f, 5.82f)
                lineTo(4.74f, 6.97f)
                lineTo(4.15f, 4.75f)
                lineTo(5.11f, 4.5f)
                lineTo(5.8f, 7.04f)
                lineTo(6.04f, 7.14f)
                lineTo(8.73f, 8.69f)
                curveTo(9.11f, 8.15f, 9.62f, 7.71f, 10.22f, 7.42f)
                curveTo(9.5f, 6.87f, 9.0f, 6.0f, 9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 5.0f)
                curveTo(15.0f, 6.0f, 14.5f, 6.87f, 13.78f, 7.42f)
                curveTo(14.38f, 7.71f, 14.89f, 8.15f, 15.27f, 8.69f)
                lineTo(17.96f, 7.14f)
                lineTo(18.2f, 7.04f)
                lineTo(18.89f, 4.5f)
                lineTo(19.85f, 4.75f)
                lineTo(19.26f, 6.97f)
                lineTo(21.24f, 5.82f)
                lineTo(21.74f, 6.69f)
                lineTo(19.76f, 7.84f)
                lineTo(21.97f, 8.43f)
                lineTo(21.71f, 9.39f)
                lineTo(19.17f, 8.71f)
                lineTo(18.96f, 8.87f)
                lineTo(16.0f, 10.59f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 11.83f, 15.74f, 12.61f, 15.31f, 13.25f)
                curveTo(16.35f, 14.17f, 17.0f, 15.5f, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _snowman!!
    }

private var _snowman: ImageVector? = null
