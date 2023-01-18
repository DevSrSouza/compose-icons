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

public val FillGroup.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) {
            return _pushPinSimpleSlash!!
        }
        _pushPinSimpleSlash = Builder(name = "PushPinSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.3f, 45.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.0f, -5.1f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.0f, -0.8f)
                arcTo(8.3f, 8.3f, 0.0f, false, true, 85.0f, 35.0f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, true, 1.0f, -1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.2f, -2.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(18.8f, 106.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.4f, 8.6f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.5f, 0.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.9f, -2.6f)
                close()
                moveTo(213.9f, 210.6f)
                lineToRelative(-36.3f, -40.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-48.5f, -53.2f)
                lineTo(53.9f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(66.2f, 72.0f)
                lineTo(49.3f, 168.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(184.0f)
                horizontalLineToRelative(32.1f)
                lineToRelative(34.0f, 37.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 213.9f, 210.6f)
                close()
            }
        }
        .build()
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
