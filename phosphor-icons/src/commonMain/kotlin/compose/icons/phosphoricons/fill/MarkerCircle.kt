package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) {
            return _markerCircle!!
        }
        _markerCircle = Builder(name = "MarkerCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 54.5f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, -147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 147.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, -147.0f)
                close()
                moveTo(168.0f, 206.4f)
                arcToRelative(88.8f, 88.8f, 0.0f, false, true, -80.0f, 0.0f)
                lineTo(88.0f, 176.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(104.0f, 160.0f)
                lineTo(104.0f, 136.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(190.2f, 190.2f)
                curveToRelative(-2.0f, 2.0f, -4.1f, 3.9f, -6.2f, 5.7f)
                lineTo(184.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(168.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.7f, -15.8f)
                lineTo(143.6f, 73.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -31.2f, 0.0f)
                lineToRelative(-10.7f, 46.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(19.9f)
                curveToRelative(-2.1f, -1.8f, -4.2f, -3.7f, -6.2f, -5.7f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 124.4f, 0.0f)
                close()
            }
        }
        .build()
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
