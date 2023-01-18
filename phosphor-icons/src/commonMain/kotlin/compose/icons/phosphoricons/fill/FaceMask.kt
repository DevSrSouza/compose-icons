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

public val FillGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 72.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.5f, -9.4f)
                lineToRelative(-80.0f, -29.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -11.0f, 0.0f)
                lineToRelative(-80.0f, 29.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 33.0f, 72.0f)
                lineTo(32.0f, 72.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 0.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(5.2f)
                curveToRelative(6.6f, 14.4f, 19.3f, 27.0f, 37.6f, 37.2f)
                curveToRelative(21.1f, 11.7f, 43.6f, 17.0f, 49.9f, 18.3f)
                lineToRelative(3.3f, 0.3f)
                lineToRelative(3.3f, -0.3f)
                curveToRelative(6.3f, -1.3f, 28.8f, -6.6f, 49.9f, -18.3f)
                curveToRelative(18.3f, -10.2f, 31.0f, -22.8f, 37.6f, -37.2f)
                lineTo(224.0f, 160.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(256.0f, 104.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 224.0f, 72.0f)
                close()
                moveTo(32.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(52.9f, 52.9f, 0.0f, false, false, 0.6f, 8.0f)
                close()
                moveTo(168.0f, 152.0f)
                lineTo(88.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(168.0f, 120.0f)
                lineTo(88.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(240.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(52.9f, 52.9f, 0.0f, false, false, 0.6f, -8.0f)
                lineTo(224.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
