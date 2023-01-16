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

public val MaterialDesignIcons.Unreal: ImageVector
    get() {
        if (_unreal != null) {
            return _unreal!!
        }
        _unreal = Builder(name = "Unreal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                moveTo(5.24f, 18.76f)
                curveTo(3.43f, 16.95f, 2.44f, 14.55f, 2.44f, 12.0f)
                curveTo(2.44f, 9.45f, 3.43f, 7.05f, 5.24f, 5.24f)
                curveTo(7.05f, 3.43f, 9.45f, 2.44f, 12.0f, 2.44f)
                curveTo(14.55f, 2.44f, 16.95f, 3.43f, 18.76f, 5.24f)
                curveTo(20.57f, 7.05f, 21.56f, 9.45f, 21.56f, 12.0f)
                curveTo(21.56f, 14.55f, 20.57f, 16.95f, 18.76f, 18.76f)
                curveTo(16.95f, 20.57f, 14.55f, 21.56f, 12.0f, 21.56f)
                curveTo(9.45f, 21.56f, 7.05f, 20.57f, 5.24f, 18.76f)
                moveTo(6.35f, 9.5f)
                curveTo(4.34f, 11.79f, 4.73f, 13.68f, 4.73f, 13.68f)
                curveTo(4.73f, 13.68f, 5.28f, 12.38f, 6.61f, 11.0f)
                curveTo(7.25f, 10.37f, 7.72f, 10.15f, 8.04f, 10.15f)
                curveTo(8.4f, 10.15f, 8.57f, 10.41f, 8.57f, 10.65f)
                verticalLineTo(15.29f)
                curveTo(8.57f, 15.75f, 8.27f, 15.85f, 8.0f, 15.84f)
                curveTo(7.77f, 15.84f, 7.55f, 15.76f, 7.55f, 15.76f)
                curveTo(8.92f, 17.73f, 12.19f, 18.0f, 12.19f, 18.0f)
                lineTo(13.63f, 16.5f)
                horizontalLineTo(13.67f)
                lineTo(15.0f, 17.63f)
                curveTo(17.39f, 16.21f, 18.55f, 13.58f, 18.55f, 13.58f)
                curveTo(17.5f, 14.7f, 16.79f, 14.97f, 16.39f, 14.96f)
                curveTo(16.03f, 14.96f, 15.88f, 14.75f, 15.88f, 14.75f)
                curveTo(15.87f, 14.65f, 15.82f, 8.9f, 15.89f, 8.9f)
                curveTo(16.31f, 8.13f, 17.63f, 6.56f, 17.63f, 6.56f)
                curveTo(15.16f, 7.05f, 13.81f, 8.66f, 13.81f, 8.66f)
                curveTo(13.41f, 8.35f, 12.59f, 8.4f, 12.59f, 8.4f)
                curveTo(12.97f, 8.61f, 13.35f, 9.21f, 13.35f, 9.72f)
                verticalLineTo(14.65f)
                curveTo(13.35f, 14.65f, 12.5f, 15.38f, 11.88f, 15.38f)
                curveTo(11.5f, 15.38f, 11.27f, 15.17f, 11.14f, 15.0f)
                curveTo(11.05f, 14.88f, 11.0f, 14.79f, 11.0f, 14.79f)
                verticalLineTo(8.69f)
                curveTo(10.93f, 8.75f, 10.82f, 8.8f, 10.71f, 8.8f)
                curveTo(10.57f, 8.79f, 10.43f, 8.73f, 10.34f, 8.53f)
                curveTo(10.26f, 8.38f, 10.22f, 8.15f, 10.22f, 7.83f)
                curveTo(10.22f, 6.7f, 11.5f, 5.96f, 11.5f, 5.96f)
                curveTo(9.87f, 6.39f, 8.36f, 7.22f, 6.35f, 9.5f)
            }
        }
        .build()
        return _unreal!!
    }

private var _unreal: ImageVector? = null
