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

public val MaterialDesignIcons.BabyBuggy: ImageVector
    get() {
        if (_babyBuggy != null) {
            return _babyBuggy!!
        }
        _babyBuggy = Builder(name = "BabyBuggy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 20.0f)
                moveTo(7.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 20.0f)
                moveTo(17.61f, 3.0f)
                curveTo(16.95f, 3.0f, 16.44f, 3.2f, 16.0f, 3.5f)
                curveTo(15.32f, 3.91f, 14.88f, 4.59f, 14.47f, 5.07f)
                lineTo(5.71f, 15.35f)
                curveTo(5.16f, 16.0f, 5.62f, 17.0f, 6.47f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 17.0f, 16.0f, 16.1f, 16.0f, 15.0f)
                verticalLineTo(6.38f)
                curveTo(16.58f, 5.7f, 16.93f, 5.0f, 17.61f, 5.0f)
                curveTo(18.38f, 5.0f, 19.0f, 5.66f, 19.0f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 4.56f, 19.5f, 3.0f, 17.61f, 3.0f)
                moveTo(8.86f, 3.09f)
                curveTo(7.04f, 3.16f, 5.23f, 3.76f, 3.68f, 4.9f)
                lineTo(8.44f, 9.66f)
                lineTo(12.32f, 5.1f)
                curveTo(12.59f, 4.78f, 12.91f, 4.38f, 13.3f, 4.0f)
                curveTo(12.14f, 3.45f, 10.9f, 3.15f, 9.65f, 3.09f)
                curveTo(9.39f, 3.08f, 9.12f, 3.08f, 8.86f, 3.09f)
                close()
            }
        }
        .build()
        return _babyBuggy!!
    }

private var _babyBuggy: ImageVector? = null
