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

public val MaterialDesignIcons.Wikipedia: ImageVector
    get() {
        if (_wikipedia != null) {
            return _wikipedia!!
        }
        _wikipedia = Builder(name = "Wikipedia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.97f, 18.95f)
                lineTo(12.41f, 12.92f)
                curveTo(11.39f, 14.91f, 10.27f, 17.0f, 9.31f, 18.95f)
                curveTo(9.3f, 18.96f, 8.84f, 18.95f, 8.84f, 18.95f)
                curveTo(7.37f, 15.5f, 5.85f, 12.1f, 4.37f, 8.68f)
                curveTo(4.03f, 7.84f, 2.83f, 6.5f, 2.0f, 6.5f)
                curveTo(2.0f, 6.4f, 2.0f, 6.18f, 2.0f, 6.05f)
                horizontalLineTo(7.06f)
                verticalLineTo(6.5f)
                curveTo(6.46f, 6.5f, 5.44f, 6.9f, 5.7f, 7.55f)
                curveTo(6.42f, 9.09f, 8.94f, 15.06f, 9.63f, 16.58f)
                curveTo(10.1f, 15.64f, 11.43f, 13.16f, 12.0f, 12.11f)
                curveTo(11.55f, 11.23f, 10.13f, 7.93f, 9.71f, 7.11f)
                curveTo(9.39f, 6.57f, 8.58f, 6.5f, 7.96f, 6.5f)
                curveTo(7.96f, 6.35f, 7.97f, 6.25f, 7.96f, 6.06f)
                lineTo(12.42f, 6.07f)
                verticalLineTo(6.47f)
                curveTo(11.81f, 6.5f, 11.24f, 6.71f, 11.5f, 7.29f)
                curveTo(12.1f, 8.53f, 12.45f, 9.42f, 13.0f, 10.57f)
                curveTo(13.17f, 10.23f, 14.07f, 8.38f, 14.5f, 7.41f)
                curveTo(14.76f, 6.76f, 14.37f, 6.5f, 13.29f, 6.5f)
                curveTo(13.3f, 6.38f, 13.3f, 6.17f, 13.3f, 6.07f)
                curveTo(14.69f, 6.06f, 16.78f, 6.06f, 17.15f, 6.05f)
                verticalLineTo(6.47f)
                curveTo(16.44f, 6.5f, 15.71f, 6.88f, 15.33f, 7.46f)
                lineTo(13.5f, 11.3f)
                curveTo(13.68f, 11.81f, 15.46f, 15.76f, 15.65f, 16.2f)
                lineTo(19.5f, 7.37f)
                curveTo(19.2f, 6.65f, 18.34f, 6.5f, 18.0f, 6.5f)
                curveTo(18.0f, 6.37f, 18.0f, 6.2f, 18.0f, 6.05f)
                lineTo(22.0f, 6.08f)
                verticalLineTo(6.1f)
                lineTo(22.0f, 6.5f)
                curveTo(21.12f, 6.5f, 20.57f, 7.0f, 20.25f, 7.75f)
                curveTo(19.45f, 9.54f, 17.0f, 15.24f, 15.4f, 18.95f)
                curveTo(15.4f, 18.95f, 14.97f, 18.95f, 14.97f, 18.95f)
                close()
            }
        }
        .build()
        return _wikipedia!!
    }

private var _wikipedia: ImageVector? = null
