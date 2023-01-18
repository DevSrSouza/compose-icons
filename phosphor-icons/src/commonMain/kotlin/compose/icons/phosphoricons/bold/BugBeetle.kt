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

public val BoldGroup.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) {
            return _bugBeetle!!
        }
        _bugBeetle = Builder(name = "BugBeetle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(212.0f, 132.0f)
                lineTo(212.0f, 116.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(211.1f, 92.0f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, false, -18.0f, -41.0f)
                lineToRelative(15.1f, -14.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.4f, -17.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -16.9f, -0.4f)
                lineTo(175.4f, 34.7f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, false, -94.9f, 0.1f)
                lineTo(64.2f, 19.3f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 47.7f, 36.7f)
                lineTo(62.8f, 51.1f)
                arcTo(82.9f, 82.9f, 0.0f, false, false, 44.9f, 92.0f)
                lineTo(32.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.0f, 116.0f)
                verticalLineToRelative(16.0f)
                lineTo(32.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.1f, 156.0f)
                arcToRelative(93.5f, 93.5f, 0.0f, false, false, 2.3f, 16.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(56.5f, 196.0f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, false, 143.0f, 0.0f)
                lineTo(224.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(209.6f, 172.0f)
                arcToRelative(93.5f, 93.5f, 0.0f, false, false, 2.3f, -16.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, 58.8f, 48.0f)
                lineTo(69.2f, 92.0f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(140.0f, 210.8f)
                lineTo(140.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(66.8f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 68.0f, 152.0f)
                lineTo(68.0f, 116.0f)
                lineTo(188.0f, 116.0f)
                verticalLineToRelative(36.0f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 140.0f, 210.8f)
                close()
            }
        }
        .build()
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
