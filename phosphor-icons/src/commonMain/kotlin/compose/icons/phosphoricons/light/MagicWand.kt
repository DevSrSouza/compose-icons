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

public val LightGroup.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(222.0f, 158.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 158.0f)
                lineTo(192.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(210.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 152.0f)
                close()
                moveTo(64.0f, 66.0f)
                lineTo(78.0f, 66.0f)
                lineTo(78.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(90.0f, 66.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(90.0f, 54.0f)
                lineTo(90.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(78.0f, 54.0f)
                lineTo(64.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(184.0f, 194.0f)
                lineTo(174.0f, 194.0f)
                lineTo(174.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(10.0f)
                lineTo(152.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(174.0f, 206.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(180.2f, 116.2f)
                lineTo(73.9f, 222.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.8f, 0.0f)
                lineTo(33.4f, 201.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -19.8f)
                lineTo(182.1f, 33.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 19.8f, 0.0f)
                lineToRelative(20.7f, 20.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 19.8f)
                lineToRelative(-42.4f, 42.3f)
                close()
                moveTo(152.5f, 80.0f)
                lineTo(176.0f, 103.5f)
                lineToRelative(38.1f, -38.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.0f, -2.8f)
                lineTo(193.4f, 41.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -2.8f, 0.0f)
                close()
                moveTo(167.5f, 112.0f)
                lineTo(144.0f, 88.5f)
                lineTo(41.9f, 190.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.0f, 2.8f)
                lineToRelative(20.7f, 20.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 2.8f, 0.0f)
                close()
            }
        }
        .build()
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
