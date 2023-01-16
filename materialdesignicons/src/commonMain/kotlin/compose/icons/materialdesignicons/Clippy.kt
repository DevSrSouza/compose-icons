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

public val MaterialDesignIcons.Clippy: ImageVector
    get() {
        if (_clippy != null) {
            return _clippy!!
        }
        _clippy = Builder(name = "Clippy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.5f, 18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.0f, 15.5f)
                verticalLineTo(13.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 10.75f, 13.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.5f, 13.75f)
                verticalLineTo(15.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.5f, 16.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.5f, 15.5f)
                verticalLineTo(11.89f)
                curveTo(12.63f, 11.61f, 12.0f, 10.87f, 12.0f, 10.0f)
                curveTo(12.0f, 8.9f, 13.0f, 8.0f, 14.25f, 8.0f)
                curveTo(15.5f, 8.0f, 16.5f, 8.9f, 16.5f, 10.0f)
                curveTo(16.5f, 10.87f, 15.87f, 11.61f, 15.0f, 11.89f)
                verticalLineTo(15.5f)
                moveTo(8.25f, 8.0f)
                curveTo(9.5f, 8.0f, 10.5f, 8.9f, 10.5f, 10.0f)
                curveTo(10.5f, 10.87f, 9.87f, 11.61f, 9.0f, 11.89f)
                verticalLineTo(17.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 12.25f, 20.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 15.5f, 17.25f)
                verticalLineTo(13.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 16.25f, 13.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 17.0f, 13.75f)
                verticalLineTo(17.25f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 12.25f, 22.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 7.5f, 17.25f)
                verticalLineTo(11.89f)
                curveTo(6.63f, 11.61f, 6.0f, 10.87f, 6.0f, 10.0f)
                curveTo(6.0f, 8.9f, 7.0f, 8.0f, 8.25f, 8.0f)
                moveTo(10.06f, 6.13f)
                lineTo(9.63f, 7.59f)
                curveTo(9.22f, 7.37f, 8.75f, 7.25f, 8.25f, 7.25f)
                curveTo(7.34f, 7.25f, 6.53f, 7.65f, 6.03f, 8.27f)
                lineTo(4.83f, 7.37f)
                curveTo(5.46f, 6.57f, 6.41f, 6.0f, 7.5f, 5.81f)
                verticalLineTo(5.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 11.25f, 2.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 15.0f, 5.75f)
                verticalLineTo(5.81f)
                curveTo(16.09f, 6.0f, 17.04f, 6.57f, 17.67f, 7.37f)
                lineTo(16.47f, 8.27f)
                curveTo(15.97f, 7.65f, 15.16f, 7.25f, 14.25f, 7.25f)
                curveTo(13.75f, 7.25f, 13.28f, 7.37f, 12.87f, 7.59f)
                lineTo(12.44f, 6.13f)
                curveTo(12.77f, 6.0f, 13.13f, 5.87f, 13.5f, 5.81f)
                verticalLineTo(5.75f)
                curveTo(13.5f, 4.5f, 12.5f, 3.5f, 11.25f, 3.5f)
                curveTo(10.0f, 3.5f, 9.0f, 4.5f, 9.0f, 5.75f)
                verticalLineTo(5.81f)
                curveTo(9.37f, 5.87f, 9.73f, 6.0f, 10.06f, 6.13f)
                moveTo(14.25f, 9.25f)
                curveTo(13.7f, 9.25f, 13.25f, 9.59f, 13.25f, 10.0f)
                curveTo(13.25f, 10.41f, 13.7f, 10.75f, 14.25f, 10.75f)
                curveTo(14.8f, 10.75f, 15.25f, 10.41f, 15.25f, 10.0f)
                curveTo(15.25f, 9.59f, 14.8f, 9.25f, 14.25f, 9.25f)
                moveTo(8.25f, 9.25f)
                curveTo(7.7f, 9.25f, 7.25f, 9.59f, 7.25f, 10.0f)
                curveTo(7.25f, 10.41f, 7.7f, 10.75f, 8.25f, 10.75f)
                curveTo(8.8f, 10.75f, 9.25f, 10.41f, 9.25f, 10.0f)
                curveTo(9.25f, 9.59f, 8.8f, 9.25f, 8.25f, 9.25f)
                close()
            }
        }
        .build()
        return _clippy!!
    }

private var _clippy: ImageVector? = null
