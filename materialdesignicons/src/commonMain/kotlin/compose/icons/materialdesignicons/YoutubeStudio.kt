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

public val MaterialDesignIcons.YoutubeStudio: ImageVector
    get() {
        if (_youtubeStudio != null) {
            return _youtubeStudio!!
        }
        _youtubeStudio = Builder(name = "YoutubeStudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                lineTo(15.0f, 12.0f)
                lineTo(10.0f, 9.0f)
                verticalLineTo(15.0f)
                moveTo(19.45f, 13.0f)
                lineTo(21.56f, 14.63f)
                curveTo(21.78f, 14.78f, 21.81f, 15.0f, 21.66f, 15.28f)
                lineTo(19.64f, 18.75f)
                curveTo(19.5f, 18.97f, 19.31f, 19.03f, 19.03f, 18.94f)
                lineTo(16.55f, 17.95f)
                curveTo(15.89f, 18.42f, 15.33f, 18.75f, 14.86f, 18.94f)
                lineTo(14.5f, 21.56f)
                curveTo(14.42f, 21.84f, 14.27f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(9.73f, 22.0f, 9.58f, 21.84f, 9.5f, 21.56f)
                lineTo(9.14f, 18.94f)
                curveTo(8.55f, 18.69f, 8.0f, 18.36f, 7.45f, 17.95f)
                lineTo(4.97f, 18.94f)
                curveTo(4.69f, 19.03f, 4.5f, 18.97f, 4.36f, 18.75f)
                lineTo(2.34f, 15.28f)
                curveTo(2.19f, 15.0f, 2.22f, 14.78f, 2.44f, 14.63f)
                lineTo(4.55f, 13.0f)
                curveTo(4.5f, 12.77f, 4.5f, 12.44f, 4.5f, 12.0f)
                curveTo(4.5f, 11.56f, 4.5f, 11.23f, 4.55f, 11.0f)
                lineTo(2.44f, 9.38f)
                curveTo(2.22f, 9.22f, 2.19f, 9.0f, 2.34f, 8.72f)
                lineTo(4.36f, 5.25f)
                curveTo(4.5f, 5.03f, 4.69f, 4.97f, 4.97f, 5.06f)
                lineTo(7.45f, 6.05f)
                curveTo(8.11f, 5.58f, 8.67f, 5.25f, 9.14f, 5.06f)
                lineTo(9.5f, 2.44f)
                curveTo(9.58f, 2.16f, 9.73f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.27f, 2.0f, 14.42f, 2.16f, 14.5f, 2.44f)
                lineTo(14.86f, 5.06f)
                curveTo(15.45f, 5.31f, 16.0f, 5.64f, 16.55f, 6.05f)
                lineTo(19.03f, 5.06f)
                curveTo(19.31f, 4.97f, 19.5f, 5.03f, 19.64f, 5.25f)
                lineTo(21.66f, 8.72f)
                curveTo(21.81f, 9.0f, 21.78f, 9.22f, 21.56f, 9.38f)
                lineTo(19.45f, 11.0f)
                curveTo(19.5f, 11.23f, 19.5f, 11.56f, 19.5f, 12.0f)
                curveTo(19.5f, 12.44f, 19.5f, 12.77f, 19.45f, 13.0f)
                close()
            }
        }
        .build()
        return _youtubeStudio!!
    }

private var _youtubeStudio: ImageVector? = null
