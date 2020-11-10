package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Stackpath: VectorAsset
    get() {
        if (_stackpath != null) {
            return _stackpath!!
        }
        _stackpath = VectorAssetBuilder(name = "Stackpath", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.72f, 7.34f)
                curveTo(2.71f, 7.34f, 1.88f, 7.57f, 1.22f, 8.04f)
                curveTo(0.559f, 8.5f, 0.23f, 9.12f, 0.23f, 9.88f)
                curveTo(0.23f, 10.66f, 0.506f, 11.26f, 1.06f, 11.67f)
                curveTo(1.61f, 12.09f, 2.46f, 12.47f, 3.6f, 12.83f)
                curveTo(4.15f, 13.03f, 4.53f, 13.21f, 4.74f, 13.39f)
                curveTo(4.96f, 13.56f, 5.06f, 13.81f, 5.06f, 14.13f)
                curveTo(5.06f, 14.41f, 4.96f, 14.64f, 4.74f, 14.81f)
                curveTo(4.53f, 15.0f, 4.2f, 15.08f, 3.77f, 15.08f)
                curveTo(3.2f, 15.08f, 2.77f, 14.96f, 2.5f, 14.74f)
                curveTo(2.2f, 14.5f, 2.06f, 14.14f, 2.06f, 13.62f)
                horizontalLineTo(0.013f)
                lineTo(0.0f, 13.66f)
                curveTo(-0.02f, 14.63f, 0.346f, 15.37f, 1.1f, 15.89f)
                curveTo(1.85f, 16.41f, 2.74f, 16.66f, 3.77f, 16.66f)
                curveTo(4.79f, 16.66f, 5.61f, 16.44f, 6.23f, 16.0f)
                curveTo(6.85f, 15.54f, 7.17f, 14.91f, 7.17f, 14.12f)
                curveTo(7.17f, 13.33f, 6.91f, 12.72f, 6.39f, 12.27f)
                curveTo(5.86f, 11.82f, 5.09f, 11.44f, 4.06f, 11.14f)
                curveTo(3.39f, 10.89f, 2.94f, 10.69f, 2.69f, 10.53f)
                curveTo(2.45f, 10.37f, 2.33f, 10.16f, 2.33f, 9.9f)
                curveTo(2.33f, 9.62f, 2.45f, 9.39f, 2.69f, 9.21f)
                curveTo(2.93f, 9.0f, 3.26f, 8.92f, 3.69f, 8.92f)
                curveTo(4.12f, 8.92f, 4.46f, 9.04f, 4.7f, 9.26f)
                curveTo(4.95f, 9.5f, 5.07f, 9.78f, 5.07f, 10.14f)
                horizontalLineTo(7.11f)
                lineTo(7.12f, 10.11f)
                curveTo(7.15f, 9.3f, 6.83f, 8.63f, 6.19f, 8.11f)
                curveTo(5.55f, 7.59f, 4.73f, 7.34f, 3.72f, 7.34f)
                moveTo(8.5f, 7.4f)
                verticalLineTo(16.58f)
                horizontalLineTo(10.65f)
                verticalLineTo(13.43f)
                horizontalLineTo(11.95f)
                curveTo(13.04f, 13.43f, 13.9f, 13.16f, 14.54f, 12.6f)
                curveTo(15.18f, 12.05f, 15.5f, 11.32f, 15.5f, 10.42f)
                curveTo(15.5f, 9.5f, 15.18f, 8.79f, 14.54f, 8.23f)
                curveTo(13.9f, 7.67f, 13.04f, 7.4f, 11.95f, 7.4f)
                horizontalLineTo(8.5f)
                moveTo(18.11f, 7.4f)
                lineTo(14.93f, 16.59f)
                horizontalLineTo(16.92f)
                lineTo(20.18f, 7.4f)
                horizontalLineTo(18.11f)
                moveTo(21.93f, 7.4f)
                lineTo(18.75f, 16.59f)
                horizontalLineTo(20.74f)
                lineTo(24.0f, 7.4f)
                horizontalLineTo(21.93f)
                moveTo(10.65f, 9.04f)
                horizontalLineTo(11.95f)
                curveTo(12.41f, 9.04f, 12.77f, 9.17f, 13.0f, 9.43f)
                curveTo(13.25f, 9.69f, 13.37f, 10.0f, 13.37f, 10.43f)
                curveTo(13.37f, 10.83f, 13.25f, 11.16f, 13.0f, 11.41f)
                curveTo(12.77f, 11.67f, 12.41f, 11.79f, 11.95f, 11.79f)
                horizontalLineTo(10.65f)
                verticalLineTo(9.04f)
                close()
            }
        }
        .build()
        return _stackpath!!
    }

private var _stackpath: VectorAsset? = null
