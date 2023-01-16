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

public val MaterialDesignIcons.FileRestoreOutline: ImageVector
    get() {
        if (_fileRestoreOutline != null) {
            return _fileRestoreOutline!!
        }
        _fileRestoreOutline = Builder(name = "FileRestoreOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                lineTo(18.0f, 9.0f)
                verticalLineTo(20.0f)
                moveTo(17.0f, 13.24f)
                curveTo(17.0f, 15.86f, 14.87f, 18.0f, 12.24f, 18.0f)
                curveTo(10.29f, 18.0f, 8.61f, 16.82f, 7.88f, 15.14f)
                horizontalLineTo(9.5f)
                curveTo(10.11f, 16.0f, 11.11f, 16.57f, 12.24f, 16.57f)
                curveTo(14.08f, 16.57f, 15.57f, 15.07f, 15.57f, 13.24f)
                reflectiveCurveTo(14.08f, 9.9f, 12.24f, 9.9f)
                curveTo(10.95f, 9.9f, 9.86f, 10.65f, 9.29f, 11.71f)
                lineTo(10.81f, 13.24f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.43f)
                lineTo(8.24f, 10.67f)
                curveTo(9.09f, 9.35f, 10.55f, 8.5f, 12.24f, 8.5f)
                curveTo(14.87f, 8.47f, 17.0f, 10.61f, 17.0f, 13.24f)
                close()
            }
        }
        .build()
        return _fileRestoreOutline!!
    }

private var _fileRestoreOutline: ImageVector? = null
