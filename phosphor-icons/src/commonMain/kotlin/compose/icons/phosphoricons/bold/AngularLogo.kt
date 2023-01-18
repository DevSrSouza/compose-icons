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

public val BoldGroup.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) {
            return _angularLogo!!
        }
        _angularLogo = Builder(name = "AngularLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.6f, 60.9f)
                lineToRelative(-96.0f, -40.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -9.2f, 0.0f)
                lineToRelative(-96.0f, 40.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -7.3f, 12.7f)
                lineToRelative(16.0f, 120.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 6.5f, 9.1f)
                lineToRelative(80.0f, 40.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.8f, 0.0f)
                lineToRelative(80.0f, -40.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 6.5f, -9.1f)
                lineToRelative(16.0f, -120.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 228.6f, 60.9f)
                close()
                moveTo(196.9f, 184.1f)
                lineTo(128.0f, 218.6f)
                lineTo(59.1f, 184.1f)
                lineTo(45.1f, 79.5f)
                lineTo(128.0f, 45.0f)
                lineToRelative(82.9f, 34.5f)
                close()
                moveTo(117.3f, 82.6f)
                lineToRelative(-36.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.4f, 10.8f)
                lineToRelative(5.4f, -10.7f)
                horizontalLineToRelative(39.8f)
                lineToRelative(5.4f, 10.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.4f, -10.8f)
                lineToRelative(-36.0f, -72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.4f, 0.0f)
                close()
                moveTo(120.1f, 130.7f)
                lineTo(128.0f, 114.8f)
                lineTo(135.9f, 130.7f)
                close()
            }
        }
        .build()
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
