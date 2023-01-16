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

public val MaterialDesignIcons.ProgressPencil: ImageVector
    get() {
        if (_progressPencil != null) {
            return _progressPencil!!
        }
        _progressPencil = Builder(name = "ProgressPencil", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.84f, 10.2f)
                lineTo(14.83f, 11.21f)
                lineTo(12.76f, 9.18f)
                lineTo(13.77f, 8.16f)
                curveTo(13.97f, 7.95f, 14.31f, 7.94f, 14.55f, 8.16f)
                lineTo(15.84f, 9.41f)
                curveTo(16.05f, 9.62f, 16.06f, 9.96f, 15.84f, 10.2f)
                moveTo(8.0f, 13.91f)
                lineTo(12.17f, 9.72f)
                lineTo(14.24f, 11.8f)
                lineTo(10.08f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.91f)
                moveTo(13.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(17.39f, 4.54f, 20.5f, 8.53f, 19.96f, 12.92f)
                curveTo(19.5f, 16.56f, 16.64f, 19.43f, 13.0f, 19.88f)
                verticalLineTo(21.88f)
                curveTo(18.5f, 21.28f, 22.45f, 16.34f, 21.85f, 10.85f)
                curveTo(21.33f, 6.19f, 17.66f, 2.5f, 13.0f, 2.0f)
                moveTo(11.0f, 2.0f)
                curveTo(9.04f, 2.18f, 7.19f, 2.95f, 5.67f, 4.2f)
                lineTo(7.1f, 5.74f)
                curveTo(8.22f, 4.84f, 9.57f, 4.26f, 11.0f, 4.06f)
                verticalLineTo(2.06f)
                moveTo(4.26f, 5.67f)
                curveTo(3.0f, 7.19f, 2.24f, 9.04f, 2.05f, 11.0f)
                horizontalLineTo(4.05f)
                curveTo(4.24f, 9.58f, 4.8f, 8.23f, 5.69f, 7.1f)
                lineTo(4.26f, 5.67f)
                moveTo(2.06f, 13.0f)
                curveTo(2.26f, 14.96f, 3.03f, 16.81f, 4.27f, 18.33f)
                lineTo(5.69f, 16.9f)
                curveTo(4.81f, 15.77f, 4.24f, 14.42f, 4.06f, 13.0f)
                horizontalLineTo(2.06f)
                moveTo(7.06f, 18.37f)
                lineTo(5.67f, 19.74f)
                curveTo(7.18f, 21.0f, 9.04f, 21.79f, 11.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(9.58f, 19.82f, 8.23f, 19.25f, 7.1f, 18.37f)
                horizontalLineTo(7.06f)
                close()
            }
        }
        .build()
        return _progressPencil!!
    }

private var _progressPencil: ImageVector? = null
