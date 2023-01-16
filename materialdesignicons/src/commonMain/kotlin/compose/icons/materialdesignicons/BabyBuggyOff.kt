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

public val MaterialDesignIcons.BabyBuggyOff: ImageVector
    get() {
        if (_babyBuggyOff != null) {
            return _babyBuggyOff!!
        }
        _babyBuggyOff = Builder(name = "BabyBuggyOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                curveTo(17.0f, 21.11f, 16.11f, 22.0f, 15.0f, 22.0f)
                reflectiveCurveTo(13.0f, 21.11f, 13.0f, 20.0f)
                reflectiveCurveTo(13.9f, 18.0f, 15.0f, 18.0f)
                reflectiveCurveTo(17.0f, 18.9f, 17.0f, 20.0f)
                moveTo(5.0f, 18.0f)
                curveTo(3.9f, 18.0f, 3.0f, 18.9f, 3.0f, 20.0f)
                reflectiveCurveTo(3.9f, 22.0f, 5.0f, 22.0f)
                reflectiveCurveTo(7.0f, 21.11f, 7.0f, 20.0f)
                reflectiveCurveTo(6.11f, 18.0f, 5.0f, 18.0f)
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(9.28f, 11.17f)
                lineTo(5.71f, 15.35f)
                curveTo(5.16f, 16.0f, 5.62f, 17.0f, 6.47f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(14.32f, 17.0f, 14.62f, 16.92f, 14.89f, 16.78f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(16.0f, 12.8f)
                verticalLineTo(6.38f)
                curveTo(16.58f, 5.7f, 16.93f, 5.0f, 17.61f, 5.0f)
                curveTo(18.38f, 5.0f, 19.0f, 5.66f, 19.0f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 4.56f, 19.5f, 3.0f, 17.61f, 3.0f)
                curveTo(16.95f, 3.0f, 16.44f, 3.2f, 16.0f, 3.5f)
                curveTo(15.32f, 3.91f, 14.88f, 4.59f, 14.47f, 5.07f)
                lineTo(11.62f, 8.42f)
                lineTo(16.0f, 12.8f)
                moveTo(12.32f, 5.1f)
                curveTo(12.59f, 4.78f, 12.91f, 4.38f, 13.3f, 4.0f)
                curveTo(12.14f, 3.45f, 10.9f, 3.15f, 9.65f, 3.09f)
                curveTo(9.39f, 3.08f, 9.12f, 3.08f, 8.86f, 3.09f)
                curveTo(8.12f, 3.12f, 7.38f, 3.26f, 6.66f, 3.46f)
                lineTo(10.47f, 7.27f)
                lineTo(12.32f, 5.1f)
                close()
            }
        }
        .build()
        return _babyBuggyOff!!
    }

private var _babyBuggyOff: ImageVector? = null
