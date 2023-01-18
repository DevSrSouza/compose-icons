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

public val FillGroup.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) {
            return _bellSimpleSlash!!
        }
        _bellSimpleSlash = Builder(name = "BellSimpleSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(202.9f, 174.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.9f, 2.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.2f, -1.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.3f, -9.7f)
                curveToRelative(-5.6f, -14.2f, -8.5f, -32.6f, -8.5f, -54.4f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -44.3f, -35.5f, -80.6f, -79.2f, -80.9f)
                arcTo(80.2f, 80.2f, 0.0f, false, false, 88.5f, 34.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.9f, 5.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 2.0f, 6.7f)
                close()
                moveTo(53.9f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(58.9f, 63.9f)
                arcTo(80.2f, 80.2f, 0.0f, false, false, 48.2f, 104.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 34.3f, -7.1f, 53.7f, -13.0f, 63.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 49.0f, 200.0f)
                lineTo(182.6f, 200.0f)
                lineToRelative(19.5f, 21.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
            }
        }
        .build()
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
