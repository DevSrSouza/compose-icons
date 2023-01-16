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

public val MaterialDesignIcons.Git: ImageVector
    get() {
        if (_git != null) {
            return _git!!
        }
        _git = Builder(name = "Git", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6f, 10.59f)
                lineTo(8.38f, 4.8f)
                lineTo(10.07f, 6.5f)
                curveTo(9.83f, 7.35f, 10.22f, 8.28f, 11.0f, 8.73f)
                verticalLineTo(14.27f)
                curveTo(10.4f, 14.61f, 10.0f, 15.26f, 10.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 16.0f)
                curveTo(14.0f, 15.26f, 13.6f, 14.61f, 13.0f, 14.27f)
                verticalLineTo(9.41f)
                lineTo(15.07f, 11.5f)
                curveTo(15.0f, 11.65f, 15.0f, 11.82f, 15.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 10.0f)
                curveTo(16.82f, 10.0f, 16.65f, 10.0f, 16.5f, 10.07f)
                lineTo(13.93f, 7.5f)
                curveTo(14.19f, 6.57f, 13.71f, 5.55f, 12.78f, 5.16f)
                curveTo(12.35f, 5.0f, 11.9f, 4.96f, 11.5f, 5.07f)
                lineTo(9.8f, 3.38f)
                lineTo(10.59f, 2.6f)
                curveTo(11.37f, 1.81f, 12.63f, 1.81f, 13.41f, 2.6f)
                lineTo(21.4f, 10.59f)
                curveTo(22.19f, 11.37f, 22.19f, 12.63f, 21.4f, 13.41f)
                lineTo(13.41f, 21.4f)
                curveTo(12.63f, 22.19f, 11.37f, 22.19f, 10.59f, 21.4f)
                lineTo(2.6f, 13.41f)
                curveTo(1.81f, 12.63f, 1.81f, 11.37f, 2.6f, 10.59f)
                close()
            }
        }
        .build()
        return _git!!
    }

private var _git: ImageVector? = null
