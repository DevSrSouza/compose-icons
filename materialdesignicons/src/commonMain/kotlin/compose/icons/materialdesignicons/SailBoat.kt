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

public val MaterialDesignIcons.SailBoat: ImageVector
    get() {
        if (_sailBoat != null) {
            return _sailBoat!!
        }
        _sailBoat = Builder(name = "SailBoat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.5f)
                lineTo(11.0f, 2.03f)
                verticalLineTo(13.5f)
                horizontalLineTo(3.0f)
                moveTo(12.5f, 13.5f)
                curveTo(13.85f, 9.75f, 13.67f, 4.71f, 12.5f, 1.0f)
                curveTo(17.26f, 2.54f, 20.9f, 8.4f, 20.96f, 13.5f)
                horizontalLineTo(12.5f)
                moveTo(21.1f, 17.08f)
                curveTo(20.69f, 17.72f, 20.21f, 18.27f, 19.65f, 18.74f)
                curveTo(19.0f, 18.45f, 18.42f, 18.0f, 17.96f, 17.5f)
                curveTo(16.47f, 19.43f, 13.46f, 19.43f, 11.97f, 17.5f)
                curveTo(10.5f, 19.43f, 7.47f, 19.43f, 6.0f, 17.5f)
                curveTo(5.5f, 18.0f, 4.95f, 18.45f, 4.3f, 18.74f)
                curveTo(3.16f, 17.8f, 2.3f, 16.46f, 2.0f, 15.0f)
                horizontalLineTo(21.94f)
                curveTo(21.78f, 15.75f, 21.5f, 16.44f, 21.1f, 17.08f)
                moveTo(20.96f, 23.0f)
                curveTo(19.9f, 23.0f, 18.9f, 22.75f, 17.96f, 22.25f)
                curveTo(16.12f, 23.25f, 13.81f, 23.25f, 11.97f, 22.25f)
                curveTo(10.13f, 23.25f, 7.82f, 23.25f, 6.0f, 22.25f)
                curveTo(4.77f, 22.94f, 3.36f, 23.05f, 2.0f, 23.0f)
                verticalLineTo(21.0f)
                curveTo(3.41f, 21.05f, 4.77f, 20.9f, 6.0f, 20.0f)
                curveTo(7.74f, 21.25f, 10.21f, 21.25f, 11.97f, 20.0f)
                curveTo(13.74f, 21.25f, 16.2f, 21.25f, 17.96f, 20.0f)
                curveTo(19.17f, 20.9f, 20.54f, 21.05f, 21.94f, 21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.96f)
                close()
            }
        }
        .build()
        return _sailBoat!!
    }

private var _sailBoat: ImageVector? = null
