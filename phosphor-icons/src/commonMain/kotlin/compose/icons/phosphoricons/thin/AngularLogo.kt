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

public val ThinGroup.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) {
            return _angularLogo!!
        }
        _angularLogo = Builder(name = "AngularLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.5f, 68.3f)
                lineToRelative(-96.0f, -40.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.0f, 0.0f)
                lineToRelative(-96.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 72.5f)
                lineToRelative(16.0f, 120.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.2f, 3.1f)
                lineToRelative(80.0f, 40.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.6f, 0.0f)
                lineToRelative(80.0f, -40.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.2f, -3.1f)
                lineToRelative(16.0f, -120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 225.5f, 68.3f)
                close()
                moveTo(204.3f, 189.4f)
                lineTo(128.0f, 227.5f)
                lineTo(51.7f, 189.4f)
                lineTo(36.4f, 74.5f)
                lineTo(128.0f, 36.3f)
                lineToRelative(91.6f, 38.2f)
                close()
                moveTo(124.4f, 86.2f)
                lineToRelative(-36.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.2f, 3.6f)
                lineToRelative(9.5f, -19.1f)
                horizontalLineToRelative(45.8f)
                lineToRelative(9.5f, 19.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 164.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, -0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.8f, -5.4f)
                lineToRelative(-36.0f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.2f, 0.0f)
                close()
                moveTo(146.9f, 134.7f)
                lineTo(109.1f, 134.7f)
                lineTo(128.0f, 96.9f)
                close()
            }
        }
        .build()
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
