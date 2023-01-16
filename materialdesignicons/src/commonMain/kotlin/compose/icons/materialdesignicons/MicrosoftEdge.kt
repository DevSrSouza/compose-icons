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

public val MaterialDesignIcons.MicrosoftEdge: ImageVector
    get() {
        if (_microsoftEdge != null) {
            return _microsoftEdge!!
        }
        _microsoftEdge = Builder(name = "MicrosoftEdge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.86f, 15.37f)
                curveTo(10.17f, 14.6f, 9.7f, 13.68f, 9.55f, 12.65f)
                curveTo(9.25f, 13.11f, 9.0f, 13.61f, 8.82f, 14.15f)
                curveTo(7.9f, 16.9f, 9.5f, 20.33f, 12.22f, 21.33f)
                curveTo(14.56f, 22.11f, 17.19f, 20.72f, 18.92f, 19.2f)
                curveTo(19.18f, 18.85f, 21.23f, 17.04f, 20.21f, 16.84f)
                curveTo(17.19f, 18.39f, 13.19f, 17.95f, 10.86f, 15.37f)
                moveTo(11.46f, 9.56f)
                curveTo(12.5f, 9.55f, 11.5f, 9.13f, 11.07f, 8.81f)
                curveTo(10.03f, 8.24f, 8.81f, 7.96f, 7.63f, 7.96f)
                curveTo(3.78f, 8.0f, 0.995f, 10.41f, 2.3f, 14.4f)
                curveTo(3.24f, 18.28f, 6.61f, 21.4f, 10.59f, 21.9f)
                curveTo(8.54f, 20.61f, 7.3f, 18.19f, 7.3f, 15.78f)
                curveTo(7.38f, 13.25f, 8.94f, 10.28f, 11.46f, 9.56f)
                moveTo(2.78f, 8.24f)
                curveTo(5.82f, 6.0f, 10.66f, 6.18f, 13.28f, 9.0f)
                curveTo(14.3f, 10.11f, 15.0f, 12.0f, 14.07f, 13.37f)
                curveTo(12.33f, 15.25f, 17.15f, 15.5f, 18.18f, 15.22f)
                curveTo(21.92f, 14.5f, 22.91f, 10.15f, 21.13f, 7.15f)
                curveTo(19.43f, 3.75f, 15.66f, 1.97f, 11.96f, 2.0f)
                curveTo(7.9f, 1.93f, 4.25f, 4.5f, 2.78f, 8.24f)
                close()
            }
        }
        .build()
        return _microsoftEdge!!
    }

private var _microsoftEdge: ImageVector? = null
