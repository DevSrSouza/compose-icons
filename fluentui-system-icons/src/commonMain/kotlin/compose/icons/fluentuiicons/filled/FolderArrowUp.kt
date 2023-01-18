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

public val FilledGroup.FolderArrowUp: ImageVector
    get() {
        if (_folderArrowUp != null) {
            return _folderArrowUp!!
        }
        _folderArrowUp = Builder(name = "FolderArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 6.5f)
                curveTo(20.8867f, 6.5f, 21.8266f, 7.343f, 21.9785f, 8.4379f)
                lineTo(21.9948f, 8.596f)
                lineTo(22.0f, 8.75f)
                lineTo(22.0008f, 11.8104f)
                curveTo(20.8328f, 10.6891f, 19.2469f, 10.0f, 17.5f, 10.0f)
                curveTo(13.9101f, 10.0f, 11.0f, 12.9101f, 11.0f, 16.5f)
                curveTo(11.0f, 17.7892f, 11.3753f, 18.9907f, 12.0226f, 20.0012f)
                lineTo(4.25f, 20.0f)
                curveTo(3.0591f, 20.0f, 2.0844f, 19.0748f, 2.0052f, 17.904f)
                lineTo(2.0f, 17.75f)
                verticalLineTo(10.499f)
                lineTo(8.2069f, 10.5f)
                lineTo(8.4033f, 10.4914f)
                curveTo(8.794f, 10.4572f, 9.169f, 10.3214f, 9.4909f, 10.0977f)
                lineTo(9.6473f, 9.9785f)
                lineTo(13.821f, 6.5f)
                horizontalLineTo(19.75f)
                close()
                moveTo(8.2069f, 4.0f)
                curveTo(8.6675f, 4.0f, 9.1153f, 4.1413f, 9.4909f, 4.4023f)
                lineTo(9.6473f, 4.5215f)
                lineTo(11.75f, 6.273f)
                lineTo(8.6871f, 8.8262f)
                lineTo(8.6022f, 8.8874f)
                curveTo(8.5136f, 8.9423f, 8.4145f, 8.9782f, 8.3113f, 8.9927f)
                lineTo(8.2069f, 9.0f)
                lineTo(2.0f, 8.999f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.0591f, 2.9252f, 4.0844f, 4.096f, 4.0052f)
                lineTo(4.25f, 4.0f)
                horizontalLineTo(8.2069f)
                close()
                moveTo(23.0f, 16.5f)
                curveTo(23.0f, 19.5376f, 20.5376f, 22.0f, 17.5f, 22.0f)
                curveTo(14.4624f, 22.0f, 12.0f, 19.5376f, 12.0f, 16.5f)
                curveTo(12.0f, 13.4624f, 14.4624f, 11.0f, 17.5f, 11.0f)
                curveTo(20.5376f, 11.0f, 23.0f, 13.4624f, 23.0f, 16.5f)
                close()
                moveTo(17.0f, 14.7071f)
                verticalLineTo(19.5f)
                curveTo(17.0f, 19.7761f, 17.2239f, 20.0f, 17.5f, 20.0f)
                curveTo(17.7761f, 20.0f, 18.0f, 19.7761f, 18.0f, 19.5f)
                verticalLineTo(14.7071f)
                lineTo(19.6464f, 16.3536f)
                curveTo(19.8417f, 16.5488f, 20.1583f, 16.5488f, 20.3536f, 16.3536f)
                curveTo(20.5488f, 16.1583f, 20.5488f, 15.8417f, 20.3536f, 15.6464f)
                lineTo(17.8536f, 13.1464f)
                curveTo(17.6583f, 12.9512f, 17.3417f, 12.9512f, 17.1464f, 13.1464f)
                lineTo(14.6464f, 15.6464f)
                curveTo(14.4512f, 15.8417f, 14.4512f, 16.1583f, 14.6464f, 16.3536f)
                curveTo(14.8417f, 16.5488f, 15.1583f, 16.5488f, 15.3536f, 16.3536f)
                lineTo(17.0f, 14.7071f)
                close()
            }
        }
        .build()
        return _folderArrowUp!!
    }

private var _folderArrowUp: ImageVector? = null
