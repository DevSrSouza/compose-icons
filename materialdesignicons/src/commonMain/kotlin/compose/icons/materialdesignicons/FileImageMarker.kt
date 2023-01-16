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

public val MaterialDesignIcons.FileImageMarker: ImageVector
    get() {
        if (_fileImageMarker != null) {
            return _fileImageMarker!!
        }
        _fileImageMarker = Builder(name = "FileImageMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                lineTo(12.0f, 14.0f)
                lineTo(13.03f, 15.03f)
                curveTo(13.28f, 12.26f, 15.68f, 10.0f, 18.5f, 10.0f)
                curveTo(19.0f, 10.0f, 19.5f, 10.08f, 20.0f, 10.22f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(15.91f)
                curveTo(15.5f, 21.44f, 15.0f, 20.76f, 14.55f, 20.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                moveTo(8.0f, 9.0f)
                curveTo(9.11f, 9.0f, 10.0f, 9.9f, 10.0f, 11.0f)
                reflectiveCurveTo(9.11f, 13.0f, 8.0f, 13.0f)
                reflectiveCurveTo(6.0f, 12.11f, 6.0f, 11.0f)
                reflectiveCurveTo(6.9f, 9.0f, 8.0f, 9.0f)
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
        return _fileImageMarker!!
    }

private var _fileImageMarker: ImageVector? = null
