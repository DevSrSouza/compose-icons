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

public val MaterialDesignIcons.CreativeCommons: ImageVector
    get() {
        if (_creativeCommons != null) {
            return _creativeCommons!!
        }
        _creativeCommons = Builder(name = "CreativeCommons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.89f, 10.34f)
                lineTo(10.55f, 11.04f)
                curveTo(10.41f, 10.74f, 10.24f, 10.53f, 10.03f, 10.41f)
                curveTo(9.82f, 10.29f, 9.62f, 10.23f, 9.45f, 10.23f)
                curveTo(8.55f, 10.23f, 8.11f, 10.82f, 8.11f, 12.0f)
                curveTo(8.11f, 12.54f, 8.22f, 12.97f, 8.45f, 13.29f)
                curveTo(8.67f, 13.61f, 9.0f, 13.77f, 9.45f, 13.77f)
                curveTo(10.03f, 13.77f, 10.44f, 13.5f, 10.68f, 12.91f)
                lineTo(11.91f, 13.54f)
                curveTo(11.65f, 14.03f, 11.29f, 14.41f, 10.82f, 14.69f)
                curveTo(10.36f, 14.97f, 9.85f, 15.11f, 9.29f, 15.11f)
                curveTo(8.39f, 15.11f, 7.67f, 14.84f, 7.12f, 14.29f)
                curveTo(6.58f, 13.74f, 6.3f, 13.0f, 6.3f, 12.0f)
                curveTo(6.3f, 11.05f, 6.58f, 10.3f, 7.13f, 9.74f)
                curveTo(7.69f, 9.18f, 8.39f, 8.9f, 9.23f, 8.9f)
                curveTo(10.47f, 8.89f, 11.36f, 9.38f, 11.89f, 10.34f)
                moveTo(17.66f, 10.34f)
                lineTo(16.34f, 11.04f)
                curveTo(16.2f, 10.74f, 16.0f, 10.53f, 15.81f, 10.41f)
                curveTo(15.6f, 10.29f, 15.4f, 10.23f, 15.21f, 10.23f)
                curveTo(14.32f, 10.23f, 13.87f, 10.82f, 13.87f, 12.0f)
                curveTo(13.87f, 12.54f, 14.0f, 12.97f, 14.21f, 13.29f)
                curveTo(14.44f, 13.61f, 14.77f, 13.77f, 15.21f, 13.77f)
                curveTo(15.8f, 13.77f, 16.21f, 13.5f, 16.45f, 12.91f)
                lineTo(17.7f, 13.54f)
                curveTo(17.42f, 14.03f, 17.05f, 14.41f, 16.59f, 14.69f)
                curveTo(16.12f, 14.97f, 15.62f, 15.11f, 15.07f, 15.11f)
                curveTo(14.17f, 15.11f, 13.44f, 14.84f, 12.9f, 14.29f)
                curveTo(12.36f, 13.74f, 12.09f, 13.0f, 12.09f, 12.0f)
                curveTo(12.09f, 11.05f, 12.37f, 10.3f, 12.92f, 9.74f)
                curveTo(13.47f, 9.18f, 14.17f, 8.9f, 15.0f, 8.9f)
                curveTo(16.26f, 8.89f, 17.14f, 9.38f, 17.66f, 10.34f)
                moveTo(12.0f, 3.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 20.5f, 12.0f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 12.0f, 20.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 3.5f, 12.0f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 12.0f, 3.5f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _creativeCommons!!
    }

private var _creativeCommons: ImageVector? = null
