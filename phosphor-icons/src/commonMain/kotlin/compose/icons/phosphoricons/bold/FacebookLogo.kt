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

public val BoldGroup.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) {
            return _facebookLogo!!
        }
        _facebookLogo = Builder(name = "FacebookLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 128.0f, 236.0f)
                horizontalLineToRelative(0.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 236.0f, 128.0f)
                close()
                moveTo(140.0f, 211.1f)
                lineTo(140.0f, 156.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 132.0f)
                lineTo(140.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(152.0f, 76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                verticalLineToRelative(20.0f)
                lineTo(96.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(55.1f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
