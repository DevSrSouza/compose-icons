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

public val FilledGroup.FolderArrowLeft: ImageVector
    get() {
        if (_folderArrowLeft != null) {
            return _folderArrowLeft!!
        }
        _folderArrowLeft = Builder(name = "FolderArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9785f, 8.4379f)
                curveTo(21.8266f, 7.343f, 20.8867f, 6.5f, 19.75f, 6.5f)
                horizontalLineTo(13.821f)
                lineTo(9.6473f, 9.9785f)
                lineTo(9.4909f, 10.0977f)
                curveTo(9.169f, 10.3214f, 8.794f, 10.4572f, 8.4033f, 10.4914f)
                lineTo(8.2069f, 10.5f)
                lineTo(2.0f, 10.499f)
                verticalLineTo(17.75f)
                lineTo(2.0052f, 17.904f)
                curveTo(2.0844f, 19.0748f, 3.0591f, 20.0f, 4.25f, 20.0f)
                lineTo(12.0226f, 20.0012f)
                curveTo(11.3753f, 18.9907f, 11.0f, 17.7892f, 11.0f, 16.5f)
                curveTo(11.0f, 12.9101f, 13.9101f, 10.0f, 17.5f, 10.0f)
                curveTo(19.2469f, 10.0f, 20.8328f, 10.6891f, 22.0008f, 11.8104f)
                lineTo(22.0f, 8.75f)
                lineTo(21.9948f, 8.596f)
                lineTo(21.9785f, 8.4379f)
                close()
                moveTo(9.4909f, 4.4023f)
                curveTo(9.1153f, 4.1413f, 8.6675f, 4.0f, 8.2069f, 4.0f)
                horizontalLineTo(4.25f)
                lineTo(4.096f, 4.0052f)
                curveTo(2.9252f, 4.0844f, 2.0f, 5.0591f, 2.0f, 6.25f)
                verticalLineTo(8.999f)
                lineTo(8.2069f, 9.0f)
                lineTo(8.3113f, 8.9927f)
                curveTo(8.4145f, 8.9782f, 8.5136f, 8.9423f, 8.6022f, 8.8874f)
                lineTo(8.6871f, 8.8262f)
                lineTo(11.75f, 6.273f)
                lineTo(9.6473f, 4.5215f)
                lineTo(9.4909f, 4.4023f)
                close()
                moveTo(17.5f, 22.0f)
                curveTo(14.4624f, 22.0f, 12.0f, 19.5376f, 12.0f, 16.5f)
                curveTo(12.0f, 13.4624f, 14.4624f, 11.0f, 17.5f, 11.0f)
                curveTo(20.5376f, 11.0f, 23.0f, 13.4624f, 23.0f, 16.5f)
                curveTo(23.0f, 19.5376f, 20.5376f, 22.0f, 17.5f, 22.0f)
                close()
                moveTo(20.5f, 17.0f)
                curveTo(20.7761f, 17.0f, 21.0f, 16.7761f, 21.0f, 16.5f)
                curveTo(21.0f, 16.2239f, 20.7761f, 16.0f, 20.5f, 16.0f)
                horizontalLineTo(15.7071f)
                lineTo(17.3536f, 14.3536f)
                curveTo(17.5488f, 14.1583f, 17.5488f, 13.8417f, 17.3536f, 13.6464f)
                curveTo(17.1583f, 13.4512f, 16.8417f, 13.4512f, 16.6464f, 13.6464f)
                lineTo(14.1464f, 16.1464f)
                curveTo(13.9512f, 16.3417f, 13.9512f, 16.6583f, 14.1464f, 16.8536f)
                lineTo(16.6464f, 19.3536f)
                curveTo(16.8417f, 19.5488f, 17.1583f, 19.5488f, 17.3536f, 19.3536f)
                curveTo(17.5488f, 19.1583f, 17.5488f, 18.8417f, 17.3536f, 18.6464f)
                lineTo(15.7071f, 17.0f)
                horizontalLineTo(20.5f)
                close()
            }
        }
        .build()
        return _folderArrowLeft!!
    }

private var _folderArrowLeft: ImageVector? = null
