package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.TrashAlt: ImageVector
    get() {
        if (_trashAlt != null) {
            return _trashAlt!!
        }
        _trashAlt = Builder(name = "TrashAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.0f, 416.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(304.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
                moveTo(432.0f, 80.0f)
                horizontalLineToRelative(-82.41f)
                lineToRelative(-34.0f, -56.7f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 274.41f, 0.0f)
                lineTo(173.59f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -41.16f, 23.3f)
                lineTo(98.41f, 80.0f)
                lineTo(16.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(336.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(416.0f, 128.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(448.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(171.84f, 50.91f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 177.0f, 48.0f)
                horizontalLineToRelative(94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.15f, 2.91f)
                lineTo(293.61f, 80.0f)
                lineTo(154.39f, 80.0f)
                close()
                moveTo(368.0f, 464.0f)
                lineTo(80.0f, 464.0f)
                lineTo(80.0f, 128.0f)
                horizontalLineToRelative(288.0f)
                close()
                moveTo(156.0f, 416.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(192.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _trashAlt!!
    }

private var _trashAlt: ImageVector? = null
