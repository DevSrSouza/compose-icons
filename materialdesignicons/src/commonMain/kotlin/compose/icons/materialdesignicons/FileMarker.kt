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

public val MaterialDesignIcons.FileMarker: ImageVector
    get() {
        if (_fileMarker != null) {
            return _fileMarker!!
        }
        _fileMarker = Builder(name = "FileMarker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 10.0f)
                curveTo(19.0f, 10.0f, 19.5f, 10.08f, 20.0f, 10.22f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(15.91f)
                curveTo(14.7f, 20.41f, 13.0f, 17.78f, 13.0f, 15.5f)
                curveTo(13.0f, 12.5f, 15.5f, 10.0f, 18.5f, 10.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                moveTo(18.5f, 12.0f)
                curveTo(16.6f, 12.0f, 15.0f, 13.6f, 15.0f, 15.5f)
                curveTo(15.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(22.0f, 18.1f, 22.0f, 15.5f)
                curveTo(22.0f, 13.6f, 20.4f, 12.0f, 18.5f, 12.0f)
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(19.7f, 15.0f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                close()
            }
        }
        .build()
        return _fileMarker!!
    }

private var _fileMarker: ImageVector? = null
