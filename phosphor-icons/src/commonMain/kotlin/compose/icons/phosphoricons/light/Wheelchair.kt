package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.7f, 186.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -7.6f, -3.8f)
                lineTo(219.0f, 188.7f)
                lineToRelative(-29.6f, -59.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 184.0f, 126.0f)
                horizontalLineTo(102.0f)
                verticalLineTo(102.1f)
                horizontalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(102.0f)
                verticalLineTo(65.3f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineTo(91.4f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, false, 83.9f, 73.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.7f, -6.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -6.3f, 5.6f)
                arcTo(58.0f, 58.0f, 0.0f, true, true, 90.0f, 103.7f)
                verticalLineTo(132.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(84.3f)
                lineToRelative(30.3f, 60.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 216.0f, 202.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 1.9f, -0.3f)
                lineToRelative(24.0f, -8.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 245.7f, 186.1f)
                close()
                moveTo(82.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 96.0f, 54.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 82.0f, 40.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
