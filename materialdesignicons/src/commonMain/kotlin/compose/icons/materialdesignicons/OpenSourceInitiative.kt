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

public val MaterialDesignIcons.OpenSourceInitiative: ImageVector
    get() {
        if (_openSourceInitiative != null) {
            return _openSourceInitiative!!
        }
        _openSourceInitiative = Builder(name = "OpenSourceInitiative", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.41f, 22.0f)
                curveTo(15.35f, 22.0f, 15.28f, 22.0f, 15.22f, 22.0f)
                curveTo(15.1f, 21.95f, 15.0f, 21.85f, 14.96f, 21.73f)
                lineTo(12.74f, 15.93f)
                curveTo(12.65f, 15.69f, 12.77f, 15.42f, 13.0f, 15.32f)
                curveTo(13.71f, 15.06f, 14.28f, 14.5f, 14.58f, 13.83f)
                curveTo(15.22f, 12.4f, 14.58f, 10.73f, 13.15f, 10.09f)
                curveTo(11.72f, 9.45f, 10.05f, 10.09f, 9.41f, 11.5f)
                curveTo(9.11f, 12.21f, 9.09f, 13.0f, 9.36f, 13.69f)
                curveTo(9.66f, 14.43f, 10.25f, 15.0f, 11.0f, 15.28f)
                curveTo(11.24f, 15.37f, 11.37f, 15.64f, 11.28f, 15.89f)
                lineTo(9.0f, 21.69f)
                curveTo(8.96f, 21.81f, 8.87f, 21.91f, 8.75f, 21.96f)
                curveTo(8.63f, 22.0f, 8.5f, 22.0f, 8.39f, 21.96f)
                curveTo(3.24f, 19.97f, 0.67f, 14.18f, 2.66f, 9.03f)
                curveTo(4.65f, 3.88f, 10.44f, 1.31f, 15.59f, 3.3f)
                curveTo(18.06f, 4.26f, 20.05f, 6.15f, 21.13f, 8.57f)
                curveTo(22.22f, 11.0f, 22.29f, 13.75f, 21.33f, 16.22f)
                curveTo(20.32f, 18.88f, 18.23f, 21.0f, 15.58f, 22.0f)
                curveTo(15.5f, 22.0f, 15.47f, 22.0f, 15.41f, 22.0f)
                moveTo(12.0f, 3.59f)
                curveTo(7.03f, 3.46f, 2.9f, 7.39f, 2.77f, 12.36f)
                curveTo(2.68f, 16.08f, 4.88f, 19.47f, 8.32f, 20.9f)
                lineTo(10.21f, 16.0f)
                curveTo(8.38f, 15.0f, 7.69f, 12.72f, 8.68f, 10.89f)
                curveTo(9.67f, 9.06f, 11.96f, 8.38f, 13.79f, 9.36f)
                curveTo(15.62f, 10.35f, 16.31f, 12.64f, 15.32f, 14.47f)
                curveTo(14.97f, 15.12f, 14.44f, 15.65f, 13.79f, 16.0f)
                lineTo(15.68f, 20.93f)
                curveTo(17.86f, 19.95f, 19.57f, 18.16f, 20.44f, 15.93f)
                curveTo(22.28f, 11.31f, 20.04f, 6.08f, 15.42f, 4.23f)
                curveTo(14.33f, 3.8f, 13.17f, 3.58f, 12.0f, 3.59f)
                close()
            }
        }
        .build()
        return _openSourceInitiative!!
    }

private var _openSourceInitiative: ImageVector? = null
