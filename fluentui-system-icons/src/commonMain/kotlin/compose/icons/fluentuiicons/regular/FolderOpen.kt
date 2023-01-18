package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0005f, 9.502f)
                verticalLineTo(8.7499f)
                curveTo(20.0005f, 7.5072f, 18.9931f, 6.4999f, 17.7505f, 6.4999f)
                horizontalLineTo(12.0252f)
                lineTo(9.6442f, 4.52f)
                curveTo(9.2401f, 4.184f, 8.7311f, 4.0f, 8.2056f, 4.0f)
                horizontalLineTo(4.2501f)
                curveTo(3.0077f, 4.0f, 2.0005f, 5.0069f, 2.0001f, 6.2492f)
                lineTo(1.9961f, 17.7492f)
                curveTo(1.9957f, 18.9922f, 3.0031f, 20.0f, 4.2461f, 20.0f)
                horizontalLineTo(4.2724f)
                curveTo(4.2766f, 20.0f, 4.2807f, 20.0f, 4.2848f, 20.0f)
                horizontalLineTo(18.4698f)
                curveTo(19.2728f, 20.0f, 19.9727f, 19.4536f, 20.1675f, 18.6746f)
                lineTo(21.9174f, 11.6765f)
                curveTo(22.1936f, 10.572f, 21.3582f, 9.502f, 20.2197f, 9.502f)
                horizontalLineTo(20.0005f)
                close()
                moveTo(4.2501f, 5.5f)
                horizontalLineTo(8.2056f)
                curveTo(8.3808f, 5.5f, 8.5504f, 5.5613f, 8.6851f, 5.6733f)
                lineTo(11.2745f, 7.8266f)
                curveTo(11.4092f, 7.9385f, 11.5789f, 7.9999f, 11.7541f, 7.9999f)
                horizontalLineTo(17.7505f)
                curveTo(18.1647f, 7.9999f, 18.5005f, 8.3357f, 18.5005f, 8.7499f)
                verticalLineTo(9.502f)
                horizontalLineTo(6.4243f)
                curveTo(5.3918f, 9.502f, 4.4919f, 10.2047f, 4.2415f, 11.2064f)
                lineTo(3.4973f, 14.1837f)
                lineTo(3.5001f, 6.2497f)
                curveTo(3.5002f, 5.8356f, 3.8359f, 5.5f, 4.2501f, 5.5f)
                close()
                moveTo(5.6967f, 11.5701f)
                curveTo(5.7802f, 11.2362f, 6.0802f, 11.002f, 6.4243f, 11.002f)
                horizontalLineTo(20.2197f)
                curveTo(20.3823f, 11.002f, 20.5017f, 11.1548f, 20.4622f, 11.3126f)
                lineTo(18.7123f, 18.3107f)
                curveTo(18.6845f, 18.422f, 18.5845f, 18.5f, 18.4698f, 18.5f)
                horizontalLineTo(4.2848f)
                curveTo(4.1222f, 18.5f, 4.0028f, 18.3472f, 4.0423f, 18.1894f)
                lineTo(5.6967f, 11.5701f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
