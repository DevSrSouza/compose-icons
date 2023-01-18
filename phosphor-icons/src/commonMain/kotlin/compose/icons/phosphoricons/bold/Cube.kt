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

public val BoldGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.4f, 68.9f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.1f, -0.1f, -0.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, false, -7.5f, -7.4f)
                lineToRelative(-88.0f, -49.5f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -19.6f, 0.0f)
                lineToRelative(-88.0f, 49.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -7.5f, 7.5f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.1f, 0.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 78.7f)
                verticalLineToRelative(98.6f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 10.2f, 17.5f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(20.6f, 20.6f, 0.0f, false, false, 9.0f, 2.5f)
                horizontalLineToRelative(1.7f)
                arcToRelative(21.2f, 21.2f, 0.0f, false, false, 8.9f, -2.5f)
                lineToRelative(88.0f, -49.5f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 236.0f, 177.3f)
                lineTo(236.0f, 78.7f)
                arcTo(19.4f, 19.4f, 0.0f, false, false, 233.4f, 68.9f)
                close()
                moveTo(128.0f, 33.8f)
                lineToRelative(71.6f, 40.3f)
                lineToRelative(-70.7f, 40.1f)
                lineTo(56.6f, 73.9f)
                close()
                moveTo(44.0f, 94.4f)
                lineTo(116.9f, 135.0f)
                lineToRelative(-0.7f, 80.6f)
                lineTo(44.0f, 175.0f)
                close()
                moveTo(140.2f, 215.4f)
                lineTo(140.9f, 135.0f)
                lineTo(212.0f, 94.6f)
                lineTo(212.0f, 175.0f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
