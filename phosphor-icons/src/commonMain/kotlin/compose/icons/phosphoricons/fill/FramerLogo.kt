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

public val FillGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 108.0f)
                horizontalLineTo(148.1f)
                lineToRelative(57.4f, 54.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 176.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.8f, 7.3f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, -3.2f, 0.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.5f, -2.2f)
                lineToRelative(-72.0f, -68.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 48.0f, 168.0f)
                verticalLineTo(100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(51.9f)
                lineTo(50.5f, 37.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(68.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 108.0f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
