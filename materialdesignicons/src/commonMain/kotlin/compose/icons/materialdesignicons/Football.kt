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

public val MaterialDesignIcons.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.39f, 21.0f)
                lineTo(3.0f, 15.61f)
                curveTo(3.0f, 16.7f, 3.04f, 17.71f, 3.2f, 18.63f)
                curveTo(3.35f, 19.55f, 3.5f, 20.1f, 3.71f, 20.29f)
                curveTo(3.9f, 20.5f, 4.44f, 20.65f, 5.35f, 20.81f)
                reflectiveCurveTo(7.27f, 21.0f, 8.39f, 21.0f)
                moveTo(15.5f, 9.89f)
                lineTo(9.89f, 15.5f)
                lineTo(8.5f, 14.11f)
                lineTo(14.11f, 8.5f)
                lineTo(15.5f, 9.89f)
                moveTo(3.29f, 13.08f)
                lineTo(10.92f, 20.71f)
                curveTo(13.7f, 20.21f, 15.9f, 19.15f, 17.53f, 17.53f)
                curveTo(19.15f, 15.9f, 20.21f, 13.7f, 20.71f, 10.92f)
                lineTo(13.08f, 3.29f)
                curveTo(10.3f, 3.79f, 8.1f, 4.85f, 6.47f, 6.47f)
                reflectiveCurveTo(3.79f, 10.3f, 3.29f, 13.08f)
                moveTo(15.61f, 3.0f)
                lineTo(21.0f, 8.39f)
                curveTo(21.0f, 7.3f, 20.96f, 6.29f, 20.81f, 5.37f)
                curveTo(20.65f, 4.45f, 20.5f, 3.9f, 20.29f, 3.71f)
                curveTo(20.1f, 3.5f, 19.56f, 3.35f, 18.65f, 3.2f)
                reflectiveCurveTo(16.73f, 3.0f, 15.61f, 3.0f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
