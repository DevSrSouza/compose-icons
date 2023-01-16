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

public val MaterialDesignIcons.LibraryOutline: ImageVector
    get() {
        if (_libraryOutline != null) {
            return _libraryOutline!!
        }
        _libraryOutline = Builder(name = "LibraryOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.27f)
                lineTo(10.64f, 13.0f)
                curveTo(9.09f, 11.57f, 7.16f, 10.57f, 5.0f, 10.18f)
                verticalLineTo(17.13f)
                curveTo(7.61f, 17.47f, 10.0f, 18.47f, 12.0f, 19.95f)
                curveTo(14.0f, 18.47f, 16.39f, 17.47f, 19.0f, 17.13f)
                verticalLineTo(10.18f)
                curveTo(16.84f, 10.57f, 14.91f, 11.57f, 13.36f, 13.0f)
                moveTo(19.0f, 8.15f)
                curveTo(19.65f, 8.05f, 20.32f, 8.0f, 21.0f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(17.5f, 19.0f, 14.36f, 20.35f, 12.0f, 22.54f)
                curveTo(9.64f, 20.35f, 6.5f, 19.0f, 3.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(3.68f, 8.0f, 4.35f, 8.05f, 5.0f, 8.15f)
                curveTo(7.69f, 8.56f, 10.1f, 9.78f, 12.0f, 11.54f)
                curveTo(13.9f, 9.78f, 16.31f, 8.56f, 19.0f, 8.15f)
                moveTo(12.0f, 6.0f)
                curveTo(12.27f, 6.0f, 12.5f, 5.9f, 12.71f, 5.71f)
                curveTo(12.9f, 5.5f, 13.0f, 5.27f, 13.0f, 5.0f)
                reflectiveCurveTo(12.9f, 4.5f, 12.71f, 4.29f)
                curveTo(12.5f, 4.11f, 12.27f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(11.5f, 4.11f, 11.29f, 4.29f)
                curveTo(11.11f, 4.5f, 11.0f, 4.74f, 11.0f, 5.0f)
                reflectiveCurveTo(11.11f, 5.5f, 11.29f, 5.71f)
                curveTo(11.5f, 5.9f, 11.74f, 6.0f, 12.0f, 6.0f)
                moveTo(14.12f, 7.12f)
                curveTo(13.56f, 7.68f, 12.8f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(10.44f, 7.68f, 9.88f, 7.12f)
                curveTo(9.32f, 6.56f, 9.0f, 5.8f, 9.0f, 5.0f)
                reflectiveCurveTo(9.32f, 3.44f, 9.88f, 2.88f)
                curveTo(10.44f, 2.32f, 11.2f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(13.56f, 2.32f, 14.12f, 2.88f)
                reflectiveCurveTo(15.0f, 4.2f, 15.0f, 5.0f)
                reflectiveCurveTo(14.68f, 6.56f, 14.12f, 7.12f)
                close()
            }
        }
        .build()
        return _libraryOutline!!
    }

private var _libraryOutline: ImageVector? = null
