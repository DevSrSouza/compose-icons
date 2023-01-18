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

public val FillGroup.HandFist: ImageVector
    get() {
        if (_handFist != null) {
            return _handFist!!
        }
        _handFist = Builder(name = "HandFist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 80.0f)
                lineTo(184.0f, 80.0f)
                lineTo(184.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -56.0f, -21.1f)
                arcTo(31.8f, 31.8f, 0.0f, false, false, 104.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 72.2f, 60.4f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 24.0f, 88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 208.0f, 0.0f)
                lineTo(232.0f, 112.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 200.0f, 80.0f)
                close()
                moveTo(152.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(168.0f, 80.0f)
                lineTo(136.0f, 80.0f)
                lineTo(136.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 48.0f)
                close()
                moveTo(88.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(88.0f, 64.0f)
                close()
                moveTo(40.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -87.9f, -84.2f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 80.0f, 125.1f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 44.6f, 3.4f)
                arcToRelative(32.3f, 32.3f, 0.0f, false, false, 11.8f, 11.4f)
                arcTo(47.7f, 47.7f, 0.0f, false, false, 120.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(152.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(136.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _handFist!!
    }

private var _handFist: ImageVector? = null
