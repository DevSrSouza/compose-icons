package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) {
            return _markerCircle!!
        }
        _markerCircle = Builder(name = "MarkerCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 211.2f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -96.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(4.2f)
                lineToRelative(12.0f, -57.6f)
                curveToRelative(1.7f, -8.5f, 13.9f, -8.5f, 15.6f, 0.0f)
                lineToRelative(12.0f, 57.6f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(35.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 54.5f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, -147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 147.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, -147.0f)
                close()
                moveTo(88.0f, 206.4f)
                lineTo(88.0f, 176.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(30.4f)
                arcTo(88.8f, 88.8f, 0.0f, false, true, 88.0f, 206.4f)
                close()
                moveTo(104.0f, 144.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                lineTo(104.0f, 160.0f)
                close()
                moveTo(118.0f, 128.0f)
                lineTo(128.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(10.0f, 48.0f)
                close()
                moveTo(190.2f, 190.2f)
                curveToRelative(-2.0f, 2.0f, -4.1f, 3.9f, -6.2f, 5.7f)
                lineTo(184.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(168.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.6f, -15.8f)
                lineTo(143.7f, 76.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -31.4f, 0.0f)
                lineToRelative(-10.7f, 51.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 144.0f)
                verticalLineToRelative(16.0f)
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
