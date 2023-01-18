package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0001f, 6.2492f)
                curveTo(2.0005f, 5.0069f, 3.0077f, 4.0f, 4.2501f, 4.0f)
                horizontalLineTo(8.2056f)
                curveTo(8.7311f, 4.0f, 9.2401f, 4.184f, 9.6442f, 4.52f)
                lineTo(12.0252f, 6.4999f)
                horizontalLineTo(17.7505f)
                curveTo(18.9931f, 6.4999f, 20.0005f, 7.5072f, 20.0005f, 8.7499f)
                verticalLineTo(9.502f)
                horizontalLineTo(6.4215f)
                curveTo(5.3888f, 9.502f, 4.4886f, 10.2051f, 4.2385f, 11.2071f)
                lineTo(2.3165f, 18.9079f)
                curveTo(2.3594f, 18.7356f, 2.3155f, 18.9118f, 2.3165f, 18.9079f)
                curveTo(2.113f, 18.5694f, 1.9959f, 18.173f, 1.9961f, 17.7492f)
                lineTo(2.0001f, 6.2492f)
                close()
                moveTo(3.745f, 19.3789f)
                curveTo(3.6662f, 19.6945f, 3.9049f, 20.0f, 4.2301f, 20.0f)
                horizontalLineTo(18.4698f)
                curveTo(19.2727f, 20.0f, 19.9727f, 19.4535f, 20.1675f, 18.6745f)
                lineTo(21.9307f, 11.6232f)
                curveTo(22.0096f, 11.3077f, 21.7709f, 11.002f, 21.4456f, 11.002f)
                horizontalLineTo(6.4215f)
                curveTo(6.0773f, 11.002f, 5.7772f, 11.2363f, 5.6939f, 11.5703f)
                lineTo(3.745f, 19.3789f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
