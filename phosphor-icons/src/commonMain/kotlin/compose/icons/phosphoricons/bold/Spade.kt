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

public val BoldGroup.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.0f, 53.6f)
                arcToRelative(450.1f, 450.1f, 0.0f, false, false, -51.5f, -39.7f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -13.0f, 0.0f)
                arcTo(450.1f, 450.1f, 0.0f, false, false, 70.0f, 53.6f)
                curveTo(34.2f, 85.8f, 16.0f, 114.9f, 16.0f, 140.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, 64.0f, 64.0f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, false, 9.2f, -0.7f)
                lineToRelative(-5.0f, 26.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 244.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -14.2f)
                lineToRelative(-5.0f, -26.5f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, false, 9.2f, 0.7f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, 64.0f, -64.0f)
                curveTo(240.0f, 114.9f, 221.8f, 85.8f, 186.0f, 53.6f)
                close()
                moveTo(176.0f, 180.0f)
                arcToRelative(39.4f, 39.4f, 0.0f, false, true, -19.0f, -4.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 139.5f, 188.0f)
                lineToRelative(6.0f, 32.0f)
                horizontalLineToRelative(-35.0f)
                lineToRelative(6.0f, -32.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 99.0f, 175.2f)
                arcTo(39.4f, 39.4f, 0.0f, false, true, 80.0f, 180.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                curveToRelative(0.0f, -17.5f, 16.3f, -41.7f, 45.8f, -68.4f)
                arcTo(430.5f, 430.5f, 0.0f, false, true, 128.0f, 38.5f)
                arcToRelative(424.4f, 424.4f, 0.0f, false, true, 42.0f, 32.9f)
                curveToRelative(29.7f, 26.7f, 46.0f, 51.1f, 46.0f, 68.6f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 176.0f, 180.0f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
