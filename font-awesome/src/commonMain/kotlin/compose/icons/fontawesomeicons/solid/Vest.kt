package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(437.25f, 239.88f)
                lineTo(384.0f, 160.0f)
                lineTo(384.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 352.0f, 0.0f)
                lineTo(320.0f, 0.0f)
                arcToRelative(24.02f, 24.02f, 0.0f, false, false, -13.31f, 4.03f)
                lineToRelative(-25.0f, 16.67f)
                arcToRelative(103.79f, 103.79f, 0.0f, false, true, -115.38f, 0.0f)
                lineToRelative(-25.0f, -16.67f)
                arcTo(24.02f, 24.02f, 0.0f, false, false, 128.0f, 0.0f)
                lineTo(96.0f, 0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 64.0f, 32.0f)
                lineTo(64.0f, 160.0f)
                lineTo(10.75f, 239.88f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 275.38f)
                lineTo(0.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(192.0f, 512.0f)
                lineTo(192.0f, 288.0f)
                arcToRelative(31.99f, 31.99f, 0.0f, false, true, 1.64f, -10.12f)
                lineTo(207.13f, 237.4f)
                lineTo(150.19f, 66.56f)
                arcTo(151.52f, 151.52f, 0.0f, false, false, 224.0f, 86.23f)
                arcToRelative(151.55f, 151.55f, 0.0f, false, false, 73.81f, -19.67f)
                lineTo(224.0f, 288.0f)
                lineTo(224.0f, 512.0f)
                lineTo(416.0f, 512.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(448.0f, 275.38f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 437.25f, 239.88f)
                close()
                moveTo(131.31f, 371.31f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, -22.62f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, 22.62f)
                close()
                moveTo(387.31f, 419.31f)
                arcToRelative(15.99f, 15.99f, 0.0f, false, true, -22.62f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, -22.62f)
                lineToRelative(48.0f, 48.0f)
                arcTo(15.99f, 15.99f, 0.0f, false, true, 387.31f, 419.31f)
                close()
            }
        }
        .build()
        return _vest!!
    }

private var _vest: ImageVector? = null
