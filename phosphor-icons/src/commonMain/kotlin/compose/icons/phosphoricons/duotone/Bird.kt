package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                lineTo(208.0f, 96.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -96.0f, 96.0f)
                horizontalLineTo(8.0f)
                lineTo(104.0f, 96.0f)
                verticalLineTo(76.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 206.3f, 62.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 68.0f)
                close()
                moveTo(125.1f, 129.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -11.2f, 1.0f)
                lineToRelative(-40.0f, 48.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 1.0f, 11.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 11.2f, -1.0f)
                lineToRelative(40.0f, -48.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 125.1f, 129.9f)
                close()
                moveTo(240.0f, 80.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.6f, 6.7f)
                lineTo(216.0f, 100.3f)
                lineTo(216.0f, 120.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, true, 112.0f, 224.0f)
                lineTo(8.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.2f, -13.0f)
                lineTo(96.0f, 93.2f)
                lineTo(96.0f, 76.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 213.2f, 57.9f)
                lineToRelative(23.2f, 15.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 240.0f, 80.0f)
                close()
                moveTo(217.6f, 80.0f)
                lineTo(201.9f, 69.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -3.3f, -4.6f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 112.0f, 76.0f)
                lineTo(112.0f, 96.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -1.8f, 5.0f)
                lineTo(24.6f, 208.0f)
                lineTo(112.0f, 208.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f)
                lineTo(200.0f, 96.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 3.6f, -6.7f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
