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

public val MaterialDesignIcons.BabyFaceOutline: ImageVector
    get() {
        if (_babyFaceOutline != null) {
            return _babyFaceOutline!!
        }
        _babyFaceOutline = Builder(name = "BabyFaceOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 9.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 15.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 14.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 13.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 14.5f, 9.25f)
                moveTo(9.5f, 9.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 10.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 9.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 8.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 9.5f, 9.25f)
                moveTo(7.5f, 14.0f)
                horizontalLineTo(16.5f)
                curveTo(15.74f, 15.77f, 14.0f, 17.0f, 12.0f, 17.0f)
                curveTo(10.0f, 17.0f, 8.26f, 15.77f, 7.5f, 14.0f)
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 10.19f, 2.2f, 8.66f, 3.86f, 8.17f)
                curveTo(5.29f, 5.11f, 8.4f, 3.0f, 12.0f, 3.0f)
                curveTo(15.6f, 3.0f, 18.71f, 5.11f, 20.15f, 8.17f)
                curveTo(21.8f, 8.66f, 23.0f, 10.19f, 23.0f, 12.0f)
                curveTo(23.0f, 13.81f, 21.8f, 15.34f, 20.15f, 15.83f)
                curveTo(18.71f, 18.89f, 15.6f, 21.0f, 12.0f, 21.0f)
                curveTo(8.4f, 21.0f, 5.29f, 18.89f, 3.86f, 15.83f)
                curveTo(2.2f, 15.34f, 1.0f, 13.81f, 1.0f, 12.0f)
                moveTo(12.0f, 5.0f)
                curveTo(8.82f, 5.0f, 6.14f, 7.12f, 5.28f, 10.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 14.0f)
                horizontalLineTo(5.28f)
                curveTo(6.14f, 16.88f, 8.82f, 19.0f, 12.0f, 19.0f)
                curveTo(15.18f, 19.0f, 17.86f, 16.88f, 18.72f, 14.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                horizontalLineTo(18.72f)
                curveTo(17.86f, 7.12f, 15.18f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _babyFaceOutline!!
    }

private var _babyFaceOutline: ImageVector? = null
