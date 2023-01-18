package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) {
            return _squaresFour!!
        }
        _squaresFour = Builder(name = "SquaresFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(120.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 40.0f)
                close()
                moveTo(104.0f, 104.0f)
                lineTo(56.0f, 104.0f)
                lineTo(56.0f, 56.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(208.0f, 40.0f)
                lineTo(144.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(200.0f, 104.0f)
                lineTo(152.0f, 104.0f)
                lineTo(152.0f, 56.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(112.0f, 136.0f)
                lineTo(48.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(120.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 136.0f)
                close()
                moveTo(104.0f, 200.0f)
                lineTo(56.0f, 200.0f)
                lineTo(56.0f, 152.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(208.0f, 136.0f)
                lineTo(144.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 136.0f)
                close()
                moveTo(200.0f, 200.0f)
                lineTo(152.0f, 200.0f)
                lineTo(152.0f, 152.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
