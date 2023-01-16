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

public val MaterialDesignIcons.HammerSickle: ImageVector
    get() {
        if (_hammerSickle != null) {
            return _hammerSickle!!
        }
        _hammerSickle = Builder(name = "HammerSickle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.59f)
                lineTo(20.59f, 22.0f)
                lineTo(17.45f, 18.86f)
                curveTo(16.89f, 19.23f, 16.3f, 19.56f, 15.66f, 19.78f)
                curveTo(14.0f, 20.36f, 12.2f, 20.4f, 10.53f, 19.88f)
                curveTo(9.5f, 19.58f, 8.56f, 19.05f, 7.75f, 18.37f)
                lineTo(4.56f, 21.56f)
                curveTo(4.0f, 22.15f, 3.03f, 22.15f, 2.44f, 21.56f)
                curveTo(1.86f, 21.0f, 1.86f, 20.0f, 2.44f, 19.44f)
                lineTo(5.82f, 16.06f)
                lineTo(8.47f, 15.54f)
                curveTo(9.19f, 16.45f, 10.19f, 17.13f, 11.28f, 17.5f)
                curveTo(12.44f, 17.85f, 13.72f, 17.84f, 14.87f, 17.46f)
                curveTo(15.16f, 17.37f, 15.44f, 17.26f, 15.7f, 17.12f)
                lineTo(7.6f, 9.0f)
                lineTo(5.83f, 10.78f)
                lineTo(3.0f, 7.95f)
                lineTo(7.95f, 3.0f)
                lineTo(12.19f, 4.41f)
                lineTo(9.0f, 7.6f)
                lineTo(17.31f, 15.89f)
                curveTo(17.5f, 15.71f, 17.65f, 15.53f, 17.8f, 15.33f)
                curveTo(19.3f, 13.36f, 19.42f, 10.42f, 18.09f, 8.0f)
                curveTo(16.78f, 5.57f, 14.5f, 3.55f, 12.0f, 2.0f)
                curveTo(13.41f, 2.5f, 14.76f, 3.17f, 16.0f, 4.04f)
                curveTo(17.24f, 4.91f, 18.43f, 5.93f, 19.33f, 7.25f)
                curveTo(20.23f, 8.54f, 20.87f, 10.12f, 21.0f, 11.79f)
                curveTo(21.1f, 13.47f, 20.66f, 15.23f, 19.7f, 16.65f)
                curveTo(19.5f, 17.0f, 19.24f, 17.28f, 19.0f, 17.56f)
                lineTo(22.0f, 20.59f)
                close()
            }
        }
        .build()
        return _hammerSickle!!
    }

private var _hammerSickle: ImageVector? = null
