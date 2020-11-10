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

public val SimpleIcons.Uber: VectorAsset
    get() {
        if (_uber != null) {
            return _uber!!
        }
        _uber = VectorAssetBuilder(name = "Uber", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.97f)
                verticalLineTo(12.93f)
                curveTo(0.0f, 14.8f, 1.3f, 16.03f, 3.0f, 16.03f)
                curveTo(3.83f, 16.03f, 4.56f, 15.71f, 5.09f, 15.16f)
                verticalLineTo(15.9f)
                horizontalLineTo(6.27f)
                verticalLineTo(7.97f)
                horizontalLineTo(5.08f)
                verticalLineTo(12.86f)
                curveTo(5.08f, 14.12f, 4.23f, 14.97f, 3.14f, 14.97f)
                curveTo(2.03f, 14.97f, 1.19f, 14.14f, 1.19f, 12.86f)
                verticalLineTo(7.97f)
                horizontalLineTo(0.0f)
                moveTo(7.44f, 7.97f)
                verticalLineTo(15.9f)
                horizontalLineTo(8.57f)
                verticalLineTo(15.17f)
                arcTo(2.88f, 2.88f, 0.0f, false, false, 10.63f, 16.03f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.66f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.63f, 10.0f)
                arcTo(2.86f, 2.86f, 0.0f, false, false, 8.58f, 10.86f)
                verticalLineTo(7.97f)
                horizontalLineTo(7.44f)
                moveTo(17.31f, 10.0f)
                curveTo(15.62f, 10.0f, 14.34f, 11.38f, 14.34f, 13.0f)
                curveTo(14.34f, 14.73f, 15.68f, 16.0f, 17.41f, 16.0f)
                curveTo(18.47f, 16.0f, 19.33f, 15.56f, 19.9f, 14.79f)
                lineTo(19.08f, 14.17f)
                curveTo(18.65f, 14.75f, 18.08f, 15.0f, 17.41f, 15.0f)
                curveTo(16.44f, 15.0f, 15.66f, 14.32f, 15.5f, 13.38f)
                horizontalLineTo(20.2f)
                verticalLineTo(13.0f)
                curveTo(20.2f, 11.29f, 18.97f, 10.0f, 17.31f, 10.0f)
                moveTo(23.6f, 10.08f)
                curveTo(22.97f, 10.08f, 22.5f, 10.37f, 22.22f, 10.83f)
                verticalLineTo(10.12f)
                horizontalLineTo(21.09f)
                verticalLineTo(15.9f)
                horizontalLineTo(22.23f)
                verticalLineTo(12.61f)
                curveTo(22.23f, 11.72f, 22.78f, 11.14f, 23.53f, 11.14f)
                horizontalLineTo(24.0f)
                verticalLineTo(10.07f)
                horizontalLineTo(23.6f)
                moveTo(17.29f, 11.0f)
                curveTo(18.14f, 11.0f, 18.85f, 11.59f, 19.04f, 12.47f)
                horizontalLineTo(15.5f)
                curveTo(15.73f, 11.59f, 16.44f, 11.0f, 17.29f, 11.0f)
                moveTo(10.55f, 11.0f)
                curveTo(11.64f, 11.0f, 12.53f, 11.9f, 12.53f, 13.0f)
                curveTo(12.53f, 14.13f, 11.64f, 15.0f, 10.55f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.56f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.55f, 11.0f)
                close()
            }
        }
        .build()
        return _uber!!
    }

private var _uber: VectorAsset? = null
