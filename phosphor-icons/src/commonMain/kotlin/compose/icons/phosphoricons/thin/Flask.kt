package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.2f, 201.8f)
                lineToRelative(-63.6f, -106.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -0.6f, -2.0f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(93.8f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -0.6f, 2.0f)
                lineTo(59.2f, 162.9f)
                horizontalLineToRelative(0.0f)
                lineTo(35.8f, 201.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -0.1f, 12.1f)
                arcTo(11.7f, 11.7f, 0.0f, false, false, 46.1f, 220.0f)
                horizontalLineTo(209.9f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 10.4f, -6.1f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 220.2f, 201.8f)
                close()
                moveTo(106.3f, 100.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 1.7f, -6.2f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(93.8f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 1.7f, 6.2f)
                lineToRelative(40.9f, 68.1f)
                curveToRelative(-14.5f, 10.3f, -35.4f, 9.0f, -60.8f, -3.7f)
                curveToRelative(-16.1f, -8.0f, -37.6f, -15.1f, -56.7f, -9.1f)
                close()
                moveTo(213.4f, 210.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, 2.0f)
                horizontalLineTo(46.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, -2.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.1f, -4.1f)
                lineToRelative(22.9f, -38.1f)
                curveToRelative(14.5f, -10.1f, 35.4f, -8.8f, 60.6f, 3.8f)
                curveToRelative(16.6f, 8.3f, 30.3f, 11.4f, 41.3f, 11.4f)
                reflectiveCurveToRelative(20.7f, -3.5f, 27.2f, -8.0f)
                lineToRelative(18.6f, 30.9f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 213.4f, 210.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
