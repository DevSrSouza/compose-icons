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

public val DuotoneGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 40.0f)
                moveToRelative(-20.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 40.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -40.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.6f, 185.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.1f, -5.1f)
                lineToRelative(-17.4f, 5.8f)
                lineToRelative(-28.9f, -57.8f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 184.0f, 124.0f)
                horizontalLineTo(104.0f)
                verticalLineTo(104.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(104.0f)
                verticalLineTo(66.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineToRelative(23.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 87.9f, 74.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, -1.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 88.0f, 106.3f)
                verticalLineTo(132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(83.1f)
                lineToRelative(29.7f, 59.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 204.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, 2.5f, -0.4f)
                lineToRelative(24.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 247.6f, 185.5f)
                close()
                moveTo(84.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 96.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 40.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
