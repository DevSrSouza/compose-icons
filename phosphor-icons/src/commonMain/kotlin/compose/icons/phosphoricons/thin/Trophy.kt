package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 68.0f)
                lineTo(204.0f, 68.0f)
                lineTo(204.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(64.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 56.0f)
                lineTo(52.0f, 68.0f)
                lineTo(23.9f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(11.9f, 96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(8.7f, 31.0f, 36.2f, 54.1f, 69.1f, 55.9f)
                lineTo(124.0f, 220.0f)
                lineTo(96.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 220.0f)
                lineTo(132.0f, 187.9f)
                arcToRelative(75.5f, 75.5f, 0.0f, false, false, 49.5f, -22.0f)
                arcTo(74.1f, 74.1f, 0.0f, false, false, 201.3f, 132.0f)
                lineTo(208.0f, 132.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(244.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 68.0f)
                close()
                moveTo(47.9f, 124.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(19.9f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(52.0f, 76.0f)
                verticalLineToRelative(35.1f)
                arcTo(78.3f, 78.3f, 0.0f, false, false, 53.1f, 124.0f)
                close()
                moveTo(175.9f, 160.3f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 127.5f, 180.0f)
                curveTo(90.3f, 179.7f, 60.0f, 148.8f, 60.0f, 111.1f)
                lineTo(60.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(192.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(56.0f)
                arcTo(67.4f, 67.4f, 0.0f, false, true, 175.9f, 160.3f)
                close()
                moveTo(236.0f, 96.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                horizontalLineToRelative(-4.9f)
                arcToRelative(78.8f, 78.8f, 0.0f, false, false, 0.9f, -12.0f)
                lineTo(204.0f, 76.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
