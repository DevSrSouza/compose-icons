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

public val MaterialDesignIcons.SourceRepository: ImageVector
    get() {
        if (_sourceRepository != null) {
            return _sourceRepository!!
        }
        _sourceRepository = Builder(name = "SourceRepository", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                moveTo(12.75f, 13.5f)
                curveTo(15.5f, 13.5f, 16.24f, 11.47f, 16.43f, 10.4f)
                curveTo(17.34f, 10.11f, 18.0f, 9.26f, 18.0f, 8.25f)
                curveTo(18.0f, 7.0f, 17.0f, 6.0f, 15.75f, 6.0f)
                curveTo(14.5f, 6.0f, 13.5f, 7.0f, 13.5f, 8.25f)
                curveTo(13.5f, 9.19f, 14.07f, 10.0f, 14.89f, 10.33f)
                curveTo(14.67f, 11.0f, 14.0f, 12.0f, 12.0f, 12.0f)
                curveTo(10.62f, 12.0f, 9.66f, 12.35f, 9.0f, 12.84f)
                verticalLineTo(8.87f)
                curveTo(9.87f, 8.56f, 10.5f, 7.73f, 10.5f, 6.75f)
                curveTo(10.5f, 5.5f, 9.5f, 4.5f, 8.25f, 4.5f)
                curveTo(7.0f, 4.5f, 6.0f, 5.5f, 6.0f, 6.75f)
                curveTo(6.0f, 7.73f, 6.63f, 8.56f, 7.5f, 8.87f)
                verticalLineTo(15.13f)
                curveTo(6.63f, 15.44f, 6.0f, 16.27f, 6.0f, 17.25f)
                curveTo(6.0f, 18.5f, 7.0f, 19.5f, 8.25f, 19.5f)
                curveTo(9.5f, 19.5f, 10.5f, 18.5f, 10.5f, 17.25f)
                curveTo(10.5f, 16.32f, 9.94f, 15.5f, 9.13f, 15.18f)
                curveTo(9.41f, 14.5f, 10.23f, 13.5f, 12.75f, 13.5f)
                moveTo(8.25f, 16.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.0f, 17.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.25f, 18.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.5f, 17.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.25f, 16.5f)
                moveTo(8.25f, 6.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.0f, 6.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.25f, 7.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.5f, 6.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.25f, 6.0f)
                moveTo(15.75f, 7.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 16.5f, 8.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 15.75f, 9.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 15.0f, 8.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 15.75f, 7.5f)
                close()
            }
        }
        .build()
        return _sourceRepository!!
    }

private var _sourceRepository: ImageVector? = null
