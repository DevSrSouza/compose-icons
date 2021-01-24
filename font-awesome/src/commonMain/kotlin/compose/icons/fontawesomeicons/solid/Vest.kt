package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Vest: ImageVector
    get() {
        if (_vest != null) {
            return _vest!!
        }
        _vest = Builder(name = "Vest", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(437.252f, 239.877f)
                lineTo(384.0f, 160.0f)
                lineTo(384.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 352.0f, 0.0f)
                lineTo(320.0f, 0.0f)
                arcToRelative(24.021f, 24.021f, 0.0f, false, false, -13.312f, 4.031f)
                lineToRelative(-25.0f, 16.672f)
                arcToRelative(103.794f, 103.794f, 0.0f, false, true, -115.376f, 0.0f)
                lineToRelative(-25.0f, -16.672f)
                arcTo(24.021f, 24.021f, 0.0f, false, false, 128.0f, 0.0f)
                lineTo(96.0f, 0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 64.0f, 32.0f)
                lineTo(64.0f, 160.0f)
                lineTo(10.748f, 239.877f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 275.377f)
                lineTo(0.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(192.0f, 512.0f)
                lineTo(192.0f, 288.0f)
                arcToRelative(31.987f, 31.987f, 0.0f, false, true, 1.643f, -10.119f)
                lineTo(207.135f, 237.4f)
                lineTo(150.188f, 66.564f)
                arcTo(151.518f, 151.518f, 0.0f, false, false, 224.0f, 86.234f)
                arcToRelative(151.55f, 151.55f, 0.0f, false, false, 73.812f, -19.672f)
                lineTo(224.0f, 288.0f)
                lineTo(224.0f, 512.0f)
                lineTo(416.0f, 512.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(448.0f, 275.377f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 437.252f, 239.877f)
                close()
                moveTo(131.312f, 371.312f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.624f, -22.624f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.624f, 22.624f)
                close()
                moveTo(387.312f, 419.312f)
                arcToRelative(15.992f, 15.992f, 0.0f, false, true, -22.624f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.624f, -22.624f)
                lineToRelative(48.0f, 48.0f)
                arcTo(15.993f, 15.993f, 0.0f, false, true, 387.312f, 419.312f)
                close()
            }
        }
        .build()
        return _vest!!
    }

private var _vest: ImageVector? = null
