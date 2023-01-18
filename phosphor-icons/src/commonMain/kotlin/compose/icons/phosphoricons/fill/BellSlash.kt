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

public val FillGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.6f, 46.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 1.9f, -12.4f)
                arcTo(80.2f, 80.2f, 0.0f, false, true, 128.6f, 24.0f)
                curveToRelative(43.7f, 0.3f, 79.2f, 36.6f, 79.2f, 80.9f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, 21.9f, 2.8f, 40.1f, 8.4f, 54.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.3f, 8.3f)
                close()
                moveTo(213.9f, 210.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.5f, 11.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineTo(182.6f, 200.0f)
                horizontalLineTo(168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -80.0f, 0.0f)
                horizontalLineTo(49.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.8f, -24.1f)
                curveToRelative(5.9f, -10.2f, 13.0f, -29.6f, 13.0f, -63.9f)
                verticalLineToRelative(-8.0f)
                arcTo(80.2f, 80.2f, 0.0f, false, true, 58.9f, 63.9f)
                lineTo(42.1f, 45.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.9f, 34.6f)
                close()
                moveTo(152.0f, 200.0f)
                horizontalLineTo(104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
