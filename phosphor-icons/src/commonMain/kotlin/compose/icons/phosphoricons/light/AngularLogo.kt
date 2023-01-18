package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) {
            return _angularLogo!!
        }
        _angularLogo = Builder(name = "AngularLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.3f, 66.5f)
                lineToRelative(-96.0f, -40.0f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, -4.6f, 0.0f)
                lineToRelative(-96.0f, 40.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -3.6f, 6.3f)
                lineToRelative(16.0f, 120.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.2f, 4.6f)
                lineToRelative(80.0f, 40.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 5.4f, 0.0f)
                lineToRelative(80.0f, -40.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.2f, -4.6f)
                lineToRelative(16.0f, -120.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 226.3f, 66.5f)
                close()
                moveTo(202.5f, 188.1f)
                lineTo(128.0f, 225.3f)
                lineTo(53.5f, 188.1f)
                lineTo(38.6f, 75.8f)
                lineTo(128.0f, 38.5f)
                lineToRelative(89.4f, 37.3f)
                close()
                moveTo(122.6f, 85.3f)
                lineToRelative(-36.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.8f, 5.4f)
                lineToRelative(9.0f, -18.0f)
                horizontalLineToRelative(43.2f)
                lineToRelative(9.0f, 18.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 164.0f, 166.0f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.7f, -0.6f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 2.7f, -8.1f)
                lineToRelative(-36.0f, -72.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -10.8f, 0.0f)
                close()
                moveTo(143.6f, 132.7f)
                lineTo(112.4f, 132.7f)
                lineTo(128.0f, 101.4f)
                close()
            }
        }
        .build()
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
