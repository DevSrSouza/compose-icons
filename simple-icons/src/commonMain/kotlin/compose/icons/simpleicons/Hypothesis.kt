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

public val SimpleIcons.Hypothesis: VectorAsset
    get() {
        if (_hypothesis != null) {
            return _hypothesis!!
        }
        _hypothesis = VectorAssetBuilder(name = "Hypothesis", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.43f, 0.0f)
                curveTo(2.5f, 0.0f, 1.72f, 0.768f, 1.72f, 1.72f)
                verticalLineTo(18.86f)
                curveTo(1.72f, 19.8f, 2.5f, 20.57f, 3.43f, 20.57f)
                horizontalLineTo(9.38f)
                lineTo(12.0f, 24.0f)
                lineTo(14.62f, 20.57f)
                horizontalLineTo(20.57f)
                curveTo(21.5f, 20.57f, 22.29f, 19.8f, 22.29f, 18.86f)
                verticalLineTo(1.72f)
                curveTo(22.29f, 0.77f, 21.5f, 0.0f, 20.57f, 0.0f)
                horizontalLineTo(3.43f)
                moveTo(5.14f, 3.43f)
                horizontalLineTo(7.72f)
                verticalLineTo(9.43f)
                reflectiveCurveTo(8.58f, 7.72f, 10.28f, 7.72f)
                curveTo(12.0f, 7.72f, 13.74f, 8.57f, 13.74f, 11.24f)
                verticalLineTo(17.14f)
                horizontalLineTo(11.16f)
                verticalLineTo(12.0f)
                curveTo(11.16f, 10.61f, 10.28f, 10.07f, 9.43f, 10.29f)
                curveTo(8.57f, 10.5f, 7.72f, 11.41f, 7.72f, 13.29f)
                verticalLineTo(17.14f)
                horizontalLineTo(5.14f)
                verticalLineTo(3.43f)
                moveTo(18.0f, 13.72f)
                curveTo(18.95f, 13.72f, 19.72f, 14.5f, 19.72f, 15.42f)
                arcTo(1.71f, 1.71f, 0.0f, false, true, 18.0f, 17.13f)
                arcTo(1.71f, 1.71f, 0.0f, false, true, 16.29f, 15.42f)
                curveTo(16.29f, 14.5f, 17.05f, 13.71f, 18.0f, 13.71f)
                close()
            }
        }
        .build()
        return _hypothesis!!
    }

private var _hypothesis: VectorAsset? = null
