package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) {
            return _markerCircle!!
        }
        _markerCircle = Builder(name = "MarkerCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 204.4f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, -152.8f, 0.0f)
                arcToRelative(111.4f, 111.4f, 0.0f, false, false, 22.1f, 17.0f)
                lineToRelative(0.8f, 0.4f)
                arcToRelative(108.5f, 108.5f, 0.0f, false, false, 107.0f, 0.0f)
                lineToRelative(0.7f, -0.4f)
                arcTo(112.0f, 112.0f, 0.0f, false, false, 204.4f, 204.4f)
                close()
                moveTo(108.0f, 156.0f)
                lineTo(108.0f, 140.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 144.0f, 58.8f)
                lineTo(188.0f, 176.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -16.0f, -19.6f)
                lineTo(172.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -14.9f, -19.3f)
                lineToRelative(-9.8f, -35.5f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -38.6f, 0.0f)
                lineToRelative(-9.8f, 35.5f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 136.0f)
                verticalLineToRelative(20.4f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 68.0f, 176.0f)
                verticalLineToRelative(10.8f)
                arcTo(83.5f, 83.5f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(92.0f, 203.9f)
                lineTo(92.0f, 180.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(23.9f)
                arcTo(84.8f, 84.8f, 0.0f, false, true, 92.0f, 203.9f)
                close()
            }
        }
        .build()
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
