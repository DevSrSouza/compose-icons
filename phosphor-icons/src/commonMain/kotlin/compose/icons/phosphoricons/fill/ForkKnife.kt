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

public val FillGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.9f, 78.8f)
                arcTo(4.9f, 4.9f, 0.0f, false, true, 128.0f, 80.0f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, true, -36.0f, 43.3f)
                lineTo(92.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(76.0f, 123.3f)
                arcTo(44.1f, 44.1f, 0.0f, false, true, 40.0f, 80.0f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 0.1f, -1.2f)
                horizontalLineToRelative(0.0f)
                lineToRelative(8.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.8f, 2.6f)
                lineTo(57.4f, 72.0f)
                lineTo(76.0f, 72.0f)
                lineTo(76.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(92.0f, 72.0f)
                horizontalLineToRelative(18.6f)
                lineToRelative(-6.5f, -38.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.8f, -2.6f)
                lineToRelative(8.0f, 48.0f)
                close()
                moveTo(208.6f, 25.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.3f, -0.9f)
                curveToRelative(-20.8f, 7.5f, -37.5f, 32.9f, -49.5f, 75.3f)
                arcTo(412.8f, 412.8f, 0.0f, false, false, 140.0f, 159.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.0f, 6.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 6.0f, 2.7f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(212.0f, 32.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 208.6f, 25.4f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
