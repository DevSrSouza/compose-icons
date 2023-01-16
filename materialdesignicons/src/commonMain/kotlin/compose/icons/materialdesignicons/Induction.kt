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

public val MaterialDesignIcons.Induction: ImageVector
    get() {
        if (_induction != null) {
            return _induction!!
        }
        _induction = Builder(name = "Induction", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 2.0f)
                curveTo(20.75f, 2.0f, 18.75f, 2.61f, 17.19f, 3.33f)
                curveTo(15.79f, 2.61f, 14.0f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(8.21f, 2.61f, 6.81f, 3.33f)
                curveTo(5.25f, 2.61f, 3.25f, 2.0f, 1.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(2.36f, 4.0f, 3.61f, 4.27f, 4.71f, 4.64f)
                curveTo(4.03f, 5.15f, 3.63f, 5.54f, 3.59f, 5.59f)
                curveTo(3.21f, 5.96f, 3.0f, 6.47f, 3.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 20.21f, 4.79f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveTo(11.0f, 20.21f, 11.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(11.0f, 6.42f, 10.75f, 5.88f, 10.32f, 5.5f)
                curveTo(10.26f, 5.45f, 9.8f, 5.05f, 9.0f, 4.54f)
                curveTo(9.92f, 4.22f, 10.92f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(14.08f, 4.22f, 15.0f, 4.54f)
                curveTo(14.2f, 5.05f, 13.74f, 5.45f, 13.68f, 5.5f)
                curveTo(13.25f, 5.88f, 13.0f, 6.42f, 13.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(13.0f, 20.21f, 14.79f, 22.0f, 17.0f, 22.0f)
                reflectiveCurveTo(21.0f, 20.21f, 21.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 6.47f, 20.79f, 5.96f, 20.41f, 5.59f)
                curveTo(20.37f, 5.54f, 19.97f, 5.15f, 19.29f, 4.64f)
                curveTo(20.39f, 4.27f, 21.64f, 4.0f, 23.0f, 4.0f)
                verticalLineTo(2.0f)
                moveTo(9.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(9.0f, 19.11f, 8.11f, 20.0f, 7.0f, 20.0f)
                reflectiveCurveTo(5.0f, 19.11f, 5.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 7.0f, 5.7f, 6.31f, 6.87f, 5.58f)
                curveTo(8.2f, 6.31f, 9.0f, 7.0f, 9.0f, 7.0f)
                moveTo(19.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 19.11f, 18.11f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(15.0f, 19.11f, 15.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 7.0f, 15.8f, 6.31f, 17.13f, 5.58f)
                curveTo(18.3f, 6.31f, 19.0f, 7.0f, 19.0f, 7.0f)
                close()
            }
        }
        .build()
        return _induction!!
    }

private var _induction: ImageVector? = null
