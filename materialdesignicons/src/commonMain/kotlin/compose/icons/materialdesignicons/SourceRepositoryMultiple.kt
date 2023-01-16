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

public val MaterialDesignIcons.SourceRepositoryMultiple: ImageVector
    get() {
        if (_sourceRepositoryMultiple != null) {
            return _sourceRepositoryMultiple!!
        }
        _sourceRepositoryMultiple = Builder(name = "SourceRepositoryMultiple", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 2.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 20.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 18.0f)
                verticalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 0.0f)
                moveTo(14.75f, 11.5f)
                curveTo(17.5f, 11.5f, 18.24f, 9.47f, 18.43f, 8.4f)
                curveTo(19.34f, 8.11f, 20.0f, 7.26f, 20.0f, 6.25f)
                curveTo(20.0f, 5.0f, 19.0f, 4.0f, 17.75f, 4.0f)
                curveTo(16.5f, 4.0f, 15.5f, 5.0f, 15.5f, 6.25f)
                curveTo(15.5f, 7.19f, 16.07f, 8.0f, 16.89f, 8.33f)
                curveTo(16.67f, 9.0f, 16.0f, 10.0f, 14.0f, 10.0f)
                curveTo(12.62f, 10.0f, 11.66f, 10.35f, 11.0f, 10.84f)
                verticalLineTo(6.87f)
                curveTo(11.87f, 6.56f, 12.5f, 5.73f, 12.5f, 4.75f)
                curveTo(12.5f, 3.5f, 11.5f, 2.5f, 10.25f, 2.5f)
                curveTo(9.0f, 2.5f, 8.0f, 3.5f, 8.0f, 4.75f)
                curveTo(8.0f, 5.73f, 8.63f, 6.56f, 9.5f, 6.87f)
                verticalLineTo(13.13f)
                curveTo(8.63f, 13.44f, 8.0f, 14.27f, 8.0f, 15.25f)
                curveTo(8.0f, 16.5f, 9.0f, 17.5f, 10.25f, 17.5f)
                curveTo(11.5f, 17.5f, 12.5f, 16.5f, 12.5f, 15.25f)
                curveTo(12.5f, 14.32f, 11.94f, 13.5f, 11.13f, 13.18f)
                curveTo(11.41f, 12.5f, 12.23f, 11.5f, 14.75f, 11.5f)
                moveTo(10.25f, 14.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.0f, 15.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 10.25f, 16.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.5f, 15.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 10.25f, 14.5f)
                moveTo(10.25f, 4.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.0f, 4.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 10.25f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.5f, 4.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 10.25f, 4.0f)
                moveTo(17.75f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 18.5f, 6.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 17.75f, 7.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 17.0f, 6.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 17.75f, 5.5f)
                moveTo(16.0f, 22.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _sourceRepositoryMultiple!!
    }

private var _sourceRepositoryMultiple: ImageVector? = null
