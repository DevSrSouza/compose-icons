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

public val FillGroup.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) {
            return _facebookLogo!!
        }
        _facebookLogo = Builder(name = "FacebookLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                arcToRelative(104.3f, 104.3f, 0.0f, false, true, -91.5f, 103.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.5f, -4.0f)
                verticalLineTo(152.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.3f, -7.5f)
                horizontalLineTo(136.0f)
                verticalLineTo(112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.3f, -7.5f)
                horizontalLineTo(152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 8.3f, 7.5f)
                horizontalLineTo(120.0f)
                verticalLineToRelative(75.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.4f, 4.0f)
                curveTo(62.8f, 224.9f, 22.0f, 179.0f, 24.1f, 124.1f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
