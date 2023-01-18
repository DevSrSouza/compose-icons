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

public val LightGroup.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) {
            return _facebookLogo!!
        }
        _facebookLogo = Builder(name = "FacebookLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 230.0f)
                horizontalLineToRelative(0.0f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 230.0f, 128.0f)
                close()
                moveTo(134.0f, 217.8f)
                lineTo(134.0f, 150.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 138.0f)
                lineTo(134.0f, 112.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, -18.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(152.0f, 82.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, -30.0f, 30.0f)
                verticalLineToRelative(26.0f)
                lineTo(96.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(67.8f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
