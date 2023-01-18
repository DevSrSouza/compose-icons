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

public val FillGroup.HandEye: ImageVector
    get() {
        if (_handEye != null) {
            return _handEye!!
        }
        _handEye = Builder(name = "HandEye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 84.0f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, false, -12.0f, 2.7f)
                lineTo(176.0f, 52.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, -13.4f, 3.4f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 36.0f)
                verticalLineToRelative(6.7f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 40.0f, 68.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                lineTo(216.0f, 112.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 188.0f, 84.0f)
                close()
                moveTo(200.0f, 152.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -144.0f, 0.0f)
                lineTo(56.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(96.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(128.0f, 136.0f)
                curveToRelative(-26.7f, 0.0f, -43.0f, 20.6f, -48.8f, 29.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, 13.2f)
                curveTo(85.0f, 187.4f, 101.3f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(43.0f, -20.6f, 48.8f, -29.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, -13.2f)
                curveTo(171.0f, 156.6f, 154.7f, 136.0f, 128.0f, 136.0f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 188.0f)
                close()
            }
        }
        .build()
        return _handEye!!
    }

private var _handEye: ImageVector? = null
