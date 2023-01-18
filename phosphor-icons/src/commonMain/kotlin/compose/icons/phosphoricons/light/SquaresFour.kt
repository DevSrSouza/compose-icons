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

public val LightGroup.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) {
            return _squaresFour!!
        }
        _squaresFour = Builder(name = "SquaresFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 42.0f)
                lineTo(48.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(118.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 42.0f)
                close()
                moveTo(106.0f, 106.0f)
                lineTo(54.0f, 106.0f)
                lineTo(54.0f, 54.0f)
                horizontalLineToRelative(52.0f)
                close()
                moveTo(208.0f, 42.0f)
                lineTo(144.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(214.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(202.0f, 106.0f)
                lineTo(150.0f, 106.0f)
                lineTo(150.0f, 54.0f)
                horizontalLineToRelative(52.0f)
                close()
                moveTo(112.0f, 138.0f)
                lineTo(48.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(118.0f, 144.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 138.0f)
                close()
                moveTo(106.0f, 202.0f)
                lineTo(54.0f, 202.0f)
                lineTo(54.0f, 150.0f)
                horizontalLineToRelative(52.0f)
                close()
                moveTo(208.0f, 138.0f)
                lineTo(144.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(214.0f, 144.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 138.0f)
                close()
                moveTo(202.0f, 202.0f)
                lineTo(150.0f, 202.0f)
                lineTo(150.0f, 150.0f)
                horizontalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
