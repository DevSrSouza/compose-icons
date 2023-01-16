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

public val MaterialDesignIcons.BabyFace: ImageVector
    get() {
        if (_babyFace != null) {
            return _babyFace!!
        }
        _babyFace = Builder(name = "BabyFace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 10.19f, 2.2f, 8.66f, 3.86f, 8.17f)
                curveTo(5.29f, 5.11f, 8.4f, 3.0f, 12.0f, 3.0f)
                curveTo(15.6f, 3.0f, 18.71f, 5.11f, 20.15f, 8.17f)
                curveTo(21.8f, 8.66f, 23.0f, 10.19f, 23.0f, 12.0f)
                curveTo(23.0f, 13.81f, 21.8f, 15.34f, 20.15f, 15.83f)
                curveTo(18.71f, 18.89f, 15.6f, 21.0f, 12.0f, 21.0f)
                curveTo(8.4f, 21.0f, 5.29f, 18.89f, 3.86f, 15.83f)
                curveTo(2.2f, 15.34f, 1.0f, 13.81f, 1.0f, 12.0f)
                moveTo(14.5f, 9.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 13.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 14.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 14.5f, 9.25f)
                moveTo(9.5f, 9.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 8.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 10.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.5f, 9.25f)
                moveTo(7.5f, 14.0f)
                curveTo(8.26f, 15.77f, 10.0f, 17.0f, 12.0f, 17.0f)
                curveTo(14.0f, 17.0f, 15.74f, 15.77f, 16.5f, 14.0f)
                horizontalLineTo(7.5f)
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 12.82f, 3.5f, 13.53f, 4.21f, 13.84f)
                curveTo(4.07f, 13.25f, 4.0f, 12.63f, 4.0f, 12.0f)
                curveTo(4.0f, 11.37f, 4.07f, 10.75f, 4.21f, 10.16f)
                curveTo(3.5f, 10.47f, 3.0f, 11.18f, 3.0f, 12.0f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 11.18f, 20.5f, 10.47f, 19.79f, 10.16f)
                curveTo(19.93f, 10.75f, 20.0f, 11.37f, 20.0f, 12.0f)
                curveTo(20.0f, 12.63f, 19.93f, 13.25f, 19.79f, 13.84f)
                curveTo(20.5f, 13.53f, 21.0f, 12.82f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _babyFace!!
    }

private var _babyFace: ImageVector? = null
