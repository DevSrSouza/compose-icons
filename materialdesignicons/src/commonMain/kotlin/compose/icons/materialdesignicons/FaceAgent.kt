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

public val MaterialDesignIcons.FaceAgent: ImageVector
    get() {
        if (_faceAgent != null) {
            return _faceAgent!!
        }
        _faceAgent = Builder(name = "FaceAgent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.72f, 14.76f)
                curveTo(19.07f, 13.91f, 19.26f, 13.0f, 19.26f, 12.0f)
                curveTo(19.26f, 11.28f, 19.15f, 10.59f, 18.96f, 9.95f)
                curveTo(18.31f, 10.1f, 17.63f, 10.18f, 16.92f, 10.18f)
                curveTo(13.86f, 10.18f, 11.15f, 8.67f, 9.5f, 6.34f)
                curveTo(8.61f, 8.5f, 6.91f, 10.26f, 4.77f, 11.22f)
                curveTo(4.73f, 11.47f, 4.73f, 11.74f, 4.73f, 12.0f)
                arcTo(7.27f, 7.27f, 0.0f, false, false, 12.0f, 19.27f)
                curveTo(13.05f, 19.27f, 14.06f, 19.04f, 14.97f, 18.63f)
                curveTo(15.54f, 19.72f, 15.8f, 20.26f, 15.78f, 20.26f)
                curveTo(14.14f, 20.81f, 12.87f, 21.08f, 12.0f, 21.08f)
                curveTo(9.58f, 21.08f, 7.27f, 20.13f, 5.57f, 18.42f)
                curveTo(4.53f, 17.38f, 3.76f, 16.11f, 3.33f, 14.73f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.18f)
                horizontalLineTo(3.09f)
                curveTo(3.93f, 6.04f, 7.6f, 2.92f, 12.0f, 2.92f)
                curveTo(14.4f, 2.92f, 16.71f, 3.87f, 18.42f, 5.58f)
                curveTo(19.69f, 6.84f, 20.54f, 8.45f, 20.89f, 10.18f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.67f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.69f)
                lineTo(22.0f, 14.73f)
                horizontalLineTo(21.94f)
                lineTo(18.38f, 18.0f)
                lineTo(13.08f, 17.4f)
                verticalLineTo(15.73f)
                horizontalLineTo(17.91f)
                lineTo(18.72f, 14.76f)
                moveTo(9.27f, 11.77f)
                curveTo(9.57f, 11.77f, 9.86f, 11.89f, 10.07f, 12.11f)
                curveTo(10.28f, 12.32f, 10.4f, 12.61f, 10.4f, 12.91f)
                curveTo(10.4f, 13.21f, 10.28f, 13.5f, 10.07f, 13.71f)
                curveTo(9.86f, 13.92f, 9.57f, 14.04f, 9.27f, 14.04f)
                curveTo(8.64f, 14.04f, 8.13f, 13.54f, 8.13f, 12.91f)
                curveTo(8.13f, 12.28f, 8.64f, 11.77f, 9.27f, 11.77f)
                moveTo(14.72f, 11.77f)
                curveTo(15.35f, 11.77f, 15.85f, 12.28f, 15.85f, 12.91f)
                curveTo(15.85f, 13.54f, 15.35f, 14.04f, 14.72f, 14.04f)
                curveTo(14.09f, 14.04f, 13.58f, 13.54f, 13.58f, 12.91f)
                arcTo(1.14f, 1.14f, 0.0f, false, true, 14.72f, 11.77f)
                close()
            }
        }
        .build()
        return _faceAgent!!
    }

private var _faceAgent: ImageVector? = null
