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

public val BoldGroup.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) {
            return _alignCenterHorizontal!!
        }
        _alignCenterHorizontal = Builder(name = "AlignCenterHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 136.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(60.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 52.0f, 60.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(156.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 136.0f)
                close()
                moveTo(76.0f, 64.0f)
                horizontalLineTo(180.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(76.0f)
                close()
                moveTo(204.0f, 192.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(160.0f)
                horizontalLineTo(204.0f)
                close()
            }
        }
        .build()
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
