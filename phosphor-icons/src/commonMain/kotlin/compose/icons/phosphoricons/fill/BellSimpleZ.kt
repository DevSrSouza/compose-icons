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

public val FillGroup.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) {
            return _bellSimpleZ!!
        }
        _bellSimpleZ = Builder(name = "BellSimpleZ", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(220.9f, 192.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, 8.0f)
                lineTo(49.0f, 200.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, -8.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 0.1f, -16.1f)
                curveToRelative(5.9f, -10.2f, 13.0f, -29.6f, 13.0f, -63.9f)
                verticalLineToRelative(-8.0f)
                arcTo(79.9f, 79.9f, 0.0f, false, true, 128.0f, 24.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(43.7f, 0.3f, 79.2f, 36.6f, 79.2f, 80.9f)
                lineTo(207.8f, 112.0f)
                curveToRelative(0.0f, 34.3f, 7.1f, 53.7f, 13.0f, 63.9f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 220.9f, 192.0f)
                close()
                moveTo(156.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(125.1f, 136.0f)
                lineToRelative(29.0f, -34.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 1.1f, -8.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 148.0f, 88.0f)
                lineTo(108.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(22.9f)
                lineToRelative(-29.0f, 34.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -1.1f, 8.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 108.0f, 152.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
