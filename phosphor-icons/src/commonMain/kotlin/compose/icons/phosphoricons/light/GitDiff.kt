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

public val LightGroup.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) {
            return _gitDiff!!
        }
        _gitDiff = Builder(name = "GitDiff", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.0f, 154.5f)
                lineTo(202.0f, 119.9f)
                arcToRelative(53.7f, 53.7f, 0.0f, false, false, -15.8f, -38.2f)
                lineTo(158.5f, 54.0f)
                lineTo(184.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(144.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(138.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 62.5f)
                lineToRelative(27.7f, 27.7f)
                arcTo(41.8f, 41.8f, 0.0f, false, true, 190.0f, 119.9f)
                verticalLineToRelative(34.6f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(196.0f, 210.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 196.0f, 210.0f)
                close()
                moveTo(112.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(25.5f)
                lineTo(78.3f, 165.8f)
                arcTo(41.8f, 41.8f, 0.0f, false, true, 66.0f, 136.1f)
                lineTo(66.0f, 101.5f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(34.6f)
                arcToRelative(53.7f, 53.7f, 0.0f, false, false, 15.8f, 38.2f)
                lineTo(97.5f, 202.0f)
                lineTo(72.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(118.0f, 168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 162.0f)
                close()
                moveTo(38.0f, 68.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, true, 60.0f, 90.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 38.0f, 68.0f)
                close()
            }
        }
        .build()
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
